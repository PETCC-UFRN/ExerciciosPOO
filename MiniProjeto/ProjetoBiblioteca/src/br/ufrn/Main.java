package br.ufrn;

public class Main {

    public static void main(String[] args) {
        Biblioteca maquina = Biblioteca.getInstance();
        maquina.executar();
    }
}
