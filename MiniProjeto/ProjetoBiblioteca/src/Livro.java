/**
 * Livro
 */
public class Livro extends Item {

  private String autor;
  private String edicao;
  private String ano;
  // Construtor
  public Livro(String titulo, String autor) {
    super(titulo);
    this.autor = autor;
  }
  // Getters
  public String getAutor() {
    return autor;
  }
  public String getEdicao() {
    return edicao;
  }
  public String getAno() {
    return ano;
  }
  // Setters
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public void setEdicao(String edicao) {
    this.edicao = edicao;
  }
  public void setAno(String ano) {
    this.ano = ano;
  }

}
