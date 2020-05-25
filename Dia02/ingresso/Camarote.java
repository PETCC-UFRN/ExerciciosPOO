package dia2.ingresso;

public class Camarote extends Ingresso {
	double adicionalVip;
	String localizacao;
	
	public Camarote(double valor, double adicionalVip, String localizacao) {
		super(valor);
		this.adicionalVip = adicionalVip;
		this.localizacao = localizacao;
	}
	public double imprimirValor() {
		return (valor + this.adicionalVip);
	}
	public String imprimirIngresso() {
		return "ingresso VIP";
	}
	public String imprimirLocalizacao() {
		return localizacao;
	}
	
}
