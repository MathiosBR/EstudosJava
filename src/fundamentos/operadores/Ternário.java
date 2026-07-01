package fundamentos.operadores;

public class Ternário {
	public static void main(String[] args) {
		//O operador ternário é como uma atribuição condicional
		double media = 8.6;
		String resultadoRecuperacao = media >= 5.0 ?
				"em recuperação" : "reprovado.";
		String resultado = media >= 7.0 ?
				"aprovado!" : resultadoRecuperacao;
		
		System.out.println("O aluno está " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto? "Sim." : "Não";
		System.out.printf("Tem desconto? %s", resultadoFinal);
	}
}
