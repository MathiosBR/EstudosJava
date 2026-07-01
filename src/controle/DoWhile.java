package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * Vimos:
		 * if(...) sentença; ou {}
		 * while(...) sentença ou {}
		 * for (...;...;...) sentença ou {}
		 * do sentença ou {} então while (...) sentença ou {}
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair?");
			valor = entrada.nextLine();
		} while(!valor.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
