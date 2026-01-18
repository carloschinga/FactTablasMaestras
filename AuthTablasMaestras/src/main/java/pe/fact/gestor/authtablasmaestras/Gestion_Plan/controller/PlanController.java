package pe.fact.gestor.authtablasmaestras.Gestion_Plan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.authtablasmaestras.Gestion_Plan.entity.Plan;
import pe.fact.gestor.authtablasmaestras.Gestion_Plan.service.PlanService;
import java.util.List;

@RestController
@RequestMapping("/api/plan")
@CrossOrigin(origins = "*")
public class PlanController {

    @Autowired
    private PlanService planService;

    @GetMapping("/listar")
    public ResponseEntity<List<Plan>> listar() {
        return ResponseEntity.ok(planService.listar());
    }

    @PostMapping("/guardar") // OJO: Tu HTML llamaba a /guardar
    public ResponseEntity<Void> guardar(@RequestBody Plan plan) {
        planService.agregar(plan);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/modificar")
    public ResponseEntity<Void> modificar(@RequestBody Plan plan) {
        planService.modificar(plan);
        return ResponseEntity.ok().build();
    }

    // Agregamos el endpoint anular/eliminar por si acaso
    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminar(@RequestParam Integer id) {
        planService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}