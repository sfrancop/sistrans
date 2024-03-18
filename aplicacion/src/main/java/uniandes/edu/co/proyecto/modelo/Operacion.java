package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Operaciones")
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idOperacion;
    private Date fecha; 

    public Operacion(Date fecha) {
        this.fecha = fecha;
    }
    public Operacion() {;}
    public Integer getIdOperacion() {
        return idOperacion;
    }
    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
