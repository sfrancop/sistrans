package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="nombres")
public class Nombre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nombre;

    public Nombre( String nombre) {
        this.nombre = nombre;
    }

    public Nombre() {;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
