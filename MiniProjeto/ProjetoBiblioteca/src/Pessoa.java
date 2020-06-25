public abstract class Pessoa {
  private String nome;
  private String senha;
  public Pessoa(String nome, String senha){
    this.nome  = nome;
    this.senha = senha;
  }
  public abstract void mostrarOpcoes();
  public String getNome(){
    return nome;
  }
  public String getSenha(){
    return senha;
  }
}
