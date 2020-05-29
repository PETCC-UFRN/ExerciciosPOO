package VelhaOfGame;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class GameManeger 
{
	private Player p1;
	private Player p2;
	private Tabuleiro t;
	private Verifier v;
	private boolean finished;
	private int lastTurn;
	private AtomicBoolean velha;
	
	
	public GameManeger()
	{
		finished = false;
		lastTurn = 2;
		velha = new AtomicBoolean();
		velha.set(false);
	}
	
	public boolean isFinished() 
	{
		return this.finished;
	}
	
	public void gameStart(int flag) // Instancia os objetos do jogo.
	{
		Scanner leitor = new Scanner(System.in);
		t = new Tabuleiro(); // Criando o tabuleiro do jogo.
		v = new Verifier3x3(); // Criando o verificador da condição de vitória.
		
		if (flag == 1) // Iniciando o jogo com dois jogadores humanos
		{
			System.out.print("Player 1, digite seu nome: ");
			String dummy = leitor.next();
			p1 = new Humano(dummy, 1);
			System.out.print("Player 2, digite seu nome: ");
			String dummy2 = leitor.next();
			p2 = new Humano(dummy2, 2);
		}
		else if(flag == 2) // Iniciando o jogo com 1 jogador humano e 1 IA.
		{
			System.out.print("Player 1, digite seu nome: ");
			String dummy = leitor.next();
			p1 = new Humano(dummy, 1);
			p2 = new Computador("Bot01",2);
		}	
		
		p1.setNumVitorias(0);
		p2.setNumVitorias(0);
		
		Tabuleiro.setNumPartidas(Tabuleiro.getNumPartidas()+1);
		System.out.println("Iniciando a partida de número: "+Tabuleiro.getNumPartidas());
	}
	
	public void turno() // Realiza o turno do jogador
	{
		if(lastTurn == 2) // caso o jogador 2 tenha sido o ultimo a jogar, a vez é do jogador 1.
		{
			lastTurn = 1;
			p1.play(t);
		}
		else if(lastTurn == 1) // caso o jogador 1 tenha sido o ultimo a jogar, a vez é do jogador 2.
		{
			lastTurn = 2;
			p2.play(t);
		}
		
	}
	
	public void verificarVitoria() 
	{		
		if(lastTurn == 1) // Verifica se o jogador 1 venceu.
		{
			finished = v.verify(t, p1, this.velha);
		}
		else // Verifica se o jogador 2 venceu.
		{
			finished = v.verify(t, p2, this.velha);
		}
	}
	
	public void winnerMessage() 
	{
		if(this.velha.get()) // Em caso de "velha", nenhum dos jogadores ganha
		{
			System.out.println("Deu velha!!! Ninguém ganhou :(");
		}
		else // Se não houve "velha", o último a jogar venceu.
		{
			if(lastTurn == 1) 
			{
				System.out.println("Parabéns " + p1.getNome() + "!!! Você venceu!!!");
			}
			else 
			{
				System.out.println("Parabéns " + p2.getNome() + "!!! Você venceu!!!");
			}
		}
	}
	
	public void printPlacar() // Mostra o placar atual.
	{
		System.out.println("Placar atual: ");
		System.out.println(p1.getNome()+" " + p1.getNumVitorias() + " vitórias");
		System.out.println(p2.getNome()+" " + p2.getNumVitorias() + " vitórias");
	}
	
	public void reset() // Reinicia o jogo.
	{
		if(this.velha.get()) // Em caso de empate, nenhum jogador ganha uma vitória.
		{
			finished = false;
			velha.set(false);
			for (int i = 0; i < 3; i++) // Reseta as marcações do tabuleiro.
			{
				for (int j = 0; j < 3; j++) 
				{
					t.addMark(i, j, 0);
				}
			}
			
			lastTurn = 2;
		}
		else // Se não houve empate, computar a vitória do jogador.
		{
			if(lastTurn == 1) 
			{
				p1.setNumVitorias(p1.getNumVitorias()+1);
			}
			else 
			{
				p2.setNumVitorias(p2.getNumVitorias()+1);
			}
			
			printPlacar();
			
			finished = false;
			for (int i = 0; i < 3; i++) // Reseta as marcações do tabuleiro.
			{
				for (int j = 0; j < 3; j++) 
				{
					t.addMark(i, j, 0);
				}
			}
			
			lastTurn = 2;
		}
		Tabuleiro.setNumPartidas(Tabuleiro.getNumPartidas()+1);
		System.out.println("Iniciando a partida de número: "+Tabuleiro.getNumPartidas());
	}
}
