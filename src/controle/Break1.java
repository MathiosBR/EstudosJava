package controle;

public class Break1 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			
			if(i==5) {
				break; // Quebra o fluxo nesse momento. Mas o break faz sentido dentro de um laço de repetição. Menos sentido dentro de um if.
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
		
	}
}
