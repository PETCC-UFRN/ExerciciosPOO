package VelhaOfGame;

import java.util.Scanner;

public class GameManeger 
{
	private Player p1;
	private Player p2;
	private Tabuleiro t;
	private int numRodadas;
	private boolean finished;
	private int lastTurn;
	
	public GameManeger() 
	{
		finished = false;
		numRodadas = 0;
		lastTurn = 2;
	}
	
	public void setNumRodadas(int numRodadas) 
	{
		this.numRodadas = numRodadas;
	}
	
	public int getNumRodadas() 
	{
		return this.numRodadas;
	}
	
	public boolean isFinished() 
	{
		return this.finished;
	}
	
	public void gameStart() 
	{
		Scanner leitor = new Scanner(System.in);
		p1 = new Player();
		p2 = new Player();
		t = new Tabuleiro();
		
		System.out.print("Player 1, digite seu nome: ");
		p1.setNome(leitor.next());
		p1.setMarca(1);
		System.out.print("Player 2, digite seu nome: ");
		p2.setNome(leitor.next());
		p2.setMarca(2);
		
		p1.setNumVitorias(0);
		p2.setNumVitorias(0);
		
		leitor.reset();
		leitor.close();
		
		System.out.println("Começando o jogo...");
	}
	
	public void turno() 
	{
		Scanner leitor = new Scanner(System.in);
		if(lastTurn == 2) 
		{
			lastTurn = 1;
			t.printTabuleiro();
			System.out.print(p1.getNome()+", digite a coordenada x onde deseja inserir a sua marca: ");
			String x = leitor.next();
			System.out.println(x);
			//System.out.print(p1.getNome()+", digite a coordenada y onde deseja inserir a sua marca: ");
			//int y = leitor.nextInt();
			//t.addMark(x, y, p1.getMarca());
			//t.printTabuleiro();
		}
		else if(lastTurn == 1) 
		{
			lastTurn = 2;
			t.printTabuleiro();
			//Scanner leitor = new Scanner(System.in);
			System.out.print(p2.getNome()+", digite a coordenada x onde deseja inserir a sua marca: ");
			int x = leitor.nextInt();
			System.out.print(p2.getNome()+", digite a coordenada y onde deseja inserir a sua marca: ");
			int y = leitor.nextInt();
			t.addMark(x, y, p2.getMarca());
			t.printTabuleiro();
		}
		
		leitor.close();
	}
	
	private void verificarDiagonal(Player p) 
	{
		int countPrinc = 0;
		int countSec = 0;
		for (int i = 0; i < 3; i++) 
		{
			if(t.at(i, i) == p.getMarca()) 
			{
				countPrinc++;
			}
		}
		int j = 2;
		for (int i = 0; i < 3; i++) 
		{
			if(t.at(j-i, i) == p.getMarca()) 
			{
				countSec++;
			}
		}
		
		if(countSec == 3 || countPrinc == 3) 
		{
			finished = true;
		}
	}
	
	private void verificarLinha(Player p) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if(t.at(i, j) == p.getMarca()) 
				{
					count++;
				}
				if(count == 3) 
				{
					finished = true;
					break;
				}
			}
			if(finished) 
			{
				break;
			}
		}
	}
	
	private void verificarColuna(Player p) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if(t.at(j, i) == p.getMarca()) 
				{
					count++;
				}
				if(count == 3) 
				{
					finished = true;
					break;
				}
			}
			if(finished) 
			{
				break;
			}
		}
	}
	
	public void verificarVitoria() 
	{
		Player p;
		if(lastTurn == 1) 
		{
			p = this.p1;
		}
		else 
		{
			p = this.p2;
		}
		
		verificarDiagonal(p);
		
		if(!finished) 
		{
			verificarLinha(p);
		}
		
		if(!finished) 
		{
			verificarColuna(p);
		}
		
	}
}
