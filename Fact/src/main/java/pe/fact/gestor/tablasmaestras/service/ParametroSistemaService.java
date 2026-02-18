package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.fact.gestor.tablasmaestras.repository.ParametroSistemaRepository;

@Service
public class ParametroSistemaService {

    @Autowired
    private ParametroSistemaRepository parametroSistemaRepository;

    public String obtenerValorParametro(Integer codiPara) {
        try {
            return parametroSistemaRepository.obtenerValorParametro(codiPara);
        } catch (Exception e) {
            return null;
        }
    }
}
