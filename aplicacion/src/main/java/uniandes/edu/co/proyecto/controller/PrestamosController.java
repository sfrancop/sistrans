package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Prestamo;
import uniandes.edu.co.proyecto.repositorio.PrestamoRepository;

public class PrestamosController {
    
    @Autowired
    private PrestamoRepository prestamoRepository;

    @GetMapping("/prestamos/new")
    public String userForm(Model model) {
        model.addAttribute("prestamo", new Prestamo());
        return "prestamoNuevo";
    }

    @PostMapping("/prestamos/new/save")
    public String prestamoGuardar(@ModelAttribute Prestamo prestamo) {
        prestamoRepository.insertarPrestamo(prestamo.getIdPrestamo(), prestamo.getTipo(), prestamo.getEstado(), prestamo.getSaldo(), prestamo.getMonto(), prestamo.getInteres(), prestamo.getNumero_cuotas(), prestamo.getDia_pago(), prestamo.getValor_cuota());
        return "redirect:/cuentas";
    }

    public void cerrarPrestamoSiSaldoCero(int idPrestamo) {
        Prestamo prestamo = prestamoRepository.findById(idPrestamo).orElse(null);
        if (prestamo != null && prestamo.getSaldoPendiente() == 0) {
            prestamo.setEstado("cerrado");
            prestamoRepository.save(prestamo);
        }
    }



}
