package pe.fact.gestor.authtablasmaestras.Gestion_Cliente.service;

import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.entity.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listar();
    void agregar(Cliente cliente);
    void modificar(Cliente cliente);
    void eliminar(Integer id);

    // --- NUEVOS MÉTODOS REQUERIDOS ---
    Cliente buscarPorId(Integer id);
    //List<Cliente> buscarPorDireccion(String direccion);
}