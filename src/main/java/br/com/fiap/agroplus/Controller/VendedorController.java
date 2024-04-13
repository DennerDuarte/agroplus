package br.com.fiap.agroplus.Controller;

import br.com.fiap.agroplus.Service.VendedorService;
import br.com.fiap.agroplus.entity.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class VendedorController {

    @Autowired
    private VendedorService vendedorService;
    @GetMapping("/vendedor")
    public Vendedor findAll(){
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
