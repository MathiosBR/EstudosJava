package arraysEcollections;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		//Minha tentativa:
		Scanner sc = new Scanner(System.in);
		int n=0, m=0;
		System.out.println("Digite a quantidade de alunos:");
		m = sc.nextInt();
		System.out.println("Digite a quantidade de notas por aluno:");
		n = sc.nextInt();
		
		double[][] alunos = new double[n][m];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Notas do " + (i+1) + "º aluno:");
			for (int j = 0; j < alunos[i].length; j++) {
				System.out.println("Digite a " + (i+1) + "º nota:");
				alunos[i][j] = sc.nextDouble();
			}
		}
		
		//Imprimindo a matriz:
		for (double[] aluno : alunos) {
			System.out.println("Notas do aluno " + aluno);
			for (double nota : aluno) {
				System.out.println(nota + " | ");
			}
		}
		
		sc.close();
	}
}
