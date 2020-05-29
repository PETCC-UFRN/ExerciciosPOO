package LojaDeRoupa;

public class Calcados extends Produto{
	int tamanho;
	boolean fechado;
	boolean baixo;
	
	public Calcados(String nome, double preco, String cor, String categoria, String area, int tamanho, boolean fechado, boolean baixo) {
		super(nome, preco, cor, categoria, area);
		this.tamanho = tamanho;
		this.fechado = fechado;
		this.baixo = baixo;
	}
	
	public String cadastrar() {
		return (this.nome + " de tamanho " + this.tamanho + " cadastrado(a)");
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean getFechado() {
		return fechado;
	}
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	public boolean getBaixo() {
		return baixo;
	}
	public void setBaixo(boolean baixo) {
		this.baixo = baixo;
	}
	  
}
