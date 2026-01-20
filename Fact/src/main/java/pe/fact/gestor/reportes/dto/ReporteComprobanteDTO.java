package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ReporteComprobanteDTO {
    private String serieNumero; // Ej: F001-0000123
    private String fechaEmision;
    private String cliente;
    private BigDecimal total;
    private String pdf;
    private String estado;

    public ReporteComprobanteDTO(String serie, String numero, LocalDateTime fechaEmision,
                                 String cliente, BigDecimal total, String pdf, String activo) {
        this.serieNumero = serie + "-" + numero;
        this.fechaEmision = (fechaEmision != null) ? fechaEmision.toString() : "";
        this.cliente = cliente;
        this.total = total;
        this.pdf = pdf;
        this.estado = "S".equals(activo) ? "ACTIVO" : "ANULADO";
    }
}