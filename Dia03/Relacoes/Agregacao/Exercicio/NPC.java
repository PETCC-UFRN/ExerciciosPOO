package Relacoes.Agregacao.Exercicio;

public class NPC extends Personagem
{
	private int ataque;
	
	public NPC() 
	{
		this.vivo = true;
	}
	
	public int getAtaque() 
	{
		return ataque;
	}
	public void setAtaque(int ataque) 
	{
		this.ataque = ataque;
	}
}
