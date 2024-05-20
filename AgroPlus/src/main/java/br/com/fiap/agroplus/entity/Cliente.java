package br.com.fiap.agroplus.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	
	@NotNull(message = "É necessário que o nome do cliente seja informado.")
	@Size(min = 3, max = 60, message = "O nome precisa ter entre 3 e 60 caracteres")
	@Column(name="DS_NOME_CLIENTE")
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
	private List<TipoCultivo> tipoCultivos;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<HistoricoVendas> vendas;

}
