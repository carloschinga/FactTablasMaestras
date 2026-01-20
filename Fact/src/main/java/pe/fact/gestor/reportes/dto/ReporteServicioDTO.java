package pe.fact.gestor.reportes.dto;

import lombok.Data;

@Data
public class ReporteServicioDTO {
    private Integer codigoServicio;
    private String cliente;
    private String direccion;
    private String nombrePlan;
    private String estado;

    public ReporteServicioDTO(Integer codiServ, String nombClie, String raznSoci,
                              String direServ, String nombPlan, String estdServ) {
        this.codigoServicio = codiServ;
        this.cliente = (raznSoci != null && !raznSoci.isEmpty()) ? raznSoci : nombClie;
        this.direccion = direServ;
        this.nombrePlan = (nombPlan != null) ? nombPlan : "SIN PLAN";
        this.estado = "A".equals(estdServ) ? "ACTIVO" : "CORTADO";
    }
}