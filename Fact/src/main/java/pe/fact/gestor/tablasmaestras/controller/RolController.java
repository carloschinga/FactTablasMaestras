package pe.fact.gestor.tablasmaestras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.fact.gestor.tablasmaestras.entity.Rol;
import pe.fact.gestor.tablasmaestras.service.RolService;


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
