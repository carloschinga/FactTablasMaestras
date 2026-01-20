package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ReporteTrasladoDTO {
    private String cliente;
    private String direccion;
    private Double monto;
    private String fechaVencimiento;
    private String estadoPago; // Pendiente / Cancelado

    public ReporteTrasladoDTO(String cliente, String direccion, Double monto, LocalDate fechaVenc, String estado) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.monto = monto;
        this.fechaVencimiento = (fechaVenc != null) ? fechaVenc.toString() : "";
        this.estadoPago = "C".equals(estado) ? "ATENDIDO/PAGADO" : "PENDIENTE";
    }
}