package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Cuota;
import pe.fact.gestor.reportes.dto.ReporteDeudaDTO;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReporteDeudaRepository extends JpaRepository<Cuota, Integer> {

    // Listar deudas que vencen en un rango de fechas
    // Opcionalmente podrías agregar "AND c.montDeud > 0" si solo quieres impagos
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteDeudaDTO(" +
            "c.codiCuot, cli.nombClie, s.direServ, c.codiConc, c.montDeud, c.fechVenc, c.estdConc) " +
            "FROM Cuota c " +
            "JOIN Servicio s ON c.codiServ = s.codiServ " +
            "JOIN Cliente cli ON s.codiClie = cli.codiClie " +
            "WHERE c.fechVenc BETWEEN :fechaInicio AND :fechaFin " +
            "ORDER BY c.fechVenc ASC")
    List<ReporteDeudaDTO> obtenerDeudasPorVencimiento(@Param("fechaInicio") LocalDate fechaInicio,
                                                      @Param("fechaFin") LocalDate fechaFin);
}