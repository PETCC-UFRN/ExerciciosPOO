
public class Funcionario extends Pessoa {
  public Funcionario(String nome, String senha){
    super(nome, senha);
  }
  @Override
  public void mostrarOpcoes(){
    System.out.println("Eu sou um funcionário");
  }
}
