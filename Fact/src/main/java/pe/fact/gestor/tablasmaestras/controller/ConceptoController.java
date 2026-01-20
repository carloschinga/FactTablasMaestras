package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.tablasmaestras.entity.Concepto;
import pe.fact.gestor.tablasmaestras.service.ConceptoService;

import java.util.List;

@RestController
@RequestMapping("/api/concepto")
@CrossOrigin(origins = "*") // Importante
public class ConceptoController {

    @Autowired
    private ConceptoService conceptoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Concepto>> listar() {
        return ResponseEntity.ok(conceptoService.listar());
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@RequestBody Concepto concepto) {
        conceptoService.agregar(concepto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/modificar")
    public ResponseEntity<Void> modificar(@RequestBody Concepto concepto) {
        conceptoService.modificar(concepto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminar(@RequestParam Integer id) {
        conceptoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}