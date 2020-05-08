import java.util.ArrayList;

class Loja {
  private int id_loja;
  private ArrayList<Funcionario> funcionarios;
  public int getIdLoja(){
    return id_loja;
  }
  void cadastrarFuncionario(Funcionario f){
    funcionarios.add(f);
  }
  void removerFuncionario(Funcionario f){
    funcionarios.remove(f);
  }
}

abstract class Funcionario
{
  String nome;
  String cpf;
  String getNome(){
    return nome;
  }
  String getCpf(){
    return cpf;
  }
  public Funcionario(){
    nome = "Fulano";
  }
}

class Vendedor extends Funcionario{
  Loja loja;
  Loja getLoja(){
    return loja;
  }
}

class Gerente extends Funcionario{
  Loja loja;
  public void cadastrarFuncionario(Funcionario f){
    this.loja.cadastrarFuncionario(f);
  }
  public void removerFuncionario(Funcionario f){
    this.loja.removerFuncionario(f);
  }
}

class Main {
  public static void main(String[] args) {
    Loja loja = new Loja();
    System.out.println("Hello loja");
  }
}

