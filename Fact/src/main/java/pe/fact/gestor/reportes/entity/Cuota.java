package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cuota")
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiCuot")
    private Integer codiCuot;

    @Column(name = "codiServ")
    private Integer codiServ; // El puente hacia el Cliente

    @Column(name = "codiAnio")
    private Integer codiAnio;

    @Column(name = "codiConc")
    private Integer codiConc;

    @Column(name = "montDeud")
    private Double montDeud;

    @Column(name = "montAbon")
    private Double montAbon;

    @Column(name = "estdConc")
    private String estdConc;

    @Column(name = "fechVenc")
    private LocalDate fechVenc;

    @Column(name = "obsvcuot")
    private String obsvcuot;

    // Campos de auditoría
    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta;
}