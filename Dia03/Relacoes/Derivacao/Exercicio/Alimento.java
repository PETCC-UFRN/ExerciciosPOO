package Relacoes.Derivacao.Exercicio;

public class Alimento 
{
	protected double valor_nutricional;

	public Alimento(double valor_nutricional) 
	{
		this.valor_nutricional = valor_nutricional;
	}
	
	public double getValor_nutricional() 
	{
		return valor_nutricional;
	}

	public void setValor_nutricional(double valor_nutricional) 
	{
		this.valor_nutricional = valor_nutricional;
	}
}
