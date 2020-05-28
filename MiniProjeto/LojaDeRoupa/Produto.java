package LojaDeRoupa;

public class Produto {
	String nome;
	double preco;
	String cor;
	String categoria;
	
	public Produto() {
		
	}
	
	public void cadastrar(String nome, double preco, String cor, String categoria, String area) {
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
		this.categoria = categoria;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preço;
	}
	public void setPreco(double preco) {
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
	String area;
}
