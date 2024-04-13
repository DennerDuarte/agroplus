package br.com.fiap.agroplus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_VENDEDORES")
public class Vendedor {
	
	@Id
	@Column(name="ID_VENDEDOR")
	private Long id;
	
	@Column(name="DS_NOME")
	private String nome;
	
	@Column(name="DS_CONTATO")
	private String contato;
	
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
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
}
