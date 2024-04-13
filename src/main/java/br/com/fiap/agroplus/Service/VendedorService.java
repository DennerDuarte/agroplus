package br.com.fiap.agroplus.Service;

import br.com.fiap.agroplus.entity.Vendedor;
import br.com.fiap.agroplus.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository vendedorRepository;

    public Vendedor getAll(){
        return (Vendedor) vendedorRepository.findAll();
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
