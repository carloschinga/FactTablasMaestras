package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.tablasmaestras.entity.Personal;
import pe.fact.gestor.tablasmaestras.service.PersonalService;


import java.util.List;

@RestController
@RequestMapping("/api/personal")
@CrossOrigin("*")
public class PersonalController {

    @Autowired // IMPORTANTE
    private PersonalService personalService; // Usa la Interfaz

    // Constructor opcional (ya pusimos @Autowired arriba)
    // public PersonalController(PersonalService personalService) { this.personalService = personalService; }

    @GetMapping("/listar")
    public ResponseEntity<List<Personal>> listar() {
        return ResponseEntity.ok(personalService.listar());
    }

    @PostMapping("/agregar")
    public ResponseEntity<Void> agregar(@RequestBody Personal personal) {
        personalService.agregar(personal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/modificar")
    public ResponseEntity<Void> modificar(@RequestBody Personal personal) {
        personalService.modificar(personal);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminar(@RequestParam Integer codiPers) {
        personalService.eliminar(codiPers);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}