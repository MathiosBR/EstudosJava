package fundamentos.operadores;

public class Atribuição {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		c++; // Também é uma atribuição, mas é considerado unário.
		//Equivalente a c = c + 1;
		System.out.println(c);
		c %= 2; // c = c % 2; 0(par) ou 1(immpar)
		System.out.println(c);
	}
}
