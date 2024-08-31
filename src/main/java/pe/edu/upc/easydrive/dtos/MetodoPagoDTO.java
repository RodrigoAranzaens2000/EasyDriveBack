package pe.edu.upc.easydrive.dtos;

public class MetodoPagoDTO {
    private int IDMetodo;
    private String MetodoPago;

    public int getIDMetodo() {
        return IDMetodo;
    }

    public void setIDMetodo(int IDMetodo) {
        this.IDMetodo = IDMetodo;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        MetodoPago = metodoPago;
    }
}
