import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Classe para simular um backend com autenticação de usuário
 */
public class Autenticador{
  static private Autenticador instance;
  private HashMap<String, Usuario> usuarios = new HashMap<>();
  private HashMap<String, Funcionario> funcionarios = new HashMap<>();
  private Pessoa usuarioLogado = null;
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
  public void cadastro(){
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
      }
    }
    System.out.print("Digite sua senha: ");
    Console console = System.console();
    String senha = new String(
        console.readPassword("Digite sua senha: "));
    try{
      checarSenha(senha);
    }
    catch(InvalidPasswordException ipe){
      System.out.println("Erro: Senha inválida");
    }
  }
  public Pessoa getUsuarioLogado(){
    return usuarioLogado;
  }
  public void sair(){
    usuarioLogado = null;
  }
  private void carregarUsuarios(){
    // @TODO: Carregar arquivo com nomes e senhas de usuarios
    String senha = "123";
    try{
      MessageDigest md = MessageDigest.getInstance("SHA3-512");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    byte[] hash = senha.getBytes(StandardCharsets.UTF_8);
    usuarios.put("josivan", new Usuario("josivan", hash));
  }
  private void carregarFuncionarios(){
    // @TODO: Carregar arquivo com nomes e senhas de funcionarios
    String senha = "123";
    try{
      MessageDigest md = MessageDigest.getInstance("SHA3-512");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    byte[] hash = senha.getBytes(StandardCharsets.UTF_8);
    funcionarios.put("admin", new Funcionario("admin", hash));
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
      try{
        MessageDigest md = MessageDigest.getInstance("SHA3-512");
      }
      catch(Exception e){
        e.printStackTrace();
      }
      byte[] hash = senha.getBytes(StandardCharsets.UTF_8);
      if (Arrays.equals(hash, usuarioLogado.getSenha())){
        System.out.println(
            "Seja bem vindo, " + usuarioLogado.getNome());
      }
      else {
        throw new InvalidPasswordException("Senha inválida");
        //System.out.println("Senha inválida");
      }
  }
}

