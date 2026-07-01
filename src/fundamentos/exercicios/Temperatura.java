package fundamentos.exercicios;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		//Fundamento1: C = 5/9 * (F - 32)
		//Fundamento2: F = C*9/5 + 32
		//Q1: Criar um programa que leia a temperatura em Fahrenheit e
		// converta para Celsius.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit:");
		double f = entrada.nextDouble();
		double calculoCelsius = ((f-32)*5)/9;
		System.out.printf("A temperatura em Celsius é: %.1f\n", calculoCelsius);
		
		//Q2: Criar um programa que leia a temperatura em Celsius e 
		// converta para Fahrenheit.
		System.out.println("Agora digite a temperatura em Celsius:");
		double c = entrada.nextDouble();
		double calculoFahrenheit = ((c*9)/5) + 32;
		System.out.printf("A temperatura digitada em Fahrenheit é: %.1f\n", calculoFahrenheit);
		
		
		entrada.close();
	}
}
