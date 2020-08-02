package br.ufrn.estados;

import br.ufrn.Biblioteca;
import br.ufrn.Usuario;
import br.ufrn.UsuarioComum;

public class EstadoCadastro implements Estado {
    @Override
    public void mostrarOpcoes() {
        Biblioteca.getInstance().getAutenticador().cadastro();
        System.out.println("Deseja continuar?");
        System.out.println("c - continuar\nq - quitar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        Usuario usuarioLogado = Biblioteca.getInstance().getAutenticador().getUsuarioLogado();
        if (opt.charAt(0) == 'q')
            return null;
        else if (usuarioLogado == null) {
            return new EstadoInicial();
        }
        else if (usuarioLogado instanceof UsuarioComum){
            return new EstadoOpcoesComum();
        }
        else {
            return new EstadoOpcoesFuncionario();
        }
    }
}
