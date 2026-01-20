package pe.fact.gestor.tablasmaestras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.fact.gestor.tablasmaestras.entity.Producto;
import pe.fact.gestor.tablasmaestras.repository.ProductoRepository;

import java.util.List;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public void agregar(Producto p) {
        // Guardamos directo (ya no hay campos extra que validar)
        productoRepository.save(p);
    }

    @Override
    public void modificar(Producto p) {
        productoRepository.save(p);
    }

    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto buscarPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
}