package pe.edu.upc.easydrive.servicesinterfaces;

import pe.edu.upc.easydrive.entities.Direcciones;
import pe.edu.upc.easydrive.entities.Escuelas;

import java.util.List;

public interface IDireccionesService {
    public List<Direcciones> list();

    public void insert(Direcciones direc);

    public Direcciones listId(int id);

    public void delete(int id);

    public void update(Direcciones direc);

    public List<Direcciones> buscar(String nombre);
}
