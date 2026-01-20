package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.dto.ReporteClienteDTO;
import pe.fact.gestor.tablasmaestras.entity.Cliente;

import java.util.List;

@Repository
public interface ReporteClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReporteClienteDTO(" +
            "c.numeDocu, c.nombClie, c.raznSociClie, c.mailClie, c.celuClie, c.estdClie) " +
            "FROM Cliente c")
    List<ReporteClienteDTO> listarResumen();
}