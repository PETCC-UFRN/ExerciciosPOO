package br.ufrn.estados;

public class EstadoInicial implements Estado {
    @Override
    public void mostrarOpcoes() {
        System.out.println("l - login");
        System.out.println("c - cadastrar");
        System.out.println("q - quitar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'l':
                return new EstadoAutenticacao();
            case 'c':
                return new EstadoCadastro();
            case 'q':
                return null;
            default:
                System.out.println("Opção Inválida");
        }
        return this;
    }

}
