package br.com.fiap.agroplus.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.agroplus.entity.Vendedor;
import br.com.fiap.agroplus.repository.VendedorRepository;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    public List<Vendedor> getAll(){
        return (List<Vendedor>) vendedorRepository.findAll();
    }
    public Optional<Vendedor> getById(Long id) {
        return vendedorRepository.findById(id);
    }

    public Vendedor criarVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

    public Vendedor updateVendedor(Long id, Vendedor vendedor){
        Vendedor vendedorExistente = vendedorRepository.findById(id).orElse(null);
        if(vendedorExistente != null){
            vendedorExistente.setId(id);
            return vendedorRepository.save(vendedor);
        } else {
            return null;
        }
    }

    public boolean deleteVendedor(Long id) {
        if (vendedorRepository.existsById(id)) {
            vendedorRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
