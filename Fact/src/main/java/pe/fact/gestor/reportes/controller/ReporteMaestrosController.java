package pe.fact.gestor.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.reportes.service.ReporteMaestrosService;
import pe.fact.gestor.reportes.dto.*;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
@CrossOrigin(origins = "*")
public class ReporteMaestrosController {

    @Autowired private ReporteMaestrosService service;

    @GetMapping("/clientes/listar")
    public ResponseEntity<List<ReporteClienteDTO>> listarClientes() {
        return ResponseEntity.ok(service.clientes());
    }

    @GetMapping("/planes/listar")
    public ResponseEntity<List<ReportePlanDTO>> listarPlanes() {
        return ResponseEntity.ok(service.planes());
    }

    @GetMapping("/servicios/listar")
    public ResponseEntity<List<ReporteServicioDTO>> listarServicios() {
        return ResponseEntity.ok(service.servicios());
    }
}