package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ReporteDeudaDTO {
    private Integer idCuota;
    private String nombreCliente;      // De tabla Cliente
    private String direccionServicio;  // De tabla Servicio
    private String concepto;           // Código o nombre del concepto
    private Double montoDeuda;         // De tabla Cuota
    private String fechaVencimiento;   // De tabla Cuota
    private String estado;             // De tabla Cuota

    public ReporteDeudaDTO(Integer idCuota, String nombreCliente, String direccionServicio,
                           Integer codiConc, Double montoDeuda, LocalDate fechaVencimiento, String estado) {
        this.idCuota = idCuota;
        this.nombreCliente = nombreCliente;
        this.direccionServicio = direccionServicio;
        this.concepto = (codiConc != null) ? codiConc.toString() : "S/N"; // Aquí podrías cruzar con tabla Concepto si fuera necesario
        this.montoDeuda = montoDeuda;
        this.fechaVencimiento = (fechaVencimiento != null) ? fechaVencimiento.toString() : "";
        this.estado = estado;
    }
}