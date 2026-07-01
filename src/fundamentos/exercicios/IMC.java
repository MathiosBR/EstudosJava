package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		//Fundamento: peso(kg) / altura²
		//Q1: Criar um programa que leia o peso e a altura do 
		// usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos calcular seu IMC. Digite sua altura(m):");
		double h = entrada.nextDouble();
		System.out.println("Agora digite seu peso em kg:");
		double p = entrada.nextDouble();
		double imc = p / Math.pow(h, 2);
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		entrada.close();
	}
}
