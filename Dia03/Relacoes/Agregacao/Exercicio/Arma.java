package Relacoes.Agregacao.Exercicio;

public class Arma 
{
	private String nome;
	private int poderAtaque;
	private int durabilidade;
	
	public Arma(String nome, int poderAtaque, int durabilidade) 
	{
		this.nome = nome;
		this.poderAtaque = poderAtaque;
		this.durabilidade = durabilidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPoderAtaque() {
		return poderAtaque;
	}
	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
}
