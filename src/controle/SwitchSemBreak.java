package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		//if (bool) ...
		// while(bool) ...
		//for (;bool;) ...
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Sandan");
		case "laranja":
			System.out.println("Sei o Heian Nidan");
		case "vermelha":
			System.out.println("Sei o Heian Shodan");
		default:
			System.out.println("Não sei Karatê");
		}
		//Com o switch sem o break, todos os cases abaixo irão executar mesmo assim.
		
		int idade = 3;
		switch(idade) {
		case 3:
			System.out.println("sabe falar");
		case 4:
			System.out.println("Sabe andar");
		case 5:
			System.out.println("Sabe respirar");
		}
		
	}
}
