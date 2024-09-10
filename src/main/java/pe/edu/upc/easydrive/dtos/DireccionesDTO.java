package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.Escuelas;
import pe.edu.upc.easydrive.entities.Users;

public class DireccionesDTO {
    private int IDdireccion;
    private String Calle;
    private String Ciudad;
    private String EstadProvincia;
    private int CodigoPostal;
    private String Pais;
    private Long Latitud;
    private Long Longitud;
    private Users user;
    private Escuelas esc;

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
