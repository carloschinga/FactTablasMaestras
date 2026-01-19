package pe.fact.gestor.authtablasmaestras.Gestion_Personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.authtablasmaestras.Gestion_Personal.entity.AsistenciaHorario;
import pe.fact.gestor.authtablasmaestras.Gestion_Personal.repository.AsistenciaHorarioRepository;

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
