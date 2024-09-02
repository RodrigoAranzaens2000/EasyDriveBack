package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Escuelas")
public class Escuelas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDEscuela;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "Ruc", nullable = false)
    private Long Ruc;
    @ManyToOne
    @JoinColumn
    private Promocion prom;

    public Escuelas() {
    }

    public Escuelas(int IDEscuela, String nombre, Long ruc, Promocion prom) {
        this.IDEscuela = IDEscuela;
        this.nombre = nombre;
        this.Ruc = ruc;
        this.prom = prom;
    }

    public int getIDEscuela() {
        return IDEscuela;
    }

    public void setIDEscuela(int IDEscuela) {
        this.IDEscuela = IDEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getRuc() {
        return Ruc;
    }

    public void setRuc(Long ruc) {
        Ruc = ruc;
    }

    public Promocion getProm() {
        return prom;
    }

    public void setProm(Promocion prom) {
        this.prom = prom;
    }
}
