package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReporteKardexDTO {
    private Integer idMovimiento;
    private String fecha;
    private String nombreProducto;
    private Integer cantidad;
    private Integer saldo;
    private String observacion;
    private String tipoMovimiento; // "Entrada" o "Salida" (Lógica visual)

    // Constructor para JPQL
    public ReporteKardexDTO(Integer idMovimiento, LocalDateTime fecha, String nombreProducto,
                            Integer cantidad, Integer saldo, String observacion, Integer codiTipo) {
        this.idMovimiento = idMovimiento;
        this.fecha = fecha.toString(); // O formatear a dd/MM/yyyy
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.saldo = saldo;
        this.observacion = observacion;
        // Lógica simple para mostrar texto en lugar de número
        this.tipoMovimiento = (codiTipo != null && codiTipo == 1) ? "ENTRADA" : "SALIDA";
    }
}