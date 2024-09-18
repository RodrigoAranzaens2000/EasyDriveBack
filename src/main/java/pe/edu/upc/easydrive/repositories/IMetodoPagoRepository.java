package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.MetodoPago;

@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
}
