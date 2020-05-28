package LojaDeRoupa;
public class Caixa {
	private int QuantidadeVendas;
	private double ValorNoCaixa;
	
	public Caixa() {
	}
	public String Venda(double valor, int numero){
	    this.ValorNoCaixa = this.ValorNoCaixa + valor;
	    this.QuantidadeVendas++;
	    return ("Compra efetuada no débito");    
	}
	public String Venda(double valor, int numero, int parcela){
	    this.ValorNoCaixa = this.ValorNoCaixa + valor;
	    this.QuantidadeVendas++;
	    return ("Compra efetuada no crédito em " + parcela);    
	}
	
	public String Venda(double valorCompra, double valorPago){
	    this.ValorNoCaixa = this.ValorNoCaixa + valorCompra;
	    this.QuantidadeVendas++;
	    double troco = valorPago - valorCompra;
	   return ("Troco:" + troco);
	}
	
	public int getQuantidadeVendas() {
		return QuantidadeVendas;
	}
	public double getValorNoCaixa() {
		return ValorNoCaixa;
	}
	
	
}
