package Relacoes.Agregacao.Exercicio;

public class Armadura 
{
	private String nome;
	private int defesa;
	private int durabilidade;
	
	public Armadura(String nome, int defesa, int durabilidade) 
	{
		this.nome = nome;
		this.defesa = defesa;
		this.durabilidade = durabilidade;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getDefesa() 
	{
		return defesa;
	}

	public void setDefesa(int defesa) 
	{
		this.defesa = defesa;
	}

	public int getDurabilidade() 
	{
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) 
	{
		this.durabilidade = durabilidade;
	}
	
}
