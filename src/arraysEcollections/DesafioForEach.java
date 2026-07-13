package arraysEcollections;

import java.util.Scanner;

public class DesafioForEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;		
		System.out.println("Digite a quantidade de notas a serem inseridas:");
		n = sc.nextInt();
		double[] notas = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite a nota " + (i+1));
			notas[i] = sc.nextDouble();
		}
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = 0;
		media = total/notas.length;
		System.out.println(media);
		
		sc.close();
	}
}
