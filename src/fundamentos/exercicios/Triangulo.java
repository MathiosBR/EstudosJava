package fundamentos.exercicios;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		//Fundamento: A = b*h/2
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base e a altura do triangulo:");
		double b = entrada.nextDouble();
		double h = entrada.nextDouble();
		double A = (b*h)/2;
		System.out.printf("A área do triangulo é: %.2f", A);
		entrada.close();
	}
}
