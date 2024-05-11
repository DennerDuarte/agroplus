package br.com.fiap.agroplus.entity;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="T_VENDEDORES")
public class Vendedor {
	
	@Id
	@Column(name="ID_VENDEDOR")
	private Long id;
	
	@Column(name="DS_NOME")
	@NotNull(message = "É necessário que o nome seja informado.")
	@Size(min = 10, max = 60, message = "O nome precisa ter entre 10 e 60 caracteres")
	private String nome;
	
	@Column(name="DS_CONTATO")
	@NotNull(message = "É necessário que o contato seja informado.")
	private String contato;
	
	@ManyToMany(mappedBy = "vendedor")
	private InfoRegiao infoRegiao;


}
