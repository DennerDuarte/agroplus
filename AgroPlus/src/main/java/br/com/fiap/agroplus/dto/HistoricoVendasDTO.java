package br.com.fiap.agroplus.dto;

import java.time.LocalDate;

public class HistoricoVendasDTO {

	private Long id;
	private Long idVendedor;
	private Long idCliente;
	private LocalDate dataVenda;
	private Integer quantidade;
	private Double valorTotal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(Long idVendedor) {
		this.idVendedor = idVendedor;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public LocalDate getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
