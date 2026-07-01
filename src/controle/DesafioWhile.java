package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Programa que calcula média das notas de uma turma
		// Não sei quantos alunos tem nessa turma.
		// A nota é entre 0 e 10 (nota válida). Armazenemos a nota em uma variável total. Ao inserir uma nova nota, soma a nota anterior (total) com a nova nota.
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		double nota = 0;
		double total = 0;
		
		while(nota!= -1) {
			System.out.print("Informe a nota (Ou -1 para sair): ");
			nota = entrada.nextDouble();
			if(nota >=0 && nota <=10) {
				contador++;
				total += nota;				
			} else if(nota != -1){
				System.out.println("Nota inválida!");
			}
		}
		
		//Calcular a média
		double media = total / contador;
		System.out.println("Média = " + media);
		
		entrada.close();
		
	}
}
