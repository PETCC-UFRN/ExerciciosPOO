package Relacoes.Agregacao.Exemplo;

import java.util.ArrayList;

public class Formiga
{
	private String trabalho;
	private ArrayList<Formiga> colonia;

	public Formiga() 
	{
		colonia = new ArrayList<Formiga>();
		colonia.add(this);
	}
	
	public void addMembro(Formiga novo) 
	{
		colonia.add(novo);
	}
	
	public void descColonia() 
	{
		System.out.println("A colônia possui " + this.colonia.size() + " membros, sendo eles ");
		int rainhas = 0;
		int operarias = 0;
		int rastreadoras = 0;
		for (Formiga e : colonia) 
		{
			if(e.trabalho.contentEquals("Rainha")) 
			{
				rainhas++;
			}
			else if(e.trabalho.contentEquals("Operaria")) 
			{
				operarias++;
			}
			else if(e.trabalho.contentEquals("Rastreadora"))
			{
				rastreadoras++;
			}
		}
		System.out.println(rainhas + " Rainhas, " + operarias + " Operarias e " + rastreadoras + " Rastreadoras.");
	}
	
	public String getTrabalho() 
	{
		return trabalho;
	}

	public void setTrabalho(String trabalho) 
	{
		this.trabalho = trabalho;
	}
}
