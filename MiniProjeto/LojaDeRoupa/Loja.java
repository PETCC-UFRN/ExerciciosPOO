package LojaDeRoupa;

import java.util.ArrayList;

public class Loja {
	Pessoa funcionario;
	Pessoa cliente;
	Caixa caixa;
	ArrayList<Produto> produto = new ArrayList<Produto>();
	
	public Loja(Pessoa funcionario, Caixa caixa) {
		this.funcionario = funcionario;
		this.caixa = caixa;
	}
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("henrrique");
		Caixa caixa = new Caixa();
		Loja marisa = new Loja(func,caixa);
		
		func.setSalario(1000);
		
		Roupas blusa = new Roupas("blusa", 89.9 , "branco", "formal", "feminina", 38, "inverno");
		Calcados sapato = new Calcados("sapato", 100, "preto", "social", "masculina", 42, true, true);
		Acessorios brinco = new Acessorios("brinco", 30, "prata", "social", "feminina", "redondo", "prata");
		
		marisa.produto.add(blusa);
		marisa.produto.add(sapato);
		marisa.produto.add(brinco);
		
		System.out.println(marisa.caixa.Venda(marisa.produto.get(2).preco, 50.0));
		System.out.println(marisa.caixa.getQuantidadeVendas());
		System.out.println(marisa.caixa.getValorNoCaixa());
		
		
		
		
		
	}

	
}
