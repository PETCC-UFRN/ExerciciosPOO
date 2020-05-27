package LojaDeRoupa;
import java.util.Scanner;
public class Caixa {
	private int QuantidadeVendas;
	private double ValorNoCaixa;
	
	public Caixa() {
	}
	public void Venda(double valor, int numero){
	    this.ValorNoCaixa = this.ValorNoCaixa + valor;
	    this.QuantidadeVendas++;
	    if(numero == 0) {
	    	Scanner s = new Scanner( System.in ); 
	    	System.out.print("Qual a quantidade de parcela?");
	    	int quantidadeParcela = s.nextInt();
	    	System.out.print("Compra efetuada no crédito em ");
	    	System.out.print(quantidadeParcela);
	    	System.out.println("parcela(s)");
	    	
	    }
	    if(numero == 1) {
	    	System.out.print("Compra efetuada no débito");
	    }    
	}
	
	public void Venda(double valorCompra, double valorPago){
	    this.ValorNoCaixa = this.ValorNoCaixa + valorCompra;
	    this.QuantidadeVendas++;
	    double troco = valorPago - valorCompra;
	    System.out.println("Troco:");
	    System.out.println(troco);
	}
	
	public int getQuantidadeVendas() {
		return QuantidadeVendas;
	}
	public double getValorNoCaixa() {
		return ValorNoCaixa;
	}
	
	
}
