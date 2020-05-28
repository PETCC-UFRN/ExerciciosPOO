package VelhaOfGame;

import java.util.concurrent.atomic.AtomicBoolean;

public class Verifier3x3 extends Verifier
{
	public boolean solve(Tabuleiro t, Player p, AtomicBoolean velha) 
	{	
		if(verificarDiagonal(t, p)) // Verifica se houve uma vitória na diagonal secudária ou principal.
		{
			return true;
		}

		if(verificarLinha(t,p)) // Verifica se houve uma vitória em uma das linhas.
		{
			return true;
		}	
		
		if(verificarColuna(t,p)) // Verica se houve uma vitória em uma das colunas.
		{
			return true;
		}
		
		if(verificarVelha(t)) // Verifica se houve empate.
		{
			velha.set(true);;
			return true;
		}
		
		return false;
	}
	
	private boolean verificarDiagonal(Tabuleiro t, Player p) 
	{
		int countPrinc = 0;
		int countSec = 0;
		for (int i = 0; i < 3; i++) // Verifica se houve vitória na diagonal principal.
		{
			if(t.at(i, i) == p.getMarca()) 
			{
				countPrinc++; // Conta de houveram 3 marcas daquele jogador na diagonal, se sim, ele ganhou.
			}
		}
		int j = 2;
		for (int i = 0; i < 3; i++) // Verifica a diagonal secundária.
		{
			if(t.at(j-i, i) == p.getMarca()) 
			{
				countSec++;
			}
		}
		
		if(countSec == 3 || countPrinc == 3) // Caso haja três marcas em alguma das diagonais, ele vence
		{
			return true;
		}
		
		return false;
	}
	
	private boolean verificarLinha(Tabuleiro t, Player p) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) // Mesma lógica das diagonais, caso haja três marcas em uma das linhas, o jogador ganha.
		{
			for (int j = 0; j < 3; j++) 
			{
				if(t.at(i, j) == p.getMarca()) 
				{
					count++;
				}
				if(count == 3) 
				{
					return true;
				}
			}
			count = 0;
		}
		
		return false;
	}
	
	private boolean verificarColuna(Tabuleiro t, Player p) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) // Mesma lógica das linhas, porém verifica as colunas
		{
			for (int j = 0; j < 3; j++) 
			{
				if(t.at(j, i) == p.getMarca()) 
				{
					count++;
				}
				if(count == 3) 
				{
					return true;
				}
			}
			count = 0;
		}
		
		return false;
	}
	
	private boolean verificarVelha(Tabuleiro t) 
	{
		int count = 0;
		
		for (int i = 0; i < 3; i++) // Percorre todo o tabuleiro, caso não haja nenhuma casa em branco, o jogo empatou.
		{
			for(int j = 0; j < 3; j++) 
			{
				if(t.at(i, j) == 0) 
				{
					count++;
				}
			}
		}
		
		if(count == 0) 
		{
			return true;
		}
		
		return false;
	}
	
}
