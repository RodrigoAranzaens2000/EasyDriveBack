package pe.edu.upc.easydrive.dtos;

import pe.edu.upc.easydrive.entities.CentrosMedicos;
import pe.edu.upc.easydrive.entities.Escuelas;
import pe.edu.upc.easydrive.entities.Usuario;

public class TelefonosDTO {
    private int IDTelefono;
    private String TipoDeTelefono;
    private String NumeroTelefono;
    private String AnexoEscuelas;
    private Usuario user;
    private Escuelas esc;
    private CentrosMedicos centros;

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
}
