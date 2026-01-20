package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.ReporteReciboDTO;
import pe.fact.gestor.reportes.repository.ReporteReciboRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReporteReciboService {

    @Autowired
    private ReporteReciboRepository reporteReciboRepository;

    public List<ReporteReciboDTO> generarReporte(String inicio, String fin) {
        // Convertimos Strings 'yyyy-MM-dd' a LocalDateTime
        // Inicio: 00:00:00
        LocalDateTime fechaInicio = LocalDate.parse(inicio).atStartOfDay();
        // Fin: 23:59:59.999999999
        LocalDateTime fechaFin = LocalDate.parse(fin).atTime(LocalTime.MAX);

        return reporteReciboRepository.obtenerReportePorFechas(fechaInicio, fechaFin);
    }
}