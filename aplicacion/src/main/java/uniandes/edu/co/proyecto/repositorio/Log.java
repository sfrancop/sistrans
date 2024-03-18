package uniandes.edu.co.proyecto.repositorio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Log")
public class Log {
    @Id
    private Integer idOperacion; 
    
    public Log(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }
    public Log() {;}
    public Integer getIdOperacion() {
        return idOperacion;
    }
    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }
    
}
