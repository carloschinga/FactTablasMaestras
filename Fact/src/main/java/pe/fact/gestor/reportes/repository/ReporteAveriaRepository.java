package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Averia;
import pe.fact.gestor.reportes.dto.ReporteAveriaDTO;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReporteAveriaRepository extends JpaRepository<Averia, Integer> {

    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteAveriaDTO(" +
            "a.codiAver, c.nombClie, a.descriAver, a.comenAve, a.fechRegiAlta, a.estdAver) " +
            "FROM Averia a JOIN Cliente c ON a.codiClie = c.codiClie " +
            "WHERE a.fechRegiAlta BETWEEN :inicio AND :fin")
    List<ReporteAveriaDTO> reportar(@Param("inicio") LocalDateTime inicio, @Param("fin") LocalDateTime fin);
}