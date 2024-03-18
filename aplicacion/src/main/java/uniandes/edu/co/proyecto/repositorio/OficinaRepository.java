package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Oficina;


public interface OficinaRepository extends JpaRepository<Oficina, Integer>{

        @Query(value = "SELECT * FROM oficinas", nativeQuery = true)
        Collection<Oficina> darOficinas();

        @Query(value = "SELECT * FROM oficinas WHERE id=:id", nativeQuery = true)
        Oficina darOficina(@Param("id") Integer id);

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO oficinas (id, nombre, direccion, numero_puntos, id_gerente_oficina, tipo_id_gerente_oficina) VALUES (secuencia_ids.nextval, :nombre, :direccion, :numero_puntos, :id_gerente_oficina, :tipo_id_gerente_oficina)", nativeQuery = true)
        void insertarOficina(@Param("nombre") String nombre, @Param("direccion") String direccion,
        @Param("numero_puntos") Integer numero_puntos, @Param("id_gerente_oficina") Integer id_gerente_oficina, @Param("tipo_id_gerente_oficina") String tipo_id_gerente_oficina);

}