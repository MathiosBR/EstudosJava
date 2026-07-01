package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Acabei usando IF e ELSE por já estar acostumado
		
		System.out.println("Informe a média:");
		//Melhorando código:
		//double media = entrada.nextDouble();
			double media = entrada.nextDouble();
			
			if(media >= 7.0 && media <= 10) {
				System.out.println("Aprovado!");
			}
			else if (media >= 5.0 && media < 7.0) {
				System.out.println("Em recuperação");
			}
			else if (media < 5.0) {
				System.out.println("Reprovado");
			}
			else {
				System.out.println("Nota inválida");
			}

		entrada.close();
	}
}