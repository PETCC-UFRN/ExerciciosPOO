package Polimorfismo.Template;
import java.util.ArrayList;

public class Buscador <T extends Comparable<T>>{
	
	public T buscarMaior(ArrayList<T> v) {
		int n = v.size();
		T maior = v.get(1);
		for(int i=1; i < n; i++) {
			if(maior.compareTo(v.get(i)) != 1) {
				maior = v.get(i);
			}
		}
		
		return maior;
	}
	
	public T buscarMenor(ArrayList<T> v) {
		int n = v.size();
		T menor = v.get(1);
		for(int i=1; i < n; i++) {
			if(menor.compareTo(v.get(i)) == 1) {
				menor = v.get(i);
			}
		}
		
		return menor;
	}
}
