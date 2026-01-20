package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ReporteReciboDTO {
    private String numeroRecibo;
    private String fechaEmision;
    private String nombreCliente; // Dato cruzado (Cliente)
    private String direccionServicio; // Dato cruzado (Servicio)
    private Double monto;
    private String estado;
    private String numeroOperacion;

    // Constructor compatible con JPQL
    public ReporteReciboDTO(String numeroRecibo, LocalDateTime fechaEmision,
                            String nombreCliente, String direccionServicio,
                            Double monto, String estado, String numeroOperacion) {
        this.numeroRecibo = numeroRecibo;
        this.fechaEmision = (fechaEmision != null) ? fechaEmision.toLocalDate().toString() : "";
        this.nombreCliente = nombreCliente;
        this.direccionServicio = direccionServicio;
        this.monto = monto;
        this.estado = estado;
        this.numeroOperacion = numeroOperacion;
    }
}