package pe.fact.gestor.tablasmaestras.entity;

import javax.persistence.*;

@Entity
@Table(name = "asistencia_horario")
public class AsistenciaHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codiHora;

    private String nombHora;

    // Getters & Setters
    public Integer getCodiHora() {
        return codiHora;
    }

    public void setCodiHora(Integer codiHora) {
        this.codiHora = codiHora;
    }

    public String getNombHora() {
        return nombHora;
    }

    public void setNombHora(String nombHora) {
        this.nombHora = nombHora;
    }
}
