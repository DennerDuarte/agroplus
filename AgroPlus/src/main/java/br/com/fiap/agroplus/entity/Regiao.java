package br.com.fiap.agroplus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_REGIAO")
public class Regiao {
	
	@Id
	@Column(name="ID_REGIAO")
	private Long id;
	
	@Column(name="DS_NOME_REGIAO")
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
