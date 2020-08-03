package br.ufrn.estados;

import br.ufrn.Biblioteca;
import br.ufrn.Item;

public class EstadoListarAcervo implements Estado {
    @Override
    public void mostrarOpcoes() {
        System.out.println("---------------- Acervo ----------------");
        System.out.println("|Id ; Título ; Quantidade ; Disponíveis|");
        System.out.println("----------------------------------------");
        for (Item i : Biblioteca.getInstance().getAcervo().values()) {
            System.out.println(i.getId() + " ; " + i.getTitulo() + " ; " +
                    i.getQuantidade() + " ; " + i.getDisponiveis());
        }
        //System.out.println("0 | O Senhor dos Anéis");
        System.out.println("----------------------------------------");
        System.out.println("Digite o número de um item para ver detalhes ou");
        System.out.println("v - voltar");
        System.out.println("q - quitar");
    }

    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'v':
                return new EstadoOpcoesComum();
            case 'q':
                return null;
            default:
                try {
                    Item item = Biblioteca.getInstance().getAcervo().get(Integer.parseInt(opt));
                    item.getTitulo();// Só para gerar exception
                    return new EstadoDetalhes(item);
                }
                catch (Exception e){
                    System.out.println("Opção inválida");
                }
        }
        return this;
    }
}
