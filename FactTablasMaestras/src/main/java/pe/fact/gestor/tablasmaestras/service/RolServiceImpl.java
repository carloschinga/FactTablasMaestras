package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.Rol;
import pe.fact.gestor.tablasmaestras.repository.RolRepository;


import java.util.List;

@Service
@Transactional
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> listar() {
        return rolRepository.findAll();
    }
}
