package uniandes.edu.co.proyecto.repositorio;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.OperacionesCuenta;
public interface OperacionesCuentaRepository extends JpaRepository<OperacionesCuenta, Integer> {
   
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cuentas_operaciones (tipo, valor, fecha, cuenta_destino, cuenta_origen) VALUES (:tipo, :valor, :fecha, :cuenta_destino, :cuenta_origen)", nativeQuery = true)
    void insertarOperacion(@Param("tipo") String tipo,
     @Param("valor") Float valor,
     @Param("fecha") Date fecha, 
     @Param("cuenta_destino") String cuenta_destino,
     @Param("cuenta_origen") String cuenta_origen);

}
