package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.PuntoAtencion;


public interface PuntoAtencionRepository extends JpaRepository<PuntoAtencion, Integer>{

        @Query(value = "SELECT * FROM puntos_atencion", nativeQuery = true)
        Collection<PuntoAtencion> darPuntosAtencion();

        @Query(value = "SELECT * FROM bares WHERE id_oficina = :id_oficina", nativeQuery = true)
        PuntoAtencion darBar(@Param("id_oficina") int id_oficina);

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO puntos_atencion (id_punto, nombre, hora_apertura, hora_cierre, ciudad, tipo, id_oficina) VALUES ( secuencia_ids.nextval , :nombre, '8:00', '17:00', :ciudad, :tipo, :id_oficina)", nativeQuery = true)
        void insertarPuntoAtencion(@Param("nombre") String nombre, @Param("ciudad") String ciudad,
        @Param("tipo") String tipo, @Param("id_oficina") Integer id_oficina);

        @Modifying
        @Transactional
        @Query(value = "DELETE FROM bares WHERE id_punto = :id_punto", nativeQuery = true)
        void eliminarPuntoAtencion(@Param("id_punto") long id_punto);
}