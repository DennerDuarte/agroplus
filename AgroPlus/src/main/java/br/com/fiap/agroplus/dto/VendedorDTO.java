package br.com.fiap.agroplus.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VendedorDTO {
	
	private Long id;
	private String nome;
	private String contato;
	private List<HistoricoVendasDTO> vendas;


}
