package model;

public class ModeloOrk extends ModeloGeral {
	
	private String cor;
	
	public ModeloOrk(float preco,int produto,String produtoNome, String tipo,String cor) {
		super(preco,produto, produtoNome, tipo);
	
	
	this.cor = cor;
	
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void exibir() {
		super.exibir();
		System.out.println(cor);
	}
}
