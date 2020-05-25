package dia2.contaDeUmBanco;

public class ContaDeUmBanco {
	private int numeroConta;
	private String agencia;
	protected double saldo;
	
	public ContaDeUmBanco(int numeroConta, String agencia) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}
	public double sacar(double valor) {
		if(this.saldo < valor) {
			return 0;
		}
		else {
			this.saldo = this.saldo - valor;
		}
		return this.saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	
}
