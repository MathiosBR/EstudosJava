package arraysEcollections;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		//Ou double notasAlunoA[] = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		String array = Arrays.toString(notasAlunoA);
		System.out.println(array);
		
		double totalA = 0;
		double totalB = 0;
		for(int i = 0; i<notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		double aprovado = totalA /notasAlunoA.length;
		System.out.println(aprovado);
		
		//Valores literais num Array
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		double aprovadoB = totalB/notasAlunoB.length;
		System.out.println(aprovadoB);
	}
}
