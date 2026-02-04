package pe.fact.gestor.tablasmaestras.entity;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codiRol;

    private String nombRol;

    // Getters & Setters
    public Integer getCodiRol() {
        return codiRol;
    }

    public void setCodiRol(Integer codiRol) {
        this.codiRol = codiRol;
    }

    public String getNombRol() {
        return nombRol;
    }

    public void setNombRol(String nombRol) {
        this.nombRol = nombRol;
    }
}
