package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.ReporteKardexDTO;
import pe.fact.gestor.reportes.repository.KardexRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReporteService {

    @Autowired
    private KardexRepository kardexRepository;

    public List<ReporteKardexDTO> obtenerKardex(String inicio, String fin) {
        // Convertimos Strings 'yyyy-MM-dd' a LocalDateTime (Inicio del día 00:00 - Fin del día 23:59)
        LocalDateTime fechaInicio = LocalDate.parse(inicio).atStartOfDay();
        LocalDateTime fechaFin = LocalDate.parse(fin).atTime(LocalTime.MAX);

        return kardexRepository.reportePorFechas(fechaInicio, fechaFin);
    }
}