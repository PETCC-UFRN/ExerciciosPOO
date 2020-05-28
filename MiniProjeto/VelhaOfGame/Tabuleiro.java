package VelhaOfGame;

public class Tabuleiro 
{
	private int[][] info;
	private static int numPartidas;
	
	public Tabuleiro() 
	{
		info = new int[3][3];
		
		for (int[] e : info) 
		{
			e = new int[3];
			
			for (int i : e) 
			{
				i = 0;
			}
		}
	}
	
	public static int getNumPartidas() 
	{
		return numPartidas;
	}
	
	public static void setNumPartidas(int numPartidas) 
	{
		Tabuleiro.numPartidas = numPartidas;
	}


	public void printTabuleiro() 
	{
		System.out.println("------------------");
		System.out.println("y/x 0 1 2");
		for (int i = 0; i < 3; i++) 
		{
			System.out.print(i+"  |");
			for (int j = 0; j < 3; j++) 
			{
				if(info[j][i] == 0) 
				{
					System.out.print(" |");
				}
				else if(info[j][i] == 1) 
				{
					System.out.print("X|");
				}
				else if(info[j][i] == 2) 
				{
					System.out.print("O|");
				}
			}
			System.out.print("\n");
		}
		System.out.println("------------------");
	}
	
	public void addMark(int x, int y, int mark) 
	{
		info[x][y] = mark;
	}
	
	public int at(int x, int y) 
	{
		return info[x][y];
	}
}
