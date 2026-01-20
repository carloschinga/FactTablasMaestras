package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.dto.ReporteReciboDTO;
import pe.fact.gestor.reportes.service.ReporteReciboService;

import java.util.List;

@RestController
@RequestMapping("/api/reportes/recibos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReporteReciboController {

    @Autowired
    private ReporteReciboService reporteReciboService;

    // Endpoint: GET /api/reportes/recibos/listar?inicio=2025-01-01&fin=2025-01-31
    @GetMapping("/listar")
    public ResponseEntity<List<ReporteReciboDTO>> listarRecibos(
            @RequestParam("inicio") String inicio,
            @RequestParam("fin") String fin) {

        List<ReporteReciboDTO> data = reporteReciboService.generarReporte(inicio, fin);
        return ResponseEntity.ok(data);
    }
}