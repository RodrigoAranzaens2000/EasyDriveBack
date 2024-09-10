package pe.edu.upc.easydrive.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Telefonos")
public class Telefonos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDTelefono;
    @Column(name = "TipoDeTelefono" , nullable = false , length = 50)
    private String TipoDeTelefono;
    @Column(name = "NumeroTelefono" , nullable = false , length = 50)
    private String NumeroTelefono;
    @Column(name = "AnexoEscuelas" , nullable = false , length = 50)
    private String AnexoEscuelas;
    @ManyToOne
    @JoinColumn(name = "IDUsuario")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "IDEscuela")
    private Escuelas esc;
    @ManyToOne
    @JoinColumn(name = "IDCentros")
    private CentrosMedicos centros;

    public Telefonos() {
    }

    public Telefonos(int IDTelefono, String tipoDeTelefono, String numeroTelefono, String anexoEscuelas, Users user, Escuelas esc, CentrosMedicos centros) {
        this.IDTelefono = IDTelefono;
        this.TipoDeTelefono = tipoDeTelefono;
        this.NumeroTelefono = numeroTelefono;
        this.AnexoEscuelas = anexoEscuelas;
        this.user = user;
        this.esc = esc;
        this.centros = centros;
    }

    public int getIDTelefono() {
        return IDTelefono;
    }

    public void setIDTelefono(int IDTelefono) {
        this.IDTelefono = IDTelefono;
    }

    public String getTipoDeTelefono() {
        return TipoDeTelefono;
    }

    public void setTipoDeTelefono(String tipoDeTelefono) {
        TipoDeTelefono = tipoDeTelefono;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        NumeroTelefono = numeroTelefono;
    }

    public String getAnexoEscuelas() {
        return AnexoEscuelas;
    }

    public void setAnexoEscuelas(String anexoEscuelas) {
        AnexoEscuelas = anexoEscuelas;
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
}
