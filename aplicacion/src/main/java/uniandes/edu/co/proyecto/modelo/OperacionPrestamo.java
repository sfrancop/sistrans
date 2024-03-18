package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="operacionesPrestamos")
public class OperacionPrestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numeroPrestamo;
    private float valor; 
    private String tipoOperacion; 
    private String tipoPago;
    private Integer idOperacion;
    private Date fecha;

    public OperacionPrestamo(String numeroPrestamo, float valor, String tipoOperacion, String tipoPago, Integer idOperacion, Date fecha) {
        this.numeroPrestamo = numeroPrestamo;
        this.valor = valor;
        this.tipoOperacion = tipoOperacion;
        this.tipoPago = tipoPago;
        this.idOperacion = idOperacion;
        this.fecha = fecha;
    }
    public OperacionPrestamo() {;}
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }
    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getTipoOperacion() {
        return tipoOperacion;
    }
    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    public String getTipoPago() {
        return tipoPago;
    }
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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
