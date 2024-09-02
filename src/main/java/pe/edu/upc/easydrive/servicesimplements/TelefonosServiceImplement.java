package pe.edu.upc.easydrive.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easydrive.entities.Telefonos;
import pe.edu.upc.easydrive.repositories.ITelefonosRepository;
import pe.edu.upc.easydrive.servicesinterfaces.ITelefonosService;

import java.util.List;

@Service
public class TelefonosServiceImplement implements ITelefonosService {
    @Autowired
    private ITelefonosRepository tR;


    @Override
    public List<Telefonos> list() {
        return tR.findAll();
    }

    @Override
    public void insert(Telefonos tel) {
        tR.save(tel);
    }

    @Override
    public Telefonos listId(int id) {
        return tR.findById(id).orElse(new Telefonos());
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public void update(Telefonos tel) {
        tR.save(tel);
    }

    @Override
    public List<Telefonos> buscar(String nombre) {
        return tR.buscar(nombre);
    }
}
