/**
 * Item
 */
public abstract class Item {

  private int id;
  private String titulo;
  private int quantidade;
  private int disponiveis;
  public Item(String titulo){
    this.titulo = titulo;
  }
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
  
}
