import java.io.Console;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Biblioteca{
  private Autenticador autenticador = Autenticador.getInstance();
  private Scanner sc = new Scanner(System.in);
  private ArrayList<Item> itens = new ArrayList<>();
  private boolean aberto = true;
  
  public Biblioteca(){
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
  private void fechar(){
    aberto = false;
    System.out.println("Fechando...");
  }
}

