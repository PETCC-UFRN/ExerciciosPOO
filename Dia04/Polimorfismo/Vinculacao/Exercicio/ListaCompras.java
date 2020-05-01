package Polimorfismo.Vinculacao.Exercicio;

import java.util.ArrayList;

public class ListaCompras 
{
	private ArrayList<ItemCompra> lista;
	
	public ListaCompras() 
	{
		this.lista = new ArrayList<ItemCompra>();
	}
	
	public void addItem(ItemCompra item) 
	{
		lista.add(item);
	}
	
	private double valorTotal() 
	{
		double total = 0.0;
		
		for (ItemCompra e : lista) 
		{
			total += e.getValor();
		}
		
		return total;
	}
	
	public void descLista() 
	{
		System.out.println("Os itens atuais na lista são: ");
		System.out.println("------------------------------");
		for (ItemCompra e: lista) 
		{
			System.out.println(e.getNome()+".");
		}
		System.out.println("------------------------------");
		
		System.out.println("Totalizando: "+valorTotal()+"R$ em compras.");
	}
}
