package LojaDeRoupa;

public class Cliente extends Pessoa {
	 String email;
	 int quantidadeCompras;
	 double bonus;
	 
	public Cliente() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuantidadeCompras() {
		return quantidadeCompras;
	}
	public void setQuantidadeCompras(int quantidadeCompras) {
		this.quantidadeCompras = quantidadeCompras;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
