package br.com.fiap.agroplus.repository;

import java.util.List;
import java.util.Optional;

import br.com.fiap.agroplus.entity.Vendedor;

public class VendedorRepositoryImpl implements VendedorRepository{

	@Override
	public <S extends Vendedor> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vendedor> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Vendedor> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Vendedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Vendedor> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vendedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Vendedor> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor buscaVendedor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> buscaVendedores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendedor criaVendedor() {
		// TODO Auto-generated method stub
		return null;
	}

}
