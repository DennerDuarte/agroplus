package br.com.fiap.agroplus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="T_TIPOS_CULTIVOS")
public class TipoCultivo {
	
	@Id
	@Column(name="ID_TIPO_CULTIVO")
	private Long id;
	
	@Column(name="DS_NOME_CULTIVO")
	private String descricao;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="TB_CLIENTE_TIPOCULTIVO",
			joinColumns = @JoinColumn(name="ID_CLIENTE"),
			inverseJoinColumns = @JoinColumn(name="ID_TIPO_CULTIVO"))
	private List<Cliente> clientes;
}
