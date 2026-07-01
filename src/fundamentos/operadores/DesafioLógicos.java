package fundamentos.operadores;

public class DesafioLógicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		
		// Trabalho na quinta (V ou F)
		
		// Se os dois trabalhos derem certo, comprar tv de 50 pol no fds
		
		// Se apenas um dois dos trabalhos, comprar tv de 32 pol
		
		// De toda forma, se algum trabalho (seja os dois ou 1 só),
		// comprar sorvete
		
		// Nenhum trabalho deu certo, ficaremos em casa sem sorvete.
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		//Operador Unário
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
