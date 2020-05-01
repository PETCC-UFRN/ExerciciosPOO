package ExerciciosPolimorfismoVinculacao;

public class Produto extends ItemCompra
{
	private String fornecedor;
	private int quant_estoque;
	
	public Produto(double valor, String nome) 
	{
		super(valor,nome);
	}
	
	public Produto(double valor, String nome, int quant_estoque) 
	{
		super(valor,nome);
		this.quant_estoque = quant_estoque;
	}

	public String getFornecedor() 
	{
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) 
	{
		this.fornecedor = fornecedor;
	}

	public int getQuant_estoque() 
	{
		return quant_estoque;
	}

	public void setQuant_estoque(int quant_estoque) 
	{
		this.quant_estoque = quant_estoque;
	}
	
}
