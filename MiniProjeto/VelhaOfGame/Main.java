package VelhaOfGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		GameManeger g = new GameManeger();
		g.gameStart();
		boolean quit = false;
		Scanner leitor = new Scanner(System.in);
		while(!quit) 
		{
			while(!g.isFinished()) 
			{
				g.turno();
				g.verificarVitoria();
			}
			g.winnerMessage();
			
			System.out.println("Deseja jogar novamente?");
			System.out.print("Digite 1 para sim ou 2 para não: ");
			int resp = leitor.nextInt();
			
			if (resp == 2) 
			{
				quit = true;
			}
			else 
			{
				g.reset();
			}
			
		}
		System.out.println("Obigado por jogar!!!");
		
		leitor.close();
		
	}

}
