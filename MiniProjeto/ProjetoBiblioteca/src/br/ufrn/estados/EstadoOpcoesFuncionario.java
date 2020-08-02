package br.ufrn.estados;

public class EstadoOpcoesFuncionario extends EstadoOpcoesComum {
    @Override
    public void mostrarOpcoes() {
        // @TODO Listar opções para Funcionário.
        // @TODO Uma forma de fazer isso é fazendo try para casting e outro try dentro do catch.
        // @TODO Outra forma é criar um metodo em Usuário e chamar "mostrarOpcoesDeUsuario" da classe deprecated.Usuario.
        System.out.println("c - Cadastrar material no acervo");
        System.out.println("a - Aprovar solicitação de empréstimo\n");
        super.mostrarOpcoes();
    }


    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'c':
                System.out.println("@TODO: Implementar cadastro de acervo");
                return this;
            case 'a':
                System.out.println("@TODO: Implementar aprovar solicitação de empréstimo");
                return this;
            default:
                return super.proximoEstado(opt);
        }
    }
}
