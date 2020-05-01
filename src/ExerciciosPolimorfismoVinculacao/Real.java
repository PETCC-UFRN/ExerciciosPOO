package ExerciciosPolimorfismoVinculacao;

public class Real extends Numeral
{

	private double numero;
	
	public Real(double numero) 
	{
		this.numero = numero;
	}
	
	public double getNumero() 
	{
		return this.numero;
	}
	
	public void setNumero(double numero) 
	{
		this.numero = numero;
	}
	
	public void printNum() {
		System.out.print(this.numero + " ");
	}
	
}
