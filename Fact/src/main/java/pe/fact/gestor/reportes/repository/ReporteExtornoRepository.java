package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Recibo; // Reusamos Recibo
import pe.fact.gestor.reportes.dto.ReporteExtornoDTO;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReporteExtornoRepository extends JpaRepository<Recibo, Integer> {
    // Buscamos recibos con estado 'E' (Extornado) o 'A' (Anulado)
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteExtornoDTO(r.numeReci, r.fechRegiAlta, r.montReci, r.obsvReci) " +
            "FROM Recibo r WHERE (r.estdReci = 'E' OR r.estdReci = 'A') " +
            "AND r.fechRegiAlta BETWEEN :inicio AND :fin")
    List<ReporteExtornoDTO> reportar(@Param("inicio") LocalDateTime inicio, @Param("fin") LocalDateTime fin);
}