package br.com.fiap.agroplus.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.agroplus.Service.VendedorService;
import br.com.fiap.agroplus.entity.Vendedor;

@RestController

public class VendedorController {

    @Autowired
    private VendedorService vendedorService;
    @GetMapping("/vendedor")
    public List<Vendedor> findAll(){
        return vendedorService.getAll();
    }

    @GetMapping("vendedor/{id}")
    public Optional<Vendedor> findById(@PathVariable long id){
        return vendedorService.getById(id);
    }

    @PostMapping()
    public ResponseEntity<Vendedor> criarVendedor(@PathVariable Vendedor vendedor){
        Vendedor novoVendedor = vendedorService.criarVendedor(vendedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoVendedor);
    }

    @DeleteMapping("/vendedor/{id}")
    public ResponseEntity<Void> excluirVendedor(@PathVariable Long id){
        boolean vendedorDeletado = vendedorService.deleteVendedor(id);
        if(vendedorDeletado){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("vendedor/{id}")
    public ResponseEntity<Vendedor> atualizarVendedor(@PathVariable Long id, @RequestBody Vendedor vendedor ){
        Vendedor vendedorAtualizado = vendedorService.updateVendedor(id, vendedor);

        if(vendedorAtualizado != null){
            return ResponseEntity.ok(vendedorAtualizado);
        }

        return ResponseEntity.notFound().build();
    }
}
