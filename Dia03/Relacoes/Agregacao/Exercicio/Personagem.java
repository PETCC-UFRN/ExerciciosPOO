package Relacoes.Agregacao.Exercicio;

public class Personagem 
{
	private String nome;
	public Arma armaPrincipal;
	public Armadura armadura;
	
	public Personagem(String nome) 
	{
		this.nome = nome;
	}

	public void descEquipamento() 
	{
		System.out.println("O personagem " + nome + " Está equipado com: ");
		System.out.println("Arma: " + armaPrincipal.getNome() + 
				           " | Poder de Ataque: " + armaPrincipal.getPoderAtaque() 
				           + " | Durabilidade atual: " + armaPrincipal.getDurabilidade());
		System.out.println("Armadura: " + armadura.getNome() + 
		                   " | Defesa: " + armadura.getDefesa()
		           + " | Durabilidade atual: " + armadura.getDurabilidade());
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
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
