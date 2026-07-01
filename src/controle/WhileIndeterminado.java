package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		System.out.println("Ao digitar sair, o programa termina.");
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo:");
			valor = entrada.nextLine();
			System.out.println("O que digitou: " + valor);
		}
		
		entrada.close();
	}
}
