package br.ufrn;

import br.ufrn.estados.Estado;
import br.ufrn.estados.EstadoInicial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    /**
     * A referência estática faz parte de um padrão chamado Singleton.
     * Esse padrão garante que haja apenas uma instância da classe deprecated.Biblioteca.
     */
    private static final Biblioteca INSTANCE = new Biblioteca();
    static private Estado estado = new EstadoInicial();
    static public Scanner scanner = new Scanner(System.in);
    static private HashMap<Integer, Item> acervo = new HashMap<>();
    static private Autenticador autenticador = Autenticador.getInstance();

    private Biblioteca(){
    } // Com o construtor private não é possível criar uma instância de Biblioteca
    /**
     * A única forma de retornar um objeto de deprecated.Biblioteca. E será sempre o mesmo objeto.
     * @return O único objeto da classe deprecated.Biblioteca.
     */
    public static Biblioteca getInstance() {
        if (acervo.isEmpty())
            carregarAcervo();
        return INSTANCE;
    }

    public HashMap<Integer, Item> getAcervo() {
        return acervo;
    }

    public Autenticador getAutenticador() {
        return autenticador;
    }

    /**
     * O loop principal da Máquina de Estados.
     */
    public void executar() {
        carregarAcervo();
        while (estado != null){
            estado.mostrarOpcoes();
            String opt = scanner.next();
            estado = estado.proximoEstado(opt);
        }
    }

    static private void carregarAcervo(){
        //Carregar os livros
        try {
            Scanner reader = new Scanner(new File("resources/acervo/livros.csv"));
            //0:Id,1:Titulo,2:Autor,3:Edição,4:Ano,5:Quantidade,6:Disponíveis
            String header = reader.nextLine();//Primeira linha é o cabeçalho
            while (reader.hasNextLine()){
                String[] dados = reader.nextLine().trim().split(";");
                int id = Integer.parseInt(dados[0]);
                Livro livro = new Livro();
                livro.setId(id);
                livro.setTitulo(dados[1]);
                livro.setAutor(dados[2]);
                livro.setEdicao(dados[3]);
                livro.setAno(dados[4]);
                livro.setQuantidade(Integer.parseInt(dados[5]));
                livro.setDisponiveis(Integer.parseInt(dados[6]));
                acervo.put(id, livro);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao carregar acervo.");
            //sair();
        }
        //Carregar os periódicos
        try {
            Scanner reader = new Scanner(new File("resources/acervo/periodicos.csv"));
            String header = reader.nextLine();//Primeira linha é o cabeçalho
            //0:Id;1:Título;2:Ano;3:Volume;4:Número;5:Assunto;6:Quantidade;7:Disponíveis
            while (reader.hasNextLine()){
                String[] dados = reader.nextLine().trim().split(";");
                int id = Integer.parseInt(dados[0]);
                Periodico periodico = new Periodico();
                periodico.setId(id);
                periodico.setTitulo(dados[1]);
                periodico.setAno(dados[2]);
                periodico.setVolume(Integer.parseInt(dados[3]));
                periodico.setNumero(Integer.parseInt(dados[4]));
                periodico.setAssunto(dados[5]);
                periodico.setQuantidade(Integer.parseInt(dados[6]));
                periodico.setDisponiveis(Integer.parseInt(dados[7]));
                acervo.put(id, periodico);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao carregar acervo.");
        }
    }
}
