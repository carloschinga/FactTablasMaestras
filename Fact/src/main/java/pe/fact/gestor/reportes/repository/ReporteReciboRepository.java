package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Recibo;
import pe.fact.gestor.reportes.dto.ReporteReciboDTO;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReporteReciboRepository extends JpaRepository<Recibo, Integer> {

    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteReciboDTO(" +
            "r.numeReci, r.fechRegiAlta, cli.nombClie, s.direServ, r.montReci, r.estdReci, r.numeOper) " +
            "FROM Recibo r " +
            "JOIN Subcuota sub ON r.codiSubCuot = sub.codiSubCuot " +
            "JOIN Cuota c ON sub.codiCuot = c.codiCuot " +
            "JOIN Servicio s ON c.codiServ = s.codiServ " +
            "JOIN Cliente cli ON s.codiClie = cli.codiClie " +
            "WHERE r.fechRegiAlta BETWEEN :fechaInicio AND :fechaFin " +
            "ORDER BY r.fechRegiAlta DESC")
    List<ReporteReciboDTO> obtenerReportePorFechas(@Param("fechaInicio") LocalDateTime fechaInicio,
                                                   @Param("fechaFin") LocalDateTime fechaFin);
}