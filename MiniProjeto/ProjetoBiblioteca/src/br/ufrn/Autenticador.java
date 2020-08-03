package br.ufrn;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Classe para simular um backend com autenticação de usuário
 */
public class Autenticador{
    static private Autenticador instance = new Autenticador();
    static private HashMap<String, UsuarioComum> usuarios = new HashMap<>();
    static private HashMap<String, Funcionario> funcionarios = new HashMap<>();
    static private Usuario usuarioLogado = null;
    Scanner sc = new Scanner(System.in);

    /**
     * @brief   O construtor private serve para implementar o padrão de Singleton em que uma classe
     * possui apenas um objeto.
     */
    private Autenticador(){
    }
    /**
     * @brief   Método que sempre retorna o único elemento dessa classe.
     * @return  O objeto do tipo Autenticador.
     */
    static public Autenticador getInstance(){
        if (usuarios.isEmpty())
            carregarUsuarios();
        if (funcionarios.isEmpty())
            carregarFuncionarios();
        return instance;
    }
    /**
     * @brief Um método dummie para simular um cadastro de usuário.
     * Atenção: em uma situação real nunca se deve guardar senhas em
     * formato de texto, apenas uma hash gerada por um algoritmo de
     * criptografia adequado.
     **/
    public void cadastro(){
        System.out.print("Digite nome do usuário: ");
        String nome = sc.next();
        Usuario usuario = usuarios.get(nome);
        if (usuario == null)
            usuario = funcionarios.get(nome);
        if (usuario != null){
            System.out.println("Usuário já cadastrado");
            return;
        }
        Console console = System.console();
        //String senha = new String(console.readPassword("Digite sua senha: "));
        // Atenção: O método abaixo para pegar senha não é seguro e foi usado apenas para fins didáticos:
        System.out.print("Digite sua senha (Atenção! A senha irá aparecer!): ");
        String senha = sc.next();
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("resources/usuarios.csv", true));
            // Atenção: O método abaixo para salvar senha em arquivo não é seguro e foi usado apenas para fins didáticos
            writer.append("\n" + nome+","+senha);
            writer.close();
            UsuarioComum u = new UsuarioComum(nome, senha);
            usuarioLogado = u;
            usuarios.put(nome, u);
        }
        catch (Exception e){
            System.out.println("Erro: Ocorreu algum erro ao salvar as informações do usuário.");
        }
    }
    /**
     * @brief Um método dummie para simular um login de usuário.
     * Atenção: em uma situação real nunca se deve guardar senhas em
     * formato de texto, apenas uma hash gerada por um algoritmo de
     * criptografia adequado.
     **/
    public void login() throws NoSuchUserException, InvalidPasswordException {
        System.out.print("Digite nome do usuário: ");
        String nome = sc.next();
        try{
            checarUsuario(nome);
        }
        catch(NoSuchUserException e){
            // Se não estiver entre os usuários comuns:
            checarFuncionario(nome);
        }
        //Console console = System.console();
        //String senha = new String(console.readPassword("Digite sua senha: "));
        // Atenção: O método abaixo para pegar senha não é seguro e foi usado apenas para fins didáticos:
        System.out.print("Digite sua senha (Atenção! A senha irá aparecer!): ");
        String senha = sc.next();
        checarSenha(senha);
    }

    /**
     * @brief  Getter para o usuário autenticado.
     * @return Um objeto do tipo Usuário.
     */
    static public Usuario getUsuarioLogado(){
        return usuarioLogado;
    }
    static public void sair(){
        usuarioLogado = null;
    }
    static private void carregarUsuarios(){
        try {
            Scanner reader = new Scanner(new File("resources/usuarios.csv"));
            String header = reader.nextLine();//Primeira linha é o cabeçalho
            while (reader.hasNextLine()){
                String[] dados = reader.nextLine().trim().split(",");
                usuarios.put(dados[0], new UsuarioComum(dados[0], dados[1]));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erros ao carregar os dados de usuários.");
            sair();
        }
    }
    static private void carregarFuncionarios(){
        try {
            Scanner reader = new Scanner(new File("resources/funcionarios.csv"));
            String header = reader.nextLine();//Primeira linha é o cabeçalho
            while (reader.hasNextLine()){
                String[] dados = reader.nextLine().split(",");
                funcionarios.put(dados[0], new Funcionario(dados[0].trim(), dados[1].trim()));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erros ao carregar os dados de usuários.");
            sair();
        }
    }
    private void checarUsuario(String nome)
            throws NoSuchUserException {
        usuarioLogado = usuarios.get(nome);
        if (usuarioLogado == null)
            throw new NoSuchUserException("Usuário não encontrado");
    }
    private void checarFuncionario(String nome)
            throws NoSuchUserException {
        usuarioLogado = funcionarios.get(nome);
        if (usuarioLogado == null)
            throw new NoSuchUserException("Usuário não encontrado");
    }
    private void checarSenha(String senha)
            throws InvalidPasswordException {
        if (senha.equals(usuarioLogado.getSenha())){
            System.out.println(
                    "Seja bem vindo, " + usuarioLogado.getNome());
        }
        else {
            throw new InvalidPasswordException("Senha inválida");
        }
    }
}

