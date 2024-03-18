package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
    @Query(value = "SELECT * FROM cuentas", nativeQuery = true)
    Collection<Cuenta> darCuentas();
   
    @Query (value= "SELECT * FROM cuentas WHERE id = :numero_cuenta", nativeQuery = true)
    Cuenta darCuenta(@Param("numero_cuenta") int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cuentas (tipo, estado, numero_cuenta, saldo, ultima_transaccion, fecha_creacion) VALUES (:tipo, :estado, :numero_cuenta, :saldo, :ultima_transaccion, :fecha_creacion)", nativeQuery = true)
    void insertarCuenta(@Param("tipo") String tipo,
     @Param("estado") String estado,
     @Param("numero_cuenta") String numero_cuenta, 
     @Param("saldo") float saldo,
     @Param("ultima_transaccion") Date ultima_transaccion,
     @Param("fecha_creacion") Date fecha_creacion);

     @Modifying
     @Transactional
     @Query(value = "UPDATE cuentas SET tipo = :tipo, estado = :estado, saldo = :saldo, ultima_transaccion = :ultima_transaccion, fecha_creacion = :fecha_creacion WHERE numero_cuenta = :numero_cuenta", nativeQuery = true)
     void actualizarCuenta(@Param("tipo") String tipo,
     @Param("estado") String estado,
     @Param("numero_cuenta") String numero_cuenta, 
     @Param("saldo") float saldo,
     @Param("ultima_transaccion") Date ultima_transaccion,
     @Param("fecha_creacion") Date fecha_creacion); 
}