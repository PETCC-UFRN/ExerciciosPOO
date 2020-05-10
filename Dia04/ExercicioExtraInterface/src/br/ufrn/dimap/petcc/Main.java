package br.ufrn.dimap.petcc;

import br.ufrn.dimap.petcc.comandos.*;
import br.ufrn.dimap.petcc.mapa.Mapa;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Comando> historico = new Stack<>();
        Mapa mapa = new Mapa(8,16);
        char opt = 's';
        Scanner scanner = new Scanner(System.in);
        while (opt != 'q'){
            System.out.println(mapa);
            System.out.println("Digite um comando:\nc - Mover para cima | " +
                    "d - Desfazer | q - Quitar\n");
            opt = scanner.next().charAt(0);
            if (opt == 'c') {
                historico.add(new MoverParaCima());
                historico.peek().executar(mapa);
            }
            else if (opt == 'd') {
                historico.pop().desfazer(mapa);
            }
        }
    }
}
