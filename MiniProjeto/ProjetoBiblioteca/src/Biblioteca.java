import java.io.Console;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.Comparator;
import java.util.Scanner;


public class Biblioteca{
      //Comparator.comparing(Usuario::getNome));
      //Comparator.comparing(Funcionario::getNome));
  private Autenticador autenticador = Autenticador.getInstance();
  private Usuario usuarioLogado = null;
  Scanner sc = new Scanner(System.in);
  
  public Biblioteca(){
    mostrarOpcoes();
  }
  private void mostrarOpcoes(){
    if (autenticador.getUsuarioLogado()!= null){
      //@TODO
      System.out.println("Bem-vindo, " + 
          autenticador
          .getUsuarioLogado()
          .getNome());
      autenticador
        .getUsuarioLogado().mostrarOpcoes();
      //if (autenticador.getUsuarioLogado() instanceof Funcionario)
      //  System.out.println("Opções de Funcionário");
      System.out.print( 
          "l - listar itens\n" +
          "s - Sair\n");
      String opt = sc.next();
      if (opt.charAt(0) == 's'){
        autenticador.sair();
        mostrarOpcoes();
      }
      else
        mostrarOpcoes();
    }
    else {
      System.out.print( 
          "l - Fazer login\n" +
          "c - Fazer cadastro\n" +
          "f - Fechar\n");
      String opt = sc.next();
      if (opt.charAt(0) == 'l'){
        autenticador.login();
        mostrarOpcoes();
      }
      else if (opt.charAt(0) == 'c')
        ;
      //cadastro();
      else if (opt.charAt(0) == 'f')
        fechar();
      else
        System.out.println("Opção inválida");
    }
  }
  private void fechar(){
    System.out.println("Fechando...");
  }
}

