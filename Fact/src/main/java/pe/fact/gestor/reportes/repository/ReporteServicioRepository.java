package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Servicio;
import pe.fact.gestor.reportes.dto.ReporteServicioDTO;
import java.util.List;

@Repository
public interface ReporteServicioRepository extends JpaRepository<Servicio, Integer> {
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteServicioDTO(" +
            "s.codiServ, c.nombClie, c.raznSociClie, s.direServ, p.nombPlan, s.estdServ) " +
            "FROM Servicio s " +
            "JOIN Cliente c ON s.codiClie = c.codiClie " +
            "LEFT JOIN Plan p ON s.codiPlan = p.codiPlan") // LEFT JOIN por si no tiene plan asignado
    List<ReporteServicioDTO> listarResumen();
}