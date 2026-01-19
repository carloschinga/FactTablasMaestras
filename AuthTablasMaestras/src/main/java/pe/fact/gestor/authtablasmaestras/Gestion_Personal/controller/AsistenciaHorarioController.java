package pe.fact.gestor.authtablasmaestras.Gestion_Personal.controller;

import pe.fact.gestor.authtablasmaestras.Gestion_Personal.entity.AsistenciaHorario;
import pe.fact.gestor.authtablasmaestras.Gestion_Personal.service.AsistenciaHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
