package LojaDeRoupa;

public class Acessorios extends Produto {
	 String formato;
	 String material;
	 
	 public Acessorios() {
		 
	 }
	 
	 public void cadastrar(String formato, String material, String nome, double preço, String cor, String categoria, String area) {
			super.cadastrar(nome, preço, cor, categoria, area);
			this.formato = formato;
			this.material = material;		
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
