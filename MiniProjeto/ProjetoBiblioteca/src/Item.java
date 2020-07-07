/**
 * Item
 */
public abstract class Item {
  // TODO: Trocar por ISBN para livros e ISSN para periódicos
  private int id;
  private String titulo;
  private int quantidade;
  private int disponiveis;
  public Item(){ /* Empty */}
  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public int getQuantidade() {
    return quantidade;
  }
  public void setDisponiveis(int disponiveis) {
    this.disponiveis = disponiveis;
  }
  public int getDisponiveis() {
    return disponiveis;
  }
  public abstract void mostrarDetalhes();
  
}
