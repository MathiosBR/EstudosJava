package fundamentos.operadores;

public class Unários {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		//Formas pós-fixada, que tem precedência menor a ==
		a++; // a = a + 1;
		a--; // a = a - 1;
		//Formas pré-fixada, que tem precedência maior que ==
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(++a == b--); Aqui é true
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
