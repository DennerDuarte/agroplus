package br.com.fiap.agroplus.dto;

import java.util.List;

public class VendedorDTO {
	
	private Long id;
	private String nome;
	private String contato;
	private List<HistoricoVendasDTO> vendas;
	
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
	public List<HistoricoVendasDTO> getVendas() {
		return vendas;
	}
	public void setVendas(List<HistoricoVendasDTO> vendas) {
		this.vendas = vendas;
	}

}
