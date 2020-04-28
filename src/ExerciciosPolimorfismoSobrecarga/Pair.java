package ExerciciosPolimorfismoSobrecarga;

public class Pair {
	
	private String dado;
	private int chave;
	
	public Pair(Pair other) {
		this.dado = other.dado;
		this.chave = other.chave;
	}
	
	public Pair(String dado) {
		this.dado = dado;
		this.chave = 0;
	}
	
	public Pair(String dado, int chave) {
		this.dado = dado;
		this.chave = chave;
	}
	
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
}
