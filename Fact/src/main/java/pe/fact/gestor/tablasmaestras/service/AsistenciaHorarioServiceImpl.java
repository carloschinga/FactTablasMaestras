package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.AsistenciaHorario;
import pe.fact.gestor.tablasmaestras.repository.AsistenciaHorarioRepository;


import java.util.List;

@Service
@Transactional
public class AsistenciaHorarioServiceImpl implements AsistenciaHorarioService {

    @Autowired
    private AsistenciaHorarioRepository asistenciaHorarioRepository;

    @Override
    public List<AsistenciaHorario> listar() {
        return asistenciaHorarioRepository.findAll();
    }
}
