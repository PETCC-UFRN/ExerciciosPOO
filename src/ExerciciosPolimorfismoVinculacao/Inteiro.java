package ExerciciosPolimorfismoVinculacao;

public class Inteiro extends Numeral{

	private int numero;
	
	public Inteiro(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public void printNum() {
		System.out.print(this.numero + " ");
	}
}
