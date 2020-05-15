package Relacoes.Heranca.Exemplo;

public class Main 
{
	public static void main(String args[]) 
	{
		Catalogo c = new Catalogo();
		
		Humano h1 = new Humano();
		Humano h2 = new Humano();
		Formiga f1 = new Formiga();
		Formiga f2 = new Formiga();
		
		h1.setNome("Fulano");
		h1.setEndereco("Rua das flores, n° 112");
		h1.setNumTelefone("84999531658");
		h1.setNumVertebras(32);
		h1.setNomeEspecie("Homo Sapiens");
		
		h2.setNome("Cicrano");
		h2.setEndereco("Rua das maçãs, n° 10");
		h2.setNumTelefone("84986745236");
		h2.setNumVertebras(32);
		h2.setNomeEspecie("Homo Sapiens");
		
		f1.setNomeEspecie("Paraponera clavata");
		f1.setTrabalho("Rainha");
		
		f2.setNomeEspecie("Solenopsis");
		f2.setTrabalho("Operário");
		
		c.addAnimal(h1);
		c.addAnimal(h2);
		c.addAnimal(f1);
		c.addAnimal(f2);
		
		c.printLista();
	}
}
