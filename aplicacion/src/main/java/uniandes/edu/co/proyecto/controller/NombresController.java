package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.Nombre;
import uniandes.edu.co.proyecto.repositorio.NombreRepository;

import java.util.ArrayList;

@RestController
public class NombresController {

    @Autowired
    private NombreRepository nombreRepository;

    @GetMapping("/nombres")
    public String userForm(Model model) {
        model.addAttribute("nombres", nombreRepository.darNombres());
        ArrayList<String> nombresArray = new ArrayList<String>();
        for (Nombre nombre : nombreRepository.darNombres()) {
            nombresArray.add(nombre.getNombre());
        }
        return nombresArray.toString();
    }


    
}
