package pe.fact.gestor.tablasmaestras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.tablasmaestras.entity.Personal;


@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {
}

