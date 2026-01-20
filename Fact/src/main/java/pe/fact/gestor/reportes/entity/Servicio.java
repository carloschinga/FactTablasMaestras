package pe.fact.gestor.reportes.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codiServ")
    private Integer codiServ;

    @Column(name = "codiClie")
    private Integer codiClie; // Enlace vital con Cliente

    @Column(name = "codiTipoServ")
    private Integer codiTipoServ;

    @Column(name = "codiPlan")
    private Integer codiPlan;

    @Column(name = "codiUbig")
    private String codiUbig;

    @Column(name = "direServ")
    private String direServ;

    @Column(name = "estdServ")
    private String estdServ; // Estado del servicio

    // Auditoría
    @Column(name = "fechRegiAlta")
    private LocalDateTime fechRegiAlta;
}