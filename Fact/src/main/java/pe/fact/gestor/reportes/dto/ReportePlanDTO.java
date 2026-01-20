package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ReportePlanDTO {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private String estado;

    public ReportePlanDTO(Integer codiPlan, String nombPlan, BigDecimal montPlan, String estdPlan) {
        this.codigo = codiPlan;
        this.nombre = nombPlan;
        this.precio = (montPlan != null) ? montPlan.doubleValue() : 0.0;
        this.estado = "V".equals(estdPlan) ? "ACTIVO" : "INACTIVO";
    }
}