package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Rol;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    @Query("Select r from Rol r where r.NombreRol like %:nombre%")
    public List<Rol> buscar(@Param("nombre") String nombre);
}
