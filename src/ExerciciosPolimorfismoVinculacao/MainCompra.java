package ExerciciosPolimorfismoVinculacao;

import java.util.Scanner;

public class MainCompra {

	public static void main(String[] args) 
	{
		// Instanciando os produtos.
		ItemCompra i1 = new Produto(7.00, "Coke Kola 2L");
		ItemCompra i2 = new Produto(5.00, "Bizz chocolate branco");
		ItemCompra i3 = new Produto(5.00, "Xi-thus 200g");
		
		// Instanciando a lista de compras e o leitos de inputs
		ListaCompras list = new ListaCompras();
		Scanner leitor = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Bem vindo ao mercado online!!!");
		while(i!=4) 
		{
			System.out.println("Lista de produtos: ");
			System.out.println("Coke Kola 2L--número: 1\nBizz chocolate branco--número: 2\nXi-thus 200g--número: 3");
			System.out.print("Digite o numero do produto para adicioná-lo à sua lista: ");
			int prod = leitor.nextInt();
			switch(prod) 
			{
			case 1:
				list.addItem(i1);
				break;
			case 2:
				list.addItem(i2);
				break;
			case 3:
				list.addItem(i3);
				break;
			default:
				System.out.println("Este número não está na lista");
				break;
			}
			list.descLista();
			i++;
		}
		leitor.close();
	}

}
