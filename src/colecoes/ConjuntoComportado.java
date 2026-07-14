package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Dados homogêneos definidos pelo Generics
//		Set<String> listaAprovado = new HashSet<String>(); // OU new HashSet<>(); por inferência
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");
		listaAprovados.add("Luca");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<Integer>(); // OU new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
