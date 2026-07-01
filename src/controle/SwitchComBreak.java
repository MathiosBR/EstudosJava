package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		//Como possui break em cada um dos cases, apresenta apenas um dos cases na saída (console).
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Informe a nota:");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "B";
			break;
		case 8:
			conceito = "C";
			break;
		case 7: 
		case 6:
			conceito = "D";
			break;
		case 5: case 4: case 3:
			conceito = "E";
			break;
		case 2: case 1: case 0:
			conceito = "F";
			break;
		default:
			conceito = "não informado.";
		}
		System.out.println("Conceito é: " + conceito);
		entrada.close();
	}
}
