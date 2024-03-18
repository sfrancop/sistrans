package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prestamos")
public class Prestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPrestamo;
    private String tipo;
    private String estado;
    private float saldo;
    private float monto;
    private float interes;
    private Integer numero_cuotas;
    private String dia_pago;
    private float valor_cuota;

    public Prestamo(String tipo, String estado, float saldo, float monto, float interes, Integer numero_cuotas, String dia_pago, float valor_cuota) {
        this.tipo = tipo;
        this.estado = estado;
        this.saldo = saldo;
        this.monto = monto;
        this.interes = interes;
        this.numero_cuotas = numero_cuotas;
        this.dia_pago = dia_pago;
        this.valor_cuota = valor_cuota;
    }
    public Prestamo() {;}
    public Integer getIdPrestamo() {
        return idPrestamo;
    }
    public float getSaldoPendiente(){
        return this.getSaldo();
    }
    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
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
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public float getInteres() {
        return interes;
    }
    public void setInteres(float interes) {
        this.interes = interes;
    }
    public Integer getNumero_cuotas() {
        return numero_cuotas;
    }
    public void setNumero_cuotas(Integer numero_cuotas) {
        this.numero_cuotas = numero_cuotas;
    }
    public String getDia_pago() {
        return dia_pago;
    }
    public void setDia_pago(String dia_pago) {
        this.dia_pago = dia_pago;
    }
    public float getValor_cuota() {
        return valor_cuota;
    }
    public void setValor_cuota(float valor_cuota) {
        this.valor_cuota = valor_cuota;
    }

    
}
