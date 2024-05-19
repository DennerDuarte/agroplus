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
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_VENDEDOR_REGIAO",
			joinColumns = @JoinColumn(name = "ID_REGIAO"),
			inverseJoinColumns = @JoinColumn(name = "ID_VENDEDOR"))
	private List<Vendedor> vendedores;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns(value = {
		@JoinColumn(name = "ID_REGIAO", referencedColumnName = "ID_REGIAO", insertable = false, updatable = false)
	})
	private List<InfoRegiao> infosRegiao;

}
