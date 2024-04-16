package br.com.fiap.agroplus.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="T_VENDEDORES")
public class Vendedor {
	
	@Id
	@Column(name="ID_VENDEDOR")
	private Long id;
	
	@Column(name="DS_NOME")
	@NotNull(message = "É necessário que o nome seja informado.")
	@Size(min = 10, max = 60, message = "O nome precisa ter entre 10 e 60 caracteres")
	private String nome;
	
	@Column(name="DS_CONTATO")
	@NotNull(message = "É necessário que o contato seja informado.")
	private String contato;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "ID_VENDEDOR", referencedColumnName = "ID_VENDEDOR", insertable = false, updatable = false)
	})
	private List<HistoricoVendas> vendas;
	
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
	public List<HistoricoVendas> getVendas() {
		return vendas;
	}
	public void setVendas(List<HistoricoVendas> vendas) {
		this.vendas = vendas;
	}
}
