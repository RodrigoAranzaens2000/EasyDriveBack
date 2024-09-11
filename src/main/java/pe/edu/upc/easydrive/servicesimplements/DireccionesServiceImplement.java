package pe.edu.upc.easydrive.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easydrive.entities.Direcciones;
import pe.edu.upc.easydrive.repositories.IDireccionesRepository;
import pe.edu.upc.easydrive.servicesinterfaces.IDireccionesService;

import java.util.List;

@Service
public class DireccionesServiceImplement implements IDireccionesService {
    @Autowired
    private IDireccionesRepository dR;

    @Override
    public List<Direcciones> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Direcciones direc) {
        dR.save(direc);
    }

    @Override
    public Direcciones listId(int id) {
        return dR.findById(id).orElse(new Direcciones());
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }

    @Override
    public void update(Direcciones direc) {
        dR.save(direc);
    }

}
