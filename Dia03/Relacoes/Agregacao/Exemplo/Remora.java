package Relacoes.Agregacao.Exemplo;

public class Remora 
{
	private Tubarao fornecedor;

	public Tubarao getFornecedor() 
	{
		return fornecedor;
	}

	public void setFornecedor(Tubarao fornecedor) 
	{
		this.fornecedor = fornecedor;
	}
	
	public void consumirAlimento() 
	{
		this.fornecedor.setEnergia(this.fornecedor.getEnergia() - 15.00);
	}
}
