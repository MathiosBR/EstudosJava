package arraysEcollections;

import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		for (double nota : notas) {
			nota = nota/2;
		}
		//Sem alterar a nota, pois o foreach não consegue fazer isso.
		String novasNotas = Arrays.toString(notas);
		System.out.println(novasNotas);
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = notas[i]/2;
		}
		//Agora o array foi modificado.
		novasNotas = Arrays.toString(notas);
		System.out.println(novasNotas);
	}
}
