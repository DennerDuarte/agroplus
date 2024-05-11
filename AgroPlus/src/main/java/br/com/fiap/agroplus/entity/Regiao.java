package br.com.fiap.agroplus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="T_REGIAO")
public class Regiao {
	
	@Id
	@Column(name="ID_REGIAO")
	private Long id;
	
	@Column(name="DS_NOME_REGIAO")
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "T_VENDEDOR_REGIAO",
			joinColumns = @JoinColumn(name = "ID_REGIAO"),
			inverseJoinColumns = @JoinColumn(name = "ID_VENDEDOR"))
	private List<Vendedor> vendedores;

}
