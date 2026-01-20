package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.Concepto;
import pe.fact.gestor.tablasmaestras.repository.ConceptoRepository;

import java.util.List;

@Service
@Transactional
public class ConceptoServiceImpl implements ConceptoService {

    @Autowired
    private ConceptoRepository conceptoRepository;

    @Override
    public List<Concepto> listar() {
        return conceptoRepository.findAll();
    }

    @Override
    public void agregar(Concepto concepto) {
        conceptoRepository.save(concepto);
    }

    @Override
    public void modificar(Concepto concepto) {
        conceptoRepository.save(concepto);
    }

    @Override
    public void eliminar(Integer id) {
        conceptoRepository.deleteById(id);
    }

    @Override
    public Concepto buscarPorId(Integer id) {
        return conceptoRepository.findById(id).orElse(null);
    }
}