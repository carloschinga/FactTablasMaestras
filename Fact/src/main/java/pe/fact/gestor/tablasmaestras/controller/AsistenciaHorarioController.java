package pe.fact.gestor.tablasmaestras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.fact.gestor.tablasmaestras.entity.AsistenciaHorario;
import pe.fact.gestor.tablasmaestras.service.AsistenciaHorarioService;


import java.util.List;

@RestController
@RequestMapping("/api/horario")
@CrossOrigin("*")
public class AsistenciaHorarioController {

    @Autowired
    private AsistenciaHorarioService asistenciaHorarioService;

    @GetMapping("/listar")
    public List<AsistenciaHorario> listar() {
        return asistenciaHorarioService.listar();
    }
}
