
public class Funcionario extends Pessoa {
  public Funcionario(String nome, byte[] senha){
    super(nome, senha);
  }
  @Override
  public void mostrarOpcoes(){
    System.out.println("Eu sou um funcionário");
  }
}
