package pe.fact.gestor.tablasmaestras.service;


import pe.fact.gestor.tablasmaestras.entity.Plan;

import java.util.List;

public interface PlanService {
    List<Plan> listar();
    void agregar(Plan plan);
    void modificar(Plan plan);
    void eliminar(Integer id);
    Plan buscarPorId(Integer id);
}