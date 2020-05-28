package LojaDeRoupa;

public class Calçados extends Produto{
	int tamanho;
	boolean fechado;
	boolean baixo;
	
	public Calcados() {
		
	}
	
	public void cadastrar(int tamanho, boolean fechado, boolean baixo, String nome, double preco, String cor, String categoria, String area) {
		super.cadastrar(nome, preco, cor, categoria, area);
		this.tamanho = tamanho;
		this.fechado = fechado;
		this.baixo = baixo;		
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
