package loja.repository;

import loja.model.Loja;



public interface LojaRepository {

	void listarProdutos(Loja produto);
	void limparLista(int prod);
	void adicionarProdutos(Loja produtos);
	void procurarProdutos(int produtos);
	void atualizarLista(Loja produtos);
}
