package Relacoes.Agregacao.Exercicio;

public class Personagem 
{
	protected String nome;
	protected int vida;
	protected boolean vivo;
	
	public Personagem() 
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

	public boolean isVivo() 
	{
		return vivo;
	}

	public void setVivo(boolean vivo) 
	{
		this.vivo = vivo;
	}
	
	
}
