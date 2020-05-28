package VelhaOfGame;

public class Player 
{
	protected String nome;
	protected int numVitorias;
	protected int marca;
	
	public void play(Tabuleiro t) 
	{
		// Override me
	}
	
	public Player(String nome, int marca) 
	{
		this.nome = nome;
		this.marca = marca;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getNumVitorias() 
	{
		return numVitorias;
	}
	public void setNumVitorias(int numVitorias) 
	{
		this.numVitorias = numVitorias;
	}
	public int getMarca() 
	{
		return marca;
	}
	public void setMarca(int marca) 
	{
		this.marca = marca;
	}
	
	
}
