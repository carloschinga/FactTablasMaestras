package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "kardex")
public class Kardex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiKard")
    private Integer codiKard;

    @Column(name = "codiProd")
    private Integer codiProd;

    @Column(name = "codiTipo")
    private Integer codiTipo; // Probablemente: 1=Entrada, 2=Salida (Lo manejaremos en lógica)

    @Column(name = "codiTrab")
    private Integer codiTrab;

    @Column(name = "cantProd")
    private Integer cantProd;

    @Column(name = "cantSald")
    private Integer cantSald;

    @Column(name = "fechMovi")
    private LocalDateTime fechMovi;

    @Column(name = "obseMovi")
    private String obseMovi;

    // --- Auditoría (según tu script) ---
    @Column(name = "codiUsuaAlta")
    private Integer codiUsuaAlta;

    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta;

    @Column(name = "codiUsuaModi")
    private Integer codiUsuaModi;

    @Column(name = "fechRegiModi")
    private LocalDateTime fechRegiModi;
}