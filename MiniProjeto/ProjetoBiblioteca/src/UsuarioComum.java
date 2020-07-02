import java.util.TreeSet;

public class UsuarioComum extends Usuario {
  TreeSet<Emprestimo> emprestimos;
  public UsuarioComum(String nome, String senha){
    super(nome, senha);
  }
  @Override
  public void mostrarOpcoes(){
    System.out.println(
        "l - Listar acervo\n" +
        "m - Mostrar meus empréstimos\n" +
        "e - Solicitar empréstimo(e + nº do item sem espaço, ex: \"e3\")\n" +
        "s - Sair");
  }
  @Override
  public void tratarOpcao(String opt, Biblioteca bib){
    switch (opt.charAt(0)){
      case 'l': System.out.println("TODO: Listar acervo"); break;
      case 'm': System.out.println("TODO: Mostrar meus empréstimos"); break;
      case 'e': System.out.println("TODO: Solicitar empréstimo"); break;
      default: System.out.println("Opção Inválida");break;
    }
  }
}

