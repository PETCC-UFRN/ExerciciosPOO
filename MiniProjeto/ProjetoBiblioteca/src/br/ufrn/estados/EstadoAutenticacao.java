package br.ufrn.estados;

import br.ufrn.*;

public class EstadoAutenticacao implements Estado{

    @Override
    public void mostrarOpcoes() {
        try {
            Biblioteca.getInstance().getAutenticador().login();
            System.out.println("Bem-vindo " + Biblioteca.getInstance()
                    .getAutenticador()
                    .getUsuarioLogado()
                    .getNome());
        } catch (NoSuchUserException e) {
            System.out.println("Usuário não encontrado!");
        } catch (InvalidPasswordException e) {
            System.out.println("Senha inválida");;
        }
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
