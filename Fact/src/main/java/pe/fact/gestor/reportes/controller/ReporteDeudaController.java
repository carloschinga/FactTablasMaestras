package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.dto.ReporteDeudaDTO;
import pe.fact.gestor.reportes.service.ReporteDeudaService;

import java.util.List;

@RestController
@RequestMapping("/api/reportes/deudas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReporteDeudaController {

    @Autowired
    private ReporteDeudaService reporteDeudaService;

    @GetMapping("/listar")
    public ResponseEntity<List<ReporteDeudaDTO>> listarDeudas(
            @RequestParam("inicio") String inicio,
            @RequestParam("fin") String fin) {

        List<ReporteDeudaDTO> data = reporteDeudaService.generarReporte(inicio, fin);
        return ResponseEntity.ok(data);
    }
}