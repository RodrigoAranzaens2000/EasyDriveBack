package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Telefonos;

import java.util.List;

@Repository
public interface ITelefonosRepository extends JpaRepository<Telefonos, Integer> {
    ///HUB: Buscar telefonos por el numero
    @Query("Select t from Telefonos t where t.NumeroTelefono like %:nombre%")
    public List<Telefonos> buscar(@Param("nombre") String nombre);
}
