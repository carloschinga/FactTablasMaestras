package pe.fact.gestor.authtablasmaestras.Gestion_Concepto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.authtablasmaestras.Gestion_Concepto.entity.Concepto;

@Repository
public interface ConceptoRepository extends JpaRepository<Concepto, Integer> {
}