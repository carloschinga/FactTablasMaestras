package pe.fact.gestor.reportes.dto;

import lombok.Data;

@Data
public class ReporteClienteDTO {
    private String documento; // DNI o RUC
    private String nombreCompleto; // Razon Social o Nombres+Apellidos
    private String correo;
    private String celular;
    private String estado; // Vigente / Suspendido

    public ReporteClienteDTO(String numeDocu, String nombClie, String raznSociClie,
                             String mailClie, String celuClie, String estdClie) {
        this.documento = numeDocu;
        // Lógica visual: Si tiene Razón Social, la usamos; si no, Nombres
        this.nombreCompleto = (raznSociClie != null && !raznSociClie.isEmpty()) ? raznSociClie : nombClie;
        this.correo = mailClie;
        this.celular = celuClie;
        this.estado = "V".equals(estdClie) ? "VIGENTE" : "SUSPENDIDO";
    }
}