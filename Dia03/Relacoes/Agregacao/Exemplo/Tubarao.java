package Relacoes.Agregacao.Exemplo;

import java.util.ArrayList;

public class Tubarao 
{
	private double energia;
	private ArrayList<Remora> comen;
	
	public Tubarao() 
	{
		comen = new ArrayList<Remora>();
	}
	
	public void addRemo(Remora novo) 
	{
		this.comen.add(novo);
	}
	
	public void descComen() 
	{
		System.out.println("Este tubarão possui uma relação de comensalismo com " + this.comen.size() + " Rêmoras");
	}

	public double getEnergia() 
	{
		return energia;
	}

	public void setEnergia(double energia) 
	{
		this.energia = energia;
	}
}
