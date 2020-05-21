package Relacoes.Agregacao.Exercicio;

public class Main {

	public static void main(String[] args) 
	{
		Arma a1 = new Arma();
		a1.setNome("Espada Curta");
		a1.setAtaque(0);
		a1.setDurabilidade(20);
		
		Armadura arm1 = new Armadura();
		arm1.setNome("Armadura de Couro");
		arm1.setDefesa(0);
		arm1.setDurabilidade(50);
		
		PDJ p1 = new PDJ();
		p1.setNome("Cléber");
		p1.setVida(30);
		p1.setArmaPrincipal(a1);
		p1.setArmadura(arm1);
		
		NPC m1 = new NPC();
		m1.setNome("Goblin");
		m1.setAtaque(10);
		m1.setVida(20);
		
		p1.Combater(m1);
	}

}
