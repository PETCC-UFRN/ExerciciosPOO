package VelhaOfGame;

import java.util.Scanner;

public class Humano extends Player
{
	public Humano(String nome, int marca) 
	{
		super(nome,marca);
	}
	
	public void play(Tabuleiro t) 
	{
		Scanner leitor = new Scanner(System.in);
		t.printTabuleiro();
		boolean valid = false;
		while(!valid) 
		{		
			System.out.print(this.nome+", digite a coordenada x onde deseja inserir a sua marca: ");
			int x = leitor.nextInt();
			System.out.print(this.nome+", digite a coordenada y onde deseja inserir a sua marca: ");
			int y = leitor.nextInt();
			
			if(t.at(x, y) != 0 || x > 2 || x < 0 || y > 2 || y < 0) 
			{
				System.out.println("Digite uma coordenada válida!!!");
			}
			else 
			{
				t.addMark(x, y, marca);
				valid = true;
			}
			
			t.printTabuleiro();
		}
	}
}
