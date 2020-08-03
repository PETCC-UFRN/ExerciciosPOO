package br.ufrn.estados;

public class EstadoOpcoesComum implements Estado {
    @Override
    public void mostrarOpcoes() {
        System.out.println("l - listar acervo");
        System.out.println("m - mostrar meus empréstimos");
        System.out.println("s - sair");
        System.out.println("q - quitar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'l':
                return new EstadoListarAcervo();
            case 'm':
                return new EstadoMostrarEmprestimos();
            case 's':
                return new EstadoInicial();
            case 'q':
                return null;
        }
        return this;
    }
}
