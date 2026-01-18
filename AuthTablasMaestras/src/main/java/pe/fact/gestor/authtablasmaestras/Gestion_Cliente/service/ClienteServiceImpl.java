package pe.fact.gestor.authtablasmaestras.Gestion_Cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.entity.Cliente;
import pe.fact.gestor.authtablasmaestras.Gestion_Cliente.repository.ClienteRepository;
import java.util.List;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public void agregar(Cliente cliente) {
        if(cliente.getUsuarioRegistroId() == null) cliente.setUsuarioRegistroId(1);
        clienteRepository.save(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> buscarPorDireccion(String direccion) {
        // Usamos el método mágico que creamos en el repositorio
        return clienteRepository.findByDireClieContaining(direccion);
    }
}