package br.com.fiap.agroplus.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.agroplus.entity.Vendedor;

public class VendedorResource {
	
	@PostMapping
	public Vendedor criaVendedor(@RequestBody Vendedor vendedor) {
		return vendedor;
	}

}
