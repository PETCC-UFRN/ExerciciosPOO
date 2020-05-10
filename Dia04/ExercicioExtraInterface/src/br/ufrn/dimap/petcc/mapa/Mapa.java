package br.ufrn.dimap.petcc.mapa;

import java.awt.*;

public class Mapa {
    public char[][] matriz;// = new char[4][16];
    public Point coordenadasJogador;// = new Point(0,matriz.length-1);
    public Mapa(){
        new Mapa(4,16);
    }

    public Mapa(int linhas, int colunas){
        matriz = new char[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = '|';
            }
        }
        matriz[matriz.length - 1][0] = 'o';// o jogador
        coordenadasJogador = new Point(0,matriz.length-1);
    }

    public void desenhar(Point p, char c){
        if (p.y < matriz.length)
            if (p.x < matriz[0].length)
                matriz[p.y][p.x] = c;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                str += matriz[i][j];
            }
            str += '\n';
        }
        return str;
    }
}
