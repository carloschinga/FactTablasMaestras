package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.AudiAnulacion;
import pe.fact.gestor.reportes.dto.ReporteAnulacionDTO;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReporteAnulacionRepository extends JpaRepository<AudiAnulacion, Integer> {

    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteAnulacionDTO(" +
            "a.nomTabla, a.codiRegi, a.codiUsua, a.fechaElim) " +
            "FROM AudiAnulacion a " +
            "WHERE a.fechaElim BETWEEN :inicio AND :fin " +
            "ORDER BY a.fechaElim DESC")
    List<ReporteAnulacionDTO> reportar(@Param("inicio") LocalDateTime inicio, @Param("fin") LocalDateTime fin);
}