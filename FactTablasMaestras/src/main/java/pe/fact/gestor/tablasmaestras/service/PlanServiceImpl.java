package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.Plan;
import pe.fact.gestor.tablasmaestras.repository.PlanRepository;

import java.util.List;

@Service
@Transactional
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public List<Plan> listar() {
        return planRepository.findAll();
    }

    @Override
    public void agregar(Plan plan) {
        planRepository.save(plan);
    }

    @Override
    public void modificar(Plan plan) {
        planRepository.save(plan);
    }

    @Override
    public void eliminar(Integer id) {
        planRepository.deleteById(id);
    }

    @Override
    public Plan buscarPorId(Integer id) {
        return planRepository.findById(id).orElse(null);
    }
}