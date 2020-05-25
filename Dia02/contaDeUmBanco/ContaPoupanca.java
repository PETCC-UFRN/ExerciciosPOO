package dia2.contaDeUmBanco;

public class ContaPoupanca extends ContaDeUmBanco {
	private int dia;
	private double rendimento;
	
	public ContaPoupanca(int numeroConta, String agencia) {
		super(numeroConta, agencia);
	}
	public void calcularNovoSaldo(int dia) {
		if( this.dia == dia ) {
			this.saldo = (this.getSaldo()*this.getRendimento());
		}
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
}
