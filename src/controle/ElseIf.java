package controle;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota de 0 a 10:");
		double nota = entrada.nextDouble();
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida.");
		}
		else if (nota >= 8) {
			System.out.println("Conceito A");
		}
		else if (nota >=6 && nota < 8) {
			System.out.println("Conceito B");
		}
		else if (nota >= 4 && nota < 6) {
			System.out.println("Conceito C");
		}
		else if (nota >= 2 && nota < 4) {
			System.out.println("Conceito D");
		}
		else {
			System.out.println("Conceito E");
		}
		System.out.println("FIM!");
			
		entrada.close();
		
	}
}
