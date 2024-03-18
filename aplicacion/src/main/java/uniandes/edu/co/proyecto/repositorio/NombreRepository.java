package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Nombre;

import java.util.Collection;


public interface NombreRepository extends JpaRepository<Nombre, Integer> {

    @Query(value = "SELECT * FROM nombres", nativeQuery = true)
    Collection<Nombre> darNombres();

    @Query(value = "SELECT * FROM Nombrees WHERE id = :id", nativeQuery = true)
    Nombre darNombre(@Param("id") long id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO nombres (id, nombre) VALUES ( 3 , :nombre)", nativeQuery = true)
    void insertarNombre(@Param("nombre") String nombre);

}
