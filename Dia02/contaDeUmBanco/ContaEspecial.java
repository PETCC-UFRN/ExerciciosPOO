package dia2.contaDeUmBanco;

public class ContaEspecial extends ContaDeUmBanco {
	
	double limite;
	
	public ContaEspecial(int numeroConta, String agencia) {
		super(numeroConta, agencia);
	}
	public double sacar(double valor) {
		if( this.saldo + this.limite < valor ) {
			return 0;
		}
		else {
			this.setSaldo(this.saldo - valor);
		}
		return this.getSaldo();
	}

	
	
	
}
