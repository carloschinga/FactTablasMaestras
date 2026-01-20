package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.ReporteDeudaDTO;
import pe.fact.gestor.reportes.repository.ReporteDeudaRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReporteDeudaService {

    @Autowired
    private ReporteDeudaRepository reporteDeudaRepository;

    public List<ReporteDeudaDTO> generarReporte(String inicio, String fin) {
        LocalDate fechaInicio = LocalDate.parse(inicio);
        LocalDate fechaFin = LocalDate.parse(fin);
        return reporteDeudaRepository.obtenerDeudasPorVencimiento(fechaInicio, fechaFin);
    }
}