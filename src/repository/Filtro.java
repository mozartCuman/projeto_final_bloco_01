package repository;

import model.ModeloGeral;



public interface Filtro {

	void listarProdutos(ModeloGeral produto);
	void limparLista(ModeloGeral produto);
	void adicionarProdutos(ModeloGeral produtos);
	void procurarProdutos(ModeloGeral produtos);
}
