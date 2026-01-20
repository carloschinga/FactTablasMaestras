package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "audianulacion")
public class AudiAnulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiAudi")
    private Integer codiAudi;

    @Column(name = "nomTabla")
    private String nomTabla;

    @Column(name = "codiRegi")
    private Integer codiRegi; // ID del registro borrado

    @Column(name = "codiUsua")
    private Integer codiUsua; // ID del usuario que borró

    @Column(name = "fechaElim")
    private LocalDateTime fechaElim;
}