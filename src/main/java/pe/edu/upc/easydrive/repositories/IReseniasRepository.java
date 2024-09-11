package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.Resenias;
import pe.edu.upc.easydrive.entities.Telefonos;

import java.util.List;

@Repository
public interface IReseniasRepository extends JpaRepository<Resenias , Integer> {

    @Query(value = "Select e.nombre, count(r.IDResenia)\n" +
            " from escuelas e\n" +
            " join resenias r\n" +
            " on e.IDEscuela = r.IDEscuelas\n" +
            " group by e.nombre",nativeQuery = true)
    public List<String[]>cantidad();
}
