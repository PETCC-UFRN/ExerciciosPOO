package br.ufrn.estados;

public class EstadoOpcoesComum implements Estado {
    @Override
    public void mostrarOpcoes() {
        // @TODO Listar opções diferentes par Usuário Comum ou para Funcionário.
        // @TODO Uma forma de fazer isso é fazendo try para casting e outro try dentro do catch.
        // @TODO Outra forma é criar um metodo em Usuário e chamar "mostrarOpcoesDeUsuario" da classe deprecated.Usuario.
        System.out.println("l - listar acervo");
        System.out.println("s - sair");
        System.out.println("q - quitar");
    }


    @Override
    public Estado proximoEstado(String opt) {
        switch (opt.charAt(0)){
            case 'l':
                return new EstadoListarAcervo();
            case 's':
                return new EstadoInicial();
            case 'q':
                return null;
        }
        return this;
    }
}
