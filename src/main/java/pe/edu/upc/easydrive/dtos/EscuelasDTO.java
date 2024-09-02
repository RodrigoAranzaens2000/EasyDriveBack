package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.Promocion;

public class EscuelasDTO {
    private int IDEscuela;
    private String nombre;
    private Long Ruc;
    private Promocion prom;

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
