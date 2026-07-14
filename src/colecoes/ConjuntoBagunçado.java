package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//Set e HashSet são não-ordenados
		HashSet conjunto = new HashSet();
		//Dados heterogêneos
		conjunto.add(1.2); // double --> Double
		conjunto.add(true); // boolean --> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int --> Integer
		conjunto.add('x'); // char --> Char
		
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x'); //Não modifica, pois não aceita repetição
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		//União
//		conjunto.addAll(nums);
//		System.out.println(conjunto);
		
		//Interseção
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
