package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

        @Query(value = "SELECT * FROM usuarios", nativeQuery = true)
        Collection<Usuario> darUsuarios();

        @Query(value = "SELECT * FROM usuarios WHERE numero_identificacion = :numero_identificacion", nativeQuery = true)
        Usuario darUsuario(@Param("numero_identificacion") String numero_identificacion);

        @Modifying
        @Transactional
        @Query(value = "INSERT INTO usuarios (login, contrasena, tipo_identificacion, numero_identificacion, nombre, nacionalidad, direccion, correo, telefono, ciudad, departamento, codigo_postal, tipo_person, id_cliente) VALUES (:login, :contrasena, :tipo_identificacion, :numero_identificacion , :nombre, :nacionalidad, :direccion, :correo, :telefono, :ciudad, :departamento, :codigo_postal,  :tipo_person, secuencia_ids.nextval)", nativeQuery = true)
        void insertarUsuario (@Param("login") String login, @Param("contrasena") String contrasena, @Param("tipo_identificacion") String tipo_identificacion, @Param("numero_identificacion") String numero_identificacion, @Param("nombre") String nombre, @Param("nacionalidad") String nacionalidad, @Param("direccion") String direccion, @Param("correo") String correo, @Param("telefono") String telefono, @Param("ciudad") String ciudad, @Param("departamento") String departamento, @Param("codigo_postal") String codigo_postal, @Param("tipo_person") String tipo_person);
}