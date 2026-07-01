package controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1)
				continue; // Toda vez que o i for impar, ele passa para o proximo
			System.out.println(i);
		}
		
	}
}
