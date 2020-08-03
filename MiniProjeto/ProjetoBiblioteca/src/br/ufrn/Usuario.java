package br.ufrn;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public abstract class Usuario {
  private String nome;
  private String senha;

  public TreeSet<Emprestimo> getEmprestimos() {
    return this.emprestimos;
  }

  private TreeSet<Emprestimo> emprestimos = new TreeSet<Emprestimo>();
  public Usuario(String nome, String senha){
    this.nome  = nome;
    this.senha = senha;
    carregarEmprestimos();
  }
  public abstract void mostrarOpcoes();
  public abstract void tratarOpcao(String opt, Biblioteca bib);
  public String getNome(){
    return nome;
  }
  public String getSenha(){
    return senha;
  }
  private void carregarEmprestimos() {
    try {
      // Seria mais otimizado criar um arquivo de empréstimos para cada usuário, mas para simplificar...
      Scanner reader = new Scanner(new File("resources/emprestimos.csv"));
      String header = reader.nextLine();//Primeira linha é o cabeçalho
      while (reader.hasNextLine()){
        //0: Usuário;1:Data de Devolução;2:Data de Empréstimo;3:Id Item
        String[] dados = reader.nextLine().trim().split(";");
        System.out.println(dados[0]);
        Biblioteca biblioteca = Biblioteca.getInstance();
        if (dados[0].equals(nome)){
          Emprestimo e = new Emprestimo();
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
          e.setDataDevolucao(LocalDate.parse(dados[1], formatter));
          e.setDataEmprestimo(LocalDate.parse(dados[2], formatter));
          HashMap<Integer ,Item> acervo = biblioteca.getAcervo();
          Item item = acervo.get(Integer.parseInt(dados[3]));
          e.setItem(item);
          this.emprestimos.add(e);
        }
      }
      reader.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("Erros ao carregar os dados de empréstimos.");
    }
  }
  public void adicionarEmprestimo(Item item){
    Emprestimo e = new Emprestimo();
    item.setDisponiveis(item.getDisponiveis() - 1);
    e.setItem(item);
    try {
      getEmprestimos().add(e);
      BufferedWriter writer = new BufferedWriter(
              new FileWriter("resources/emprestimos.csv", true));
      //usuário;data de devolução;data de empréstimo;Id deprecated.Item
      writer.append("\n" + getNome() + ";" + e.getDataDevolucao() + ";" + e.getDataEmprestimo() + ";" + item.getId());
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
