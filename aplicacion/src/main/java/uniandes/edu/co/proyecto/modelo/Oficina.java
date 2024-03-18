package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="oficinas")
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id;
    private String nombre;
    private String direccion;
    private Integer numero_puntos;
    private String id_gerente_oficina;
    private String tipo_id_gerente_oficina;

    
    public Oficina(String nombre, String direccion, Integer numero_puntos, String id_gerente_oficina, String tipo_id_gerente_oficina) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero_puntos = numero_puntos;
        this.id_gerente_oficina = id_gerente_oficina;
        this.tipo_id_gerente_oficina = tipo_id_gerente_oficina;
    }
    
    public Oficina() {;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumero_puntos() {
        return numero_puntos;
    }

    public void setNumero_puntos(Integer numero_puntos) {
        this.numero_puntos = numero_puntos;
    }

    public String getId_gerente_oficina() {
        return id_gerente_oficina;
    }

    public void setId_gerente_oficina(String id_gerente_oficina) {
        this.id_gerente_oficina = id_gerente_oficina;
    }

    public String getTipo_id_gerente_oficina() {
        return tipo_id_gerente_oficina;
    }

    public void setTipo_id_gerente_oficina(String tipo_id_gerente_oficina) {
        this.tipo_id_gerente_oficina = tipo_id_gerente_oficina;
    }

    

    
}
