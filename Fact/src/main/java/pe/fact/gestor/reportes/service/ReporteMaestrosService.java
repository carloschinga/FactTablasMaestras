package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.*;
import pe.fact.gestor.reportes.repository.*;
import java.util.List;

@Service
public class ReporteMaestrosService {
    @Autowired private ReporteClienteRepository clienteRepo;
    @Autowired private ReportePlanRepository planRepo;
    @Autowired private ReporteServicioRepository servicioRepo;

    public List<ReporteClienteDTO> clientes() { return clienteRepo.listarResumen(); }
    public List<ReportePlanDTO> planes() { return planRepo.listarResumen(); }
    public List<ReporteServicioDTO> servicios() { return servicioRepo.listarResumen(); }
}