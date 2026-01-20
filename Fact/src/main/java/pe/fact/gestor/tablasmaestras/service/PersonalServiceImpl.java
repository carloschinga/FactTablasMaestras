package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.Personal;
import pe.fact.gestor.tablasmaestras.repository.AsistenciaHorarioRepository;
import pe.fact.gestor.tablasmaestras.repository.PersonalRepository;
import pe.fact.gestor.tablasmaestras.repository.RolRepository;


import java.util.List;

@Service
@Transactional
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private AsistenciaHorarioRepository horarioRepository;

    @Override
    public List<Personal> listar() {
        return personalRepository.findAll();
    }

    @Override
    public void agregar(Personal personal) {
        personalRepository.save(personal);
    }

    @Override
    public void modificar(Personal personal) {
        personalRepository.save(personal);
    }

    @Override
    public void eliminar(Integer id) {
        personalRepository.deleteById(id);
    }

    @Override
    public Personal buscarPorId(Integer id) {
        return personalRepository.findById(id).orElse(null);
    }
}
