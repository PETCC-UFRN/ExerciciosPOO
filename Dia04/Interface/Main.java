class Main {
  public static void main(String[] args) {
    Produto p = new Produto(2.5);
    p.alugar();
    System.out.println("Estoque: " + p.getEstoque());
    System.out.println("Disponível: " + p.getDisponivel());
    System.out.println("Preço: R$" + p.getPreco());
  }
}

