package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.service.ReporteVariosService;
import pe.fact.gestor.reportes.dto.ReporteMaquinariaDTO;
import java.util.List;

@RestController
@RequestMapping("/api/reportes/equipos") // Cambié a 'equipos' para coincidir con tu menú
@CrossOrigin(origins = "*")
public class ReporteMaquinariaController {
    @Autowired private ReporteVariosService service;

    @GetMapping("/listar")
    public ResponseEntity<List<ReporteMaquinariaDTO>> listar() {
        return ResponseEntity.ok(service.maquinarias());
    }
}