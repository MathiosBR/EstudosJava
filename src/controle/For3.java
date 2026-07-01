package controle;

public class For3 {
	public static void main(String[] args) {
		
		/*
		 * for(int i = 0; i < 10; i++) { //Se a variável i ficar dentro do laço for, vai
		 * estar disponível apenas para esse laço System.out.println(i); } int i = 0; //
		 * Mas também posso criar a variável dentro e fora.
		 * System.out.println("Saiu do for..."); System.out.println(i);
		 */
		//Agora um laço dentro do outro:	
		System.out.println();
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
