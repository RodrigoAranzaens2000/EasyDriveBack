package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "CentrosMedicos")
public class CentrosMedicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDCentro;
    @Column(name = "Nombre" , nullable = false , length = 100)
    private String Nombre;
    @Column(name = "RUC" , nullable = false)
    private long RUC;

    public CentrosMedicos() {
    }

    public CentrosMedicos(int IDCentro, String nombre, long RUC) {
        this.IDCentro = IDCentro;
        this.Nombre = nombre;
        this.RUC = RUC;
    }

    public int getIDCentro() {
        return IDCentro;
    }

    public void setIDCentro(int IDCentro) {
        this.IDCentro = IDCentro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getRUC() {
        return RUC;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }
}
