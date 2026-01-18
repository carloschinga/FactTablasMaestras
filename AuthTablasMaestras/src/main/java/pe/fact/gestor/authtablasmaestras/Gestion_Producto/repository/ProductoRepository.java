package pe.fact.gestor.authtablasmaestras.Gestion_Producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.fact.gestor.authtablasmaestras.Gestion_Producto.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}