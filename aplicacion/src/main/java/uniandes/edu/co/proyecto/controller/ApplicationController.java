package uniandes.edu.co.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cuentas")
    public String cuentas() {
        return "cuentas";
    }

    @RequestMapping("/usuarios")
    public String usuarios() {
        return "usuarios";
    }


}
