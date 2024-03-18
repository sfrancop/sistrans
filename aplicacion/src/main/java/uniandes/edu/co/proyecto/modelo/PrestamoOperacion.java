package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prestamosOperaciones")
public class PrestamoOperacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer idPrestamo;
    private Integer idOperacion; 

    public PrestamoOperacion(Integer idPrestamo, Integer idOperacion) {
        this.idPrestamo = idPrestamo;
        this.idOperacion = idOperacion;
    }
    public PrestamoOperacion() {;}
    public Integer getId() {
        return id;
    }
    public Integer getIdPrestamo() {
        return idPrestamo;
    }
    public Integer getIdOperacion() {
        return idOperacion;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }
    
}
