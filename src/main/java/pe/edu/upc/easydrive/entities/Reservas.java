package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDReserva;
    @Column(name = "FechaReserva", nullable = false)
    private LocalDate FechaReserva;
    @Column(name = "monto", nullable = false)
    private float monto;
    @Column(name = "EstadoReserva", nullable = false, length = 50)
    private String EstadoReserva;
    @ManyToOne
    @JoinColumn(name = "IDUsuario")
    private Usuario user;
    @ManyToOne
    @JoinColumn(name = "IDEscuela")
    private Escuelas esc;
    @ManyToOne
    @JoinColumn(name = "IDCentro")
    private CentrosMedicos centros;
    @ManyToOne
    @JoinColumn(name = "IDServicio")
    private Servicio ser;

    public Reservas() {
    }

    public Reservas(int IDReserva, LocalDate fechaReserva, float monto, String estadoReserva, Usuario user, Escuelas esc, CentrosMedicos centros, Servicio ser) {
        this.IDReserva = IDReserva;
        this.FechaReserva = fechaReserva;
        this.monto = monto;
        this.EstadoReserva = estadoReserva;
        this.user = user;
        this.esc = esc;
        this.centros = centros;
        this.ser = ser;
    }

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
