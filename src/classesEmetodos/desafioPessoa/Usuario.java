package classesEmetodos.desafioPessoa;

import java.util.Objects;

public class Usuario {
	String nome;
	String email;
	
	//Abaixo sendo gerado com Source
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	//Abaixo sendo criado manualmente
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Usuario) {
//			Usuario outro = (Usuario) obj;
//			return super.equals(obj);	
//		} else {
//			return false;
//		}
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if(obj instanceof Usuario) {
//			Usuario outro = (Usuario) obj;
//			
//			boolean nomeIgual = outro.nome.equals(this.nome);
//			boolean emailIgual = outro.email.equals(this.email);
//			
//			return nomeIgual && emailIgual;
//		} else {
//			return false;
//		}
//	}
	
	
}
