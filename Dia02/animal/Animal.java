package dia2.animal;

public class Animal {
	double peso;
	double altura;
	String cor;
	
	public Animal() {
		super();
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String comer() {
		return "comendo";
	}
	public String respirar() {
		return "respirando";
	}
}
