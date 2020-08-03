package br.ufrn.estados;

public class EstadoOpcoesFuncionario extends EstadoOpcoesComum {
    @Override
    public void mostrarOpcoes() {
        System.out.println("c - Cadastrar material no acervo");
        //System.out.println("e - Aprovar solicitação de empréstimo\n");
        //System.out.println("d - Aprovar solicitação de empréstimo\n");
        super.mostrarOpcoes();
    }


    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'c':
                System.out.println("@TODO: Implementar cadastro de acervo");
                return this;
            //case 'e':
            //    System.out.println("@TODO: Implementar aprovar solicitação de empréstimo");
            //    return this;
            //case 'd':
            //    System.out.println("@TODO: Implementar aprovar solicitação de devolução");
            //    return this;
            default:
                return super.proximoEstado(opt);
        }
    }
}
