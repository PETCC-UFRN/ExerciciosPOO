package VelhaOfGame;

import java.util.Scanner;

public class GameManeger 
{
	private Player p1;
	private Player p2;
	private Tabuleiro t;
	private Verifier v;
	private boolean finished;
	private int lastTurn;
	private boolean velha;
	
	
	public GameManeger() 
	{
		finished = false;
		lastTurn = 2;
		velha = false;
	}
	
	public boolean isFinished() 
	{
		return this.finished;
	}
	
	public void gameStart(int flag) 
	{
		Scanner leitor = new Scanner(System.in);
		t = new Tabuleiro();
		v = new Verifier2x2();
		
		if (flag == 1) 
		{
			System.out.print("Player 1, digite seu nome: ");
			String dummy = leitor.next();
			p1 = new Humano(dummy, 1);
			System.out.print("Player 2, digite seu nome: ");
			String dummy2 = leitor.next();
			p2 = new Humano(dummy2, 2);
		}
		else if(flag == 2) 
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
	
	public void turno() 
	{
		if(lastTurn == 2) 
		{
			lastTurn = 1;
			p1.play(t);
		}
		else if(lastTurn == 1) 
		{
			lastTurn = 2;
			p2.play(t);
		}
		
	}
	
	public void verificarVitoria() 
	{		
		if(lastTurn == 1) 
		{
			finished = v.solve(t, p1, velha);
		}
		else 
		{
			finished = v.solve(t, p2, velha);
		}
	}
	
	public void winnerMessage() 
	{
		if(velha) 
		{
			System.out.println("Deu velha!!! Ninguém ganhou :(");
		}
		else 
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
	
	public void printPlacar() 
	{
		System.out.println("Placar atual: ");
		System.out.println(p1.getNome()+" " + p1.getNumVitorias() + " vitórias");
		System.out.println(p2.getNome()+" " + p2.getNumVitorias() + " vitórias");
	}
	
	public void reset() 
	{
		if(velha) 
		{
			finished = false;
			velha = false;
			for (int i = 0; i < 3; i++) 
			{
				for (int j = 0; j < 3; j++) 
				{
					t.addMark(i, j, 0);
				}
			}
			
			lastTurn = 2;
		}
		else 
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
			for (int i = 0; i < 3; i++) 
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
