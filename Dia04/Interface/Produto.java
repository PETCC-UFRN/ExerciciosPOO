class Produto implements Alugavel, Vendavel
{
  private float preco;
  static public int estoque = 0;
  static public int disponivel = 0;
  Produto(float preco){
    estoque++;
    disponivel++;
    this.preco = preco;
  }
  @Override
  public void alugar(){
    disponivel--;
    preco*=0.95;
  }
  // Existe um erro de modelagem nesse método. Consegue descobrir qual?
  @Override 
  public void devolver(){
    disponivel++;
  }
  // Existe um erro de modelagem nesse método. Consegue descobrir qual?
  // Dica: Está relacionado ao princípio da responsabilidade única
  @Override
  public void vender(){
    estoque--;
  }

  /* Setters and Getters */
  public getPreco(){
    return preco;
  }
  public getEstoque(){
    return estoque;
  }
  public getDisponivel(){
    return disponivel;
  }
}

