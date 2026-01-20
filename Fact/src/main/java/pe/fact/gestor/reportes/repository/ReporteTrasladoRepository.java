package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Cuota; // Reusamos Cuota
import pe.fact.gestor.reportes.dto.ReporteTrasladoDTO;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReporteTrasladoRepository extends JpaRepository<Cuota, Integer> {

    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteTrasladoDTO(" +
            "cli.nombClie, s.direServ, c.montDeud, c.fechVenc, c.estdConc) " +
            "FROM Cuota c " +
            "JOIN Concepto con ON c.codiConc = con.codiConc " +
            "JOIN Servicio s ON c.codiServ = s.codiServ " +
            "JOIN Cliente cli ON s.codiClie = cli.codiClie " +
            "WHERE con.nombConc LIKE %:concepto% " + // Buscamos 'TRASLADO'
            "AND c.fechVenc BETWEEN :inicio AND :fin")
    List<ReporteTrasladoDTO> reportar(@Param("concepto") String concepto,
                                      @Param("inicio") LocalDate inicio,
                                      @Param("fin") LocalDate fin);
}