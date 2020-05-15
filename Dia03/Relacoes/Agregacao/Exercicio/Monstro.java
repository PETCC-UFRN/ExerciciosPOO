package Relacoes.Agregacao.Exercicio;

public class Monstro 
{
	private String nome;
	private int vida;
	private int ataque;
	private boolean vivo;
	
	public Monstro() 
	{
		this.vivo = true;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getVida() 
	{
		return vida;
	}
	public void setVida(int vida) 
	{
		this.vida = vida;
	}
	public int getAtaque() 
	{
		return ataque;
	}
	public void setAtaque(int ataque) 
	{
		this.ataque = ataque;
	}
	public boolean isVivo() 
	{
		return vivo;
	}
	public void setVivo(boolean vivo) 
	{
		this.vivo = vivo;
	}
}
