package Relacoes.Heranca.Exemplo;

import java.util.ArrayList;

public class Catalogo 
{
	private ArrayList<Animal> lista;
	
	public Catalogo() {
		lista = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal novo) 
	{
		lista.add(novo);
	}
	
	public void printLista() 
	{
		int i = 1;
		for (Animal e : lista) 
		{
			System.out.print("Animal n°" + i++ + " ");
			System.out.println(e.getNomeEspecie());
		}
	}
}
