package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDRol;
    @Column(name = "NombreRol", nullable = false, length = 30)
    private String NombreRol;

    public Rol() {
    }

    public Rol(int IDRol, String nombreRol) {
        this.IDRol = IDRol;
        this.NombreRol = nombreRol;
    }

    public int getIDRol() {
        return IDRol;
    }

    public void setIDRol(int IDRol) {
        this.IDRol = IDRol;
    }

    public String getNombreRol() {
        return NombreRol;
    }

    public void setNombreRol(String nombreRol) {
        NombreRol = nombreRol;
    }
}
