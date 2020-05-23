package VelhaOfGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Tabuleiro t = new Tabuleiro();
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		while(i < 4) 
		{
			t.printTabuleiro();
			System.out.println("Digite a localização x de onde deseja colocar a marca: ");
			int x = leitor.nextInt();
			System.out.println("Digite a localização y de onde deseja colocar a marca: ");
			int y = leitor.nextInt();
			System.out.println("Agora, digite qual marca deseja colocar: ");
			System.out.println("1 para o X\n2 para a O");
			int resp = leitor.nextInt();
			t.addMark(x, y, resp);
		}
		t.printTabuleiro();
		leitor.close();
	}

}
