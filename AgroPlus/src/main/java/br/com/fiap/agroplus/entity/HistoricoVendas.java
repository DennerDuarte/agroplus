package br.com.fiap.agroplus.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
	
	@ManyToOne
	@JoinColumns(value = {
			@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", insertable = false, updatable = false)
	})
	private Cliente cliente;

	@ManyToOne
	@JoinColumns(value = {
			@JoinColumn(name = "ID_VENDEDOR", referencedColumnName = "ID_VENDEDOR", insertable = false, updatable = false)
	})
	private Vendedor vendedor;

}
