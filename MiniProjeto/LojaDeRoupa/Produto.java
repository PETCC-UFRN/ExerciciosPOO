package LojaDeRoupa;

public class Produto {
	String nome;
	double preco;
	String cor;
	String categoria;
	String area;
	
	public Produto(String nome, double preco, String cor, String categoria, String area) {
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
		this.categoria = categoria;
		this.area = area;
	}

	public String cadastrar() {
		return ("Produto cadastrado");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getpreco() {
		return preco;
	}
	public void setpreco(double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
