package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.MetodoPago;
import pe.edu.upc.easydrive.entities.Reservas;

import java.time.LocalDate;

public class PagosDTO {
    private int IDPago;
    private LocalDate FechaPago;
    private Reservas res;
    private MetodoPago metodo;

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
