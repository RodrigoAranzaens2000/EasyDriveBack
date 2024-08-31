package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDMetodo;
    @Column(name = "MetodoPago", nullable = false, length = 50)
    private String MetodoPago;

    public MetodoPago() {
    }

    public MetodoPago(int IDMetodo, String metodoPago) {
        this.IDMetodo = IDMetodo;
        this.MetodoPago = metodoPago;
    }

    public int getIDMetodo() {
        return IDMetodo;
    }

    public void setIDMetodo(int IDMetodo) {
        this.IDMetodo = IDMetodo;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        MetodoPago = metodoPago;
    }
}
