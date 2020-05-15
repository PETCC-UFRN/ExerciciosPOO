package Relacoes.Agregacao.Exercicio;

public class Main {

	public static void main(String[] args) 
	{
		Arma a1 = new Arma();
		a1.setNome("Espada Curta");
		a1.setAtaque(15);
		a1.setDurabilidade(20);
		
		Armadura arm1 = new Armadura();
		arm1.setNome("Armadura de Couro");
		arm1.setDefesa(10);
		arm1.setDurabilidade(50);
		
		Personagem p1 = new Personagem();
		p1.setNome("Jorgin");
		p1.setVida(30);
		p1.setArmaPrincipal(a1);
		p1.setArmadura(arm1);
		
		Monstro m1 = new Monstro();
		m1.setNome("Goblin");
		m1.setAtaque(10);
		m1.setVida(20);
		
		p1.Combater(m1);
	}

}
