package fundamentos.operadores;

public class OperadoresLógicos {
	public static void main(String[] args) {
		boolean c1 = true;
		boolean c2 = 3 > 7; // Forma diferente de fazer uma condição
		System.out.println(c1 && c2);
		System.out.println(c1 || c2);
		System.out.println(c1 ^ c2);
		System.out.println(!c1);
		System.out.println(!c2);
		System.out.println(c1 && !c2);
		System.out.println(!!c1);
		
		
		//Sei todas as tabelas verdade, exceto:
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}
}
