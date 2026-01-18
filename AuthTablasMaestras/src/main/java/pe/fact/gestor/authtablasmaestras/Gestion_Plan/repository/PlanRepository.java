package pe.fact.gestor.authtablasmaestras.Gestion_Plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.authtablasmaestras.Gestion_Plan.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
}