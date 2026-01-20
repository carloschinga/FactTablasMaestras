package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReporteExtornoDTO {
    private String numeroRecibo;
    private String fecha;
    private Double monto;
    private String observacion;

    public ReporteExtornoDTO(String nro, LocalDateTime fecha, Double monto, String obs) {
        this.numeroRecibo = nro;
        this.fecha = (fecha != null) ? fecha.toString() : "";
        this.monto = monto;
        this.observacion = obs;
    }
}