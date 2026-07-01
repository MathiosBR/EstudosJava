package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler de algum local num1, num2
		//O usuário digitará + ou - ou * ou / ou %
		// Usar o num1 e num2 com a operação que será usada.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = entrada.nextDouble();
		System.out.println("Informe a operação para esses dois números:");
		String op = entrada.next();
		System.out.printf("%.2f %s %.2f\n", num1, op, num2);
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		System.out.println("Resultado: " + resultado);
		
		entrada.close();
		
	}
}
