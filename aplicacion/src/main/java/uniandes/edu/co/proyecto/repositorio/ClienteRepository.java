package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.modelo.Cliente;
import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query(value = "SELECT * FROM clientes", nativeQuery = true)
    Collection<Cliente> darClientes();
   
    @Query (value= "SELECT * FROM clientes WHERE id = :id_cliente", nativeQuery = true)
    Cliente darCliente(@Param("id_cliente") int id);
    
}
