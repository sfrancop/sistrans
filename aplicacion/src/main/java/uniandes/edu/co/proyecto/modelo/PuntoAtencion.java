package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="puntos_atencion")
public class PuntoAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id_punto;
    private String hora_apertura = "8:00";
    private String hora_cierre = "17:00";
    private String ciudad;
    private String tipo;
    private Integer id_oficina;

    public PuntoAtencion() {;}

    public PuntoAtencion(String ciudad, String tipo, Integer id_oficina) {
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.id_oficina = id_oficina;
    }

    public Integer getId_punto() {
        return id_punto;
    }

    public void setId_punto(Integer id_punto) {
        this.id_punto = id_punto;
    }

    public String getHora_apertura() {
        return hora_apertura;
    }

    public String getHora_cierre() {
        return hora_cierre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(Integer id_oficina) {
        this.id_oficina = id_oficina;
    }

    
    

    
}
