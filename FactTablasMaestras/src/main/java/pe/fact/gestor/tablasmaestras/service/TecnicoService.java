package pe.fact.gestor.tablasmaestras.service;


import pe.fact.gestor.tablasmaestras.entity.Tecnico;

import java.util.List;

public interface TecnicoService {
    List<Tecnico> listar();
    void agregar(Tecnico tecnico);
    void modificar(Tecnico tecnico);
    void eliminar(Integer id);
    Tecnico buscarPorId(Integer id);
}