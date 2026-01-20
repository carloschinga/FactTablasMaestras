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
public class ReporteFinalService {
    @Autowired private AudiAnulacionRepository anulacionRepo;
    @Autowired private ReporteTrasladoRepository trasladoRepo;
    @Autowired private ReporteExtornoRepository extornoRepo;

    public List<ReporteAnulacionDTO> anulaciones(String ini, String fin) {
        return anulacionRepo.reportar(parseInicio(ini), parseFin(fin));
    }

    public List<ReporteTrasladoDTO> traslados(String ini, String fin) {
        // Parseamos a LocalDate porque Cuota usa LocalDate en fechVenc
        return trasladoRepo.reportar("TRASLADO", LocalDate.parse(ini), LocalDate.parse(fin));
    }

    public List<ReporteExtornoDTO> extornos(String ini, String fin) {
        return extornoRepo.reportar(parseInicio(ini), parseFin(fin));
    }

    private LocalDateTime parseInicio(String f) { return LocalDate.parse(f).atStartOfDay(); }
    private LocalDateTime parseFin(String f) { return LocalDate.parse(f).atTime(LocalTime.MAX); }
}