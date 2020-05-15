package Relacoes.Heranca.Exercicio;

public class Main 
{

	public static void main(String[] args) 
	{
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Vegetal v1 = new Vegetal();
		Vegetal v2 = new Vegetal();
		
		a1.setValorEnergetico(400.0);
		a1.setFornecedor("Ceará");
		a1.setNome("Salsisha");
		a1.setPeso(2);
		a2.setValorEnergetico(350.0);
		a2.setFornecedor("Sadio");
		a2.setNome("Filé");
		a2.setPeso(10);
		
		v1.setValorEnergetico(500.0);
		v1.setFornecedor("Happy Farm");
		v1.setNome("Alface");
		v1.setPeso(5);
		
		v2.setValorEnergetico(1000.0);
		v2.setFornecedor("Vegan Man");
		v2.setNome("Castanha de Caju");
		v2.setPeso(8);
		
		ListaAlimentos list = new ListaAlimentos();
		
		list.addAlimento(a1);
		list.addAlimento(a2);
		list.addAlimento(v1);
		list.addAlimento(v2);
		
		list.descLista();
	}

}
