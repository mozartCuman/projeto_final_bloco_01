package loja.controller;

import java.util.ArrayList;
//import java.util.concurrent.locks.Lock;

import loja.model.Loja;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {

	private ArrayList<Loja> listarCoisas = new ArrayList<Loja>();
	int numero = 0;

	@Override
	public void listarProdutos(Loja produto) {
		for (var produto1 : listarCoisas) {
			produto1.exibir();
		}
	}

	@Override
	public void limparLista(int prod) {
		var n1 = procurarProdutos(prod);
		if (n1 != null) {
			if (listarCoisas.remove(n1 )== true)
				System.out.println("Deletado com sucesso");
		}else {
			System.out.println("Não encontrado");
		}

	}

	@Override
	public void adicionarProdutos(Loja produto) {
		listarCoisas.add(produto);
		System.out.println(" o produto " + produto.getProdutoNome());

	}

	@Override
	public void procurarProdutos(int produtos) {
		for (var lojas : listarCoisas) {
			if (loja.getNumero() == produtos) {
				return lojas;
			}
		}
		return null;

	}

	public void procurarPorNumero(int produtos) {
		var lojas = procurarProdutos(produtos);
		if (lojas != null) {
			lojas.exibir();
		} else {
			System.out.println("Não foi encontrado");
		}
	}
		

	@Override
	public void atualizarLista(Loja produto) {
		var buscar = procurarProdutos(produto.getProdutos());
		if (buscar != null) {
			listacoisas.set(listacontas.indexOf(buscar), produto);
			System.out.println("\n Atualizado com sucesso!");
		}else {
			System.out.println("\n Nada feito...");
		}

	}

	public int gerarNumero() {
		return ++numero;
	}

}
