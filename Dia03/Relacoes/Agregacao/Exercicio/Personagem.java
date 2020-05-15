package Relacoes.Agregacao.Exercicio;

public class Personagem 
{
	private String nome;
	private int vida;
	public Arma armaPrincipal;
	public Armadura armadura;
	public boolean vivo;
	
	public void Combater(Monstro monstro) 
	{
		while(this.vivo && monstro.isVivo()) 
		{
			monstro.setVida(monstro.getVida() - this.armaPrincipal.getAtaque());
			if(monstro.getVida() <= 0) 
			{
				monstro.setVivo(false);
				//break;
				continue;
			}
			
			int danoPersonagem =  monstro.getAtaque() - this.armadura.getDefesa();
			
			if (danoPersonagem < 0) 
			{
				danoPersonagem = 0;
			}
			
			this.vida = this.vida - danoPersonagem;
			
			if(this.vida <= 0) 
			{
				this.vivo = false;
				//break;
			}
		}
		
		System.out.println("O resultado final do combate é:");
		
		if(!monstro.isVivo()) 
		{
			System.out.println("O monstro foi derrotado com sucesso!!!");
		}
		else
		{
			System.out.println("O personagem foi derrotado e o monstro foi vitorioso!!!");
		}
		
	}
	
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

	public Arma getArmaPrincipal() 
	{
		return armaPrincipal;
	}

	public void setArmaPrincipal(Arma armaPrincipal) 
	{
		this.armaPrincipal = armaPrincipal;
	}

	public Armadura getArmadura() 
	{
		return armadura;
	}

	public void setArmadura(Armadura armadura) 
	{
		this.armadura = armadura;
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
