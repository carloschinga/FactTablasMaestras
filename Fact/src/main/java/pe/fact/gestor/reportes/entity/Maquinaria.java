package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "maquinaria")
public class Maquinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maquina_id")
    private Integer maquinaId;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "serial_interno")
    private String serialInterno;

    @Column(name = "tarifa_dia")
    private BigDecimal tarifaDia;

    @Column(name = "estado")
    private String estado;
}