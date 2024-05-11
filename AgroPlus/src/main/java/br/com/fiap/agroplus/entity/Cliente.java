package br.com.fiap.agroplus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns(value = {
			@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", insertable = false, updatable = false)
	})
	@ManyToMany(mappedBy = "cliente")
	public List<TipoCultivo> tipoCultivos;

}
