package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comprobante")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiComp")
    private Integer codiComp;

    @Column(name = "codiServ")
    private Integer codiServ;

    @Column(name = "serie")
    private String serie;

    @Column(name = "numero")
    private String numero;

    @Column(name = "fechaEmision")
    private LocalDateTime fechaEmision;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "enlacePdf")
    private String enlacePdf;

    @Column(name = "activo")
    private String activo;
}