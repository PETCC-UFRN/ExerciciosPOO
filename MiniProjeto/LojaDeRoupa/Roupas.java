package LojaDeRoupa;
public class Roupas extends Produto {
	int tamanho;
	String setorModa;
	
	public Roupas() {
		
	}
	
	public void cadastrar(int tamanho, String setorModa,String nome, double preço, String cor, String categoria, String area) {
		super.cadastrar(nome, preço, cor, categoria, area);
		this.tamanho = tamanho;
		this.setorModa = setorModa;	
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getSetorModa() {
		return setorModa;
	}
	public void setSetorModa(String setorModa) {
		this.setorModa = setorModa;
	}
}
