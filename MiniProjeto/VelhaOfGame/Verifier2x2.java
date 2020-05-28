package VelhaOfGame;

public class Verifier2x2 extends Verifier
{
	public boolean solve(Tabuleiro t, Player p, boolean velha) 
	{	
		if(verificarDiagonal(t, p)) 
		{
			return true;
		}

		if(verificarLinha(t,p)) 
		{
			return true;
		}	
		
		if(verificarColuna(t,p)) 
		{
			return true;
		}
		
		if(verificarVelha(t, velha)) 
		{
			return true;
		}
		
		return false;
	}
	
	private boolean verificarDiagonal(Tabuleiro t, Player p) 
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
			return true;
		}
		
		return false;
	}
	
	private boolean verificarLinha(Tabuleiro t, Player p) 
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
					return true;
				}
			}
			count = 0;
		}
		
		return false;
	}
	
	private boolean verificarVelha(Tabuleiro t, boolean velha) 
	{
		int count = 0;
		
		for (int i = 0; i < 3; i++) 
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
			velha = true;
			return true;
		}
		
		return false;
	}
	
}
