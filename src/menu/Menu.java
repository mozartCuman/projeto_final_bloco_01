package menu;

import java.io.IOException;



public class Menu {

	public static void main(String[] args) {
		 
		
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
		System.out.println("            5 - Apagar Conta                         ");
		System.out.println("            6 - Sacar                                ");
		System.out.println("            7 - Depositar                            ");
		System.out.println("            8 - Transferir valores entre Contas      ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
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
