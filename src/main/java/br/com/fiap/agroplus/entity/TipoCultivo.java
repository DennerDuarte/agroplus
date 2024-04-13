package br.com.fiap.agroplus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_TIPOS_CULTIVOS")
public class TipoCultivo {
	
	@Id
	@Column(name="ID_TIPO_CULTIVO")
	private Long id;
	
	@Column(name="DS_NOME_CULTIVO")
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return descricao;
	}
	public void setNome(String descricao) {
		this.descricao = descricao;
	}

}
