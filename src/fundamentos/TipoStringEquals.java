package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2"=="2");
		String s = new String("2");
		//System.out.println("2"==s); Está errado
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();// next tira espaços em branco
		//Mas nextLine não tira
		
		//System.out.println("2" == s2.trim());
		//trim para remover espaços em branco
		//Mas de toda forma, vai dar falso, está incorreto.
		
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
