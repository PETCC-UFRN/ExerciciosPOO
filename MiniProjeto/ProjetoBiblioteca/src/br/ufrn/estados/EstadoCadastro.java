package br.ufrn.estados;

public class EstadoCadastro implements Estado {
    String nome = null;
    @Override
    public void mostrarOpcoes() {
        if (nome == null){
            System.out.println("Digite um nome de usuário:");
        }
        else {
            System.out.println("Digite uma senha");
        }
    }

    @Override
    public Estado proximoEstado(String opt) {
        if (nome == null){
            nome = opt;
        }
        else {
            return new EstadoAutenticado();
        }
        return this;
    }
}
