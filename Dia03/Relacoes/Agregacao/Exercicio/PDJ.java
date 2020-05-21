package Relacoes.Agregacao.Exercicio;

public class PDJ extends Personagem
{
	public Arma armaPrincipal;
	public Armadura armadura;
	
	public void Combater(NPC monstro) 
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
			System.out.println("O NPC " + monstro.getNome() + " foi derrotado com sucesso!!!");
		}
		else
		{
			System.out.println("O PDJ " + this.nome + " foi derrotado e o " + monstro.getNome() + " foi vitorioso!!!");
		}
		
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
}
