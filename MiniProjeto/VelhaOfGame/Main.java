package VelhaOfGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		GameManeger g = new GameManeger();
		System.out.println("Bem vindo ao jogo da velha!!!");
		System.out.println("Quem irá jogar?");
		System.out.println("Digite 1 para jogar com dois jogadores ou 2 para jogar contra a IA.");
		int type = leitor.nextInt();
		g.gameStart(type);
		boolean quit = false;
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
