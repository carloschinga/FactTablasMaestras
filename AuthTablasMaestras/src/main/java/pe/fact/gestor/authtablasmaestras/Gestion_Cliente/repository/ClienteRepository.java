package pe.fact.gestor.authtablasmaestras.Gestion_Cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.entity.Cliente;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Spring Boot crea el SQL automáticamente al leer el nombre del metodo:
    // "Buscar donde direClie contenga el texto (LIKE %texto%)"
    List<Cliente> findByDireClieContaining(String texto);
}