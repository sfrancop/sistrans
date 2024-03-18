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

    @GetMapping("/usuarios/new")
    public String userForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuariosNuevo";
    }

    @PostMapping("/usuarios/new/save")
    public String usuarioGuardar(@ModelAttribute Usuario usuario) {
        usuarioRepository.insertarUsuario(usuario.getLogin(), usuario.getContrasenia(), usuario.getTipo_identificacion(), usuario.getNumero_identificacion(), usuario.getNombre(), usuario.getNacionalidad(), usuario.getCorrreo(), usuario.getTelefono(), usuario.getTipo_persona(), usuario.getId_cliente());
        return "redirect:/usuarios";
    }
    
}
