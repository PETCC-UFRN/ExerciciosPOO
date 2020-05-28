package LojaDeRoupa;

public class Loja {
	Pessoa funcionario;
	Pessoa cliente;
	Caixa caixa;
	ArrayList<Produto> produto;
	
	public Loja(Pessoa funcionario, Caixa caixa) {
		this.funcionario = funcionario;
		this.caixa = caixa;
	}
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("henrrique");
		
		
	}

	
}
