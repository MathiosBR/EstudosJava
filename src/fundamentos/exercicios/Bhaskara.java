package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		//Fundamento: delta = b² - 4ac
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Suponhamos ax² + bx + c = 0");
		System.out.println("Em que a = 1, b = 12 e c = -13");
		int a = 1;
		int b = 12;
		int c = -13;
		int delta = ((int) Math.pow(b, 2)) - (4*a*c);
		System.out.println("O valor de delta é: " + delta);
		
		entrada.close();
	}
}
