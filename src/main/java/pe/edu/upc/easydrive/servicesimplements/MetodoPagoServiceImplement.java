package pe.edu.upc.easydrive.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easydrive.entities.MetodoPago;
import pe.edu.upc.easydrive.repositories.IMetodoPagoRepository;
import pe.edu.upc.easydrive.servicesinterfaces.IMetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mR;

    @Override
    public List<MetodoPago> list() {
        return mR.findAll();
    }

    @Override
    public void insert(MetodoPago met) {
        mR.save(met);
    }

    @Override
    public MetodoPago listId(int id) {
        return mR.findById(id).orElse(new MetodoPago());
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public void update(MetodoPago met) {
        mR.save(met);
    }

}
