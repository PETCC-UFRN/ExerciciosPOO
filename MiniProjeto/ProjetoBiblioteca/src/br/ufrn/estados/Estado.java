package br.ufrn.estados;

import br.ufrn.Biblioteca;

public interface Estado {
    Biblioteca maquina = Biblioteca.getInstance();
    void mostrarOpcoes();
    Estado proximoEstado(String opt);
}
