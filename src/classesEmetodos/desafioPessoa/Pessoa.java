package classesEmetodos.desafioPessoa;

public class Pessoa {
	private String nome;
	private double peso;
	
	public Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer (Comida comida) {
		this.peso = this.peso + comida.getPesoComida();
		return this.peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
