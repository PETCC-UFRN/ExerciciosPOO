package Relacoes.Derivacao.Exercicio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Alimento> lista = new ArrayList<Alimento>();
		
		Alimento a1 = new Animal("Picanha", 5.0, 20.0, 2000.0);
		Alimento a2 = new Animal("Leite", 2.0, 3.0, 500.0);
		Alimento a3 = new Vegetal("Tomate", 0.43, 4.50, 300.0);
		Alimento a4 = new Vegetal("Cebola", 0.050, 3.50, 100.0);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		int countA = 0;
		int countV = 0;
		for (Alimento e: lista) 
		{
			if(e instanceof Animal) 
			{
				countA++;
			}
			else if(e instanceof Vegetal) 
			{
				countV++;
			}
		}
		
		System.out.println("Quantidade de alimentos do tipo animal: " + countA);
		System.out.println("Quantidade de alimentos do tipo vegetal: " + countV);
	}

}
