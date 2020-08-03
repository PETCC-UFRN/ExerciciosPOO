package br.ufrn.estados;

import br.ufrn.Autenticador;
import br.ufrn.Biblioteca;
import br.ufrn.Item;
import br.ufrn.Usuario;

/**
 * Esse estado irá mostrar
 */
public class EstadoDetalhes implements Estado {
    private Item item; //Item para mostrar opções

    /**
     * O Construtor do estado deve receber um item para mostrar os detalhes e opções
     * @param item
     */
    public EstadoDetalhes(Item item){
        this.item = item;
    }
    @Override
    public void mostrarOpcoes() {
        System.out.println("========================================");
        System.out.println("||             Detalhes               ||");
        System.out.println("========================================");
        item.mostrarDetalhes();
        System.out.println("Opções:");
        System.out.println("e - realizar empréstimo");
        System.out.println("v - voltar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'v':
                return new EstadoListarAcervo();
            case 'e':
                if (item.getDisponiveis() > 0) {
                    Autenticador.getInstance().getUsuarioLogado().adicionarEmprestimo(item);
                    System.out.println("Empréstimo de " + item.getTitulo() + " realizado com sucesso.");
                }
                else
                    System.out.println("Não há exemplares disponíveis");
                return this;
            default:
                System.out.println("Opção inválida");
        }
        return this;
    }
}
