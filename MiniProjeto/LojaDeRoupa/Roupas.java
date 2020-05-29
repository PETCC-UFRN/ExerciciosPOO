package LojaDeRoupa;
public class Roupas extends Produto {
	int tamanho;
	String setorModa;

	public Roupas(String nome, double preco, String cor, String categoria, String area, int tamanho, String setorModa) {
		super(nome, preco, cor, categoria, area);
		this.tamanho = tamanho;
		this.setorModa = setorModa;
	}
	public String cadastrar() {	 
		return (this.nome + " de tamanho " + this.tamanho + " do setor " + this.setorModa + " cadastrado(a");
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
