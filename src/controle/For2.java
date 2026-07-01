package controle;

public class For2 {
	public static void main(String[] args) {
		//Gerar um For decrescente de 10 a 0, e quando mostrar 0, ele sai do laço.
		for(int contador = 10; contador >=0 ; contador-=2){
			System.out.printf("Contador = %d\n", contador);
		}
	}
}
