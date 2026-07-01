package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = 3 * 4 - 10;
		// int b = a^3; // Não usar assim
		int b = (int) Math.pow(a, 3); // método para elevar um número a uma potência

		System.out.println(b);
		
		//DESAFIO:
		int c = (int) Math.pow((6*(3+2)), 2);
		int d = c/(3*2);
		int e = (int) Math.pow((1-5)*(2-7)/2, 2);
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de e: " + e);
		int f = ((int) Math.pow(d-e, 3)) / ((int) Math.pow(10, 3));
		System.out.println("Valor de f: " + f);
	}
}