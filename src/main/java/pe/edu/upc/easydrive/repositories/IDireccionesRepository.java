package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Direcciones;
import pe.edu.upc.easydrive.entities.Escuelas;

import java.util.List;

@Repository
public interface IDireccionesRepository extends JpaRepository<Direcciones, Integer> {
    @Query("Select d from Direcciones d where d.Calle like %:nombre%")
    public List<Direcciones> buscar(@Param("nombre") String nombre);
}
