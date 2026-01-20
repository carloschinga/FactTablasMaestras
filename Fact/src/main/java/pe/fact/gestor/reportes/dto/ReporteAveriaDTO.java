package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReporteAveriaDTO {
    private Integer idAveria;
    private String nombreCliente;
    private String descripcion;
    private String comentario;
    private String fechaRegistro;
    private String estado;

    public ReporteAveriaDTO(Integer idAveria, String nombreCliente, String descripcion,
                            String comentario, LocalDateTime fechaRegistro, String estado) {
        this.idAveria = idAveria;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.fechaRegistro = (fechaRegistro != null) ? fechaRegistro.toString() : "";
        this.estado = estado;
    }
}