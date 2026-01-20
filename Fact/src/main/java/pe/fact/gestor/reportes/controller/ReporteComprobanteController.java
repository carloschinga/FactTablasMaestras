package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.service.ReporteVariosService;
import pe.fact.gestor.reportes.dto.ReporteComprobanteDTO;
import java.util.List;

@RestController
@RequestMapping("/api/reportes/comprobantes")
@CrossOrigin(origins = "*")
public class ReporteComprobanteController {
    @Autowired private ReporteVariosService service;

    @GetMapping("/listar")
    public ResponseEntity<List<ReporteComprobanteDTO>> listar(@RequestParam("inicio") String inicio, @RequestParam("fin") String fin) {
        return ResponseEntity.ok(service.comprobantes(inicio, fin));
    }
}