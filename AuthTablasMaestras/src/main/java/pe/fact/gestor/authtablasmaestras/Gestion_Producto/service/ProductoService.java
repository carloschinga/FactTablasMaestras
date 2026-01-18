package pe.fact.gestor.authtablasmaestras.Gestion_Producto.service;

import pe.fact.gestor.authtablasmaestras.Gestion_Producto.entity.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    void agregar(Producto producto);
    void modificar(Producto producto);
    void eliminar(Integer id);
    Producto buscarPorId(Integer id);
}