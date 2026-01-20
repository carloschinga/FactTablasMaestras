package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.entity.Maquinaria;
import pe.fact.gestor.reportes.dto.ReporteMaquinariaDTO;
import java.util.List;

@Repository
public interface ReporteMaquinariaRepository extends JpaRepository<Maquinaria, Integer> {

    // Listamos todo, opcionalmente podrías filtrar por estado si quisieras
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteMaquinariaDTO(" +
            "m.tipo, m.modelo, m.serialInterno, m.tarifaDia, m.estado) " +
            "FROM Maquinaria m")
    List<ReporteMaquinariaDTO> listarTodo();
}