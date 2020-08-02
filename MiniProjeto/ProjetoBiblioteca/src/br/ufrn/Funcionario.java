package br.ufrn;

public class Funcionario extends Usuario {
  public Funcionario(String nome, String senha){
    super(nome, senha);
  }
  @Override
  public void mostrarOpcoes(){
    System.out.print( 
        "Opções:\n" +
        "l - listar itens\n" +
        "c - Cadastrar material no acervo\n" +
        "a - Aprovar solicitação de empréstimo\n" +
        "s - Sair\n");
  }
  @Override
  public void tratarOpcao(String opt, Biblioteca bib){
    switch (opt.charAt(0)){
      case 'l':
        System.out.println("TODO: Listar acervo");
        break; // @TODO
      case 'c':
        System.out.println("TODO: cadastrar material no acervo");
        break; // @TODO
      case 'a': System.out.println("TODO: Aprovar solicitação de empréstimo");
        break; // @TODO
      default: System.out.println("Opção Inválida");
        break;
    }
  }
}

