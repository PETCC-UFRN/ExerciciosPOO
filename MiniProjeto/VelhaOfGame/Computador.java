package VelhaOfGame;

public class Computador extends Player
{
	public Computador(String nome, int marca) 
	{
		super(nome,marca);
	}
	
	public void play (Tabuleiro t) // Realiza uma jogada da IA
	{
		boolean played = false;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if(t.at(i, j) == 0) 
				{
					t.addMark(i, j, marca);
					played = true;
					break;
				}
			}
			
			if(played == true) 
			{
				break;
			}
		}
		t.printTabuleiro();
	}
}
