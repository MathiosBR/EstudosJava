package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		//Não usar:
		int a = 97;
		int b = 'a'; // Sairá true porque o valor de 'a' é 97.
		
		System.out.println(a == b);
		
		System.out.println('\u0061');
		
		//Ao invés disso, usar lógicamente:
		int c = 61;
		int d = 61;
		
		System.out.println(c == d);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}
}
