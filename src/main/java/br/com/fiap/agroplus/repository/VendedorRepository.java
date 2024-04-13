package br.com.fiap.agroplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.agroplus.entity.Vendedor;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long>{
	
	public Vendedor buscaVendedor();
	public List<Vendedor> buscaVendedores();
	public Vendedor criaVendedor();

}
