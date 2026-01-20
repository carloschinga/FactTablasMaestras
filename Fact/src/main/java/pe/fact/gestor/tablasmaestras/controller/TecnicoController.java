package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.tablasmaestras.entity.Tecnico;
import pe.fact.gestor.tablasmaestras.service.TecnicoService;

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

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        tecnicoService.eliminar(id);
        return ResponseEntity.ok().build();
    }

}