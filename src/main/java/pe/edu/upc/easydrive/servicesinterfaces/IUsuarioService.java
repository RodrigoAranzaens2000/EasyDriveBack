package pe.edu.upc.easydrive.servicesinterfaces;

import pe.edu.upc.easydrive.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario user);
    public Usuario listId(int id);
    public void delete(int id);
    public void update(Usuario user);
    public List<Usuario> buscar(String nombre);
}
