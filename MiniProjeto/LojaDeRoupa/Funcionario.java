package LojaDeRoupa;

public class Funcionario extends Pessoa {
	 private double salario;
	 int quantidadeVendas;
	
	public Funcionario() {
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}
	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	} 
}
