package loja.menu;

//import loja.model.Loja;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.BonecoHeroi;
import loja.model.BonecoOrk;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LojaController produto = new LojaController();
		byte opcao,especie;
		float num1,valor;
		String nome, raca,nome2;
		int numero;
		
		/*//Teste da Classe Geral;
		//float preco, int produto, String produtoNome,int tipo) 
		Loja h1 = new loja.model.Loja(1500,1, "adamastor", 1);
		h1.exibir();*/
		//Teste da classe Ork
		//float preco, int produto, String produtoNome,int tipo,String cor)
		BonecoOrk o1 = new loja.model.BonecoOrk(1500,1, "Gurguts", "Ork", "verde");
		//o1.exibir();
		//float preco, int produto, String produtoNome,int tipo,String prima)
		BonecoHeroi p1 = new loja.model.BonecoHeroi(1500, 1, "Roboute", "Humano", "Reluzente");
		//p1.exibir();
		
		
		
		
		System.out.println("                                                     ");
		System.out.println("                     MARTELO GEEK                    ");
		System.out.println("                                                     ");
		System.out.println("                     Vulkan vive!                    ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                                                     ");
		System.out.println("            1 - Escolher produto                     ");
		System.out.println("            2 - Listar todas as escolhas             ");
		System.out.println("            3 - Procurar por numero                  ");
		System.out.println("            4 - Atualizar pedido                     ");
		System.out.println("                                                     ");
		System.out.println("            5 - Apagar Compra                        ");
		System.out.println("            6 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
		
		try {
			opcao = scan.nextByte();
		} catch (InputMismatchException e) {
			System.out.println("\n Digite valores inteiros!");
			scan.nextLine();
			opcao = 0;
		}
		
		switch(opcao) {
			case 6:
		
	
			sobre();
			scan.close();
			System.exit(0);
			
			case 1:
				
				System.out.println("Qual o nome do personagem???");
				scan.skip("\\R?");
				nome = scan.nextLine();
				
				System.out.println("Qual a subraca do personagem???");
				scan.skip("\\R?");
				raca = scan.nextLine();
				
				System.out.println("Qual o numero de tipo do personagem???");
				num1 = scan.nextInt();
				
				System.out.println("Qual a qualidade ou cor do personagem???");
				scan.skip("\\R?");
				nome2 = scan.nextLine();
				
				System.out.println("Qual o valor do personagem???");
				valor = scan.nextInt();
				
				System.out.println(" O personagem Querido é Ork [1] ou humano [2] ??? ");
				especie = scan.nextByte();
				
				if (especie == 1) {
					loja.adicionaProdutos(new BonecoOrk(valor, num1,nome,raca,nome2));
				
					System.out.print("Escolher produto");
				}else if (especie == 2){
					loja.adicionaProdutos(new BonecoHeroi(valor, num1,nome,raca,nome2));
				}
				
				System.out.println("Produto adicionado com sucesso? ");
				
				keyPress();
				break;
				
			case 2:
				System.out.println(" Listar Todas as escolhas ");
				produto.listarProdutos();
				
				keyPress();
				break;
			case 3:
				System.out.println(" digite o numero do produto");
				numero = leia.nextInt();
				
				lojas.procurarPorNumero(numero);
				
				keyPress();
				break;
			case 4:
				System.out.println("Digite o numero do produto para atualização:");
				int prodNum = scan.nextInt();
				
				var procurar = lojas.procurarProdutos(prodNum);
				
				if (procurar != null) {
					System.out.println("Qual o nome do personagem???");
					scan.skip("\\R?");
					nome = scan.nextLine();
					
					System.out.println("Qual a subraca do personagem???");
					scan.skip("\\R?");
					raca = scan.nextLine();
					
					System.out.println("Qual o numero de tipo do personagem???");
					num1 = scan.nextInt();
					
					System.out.println("Qual a qualidade ou cor do personagem???");
					scan.skip("\\R?");
					nome2 = scan.nextLine();
					
					System.out.println("Qual o valor do personagem???");
					valor = scan.nextInt();
					
					System.out.println(" O personagem Querido é Ork [1] ou humano [2] ??? ");
					especie = scan.nextByte();
					
					if (especie == 1) {
						loja.adicionaProdutos(new BonecoOrk(valor, num1,nome,raca,nome2));
					
						System.out.print("Escolher produto");
					}else if (especie == 2){
						loja.adicionaProdutos(new BonecoHeroi(valor, num1,nome,raca,nome2));
					}
					
					System.out.println("Produto adicionado com sucesso? ");
					
				}else {
					System.out.println("Produto nao encontrado.");
				}
				keyPress();
				break;
			case 5:
				System.out.println(" Digite o numero do produto:");
				numero = scan.nextInt();
				lojas.limparLista(numero);
				keyPress();
				break;
			
		}	
		
		
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:");
		System.out.println(" Mozart Cuman Albuquerque - mozartcumana@gmail.com");
		System.out.println("https://github.com/mozartCuman/contabancaria");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
