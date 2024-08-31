package pe.edu.upc.easydrive.dtos;

public class CentrosMedicosDTO {
    private int IDCentro;
    private String Nombre;
    private long RUC;

    public int getIDCentro() {
        return IDCentro;
    }

    public void setIDCentro(int IDCentro) {
        this.IDCentro = IDCentro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getRUC() {
        return RUC;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }
}
