package model;

public class ModeloPrimarchs extends ModeloGeral{

	private String prima;
	
	public ModeloPrimarchs(float preco,int produto, String produtoNome, String tipo, String prima) {
		super( preco,produto, produtoNome, tipo);
		
		this.prima = prima;
	}
	
	public String getPrima() {
		return prima;
	}
	public void setPrima(String prima) {
		this.prima = prima;
	}
	
	
	@Override
	public void exibir() {
	super.exibir();
	System.out.println(prima);
}
	
	

}





















/*public void eschido(int escolha) {
if(escolha == 1) {
	setPrima("Vulkan");
} else if (escolha == 2){
	setPrima("Robout Guilliman");
}
}*/
