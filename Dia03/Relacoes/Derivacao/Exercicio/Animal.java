package Relacoes.Derivacao.Exercicio;

public class Animal extends Alimento
{
	private String nomeAlimento;
	private double peso;
	private double valorPeso;
	
	public Animal(String nomeAlimento, double peso, double valorPeso, double valor_nutricional) 
	{
		super(valor_nutricional);
		this.nomeAlimento = nomeAlimento;
		this.peso = peso;
		this.valorPeso = valorPeso;
	}
	
	public String getNomeAlimento() 
	{
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) 
	{
		this.nomeAlimento = nomeAlimento;
	}
	public double getPeso() 
	{
		return peso;
	}
	public void setPeso(int peso) 
	{
		this.peso = peso;
	}
	public double getValorPeso() 
	{
		return valorPeso;
	}
	public void setValorPeso(double valorPeso) 
	{
		this.valorPeso = valorPeso;
	}
	
}
