import java.util.TreeSet;

public class Usuario extends Pessoa {
  TreeSet<Emprestimo> emprestimos;
  public Usuario(String nome, byte[] senha){
    super(nome, senha);
  }
  @Override
  public void mostrarOpcoes(){
    System.out.println("Eu sou um usuário");
  }
}
