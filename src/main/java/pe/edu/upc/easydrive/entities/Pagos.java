package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPago;
    @Column(name = "FechaPago" , nullable = false)
    private LocalDate FechaPago;
    @ManyToOne
    @JoinColumn(name = "IDReserva")
    private Reservas res;
    @ManyToOne
    @JoinColumn(name = "IDMetodo")
    private MetodoPago metodo;

    public Pagos() {
    }

    public Pagos(int IDPago, LocalDate fechaPago, Reservas res, MetodoPago metodo) {
        this.IDPago = IDPago;
        this.FechaPago = fechaPago;
        this.res = res;
        this.metodo = metodo;
    }

    public int getIDPago() {
        return IDPago;
    }

    public void setIDPago(int IDPago) {
        this.IDPago = IDPago;
    }

    public LocalDate getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        FechaPago = fechaPago;
    }

    public Reservas getRes() {
        return res;
    }

    public void setRes(Reservas res) {
        this.res = res;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }
}
