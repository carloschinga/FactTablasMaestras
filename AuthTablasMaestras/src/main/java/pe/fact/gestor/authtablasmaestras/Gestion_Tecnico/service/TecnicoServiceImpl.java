package pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.entity.Tecnico;
import pe.fact.gestor.authtablasmaestras.Gestion_Tecnico.repository.TecnicoRepository;
import java.util.List;

@Service
@Transactional
public class TecnicoServiceImpl implements TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Override
    public List<Tecnico> listar() {
        return tecnicoRepository.findAll();
    }

    @Override
    public void agregar(Tecnico tecnico) {
        tecnicoRepository.save(tecnico);
    }

    @Override
    public void modificar(Tecnico tecnico) {
        tecnicoRepository.save(tecnico);
    }

    @Override
    public void eliminar(Integer id) {
        tecnicoRepository.deleteById(id);
    }

    @Override
    public Tecnico buscarPorId(Integer id) {
        return tecnicoRepository.findById(id).orElse(null);
    }
}