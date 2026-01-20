package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.service.ReporteVariosService;
import pe.fact.gestor.reportes.dto.ReporteAveriaDTO;
import java.util.List;

@RestController
@RequestMapping("/api/reportes/averias")
@CrossOrigin(origins = "*")
public class ReporteAveriaController {
    @Autowired private ReporteVariosService service;

    @GetMapping("/listar")
    public ResponseEntity<List<ReporteAveriaDTO>> listar(@RequestParam("inicio") String inicio, @RequestParam("fin") String fin) {
        return ResponseEntity.ok(service.averias(inicio, fin));
    }
}