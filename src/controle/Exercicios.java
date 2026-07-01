package controle;

import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Q1: Criar um programa que receba um número e 
		 * verifique se ele está entre 0 e 10 e é par;
	 R:
		int n = 9;
		if(n % 2 == 0) {
			if(n==0) {
				System.out.println("O zero é número neutro.");
			}
			else if (n>0 && n<=10)
				System.out.println("Número par e está entre 0 e 10");
			else System.out.println("Número par");
		}
		else if(n>0 && n<=10){
			System.out.println("Número ímpar e está entre 0 e 10");
		}
		else System.out.println("Número ímpar");
		*/
		
		/* Q2: Criar um programa informa se 
		 * o ano atual é um ano bissexto; 
		R:
		int ano = 2019;
		
		if(ano % 4 == 0) {
			System.out.println("Ano bissexto");
		}
		else {
			System.out.println("Não é ano bissexto");
		}
		*/
		
		/*
		 * Q3: Criar um programa que receba duas notas parciais,
		 *  calcular a média final. Se a nota do aluno for maior
		 *  ou igual a 7.0 imprime no console
		 * "Aprovado", se a nota for menor que 7.0 e maior do que
		 *  4.0 imprime no console "Recuperação", caso contrário
		 *  imprime no console "Reprovado".
		

		R:
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextDouble();
		media = (nota1+nota2)/2;
		
		if(media>= 7) {
			System.out.println("Aprovado");
		}
		else if(media <7 && media >4) {
			System.out.println("Em recuperação");
		}
		else {
			System.out.println("Reprovado");
		} */
		
		/*
		 * 4. Criar um programa que receba um número 
		 * e diga se ele é um número primo.
		 */
		
		int n = 11;
		boolean ehPrimo;
		if(n <=1) {
			ehPrimo = false;
		}
		else if(n <=3) {
			ehPrimo = true;
		}
		else if(n%2==0 || n %3 ==0) {
			ehPrimo = false;
		}
		else {
			for (int i = 5; i*i <= n; i+=6) {
				if(n%i==0 || n%(i+2)==0) {
					ehPrimo = false;
				}
			}
			ehPrimo = true;
		}
		System.out.println(ehPrimo);
				
		entrada.close();
	}
}
