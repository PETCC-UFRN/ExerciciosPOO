package br.ufrn;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class UsuarioComum extends Usuario {
  private TreeSet<Emprestimo> emprestimos = new TreeSet<>();
  public UsuarioComum(String nome, String senha){
    super(nome, senha);
    carregarEmprestimos();
  }
  private void carregarEmprestimos() {

    try {
      Scanner reader = new Scanner(new File("resources/emprestimos.csv"));
      String header = reader.nextLine();//Primeira linha é o cabeçalho
      while (reader.hasNextLine()){
        String[] dados = reader.nextLine().trim().split(",");
        if (dados[0].equals(getNome())){
          //@TODO adicionar empréstimo ao Set de empréstimos
        }
      }
      reader.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("Erros ao carregar os dados de empréstimos.");
    }
  }
  @Override
  public void mostrarOpcoes(){
    System.out.println(
        "l - Listar acervo\n" +
        "m - Mostrar meus empréstimos\n" +
        "s - Sair");
  }
  @Override
  public void tratarOpcao(String opt, Biblioteca bib){
    switch (opt.charAt(0)){
      case 'l': 
        //bib.opcoesDeAcervo();
        break;
      case 'm':
        System.out.println("Número de empréstimos: " + emprestimos.size());
        for (Emprestimo e: emprestimos) {
          System.out.println("deprecated.Item: " + e.item.getTitulo());
          System.out.println("Data de Devolução: " + e.getDataDevolucao());
        }
        break;
      case 'e':
        //System.out.println("Emprestado " + bib.getItemSelecionado().getTitulo());
        //adicionarEmprestimo(bib.getItemSelecionado());
        break;
      default: System.out.println("Opção Inválida");break;
    }
  }

  public void adicionarEmprestimo(Item item){
    Emprestimo e = new Emprestimo();
    e.setItem(item);
    try {
      emprestimos.add(e);
      BufferedWriter writer = new BufferedWriter(
              new FileWriter("resources/emprestimos.csv", true));
      //usuário;data de devolução;data de empréstimo;Id deprecated.Item
      writer.append("\n" + getNome() + ";" + e.dataDevolucao + ";" + e.getDataEmprestimo() + ";" + item.getId());
      writer.close();
    }
    catch (FileNotFoundException fnfe) {
      System.out.println("Erro: Ocorreu algum erro ao salvar as informações do usuário.");
      System.out.println("Erros ao salvar os dados de empréstimo.");
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }
}

