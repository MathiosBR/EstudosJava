package fundamentos;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		//Acima, antes era args, mas pode ser qualquer nome.
		//Mas é mais interessante que seja args.
		
		System.out.println("Ola terminal no computador!");
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = entrada.nextLine();
		System.out.println("Valor eh: " + valor);
		
		System.out.println(args[0]);
		
		entrada.close();
	}
}
