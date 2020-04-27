package ExerciciosPolimorfismo;
import java.util.ArrayList;

public class Conteiner {

	public static void main(String args[]) {
		
		ArrayList<Numeral> Arr = new ArrayList<Numeral>();
		
		Numeral num1 = new Inteiro(3);
		Numeral num2 = new Real(50.00);
		Numeral num3 = new Inteiro(15);
		Numeral num4 = new Real(-600.00);
		Numeral num5 = new Inteiro(-70);
		Numeral num6 = new Real(30.00);
		
		Arr.add(num1);
		Arr.add(num2);
		Arr.add(num3);
		Arr.add(num4);
		Arr.add(num5);
		Arr.add(num6);
		
		for (Numeral e : Arr){
			e.printNum();
		}
	}
	
}
