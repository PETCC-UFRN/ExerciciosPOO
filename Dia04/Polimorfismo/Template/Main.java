package Polimorfismo.Template;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Buscador<String> a = new Buscador<String>();

		ArrayList<String> v = new ArrayList<String>();
		
		v.add("Abra�o");
		v.add("Aabra�o");
		v.add("Silvino");
		v.add("Zeca");
		
		System.out.println(a.buscarMaior(v));
		
		System.out.println(a.buscarMenor(v));
	}

}
