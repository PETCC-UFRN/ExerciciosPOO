package Polimorfismo.Sobrecarga;

public class Main {

	public static void main(String[] args) {
		Pair p1 = new Pair("Oi, eu sou o dado", 30);
		Pair p2 = new Pair("Oi, eu sou o dado de chave zero", 0);
		Pair p3 = new Pair("Cinquenta", 50);
		
		ContainerPares v = new ContainerPares(3);
		
		//System.out.println(p1.getDado() + p1.getChave());
		
		v.add(p1);
		v.add(p2);
		v.add(p3);
		
		System.out.println("Usando a busca por chave: "
		+v.search(0).getDado());
		System.out.println("Usando a busca por dado: "
		+v.search("Cinquenta").getDado());
		System.out.println("Usando a busca por dado e chave: "
		+v.search(30,"Oi, eu sou o dado").getDado());
		
	}

}
