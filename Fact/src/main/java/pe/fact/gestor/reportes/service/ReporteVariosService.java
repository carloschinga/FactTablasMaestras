package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.*;
import pe.fact.gestor.reportes.repository.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReporteVariosService {

    @Autowired private ReporteAveriaRepository averiaRepo;
    @Autowired private ReporteMaquinariaRepository maquinaRepo;
    @Autowired private ReporteComprobanteRepository compRepo;

    // --- Averías ---
    public List<ReporteAveriaDTO> averias(String inicio, String fin) {
        return averiaRepo.reportar(parseInicio(inicio), parseFin(fin));
    }

    // --- Maquinaria ---
    public List<ReporteMaquinariaDTO> maquinarias() {
        return maquinaRepo.listarTodo();
    }

    // --- Comprobantes ---
    public List<ReporteComprobanteDTO> comprobantes(String inicio, String fin) {
        return compRepo.reportar(parseInicio(inicio), parseFin(fin));
    }

    // Métodos auxiliares privados para fechas
    private LocalDateTime parseInicio(String fecha) {
        return LocalDate.parse(fecha).atStartOfDay();
    }
    private LocalDateTime parseFin(String fecha) {
        return LocalDate.parse(fecha).atTime(LocalTime.MAX);
    }
}