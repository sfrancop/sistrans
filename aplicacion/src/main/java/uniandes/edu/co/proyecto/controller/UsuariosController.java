package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Usuario;
import uniandes.edu.co.proyecto.repositorio.UsuarioRepository;

@Controller
public class UsuariosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.darUsuarios());
        return "usuarios";
    }

    @GetMapping("/usuarios/new")
    public String userForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarioNuevo";
    }

    @PostMapping("/usuarios/new/save")
    public String usuarioGuardar(@ModelAttribute ("usuario") Usuario usuario) {
        System.out.println(usuario.getLogin());
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getContrasena());
        System.out.println(usuario.getNacionalidad());
        System.out.println(usuario.getDireccion());
        System.out.println(usuario.getCorreo());
        System.out.println(usuario.getTelefono());
        System.out.println(usuario.getCiudad());
        System.out.println(usuario.getDepartamento());
        System.out.println(usuario.getCodigo_postal());
        System.out.println(usuario.getTipo_person());
        usuarioRepository.insertarUsuario(usuario.getLogin(), usuario.getContrasena(), usuario.getTipo_identificacion(), usuario.getNumero_identificacion(), usuario.getNombre(), usuario.getNacionalidad(), usuario.getDireccion(), usuario.getCorreo(), usuario.getTelefono(), usuario.getCiudad(), usuario.getDepartamento(), usuario.getCodigo_postal(), usuario.getTipo_person());
        return "redirect:/usuarios";
    }
    
}
