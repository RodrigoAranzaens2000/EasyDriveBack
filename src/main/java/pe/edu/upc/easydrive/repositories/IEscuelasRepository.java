package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Escuelas;
import pe.edu.upc.easydrive.entities.Notificaciones;

import java.util.List;

@Repository
public interface IEscuelasRepository extends JpaRepository<Escuelas, Integer> {
    @Query("Select e from Escuelas e where e.nombre like %:nombre%")
    public List<Escuelas> buscar(@Param("nombre") String nombre);
}
