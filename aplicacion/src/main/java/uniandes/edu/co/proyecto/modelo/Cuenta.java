package uniandes.edu.co.proyecto.modelo;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentas")
public class Cuenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tipo;
    private String estado; 
    private String numero_cuenta; 
    private float saldo; 
    private Date ultima_transaccion; 
    private Date fecha_creacion; 

    public Cuenta(String tipo, String estado, String numero_cuenta, float saldo, Date ultima_transaccion, Date fecha_creacion) {
        this.tipo = tipo;
        this.estado = estado;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.ultima_transaccion = ultima_transaccion;
        this.fecha_creacion = fecha_creacion;
    }
    public Cuenta() {;}
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNumero_cueta() {
        return numero_cuenta;
    }
    public void setNumero_cueta(String numero_cueta) {
        this.numero_cuenta = numero_cueta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Date getUltima_transaccion() {
        return ultima_transaccion;
    }
    public void setUltima_transaccion(Date ultima_transaccion) {
        this.ultima_transaccion = ultima_transaccion;
    }
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    
}
