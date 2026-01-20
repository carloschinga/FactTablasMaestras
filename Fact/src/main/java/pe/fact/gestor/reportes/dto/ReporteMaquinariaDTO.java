package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ReporteMaquinariaDTO {
    private String tipo;
    private String modelo;
    private String serial;
    private BigDecimal tarifa;
    private String estado;

    // Constructor vacío y con campos (Lombok @Data ya crea getters/setters, pero agregamos AllArgs para facilidad)
    public ReporteMaquinariaDTO(String tipo, String modelo, String serial, BigDecimal tarifa, String estado) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.serial = serial;
        this.tarifa = tarifa;
        this.estado = estado;
    }
}