package br.ufrn.estados;

import br.ufrn.Biblioteca;

public interface Estado {
    void mostrarOpcoes();
    Estado proximoEstado(String opt);
}
