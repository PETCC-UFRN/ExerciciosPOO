package LojaDeRoupa;

public class Acessorios extends Produto {
	 String formato;
	 String material;

	public Acessorios(String nome, double preco, String cor, String categoria, String area, String formato, String material) {
		super(nome, preco, cor, categoria, area);
		this.formato = formato;
		this.material = material;
		
	}

	public String cadastrar() {	
		return (this.nome + " de formato " + this.formato + " e material " + this.material + " cadastrado(a)");
	}
	 
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
