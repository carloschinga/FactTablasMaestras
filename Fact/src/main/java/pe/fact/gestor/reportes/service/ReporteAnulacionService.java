package pe.fact.gestor.reportes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.reportes.dto.ReporteAnulacionDTO;
import pe.fact.gestor.reportes.repository.ReporteAnulacionRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ReporteAnulacionService {
    @Autowired private ReporteAnulacionRepository repo;

    public List<ReporteAnulacionDTO> listar(String inicio, String fin) {
        LocalDateTime fInicio = LocalDate.parse(inicio).atStartOfDay();
        LocalDateTime fFin = LocalDate.parse(fin).atTime(LocalTime.MAX);
        return repo.reportar(fInicio, fFin);
    }
}