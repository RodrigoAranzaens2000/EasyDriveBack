package pe.edu.upc.easydrive.servicesinterfaces;

import pe.edu.upc.easydrive.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {
    public List<MetodoPago> list();

    public void insert(MetodoPago met);

    public MetodoPago listId(int id);

    public void delete(int id);

    public void update(MetodoPago met);

    public List<MetodoPago> buscar(String nombre);
}
