package br.ufrn;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class UsuarioComum extends Usuario {
  public UsuarioComum(String nome, String senha){
    super(nome, senha);
    //carregarEmprestimos();
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
        System.out.println("Número de empréstimos: " + getEmprestimos().size());
        for (Emprestimo e: getEmprestimos()) {
          System.out.println("deprecated.Item: " + e.getItem().getTitulo());
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

}

