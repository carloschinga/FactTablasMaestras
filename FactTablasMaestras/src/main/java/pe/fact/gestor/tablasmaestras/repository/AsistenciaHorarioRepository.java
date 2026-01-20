package pe.fact.gestor.tablasmaestras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.tablasmaestras.entity.AsistenciaHorario;

@Repository
public interface AsistenciaHorarioRepository extends JpaRepository<AsistenciaHorario, Integer> {
}
