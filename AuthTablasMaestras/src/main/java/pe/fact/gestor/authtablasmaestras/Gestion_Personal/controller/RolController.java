package pe.fact.gestor.authtablasmaestras.Gestion_Personal.controller;


import pe.fact.gestor.authtablasmaestras.Gestion_Personal.entity.Rol;
import pe.fact.gestor.authtablasmaestras.Gestion_Personal.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol")
@CrossOrigin("*")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/listar")
    public List<Rol> listar() {
        return rolService.listar();
    }
}
