package classesEmetodos.desafioPessoa;

public class Comida {
	private String nome;
	private double pesoComida;
	
	public Comida (String nome, double peso) {
		this.nome = nome;
		this.pesoComida = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPesoComida() {
		return pesoComida;
	}

	public void setPesoComida(double pesoComida) {
		this.pesoComida = pesoComida;
	}
}
