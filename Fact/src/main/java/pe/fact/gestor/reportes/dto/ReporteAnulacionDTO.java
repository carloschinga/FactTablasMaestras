package pe.fact.gestor.reportes.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReporteAnulacionDTO {
    private String tablaAfectada;
    private Integer idRegistroBorrado;
    private Integer idUsuarioResponsable;
    private String fechaEliminacion;

    public ReporteAnulacionDTO(String nomTabla, Integer codiRegi, Integer codiUsua, LocalDateTime fechaElim) {
        this.tablaAfectada = nomTabla;
        this.idRegistroBorrado = codiRegi;
        this.idUsuarioResponsable = codiUsua;
        this.fechaEliminacion = (fechaElim != null) ? fechaElim.toString() : "";
    }
}