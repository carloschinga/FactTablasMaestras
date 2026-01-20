package pe.fact.gestor.tablasmaestras.service;

import pe.fact.gestor.tablasmaestras.entity.Personal;

import java.util.List;

public interface PersonalService {
    List<Personal> listar();
    void agregar(Personal personal);
    void modificar(Personal personal);
    void eliminar(Integer id);
    Personal buscarPorId(Integer id);

}