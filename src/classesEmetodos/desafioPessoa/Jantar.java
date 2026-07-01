package classesEmetodos.desafioPessoa;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Matheus", 101);
		Comida comida1 = new Comida("Risotto de camarão", 2);
		System.out.println(pessoa.getNome() + " possui o peso " + pessoa.getPeso() + "kg");
		pessoa.comer(comida1);
		System.out.println(pessoa.getNome() + " agora possui o peso " + pessoa.getPeso() + "kg");
		
	}
}
