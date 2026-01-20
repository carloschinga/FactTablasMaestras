package pe.fact.gestor.reportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.reportes.dto.ReportePlanDTO;
import pe.fact.gestor.tablasmaestras.entity.Plan;

import java.util.List;

@Repository
public interface ReportePlanRepository extends JpaRepository<Plan, Integer> {
    @Query("SELECT new pe.fact.gestor.reportes.dto.ReportePlanDTO(" +
            "p.codiPlan, p.nombPlan, p.montPlan, p.estdPlan) FROM Plan p")
    List<ReportePlanDTO> listarResumen();
}