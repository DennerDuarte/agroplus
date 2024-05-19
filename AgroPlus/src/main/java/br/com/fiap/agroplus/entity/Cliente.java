package br.com.fiap.agroplus.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="T_CLIENTES")
public class Cliente {

	@Id
	@Column(name="ID_CLIENTE")
	private Long id;
	
	@Column(name="DS_NOME_CLIENTE")
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
	private List<TipoCultivo> tipoCultivos;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<HistoricoVendas> vendas;

}
