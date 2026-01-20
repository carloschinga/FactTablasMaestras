package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "subcuota")
public class Subcuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiSubCuot")
    private Integer codiSubCuot;

    @Column(name = "codiCuot")
    private Integer codiCuot;

    @Column(name = "montAbon")
    private Double montAbon;

    @Column(name = "estdAbon")
    private String estdAbon;

    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta;
}