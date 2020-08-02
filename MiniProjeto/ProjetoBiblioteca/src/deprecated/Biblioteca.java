package deprecated;

import java.util.Scanner;


public class Biblioteca{
  private Autenticador autenticador = Autenticador.getInstance();
  private Scanner sc = new Scanner(System.in);
  //private ArrayList<deprecated.Item> acervo = new ArrayList<>();
  //private HashMap<Integer, deprecated.Item> acervo = new HashMap<>();
  private Acervo acervo = new Acervo();
  private boolean aberto = true;

  private Item itemSelecionado = null;
  
  public Biblioteca(){
    //carregarAcervo();
  }

  public Item getItemSelecionado() {
    return itemSelecionado;
  }

  public void executar(){
    while(aberto)
      mostrarOpcoes();
  }
  private void mostrarOpcoes(){
    if (autenticador.getUsuarioLogado()!= null){
      System.out.println("Bem-vindo, " + autenticador.getUsuarioLogado()
          .getNome());
      autenticador.getUsuarioLogado().mostrarOpcoes();
      String opt = sc.next();
      if (opt.charAt(0) == 's'){
        autenticador.sair();
        //mostrarOpcoes();
      }
      else
        autenticador.getUsuarioLogado().tratarOpcao(opt, this);
        //mostrarOpcoes();
    }
    else {
      System.out.print( 
          "l - Fazer login\n" +
          "c - Fazer cadastro\n" +
          "f - Fechar\n");
      String opt = sc.next();
      if (opt.charAt(0) == 'l'){
        autenticador.login();
        //mostrarOpcoes();
      }
      else if (opt.charAt(0) == 'c'){
        autenticador.cadastro();
        //mostrarOpcoes();
      }
      else if (opt.charAt(0) == 'f')
        fechar();
      else
        System.out.println("Opção inválida");
    }
  }
  public void opcoesDeAcervo(){
    acervo.listarAcervo();
    System.out.println("Digite um número para mostrar opções:");
    String opt = sc.next();
    try {
      Item item = acervo.getItemById(Integer.parseInt(opt));
      itemSelecionado = item;
      item.mostrarDetalhes();
      System.out.println("e - Solicitar empréstimo");
      System.out.println("v - Voltar");
      opt = sc.next();
      if (opt.charAt(0)=='e') {
        autenticador.getUsuarioLogado().tratarOpcao("e", this);
      }
    }
    catch (Exception e) {
      System.out.println("Erro ao solicitar empréstimo");
      e.printStackTrace();
    }
  }
  private void fechar(){
    aberto = false;
    System.out.println("Fechando...");
  }
}

