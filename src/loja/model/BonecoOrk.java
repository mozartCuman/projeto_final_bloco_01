package loja.model;

public class BonecoOrk extends Loja {
	
	private String cor;
	
	public BonecoOrk(float preco,int produto,String produtoNome, String tipo,String cor) {
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
