package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		//Digitar Domingo e o programa irá retornar 1
		//Quarta -> 4
		//Terça -> 3
		//Segunda -> 2
		//Quinta -> 5
		//Sexta -> 6
		// Sábado -> 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um dia da Semana:");
		String dia = entrada.next();
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}
		else if (dia.equalsIgnoreCase("terça") ||
				 "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}
		else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}
		else if ("sábado".equalsIgnoreCase(dia) || 
				 "sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		else {
			System.out.println("Dia inválido");
		}
		
		
		entrada.close();
	}
}
