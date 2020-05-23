package VelhaOfGame;

public class Main {

	public static void main(String[] args) 
	{
		GameManeger g = new GameManeger();
		g.gameStart();
		while(!g.isFinished()) 
		{
			g.turno();
		}
	}

}
