package br.ufrn.estados;

public class EstadoListarAcervo implements Estado {
    @Override
    public void mostrarOpcoes() {
        System.out.println("===== Acervo =====");
        System.out.println("Id | Título");
        System.out.println("0 | O Senhor dos Anéis");
        System.out.println("==================");
        System.out.println("Digite o número de um item para ver detalhes ou");
        System.out.println("v - voltar");
        System.out.println("q - quitar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'v':
                return new EstadoAutenticado();
            case 'q':
                return null;
            default:
                System.out.println("Opção inválida");
        }
        return this;
    }
}
