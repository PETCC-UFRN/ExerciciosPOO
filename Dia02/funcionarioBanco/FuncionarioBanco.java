package dia2.funcionarioBanco;

public class FuncionarioBanco {
	private String cpf;
	String nome;
	private double salario;
	
	public void funcionarioBanco(){
		
	}
	
	public void funcionarioBanco(String nome) {
		this.nome = nome;	
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario(String cpf) {
		if(this.cpf == cpf) {
			return salario;
		}
		return -1;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
