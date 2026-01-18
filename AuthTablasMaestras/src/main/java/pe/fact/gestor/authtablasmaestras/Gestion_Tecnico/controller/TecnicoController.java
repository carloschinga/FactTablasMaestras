package pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.controller;

import pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.entity.Tecnico;
import pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired; // Faltaba esto
import org.springframework.http.ResponseEntity; // Faltaba esto
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tecnico")
@CrossOrigin(origins = "*")
public class TecnicoController {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Tecnico>> listar() {
        return ResponseEntity.ok(tecnicoService.listar());
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@RequestBody Tecnico tecnico) {
        tecnicoService.agregar(tecnico);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/modificar")
    public ResponseEntity<Void> modificar(@RequestBody Tecnico tecnico) {
        tecnicoService.modificar(tecnico);
        return ResponseEntity.ok().build();
    }
}