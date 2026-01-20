package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.dto.ReporteKardexDTO;
import pe.fact.gestor.reportes.service.ReporteService;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    // Endpoint: GET /api/reportes/kardex?inicio=2025-01-01&fin=2025-01-31
    @GetMapping("/kardex")
    public ResponseEntity<List<ReporteKardexDTO>> getReporteKardex(
            @RequestParam("inicio") String inicio,
            @RequestParam("fin") String fin) {

        return ResponseEntity.ok(reporteService.obtenerKardex(inicio, fin));
    }
}