package menu;

import model.ModeloPrimarchs;
import model.ModeloOrk;
//import model.ModeloGeral;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Byte opcao;
		
		/*//Teste da Classe Geral;
		//float preco, int produto, String produtoNome,int tipo) 
		ModeloGeral h1 = new model.ModeloGeral(1500,1, "adamastor", 1);
		h1.exibir();*/
		//Teste da classe Ork
		//float preco, int produto, String produtoNome,int tipo,String cor)
		ModeloOrk o1 = new model.ModeloOrk(1500,1, "Gurguts", "Ork", "verde");
		o1.exibir();
		//float preco, int produto, String produtoNome,int tipo,String prima)
		ModeloPrimarchs p1 = new model.ModeloPrimarchs(1500, 1, "Roboute", "Humano", "Reluzente");
		p1.exibir();
		
		
		
		
		System.out.println("                                                     ");
		System.out.println("                     MARTELO GEEK                    ");
		System.out.println("                                                     ");
		System.out.println("                     Vulkan vive!                    ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Escolher produto                     ");
		System.out.println("            2 - Listar todas as escolhas             ");
		System.out.println("            3 - Lista de tipos de produtos           ");
		System.out.println("            4 - Finalizar compra                     ");
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
			case 9:
		
			System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
			scan.close();
			System.exit(0);
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

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
