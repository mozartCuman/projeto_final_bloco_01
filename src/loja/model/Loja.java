package loja.model;

public abstract class Loja {
	
	private int produto;
	private String produtoNome;
	private String  tipo;
	private float preco;
	
	public Loja (float preco, int produto, String produtoNome,String tipo) {
	
		this.produto = produto;
		this.produtoNome = produtoNome;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getProduto() {
		return produto;
	}
	public void setProduto(int produto) {
		this.produto = produto;
	}
	public String getProdutoNome() {
		return produtoNome;
	}
	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void exibir() {
		String tipo = "";
		
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Compra:");
		System.out.println("***********************************************************");
		System.out.println("Nome do personagem " + this.produtoNome + ". Preco RS: " + this.preco);
		System.out.println("Tipo " + this.tipo);
		
	}

	 

}











/*switch(this.tipo) {
case 1:
	tipo = "Ork";
break;
case 2:
	tipo = "Humano";
break;
case 3:
	tipo = "Primarch";
break;
}*/
