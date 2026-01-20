package pe.fact.gestor.tablasmaestras.service;


import pe.fact.gestor.tablasmaestras.entity.Concepto;

import java.util.List;

public interface ConceptoService {
    List<Concepto> listar();
    void agregar(Concepto concepto);
    void modificar(Concepto concepto);
    void eliminar(Integer id);
    Concepto buscarPorId(Integer id);
}