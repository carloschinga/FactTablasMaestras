package pe.fact.gestor.authtablasmaestras.Gestion_Cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.entity.Cliente;
import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.service.ClienteService;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService; // Variable correcta

    // 1. GET /api/cliente/listar
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
            // Es texto -> Buscamos por Dirección (o Razón Social si prefieres)
            List<Cliente> lista = clienteService.buscarPorDireccion(parametro);
            return ResponseEntity.ok(lista);
        }
    }

    // 4. POST /api/cliente/agregar
    @PostMapping("/agregar")
    public ResponseEntity<String> agregar(@RequestBody Cliente cliente) {
        try {
            clienteService.agregar(cliente); // Corregido a 'agregar'
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