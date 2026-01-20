package pe.fact.gestor.tablasmaestras.service;


import pe.fact.gestor.tablasmaestras.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    void agregar(Producto producto);
    void modificar(Producto producto);
    void eliminar(Integer id);
    Producto buscarPorId(Integer id);
}