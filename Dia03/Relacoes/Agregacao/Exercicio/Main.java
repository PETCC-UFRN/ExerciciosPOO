package Relacoes.Agregacao.Exercicio;

public class Main {

	public static void main(String[] args) 
	{
		Personagem p1 = new Personagem("Kleber");
		
		Arma a1 = new Arma("Adaga comum", 30, 20);
		Arma a2 = new Arma("Shanker", 150, 10);
		
		Armadura arm1 = new Armadura("Armadura de couro", 11, 100);
		Armadura arm2 = new Armadura("Cota de Malha", 16, 500);
		
		p1.setArmaPrincipal(a1);
		p1.setArmadura(arm1);
		p1.descEquipamento();
		
		p1.setArmaPrincipal(a2);
		p1.setArmadura(arm2);
		p1.descEquipamento();
	}

}
