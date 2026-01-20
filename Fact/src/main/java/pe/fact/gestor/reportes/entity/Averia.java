package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "averia")
public class Averia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiAver")
    private Integer codiAver;

    @Column(name = "codiClie")
    private Integer codiClie;

    @Column(name = "descriAver")
    private String descriAver;

    @Column(name = "comenAve")
    private String comenAve;

    @Column(name = "fechEsti")
    private LocalDate fechEsti;

    @Column(name = "estdAver")
    private String estdAver;

    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta;
}