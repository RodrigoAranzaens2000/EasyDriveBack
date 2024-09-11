package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.*;

import java.time.LocalDate;

public class ReservasDTO {
    private int IDReserva;
    private LocalDate FechaReserva;
    private String EstadoReserva;
    private Users user;
    private Escuelas esc;
    private CentrosMedicos centros;
    private Servicio ser;
    private Promocion prom;

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

    public String getEstadoReserva() {
        return EstadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        EstadoReserva = estadoReserva;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
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

    public Promocion getProm() {
        return prom;
    }

    public void setProm(Promocion prom) {
        this.prom = prom;
    }
}
