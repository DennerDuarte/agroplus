package br.com.fiap.agroplus.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_HISTORICO_VENDAS")
public class HistoricoVendas {

	@Id
	@Column(name="ID_VENDA")
	private Long id;

	@Column(name="ID_VENDEDOR")
	private Long idVendedor;

	@Column(name="ID_CLIENTE")
	private Long idCliente;

	@Column(name="DT_VENDA")
	private LocalDate dataVenda;

	@Column(name="NR_QUANTIDADE")
	private Integer quantidade;

	@Column(name="NR_VALOR_TOTAL")
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
