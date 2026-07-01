package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for(int i = 1; i <=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio:
		//A restrição não pode usar valor numérico para controlar o laço
		// Implementar a mesma coisa acima, mas sem usar i = 1; i<=5
		for(String v = "#" ; !v.equalsIgnoreCase("######"); v+="#") {
			System.out.println(v);
		}
	}
}
