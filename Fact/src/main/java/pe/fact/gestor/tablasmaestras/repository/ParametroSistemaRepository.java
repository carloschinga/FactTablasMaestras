package pe.fact.gestor.tablasmaestras.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class ParametroSistemaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String obtenerValorParametro(Integer codiPara) {
        String sql = "CALL sp_parametro_sistema_obtener_valor(?)";
        return jdbcTemplate.queryForObject(sql, String.class, codiPara);
    }

}
