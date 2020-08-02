package br.ufrn;

import br.ufrn.estados.Estado;
import br.ufrn.estados.EstadoInicial;

import java.util.Scanner;

public class Biblioteca {
    /**
     * A referência estática faz parte de um padrão chamado Singleton.
     * Esse padrão garante que haja apenas uma instância da classe deprecated.Biblioteca.
     */
    private static Biblioteca biblioteca = new Biblioteca();
    private Estado estado = new EstadoInicial();
    public Scanner scanner = new Scanner(System.in);

    public Autenticador getAutenticador() {
        return autenticador;
    }

    private Autenticador autenticador = Autenticador.getInstance();
    private Biblioteca(){} // Com o construtor private não é possível criar uma instância de deprecated.Biblioteca

    /**
     * A única forma de retornar um objeto de deprecated.Biblioteca. E será sempre o mesmo objeto.
     * @return O único objeto da classe deprecated.Biblioteca.
     */
    public static Biblioteca getInstance() {
        return biblioteca;
    }

    /**
     * O loop principal da Máquina de Estados.
     */
    public void executar() {
        while (estado != null){
            estado.mostrarOpcoes();
            String opt = scanner.next();
            estado = estado.proximoEstado(opt);
        }
    }
}
