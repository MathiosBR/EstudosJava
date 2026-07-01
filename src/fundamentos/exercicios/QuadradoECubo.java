package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = entrada.nextInt();
		System.out.println("Agora revelaremos o quadrado e o cubo do valor:");
		System.out.println("Quadrado do valor: " + (int) Math.pow(valor, 2));
		System.out.println("Cubo do valor: " + (int) Math.pow(valor, 3));
		entrada.close();
	}
}
