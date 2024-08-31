package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDUsuario;
    @Column(name = "DNI", nullable = false)
    private Long DNI;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String Nombre;
    @Column(name = "ApellidoPaterno", nullable = false, length = 50)
    private String ApellidoPaterno;
    @Column(name = "ApellidoMaterno", nullable = true, length = 50)
    private String ApellidoMaterno;
    @Column(name = "CorreoElectronico", nullable = false, length = 50)
    private String CorreoElectronico;
    @Column(name = "Contrasenia", nullable = false, length = 50)
    private String Contrasenia;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @ManyToOne
    @JoinColumn(name = "IDRol")
    private Rol rol;

    public Usuario() {

    }

    public Usuario(int IDUsuario, Long DNI, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String contrasenia, LocalDate fechaNacimiento, Rol rol) {
        this.IDUsuario = IDUsuario;
        this.DNI = DNI;
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.CorreoElectronico = correoElectronico;
        this.Contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
