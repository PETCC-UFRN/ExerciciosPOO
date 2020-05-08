package Relacoes.Agregacao.Exemplo;

import java.util.ArrayList;

public class Humano
{
	private String nome;
	private String endereco;
	private String numTelefone;
	private ArrayList<Humano> grupoSocial;
	
	public Humano() 
	{
		grupoSocial = new ArrayList<Humano>();
	}
	
	public void addGrupo(Humano novo) 
	{
		grupoSocial.add(novo);
	}
	
	public void printGrupo() 
	{
		System.out.println("O grupo de " + this.nome + " é composto por:");
		for (Humano e : grupoSocial) 
		{
			System.out.println(e.getNome()); // Poderia ser só e.nome
		}
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getEndereco() 
	{
		return endereco;
	}
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public String getNumTelefone() 
	{
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) 
	{
		this.numTelefone = numTelefone;
	}
	
}
