package pe.fact.gestor.authtablasmaestras.Gestion_Personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.authtablasmaestras.Gestion_Personal.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
