package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.service.ReporteFinalService;
import pe.fact.gestor.reportes.dto.*;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(origins = "*")
public class ReporteFinalController {

    @Autowired private ReporteFinalService service;

    @GetMapping("/anulaciones/listar")
    public ResponseEntity<List<ReporteAnulacionDTO>> anulaciones(@RequestParam("inicio") String ini, @RequestParam("fin") String fin) {
        return ResponseEntity.ok(service.anulaciones(ini, fin));
    }

    @GetMapping("/traslados/listar")
    public ResponseEntity<List<ReporteTrasladoDTO>> traslados(@RequestParam("inicio") String ini, @RequestParam("fin") String fin) {
        return ResponseEntity.ok(service.traslados(ini, fin));
    }

    @GetMapping("/extornos/listar")
    public ResponseEntity<List<ReporteExtornoDTO>> extornos(@RequestParam("inicio") String ini, @RequestParam("fin") String fin) {
        return ResponseEntity.ok(service.extornos(ini, fin));
    }
}