package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "recibo")
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiReci")
    private Integer codiReci;

    @Column(name = "codiSubCuot")
    private Integer codiSubCuot;

    @Column(name = "numeSeri")
    private String numeSeri;

    @Column(name = "numeReci")
    private String numeReci;

    @Column(name = "montReci")
    private Double montReci;

    @Column(name = "formPago")
    private Integer formPago;

    @Column(name = "numeOper")
    private String numeOper;

    @Column(name = "estdReci")
    private String estdReci;

    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta; // Fecha de emisión

    @Column(name = "obsvReci")
    private String obsvReci;
}