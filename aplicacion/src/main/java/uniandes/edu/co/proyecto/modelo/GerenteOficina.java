package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gerenteOficina")
public class GerenteOficina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public GerenteOficina(String login, String contrasena, String tipo_id, String numero_id, String nombre, String nacionalidad, String correo, String telefono, String ciudad, String departamento, String codigo_postal, String tipo_person) {
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
    public GerenteOficina() {;}
    public String getLogin() {
        return login;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getTipo_id() {
        return tipo_id;
    }
    public String getNumero_id() {
        return numero_id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getCodigo_postal() {
        return codigo_postal;
    }
    public String geTipo_person() {
        return tipo_person;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }
    public void setNumero_id(String numero_id) {
        this.numero_id = numero_id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    public void setTipo_person(String tipo_person) {
        this.tipo_person = tipo_person;
    }

    
}
