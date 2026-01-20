package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Comprobante;
import pe.fact.gestor.reportes.dto.ReporteComprobanteDTO;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReporteComprobanteRepository extends JpaRepository<Comprobante, Integer> {

    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteComprobanteDTO(" +
            "com.serie, com.numero, com.fechaEmision, cli.nombClie, com.total, com.enlacePdf, com.activo) " +
            "FROM Comprobante com " +
            "JOIN Servicio s ON com.codiServ = s.codiServ " +
            "JOIN Cliente cli ON s.codiClie = cli.codiClie " +
            "WHERE com.fechaEmision BETWEEN :inicio AND :fin")
    List<ReporteComprobanteDTO> reportar(@Param("inicio") LocalDateTime inicio, @Param("fin") LocalDateTime fin);
}