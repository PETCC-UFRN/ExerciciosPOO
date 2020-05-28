package VelhaOfGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// Iniciando os objetos para come�ar o jogo.
		Scanner leitor = new Scanner(System.in);
		GameManeger g = new GameManeger();
		System.out.println("Bem vindo ao jogo da velha!!!");
		System.out.println("Quem ir� jogar?");
		System.out.println("Digite 1 para jogar com dois jogadores ou 2 para jogar contra a IA.");
		int type = leitor.nextInt(); // Flag para saber se h� mais de um jogador humano
		g.gameStart(type); // Inicializa o jogo.
		boolean quit = false; // Boleano respons�vel por contiuar as rodadas ou n�o
		while(!quit) 
		{
			while(!g.isFinished()) // Enquanto o jogo n�o foi finalizado... 
			{
				g.turno(); // Chama o turno do jogador atual.
				g.verificarVitoria(); // Verifica se o jogador atual venceu.
			}
			g.winnerMessage(); // Imprime a mensagem de vi�ria e mostra o placar atual.
			
			System.out.println("Deseja jogar novamente?");
			System.out.print("Digite 1 para sim ou 2 para n�o: ");
			int resp = leitor.nextInt();
			
			if (resp == 2) 
			{
				quit = true; // Aciona a sa�da do jogo
			}
			else 
			{
				g.reset(); // Reseta o tabuleiro para come�ar outra rodada.
			}
			
		}
		System.out.println("Obigado por jogar!!!");
		
		leitor.close();
		
	}

}
