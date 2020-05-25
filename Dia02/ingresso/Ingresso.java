package dia2.ingresso;

public class Ingresso {
	double valor;
	
	public Ingresso(double valor) {
		super();
		this.valor = valor;
	}
	public double imprimirValor() {
		return valor;
	}
	public String imprimirIngresso() {
		return "ingresso normal";
	}
}
