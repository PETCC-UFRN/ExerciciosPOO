public abstract class Pessoa {
  private String nome;
  private byte[] senha;
  public Pessoa(String nome, byte[] senha){
    this.nome  = nome;
    this.senha = senha;
  }
  public abstract void mostrarOpcoes();
  public String getNome(){
    return nome;
  }
  public byte[] getSenha(){
    return senha;
  }
}
