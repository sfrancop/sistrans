package uniandes.edu.co.proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Cuenta;
import uniandes.edu.co.proyecto.repositorio.CuentaRepository;


@Controller
public class CuentasController {
    
    @Autowired
    private CuentaRepository cuentaRepository;

    @GetMapping("/cuentas")
    public String cuentas(Model model) {
        //model.addAttribute("cuentas", cuentaRepository.darCuentas());
        return "cuentas";
    }

    @GetMapping("/cuentas/new")
    public String userForm(Model model) {
        model.addAttribute("cuenta", new Cuenta());
        return "cuentasNuevas";
    }

    @PostMapping("/cuentas/new/save")
    public String cuentaGuardar(@ModelAttribute Cuenta cuenta) {
        cuentaRepository.insertarCuenta(cuenta.getEstado(), cuenta.getTipo(), cuenta.getNumero_cueta(), cuenta.getSaldo(), cuenta.getUltima_transaccion(), cuenta.getFecha_creacion());
        return "redirect:/cuentas";
    }

    @GetMapping("/cuentas/{id}/actualizarEstado")
    public String actualizarEstadoCuenta(@PathVariable("id") int id, Model model){
        Cuenta cuenta = cuentaRepository.darCuenta(id);
        if (cuenta != null) {
            if (cuenta.getSaldo() == 0 && cuenta.getEstado().equals("activa")) {
                cuenta.setEstado("cerrada");
            } else if (cuenta.getEstado().equals("activa")) {
                cuenta.setEstado("desactivada");
            }
            cuentaRepository.save(cuenta);
        }
        return "redirect:/cuentas";
    }

    
}
