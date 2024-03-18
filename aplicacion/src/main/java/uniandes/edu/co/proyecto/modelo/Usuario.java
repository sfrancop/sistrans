package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    private String login;
    private String contrasenia;
    private String tipo_identificacion;
    @Id
    private String numero_identificacion;
    private String nombre;
    private String nacionalidad;
    private String corrreo; 
    private String telefono;
    private String tipo_persona;
    private Integer id_cliente;

    public Usuario(){;}

    public Usuario(String login, String contraseña, String tipo_id, String numero_id, String nombre, String nacionalidad, String corrreo, String telefono, String ciudad, String departamento, String codigo_postal, String tipo_persona) {
        this.login = login;
        this.contrasenia = contraseña;
        this.tipo_identificacion = tipo_id;
        this.numero_identificacion = numero_id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.corrreo = corrreo;
        this.telefono = telefono;
        this.tipo_persona = tipo_persona;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
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

    public String getCorrreo() {
        return corrreo;
    }

    public void setCorrreo(String corrreo) {
        this.corrreo = corrreo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    

    
    
}