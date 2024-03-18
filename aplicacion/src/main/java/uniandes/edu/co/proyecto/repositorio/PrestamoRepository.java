package uniandes.edu.co.proyecto.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Prestamo;
import java.util.Collection;
import java.util.Date;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{

    @Query(value = "SELECT * FROM prestamos", nativeQuery = true)
    Collection<Prestamo> darPrestamos();
   
    @Query (value= "SELECT * FROM prestamos WHERE id = :id_prestamo", nativeQuery = true)
    Prestamo darPrestamo(@Param("id_prestamo") int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO prestamos (id_prestamo, tipo, estado, monto, interes, numero_cutoas, dia_pago, valor_cuota, saldo) VALUES (:id_prestamo, :tipo, :estado, :monto, :interes, :numero_cuotas, :dia_pago, :valor_cuota, :saldo)", nativeQuery = true)
    void insertarPrestamo (@Param("id_prestamo") Integer id_prestamo,
        @Param("tipo") String tipo,
        @Param("estado") String estado,
        @Param("saldo") float saldo,
        @Param("monto") float monto,
        @Param("interes") float interes,
        @Param("numero_cuotas") Integer numero_cuotas,
        @Param("dia_pago") String dia_pago,
        @Param("valor_cuota") float valor_cuota);

    
    @Modifying
    @Transactional
    @Query(value = "UPDATE cuentas SET tipo = :tipo, estado = :estado, saldo = :saldo, ultima_transaccion = :ultima_transaccion, fecha_creacion = :fecha_creacion WHERE numero_cuenta = :numero_cuenta", nativeQuery = true)
    void actualizarPrestamo(@Param("tipo") String tipo,
    @Param("estado") String estado,
    @Param("numero_cuenta") String numero_cuenta, 
    @Param("saldo") float saldo,
    @Param("ultima_transaccion") Date ultima_transaccion,
    @Param("fecha_creacion") Date fecha_creacion);
    
   
    @Modifying
    @Transactional
    @Query(value = "UPDATE Prestamo SET estado = 'cerrado' WHERE id = :idPrestamo AND saldo_pendiente = 0", nativeQuery = true)
    void cerrarPrestamo(@Param("idPrestamo") int idPrestamo);
    

}
