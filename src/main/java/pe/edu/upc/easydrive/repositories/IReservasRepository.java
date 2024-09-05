package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Reservas;

import java.util.List;

@Repository
public interface IReservasRepository extends JpaRepository<Reservas, Integer> {
    @Query("Select r from Reservas r where r.EstadoReserva like %:nombre%")
    public List<Reservas> buscar(@Param("nombre") String nombre);

    @Query(value = "Select e.nombre, sum(r.monto)\n" +
            " from escuelas e\n" +
            " join reservas r\n" +
            " on e.IDEscuela = r.IDEscuela\n" +
            " group by e.nombre",nativeQuery = true)
    public List<String[]>suma();

    @Query(value = "Select e.nombre, count(r.IDReserva)\n" +
            "from escuelas e\n" +
            "join reservas r\n" +
            "on e.IDEscuela = r.IDEscuela\n" +
            "group by e.nombre",nativeQuery = true)
    public List<String[]>cantidad();
}
