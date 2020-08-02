package br.ufrn.estados;

public class EstadoAutenticacao implements Estado{
    private String nomeDeUsuario;

    @Override
    public void mostrarOpcoes() {
        if (nomeDeUsuario == null) {
            System.out.println("Digite o nome de usuário:");
        }
        else {
            System.out.println("Digite sua senha");
        }
    }

    @Override
    public Estado proximoEstado(String opt) {
        if (nomeDeUsuario == null) {
            nomeDeUsuario = opt;
            return this;
        }
        // Se o estado não é Nulo
        return new EstadoAutenticado();//@TODO Passar usuário para o estado
    }
}
