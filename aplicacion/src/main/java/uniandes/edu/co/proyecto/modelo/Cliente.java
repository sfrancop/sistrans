package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idCliente;
    private String login;
    private String contrasena;
    private String tipo_id;
    private String numero_id;
    private String nombre;
    private String nacionalidad;
    private String correo; 
    private String telefono;
    private String ciudad; 
    private String departamento;
    private String codigo_postal;
    private String tipo_person;

    public Cliente(String idCliente, String login, String contrasena, String tipo_id, String numero_id, String nombre, String nacionalidad, String correo, String telefono, String ciudad, String departamento, String codigo_postal, String tipo_person) {
        this.idCliente = idCliente;
        this.login = login;
        this.contrasena = contrasena;
        this.tipo_id = tipo_id;
        this.numero_id = numero_id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codigo_postal = codigo_postal;
        this.tipo_person = tipo_person;
    }

    public Cliente() {;}

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getNumero_id() {
        return numero_id;
    }

    public void setNumero_id(String numero_id) {
        this.numero_id = numero_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getTipo_person() {
        return tipo_person;
    }

    public void setTipo_person(String tipo_person) {
        this.tipo_person = tipo_person;
    }

    
    
}
