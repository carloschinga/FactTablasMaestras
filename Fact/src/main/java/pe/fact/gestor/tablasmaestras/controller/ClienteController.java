package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.tablasmaestras.entity.Cliente;
import pe.fact.gestor.tablasmaestras.service.ClienteService;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*") // Permite acceso desde cualquier lugar (Frontend)
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // 1. GET /api/cliente/listar (Este es el que usa tu tabla principal)
    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(clienteService.listar());
    }

    // 2. GET /api/cliente/listar/{parametro} (Búsqueda Híbrida)
    @GetMapping("/listar/{parametro}")
    public ResponseEntity<?> buscar(@PathVariable("parametro") String parametro) {
        if (esNumero(parametro)) {
            // Es número -> Buscamos por ID
            Cliente c = clienteService.buscarPorId(Integer.parseInt(parametro));
            return c != null ? ResponseEntity.ok(c) : ResponseEntity.notFound().build();
        } else {
            // ERROR CORREGIDO: Como borramos "direClie" de la BD, no podemos buscar por dirección.
            // Por ahora devolvemos una lista vacía para que no de error de compilación.
            // Más adelante podemos implementar "buscarPorRazonSocial".
            System.out.println("Búsqueda por texto desactivada temporalmente: " + parametro);
            return ResponseEntity.ok(new ArrayList<Cliente>());
        }
    }

    // 4. POST /api/cliente/agregar
    @PostMapping("/agregar")
    public ResponseEntity<String> agregar(@RequestBody Cliente cliente) {
        try {
            clienteService.agregar(cliente);
            return ResponseEntity.ok("Cliente registrado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    // 5. PUT /api/cliente/modificar
    @PutMapping("/modificar")
    public ResponseEntity<String> modificar(@RequestBody Cliente cliente) {
        try {
            clienteService.modificar(cliente);
            return ResponseEntity.ok("Cliente modificado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    // 6. DELETE /api/cliente/eliminar?id=1
    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminar(@RequestParam("id") Integer id) {
        try {
            clienteService.eliminar(id);
            return ResponseEntity.ok("Cliente eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    private boolean esNumero(String str) {
        if (str == null) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}