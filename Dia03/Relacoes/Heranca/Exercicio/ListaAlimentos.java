package Relacoes.Heranca.Exercicio;

import java.util.ArrayList;

public class ListaAlimentos 
{
	private ArrayList<Alimento> lista;
	
	public ListaAlimentos() 
	{
		lista = new ArrayList<Alimento>();
	}
	
	public void addAlimento(Alimento a) 
	{
		lista.add(a);
	}
	
	public void descLista() 
	{
		double pesoAnimal = 0.0;
		double pesoVegetal = 0.0;
		int countAnimal = 0;
		int countVegetal = 0;
		for (Alimento e: lista) 
		{
			if(e instanceof Animal) 
			{
				countAnimal++;
				Animal dummy = (Animal) e;
				pesoAnimal += dummy.getPeso();
			}
			else if(e instanceof Vegetal) 
			{
				countVegetal++;
				Vegetal dummy = (Vegetal) e;
				pesoVegetal += dummy.getPeso();
			}
		}
		
		System.out.println("A lista possui:\n" 
		+ countAnimal + " Alimentos de origem animal, somados num total de: " + pesoAnimal + " quilos;\n"
		+ countVegetal + " Alimentos de origem vegetal, somados num total de: " + pesoVegetal + " quilos.");
	}
}
