package Polimorfismo.Sobrecarga;

public class ContainerPares {

	private Pair[] data;
	private int capacity;
	
	public ContainerPares(int size) {
		data = new Pair[size];
		capacity = 0;
	}
	
	public void add(Pair dado) {
		data[capacity] = new Pair(dado);
		capacity += 1;
	}
	
	public Pair at(int index) {
		return data[index];
	}
	
	public Pair search(String dado) {
		for (Pair e : data) {
			if(e.getDado().contentEquals(dado)) {
				return e;
			}
		}
		return null;
	}
	
	public Pair search(int chave) {
		for (Pair e : data) {
			if(e.getChave() == chave) {
				return e;
			}
		}
		return null;
	}
	
	public Pair search(int chave, String dado) {
		for (Pair e : data) {
			if(e.getDado().contentEquals(dado) && e.getChave() == chave) {
				return e;
			}
		}
		return null;
	}
}
