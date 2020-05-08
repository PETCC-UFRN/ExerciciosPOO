package Relacoes.Agregacao.Exemplo;

public class Main {

	public static void main(String[] args) 
	{
		Humano h1 = new Humano();
		h1.setNome("Fulano");
		Humano h2 = new Humano();
		h2.setNome("Beltrano");
		Humano h3 = new Humano();
		h3.setNome("Cicrano");
		Humano h4 = new Humano();
		h4.setNome("Enzo");
		
		h1.addGrupo(h2);
		h1.addGrupo(h3);
		h1.addGrupo(h4);
		
		h2.addGrupo(h1);
		h2.addGrupo(h3);
		
		h1.printGrupo();
		h2.printGrupo();
		
		Formiga f1 = new Formiga();
		f1.setTrabalho("Rainha");
		Formiga f2 = new Formiga();
		f2.setTrabalho("Operaria");
		Formiga f3 = new Formiga();
		f3.setTrabalho("Operaria");
		Formiga f4 = new Formiga();
		f4.setTrabalho("Rastreadora");
		Formiga f5 = new Formiga();
		f5.setTrabalho("Rastreadora");
		
		f1.addMembro(f2);
		f1.addMembro(f3);
		f1.addMembro(f4);
		f1.addMembro(f5);
		
		f1.descColonia();
		
		Remora r1 = new Remora();
		Remora r2 = new Remora();
		Remora r3 = new Remora();
		Remora r4 = new Remora();
		Remora r5 = new Remora();
		Remora r6 = new Remora();
		
		Tubarao t1 = new Tubarao();
		t1.setEnergia(600.00);
		t1.addRemo(r1);
		t1.addRemo(r2);
		t1.addRemo(r3);
		t1.addRemo(r4);
		t1.addRemo(r5);
		t1.addRemo(r6);
		
		r1.setFornecedor(t1);
		r2.setFornecedor(t1);
		r3.setFornecedor(t1);
		r4.setFornecedor(t1);
		r5.setFornecedor(t1);
		r6.setFornecedor(t1);
		
		t1.descComen();
		System.out.println("O tubarão possui " + t1.getEnergia() + " Kcal de energia");
		r1.consumirAlimento();
		r2.consumirAlimento();
		r3.consumirAlimento();
		r4.consumirAlimento();
		r5.consumirAlimento();
		r6.consumirAlimento();
		System.out.println("O tubarão agora possui " + t1.getEnergia() + " Kcal de energia");
	}

}
