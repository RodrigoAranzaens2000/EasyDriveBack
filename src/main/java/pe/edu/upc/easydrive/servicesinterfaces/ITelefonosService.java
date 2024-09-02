package pe.edu.upc.easydrive.servicesinterfaces;

import pe.edu.upc.easydrive.entities.Telefonos;

import java.util.List;

public interface ITelefonosService {
    public List<Telefonos> list();

    public void insert(Telefonos tel);

    public Telefonos listId(int id);

    public void delete(int id);

    public void update(Telefonos tel);

    public List<Telefonos> buscar(String nombre);
}
