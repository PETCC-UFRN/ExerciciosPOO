import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import org.json.*;

/*
 * Classe para simular um backend com autenticação de usuário
 */
public class Autenticador{
  static private Autenticador instance;
  private HashMap<String, UsuarioComum> usuarios = new HashMap<>();
  private HashMap<String, Funcionario> funcionarios = new HashMap<>();
  private Usuario usuarioLogado = null;
  Scanner sc = new Scanner(System.in);

  private Autenticador(){
    carregarUsuarios();
    carregarFuncionarios();
  }
  static public Autenticador getInstance(){
    if (instance == null)
      return new Autenticador();
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
    String senha = new String(console.readPassword("Digite sua senha: "));
    try {
      BufferedWriter writer = new BufferedWriter(
          new FileWriter("resources/usuarios.csv", true));
      writer.append(nome+","+senha);
      writer.close(); 
      UsuarioComum u = new UsuarioComum(nome, senha);
      usuarioLogado = u;
      usuarios.put(nome, u);
    }
    catch (Exception e){
      System.out.println("Erro: Ocorreu algum erro ao salvar as informações do usuário.");
    }
  }
  public void login(){
    System.out.print("Digite nome do usuário: ");
    String nome = sc.next();
    try{
      checarUsuario(nome);
    }
    catch(NoSuchUserException e){
      try{
        checarFuncionario(nome);
      }
      catch(NoSuchUserException nsue){
        System.out.println("Erro: Usuário não encontrado");
        return;
      }
    }
    Console console = System.console();
    String senha = new String(console.readPassword("Digite sua senha: "));
    try{
      checarSenha(senha);
    }
    catch(InvalidPasswordException ipe){
      System.out.println("Erro: Senha inválida");
      sair();
      return;
    }
  }
  public Usuario getUsuarioLogado(){
    return usuarioLogado;
  }
  public void sair(){
    usuarioLogado = null;
  }
  private void carregarUsuarios(){
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
  private void carregarFuncionarios(){
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
      throws NoSuchUserException{
    usuarioLogado = usuarios.get(nome);
    if (usuarioLogado == null)
      throw new NoSuchUserException("Usuário não encontrado");
  }
  private void checarFuncionario(String nome) 
      throws NoSuchUserException{
    usuarioLogado = funcionarios.get(nome);
    if (usuarioLogado == null)
      throw new NoSuchUserException("Usuário não encontrado");
  }
  private void checarSenha(String senha)
    throws InvalidPasswordException{
      if (senha.equals(usuarioLogado.getSenha())){
        System.out.println(
            "Seja bem vindo, " + usuarioLogado.getNome());
      }
      else {
        throw new InvalidPasswordException("Senha inválida");
      }
  }
}

