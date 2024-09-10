package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Direcciones")
public class Direcciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDdireccion;
    @Column(name = "Calle", nullable = false, length = 300)
    private String Calle;
    @Column(name = "Ciudad", nullable = false, length = 50)
    private String Ciudad;
    @Column(name = "EstadProvincia", nullable = false, length = 50)
    private String EstadProvincia;
    @Column(name = "CodigoPostal", nullable = false)
    private int CodigoPostal;
    @Column(name = "Pais", nullable = false, length = 50)
    private String Pais;
    @Column(name = "Latitud", nullable = false)
    private Long Latitud;
    @Column(name = "Longitud", nullable = false)
    private Long Longitud;
    @ManyToOne
    @JoinColumn(name = "IDUsuario")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "IDEscuela")
    private Escuelas esc;

    public Direcciones() {
    }

    public Direcciones(int IDdireccion, String calle, String ciudad, String estadProvincia, int codigoPostal, String pais, Long latitud, Long longitud, Users user, Escuelas esc) {
        this.IDdireccion = IDdireccion;
        this.Calle = calle;
        this.Ciudad = ciudad;
        this.EstadProvincia = estadProvincia;
        this.CodigoPostal = codigoPostal;
        this.Pais = pais;
        this.Latitud = latitud;
        this.Longitud = longitud;
        this.user = user;
        this.esc = esc;
    }

    public int getIDdireccion() {
        return IDdireccion;
    }

    public void setIDdireccion(int IDdireccion) {
        this.IDdireccion = IDdireccion;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstadProvincia() {
        return EstadProvincia;
    }

    public void setEstadProvincia(String estadProvincia) {
        EstadProvincia = estadProvincia;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Long getLatitud() {
        return Latitud;
    }

    public void setLatitud(Long latitud) {
        Latitud = latitud;
    }

    public Long getLongitud() {
        return Longitud;
    }

    public void setLongitud(Long longitud) {
        Longitud = longitud;
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
}
