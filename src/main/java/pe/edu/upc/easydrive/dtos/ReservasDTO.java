package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.CentrosMedicos;
import pe.edu.upc.easydrive.entities.Escuelas;
import pe.edu.upc.easydrive.entities.Servicio;
import pe.edu.upc.easydrive.entities.Usuario;

import java.time.LocalDate;

public class ReservasDTO {
    private int IDReserva;
    private LocalDate FechaReserva;
    private float monto;
    private String EstadoReserva;
    private Usuario user;
    private Escuelas esc;
    private CentrosMedicos centros;
    private Servicio ser;

    public int getIDReserva() {
        return IDReserva;
    }

    public void setIDReserva(int IDReserva) {
        this.IDReserva = IDReserva;
    }

    public LocalDate getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        FechaReserva = fechaReserva;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEstadoReserva() {
        return EstadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        EstadoReserva = estadoReserva;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Escuelas getEsc() {
        return esc;
    }

    public void setEsc(Escuelas esc) {
        this.esc = esc;
    }

    public CentrosMedicos getCentros() {
        return centros;
    }

    public void setCentros(CentrosMedicos centros) {
        this.centros = centros;
    }

    public Servicio getSer() {
        return ser;
    }

    public void setSer(Servicio ser) {
        this.ser = ser;
    }
}
