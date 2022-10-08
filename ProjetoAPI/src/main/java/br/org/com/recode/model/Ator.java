package br.org.com.recode.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TABELA DO BANCO
@Entity
public class Ator {

	@Id
	// IDENTITY = CHAVE PRIMÁRIA E AUTOINCREMENT
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column (nullable = false)
	private String primeiro_nome;
	@Column (nullable = false)
	private String ultimo_nome;
	
	
	// GET E SET
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPrimeiro_nome() {
		return primeiro_nome;
	}
	
	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}
	
	public String getUltimo_nome() {
		return ultimo_nome;
	}
	
	public void setUltimo_nome(String ultimo_nome) {
		this.ultimo_nome = ultimo_nome;
	}

	
	// HASHCODE AND EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(id, primeiro_nome, ultimo_nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ator other = (Ator) obj;
		return id == other.id && Objects.equals(primeiro_nome, other.primeiro_nome)
				&& Objects.equals(ultimo_nome, other.ultimo_nome);
	}

	
	
	
}
