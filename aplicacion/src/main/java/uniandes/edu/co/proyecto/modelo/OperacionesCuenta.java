package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Operaciones_cuenta")
public class OperacionesCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idOperacion;
    private Date fecha; 
    private String tipo;
    private Float valor;
    private String cuenta_destino;
    private String cuenta_origen;

    public OperacionesCuenta(String tipo, Float valor, Date fecha, String cuenta_destino, String cuenta_origen) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.valor = valor;
        this.cuenta_destino = cuenta_destino;
        this.cuenta_origen = cuenta_origen;
    }
    public OperacionesCuenta() {;}

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String getCuenta_destino() {
        return cuenta_destino;
    }
    public void setCuenta_destino(String cuenta_destino) {
        this.cuenta_destino = cuenta_destino;
    }
    public String getCuenta_origen() {
        return cuenta_origen;
    }
    public void setCuenta_origen(String cuenta_origen) {
        this.cuenta_origen = cuenta_origen;
    }
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
