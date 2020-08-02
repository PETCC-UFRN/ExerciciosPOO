package br.ufrn;

import br.ufrn.estados.Estado;
import br.ufrn.estados.EstadoInicial;

import java.util.Scanner;

public class Biblioteca {
    private static Biblioteca maquina = new Biblioteca();
    private Estado estado = new EstadoInicial();
    public Scanner scanner = new Scanner(System.in);
    private Biblioteca(){}
    public static Biblioteca getInstance() {
        return maquina;
    }
    public void executar() {
        while (estado != null){
            estado.mostrarOpcoes();
            String opt = scanner.next();
            estado = estado.proximoEstado(opt);
        }
    }
}
