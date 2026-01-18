package pe.fact.gestor.authtablasmaestras.Gestion_Producto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.authtablasmaestras.Gestion_Producto.entity.Producto;
import pe.fact.gestor.authtablasmaestras.Gestion_Producto.service.ProductoService;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.listar());
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@RequestBody Producto producto) {
        productoService.agregar(producto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/modificar")
    public ResponseEntity<Void> modificar(@RequestBody Producto producto) {
        productoService.modificar(producto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminar(@RequestParam Integer id) {
        productoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}