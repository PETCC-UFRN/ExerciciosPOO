package deprecated;

public abstract class Usuario {
  private String nome;
  private String senha;
  public Usuario(String nome, String senha){
    this.nome  = nome;
    this.senha = senha;
  }
  public abstract void mostrarOpcoes();
  public abstract void tratarOpcao(String opt, Biblioteca bib);
  public String getNome(){
    return nome;
  }
  public String getSenha(){
    return senha;
  }
}
