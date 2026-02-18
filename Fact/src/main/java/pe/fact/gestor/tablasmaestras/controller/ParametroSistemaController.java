package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.fact.gestor.tablasmaestras.service.ParametroSistemaService;

@RestController
@RequestMapping("/parametrosistema")
@CrossOrigin(origins = "*")
public class ParametroSistemaController {

    @Autowired
    private ParametroSistemaService parametroSistemaService;

    @GetMapping("/obtener/{codiPara}")
    public String obtenerValorParametro(@PathVariable Integer codiPara) {
        return parametroSistemaService.obtenerValorParametro(codiPara);
    }
}
