package br.ufrn.estados;

import br.ufrn.Autenticador;
import br.ufrn.Emprestimo;
import br.ufrn.UsuarioComum;

public class EstadoMostrarEmprestimos implements Estado {
    @Override
    public void mostrarOpcoes() {
        if (Autenticador.getInstance().getUsuarioLogado().getEmprestimos().isEmpty())
            System.out.println("Nenhum empréstimo");
        else {
            System.out.println("Título; Data de Empréstimo; Data de Devolução");
            for (Emprestimo e :
                    Autenticador.getInstance()
                            .getUsuarioLogado().getEmprestimos()) {
                System.out.println(e.getItem().getTitulo() + ";" +
                        e.getDataEmprestimo() + ";" + e.getDataDevolucao());
            }
        }
        System.out.println("v - voltar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)) {
            case 'v':
                if (Autenticador.getInstance().getUsuarioLogado() instanceof UsuarioComum)
                    return new EstadoOpcoesComum();
                else
                    return new EstadoOpcoesFuncionario();
        }
        return this;
    }
}
