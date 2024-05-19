package br.com.fiap.agroplus.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="T_INFOS_REGIAO")
public class InfoRegiao {

	@Id
	@Column(name="ID_INFOS_REGIAO")
	private Long id;

	@Column(name="ID_CLIENTE")
	private Long id_cliente;

	@Column(name="NR_TEMPERATURA")
	private Double temperatura;
	
	@Column(name="NR_UMIDADE")
	private Double umidade;
	
	@Column(name="NR_PRECIPITACAO")
	private Double precipitacao;
	
	@Column(name="DT_INFO")
	private LocalDate dataInfo;
}
