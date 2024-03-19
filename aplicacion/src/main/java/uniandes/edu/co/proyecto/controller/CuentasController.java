package uniandes.edu.co.proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Cuenta;
import uniandes.edu.co.proyecto.modelo.Operacion;
import uniandes.edu.co.proyecto.modelo.OperacionesCuenta;
import uniandes.edu.co.proyecto.repositorio.CuentaRepository;
import uniandes.edu.co.proyecto.repositorio.OperacionesCuentaRepository;


@Controller
public class CuentasController {
    
    @Autowired
    private CuentaRepository cuentaRepository;

    @GetMapping("/cuentas")
    public String cuentas(Model model) {
        //model.addAttribute("cuentas", cuentaRepository.darCuentas());
        return "cuentas";
    }
    @Autowired
    private OperacionesCuentaRepository operacionesCuentaRepository;
    

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

    @GetMapping("/operacion/sencilla/new")
    public String nuevaOperacionSencilla(Model model){
        model.addAttribute("operacion", new OperacionesCuenta());
        return "nuevaOperacionSencilla";
    }

    @PostMapping("/operacion/sencilla/new/save")
    public String guardarOperacionSencilla(@ModelAttribute OperacionesCuenta nuevaOperacion){
        Cuenta cuenta = cuentaRepository.darCuentaPorNumero(nuevaOperacion.getCuenta_destino());

        if (cuenta != null) {
            if (cuenta.getEstado().equals("activa")) {
                operacionesCuentaRepository.insertarOperacion(nuevaOperacion.getTipo(), nuevaOperacion.getValor(), 
                nuevaOperacion.getFecha(), nuevaOperacion.getCuenta_destino(),
                 nuevaOperacion.getCuenta_origen());

                Float saldoActual = cuenta.getSaldo();

                Float nuevoSaldo = saldoActual;
                if(nuevaOperacion.getTipo().equals("Retiro")){
                    nuevoSaldo = saldoActual - nuevaOperacion.getValor();
                }
                else if(nuevaOperacion.getTipo().equals("Consignacion")){
                    nuevoSaldo = saldoActual - nuevaOperacion.getValor();
                }

                cuentaRepository.actualizarCuenta(cuenta.getTipo(), cuenta.getEstado(), cuenta.getNumero_cueta(), nuevoSaldo, nuevaOperacion.getFecha(), cuenta.getFecha_creacion());
            }
        }    

        return "redirect:/cuentas";
    }

    @GetMapping("/operacion/entrecuentas/new")
    public String nuevaOperacionEntrecuentas(Model model){
        model.addAttribute("operacion", new OperacionesCuenta());
        return "nuevaOperacionEntreCuentas";
    }

    @PostMapping("/operacion/entrecuentas/new/save")
    public String guardarOperacionEntrecuentas(@ModelAttribute OperacionesCuenta nuevaOperacion){
        Cuenta cuenta_destino = cuentaRepository.darCuentaPorNumero(nuevaOperacion.getCuenta_destino());
        Cuenta cuenta_origen = cuentaRepository.darCuentaPorNumero(nuevaOperacion.getCuenta_origen());

        if (cuenta_destino != null && cuenta_origen != null ) {
            if (cuenta_destino.getEstado().equals("activa") && cuenta_origen.getEstado().equals("activa") && cuenta_origen.getSaldo() >= nuevaOperacion.getValor()) {
                operacionesCuentaRepository.insertarOperacion(nuevaOperacion.getTipo(), nuevaOperacion.getValor(), 
                nuevaOperacion.getFecha(), nuevaOperacion.getCuenta_destino(),
                 nuevaOperacion.getCuenta_origen());

                Float saldoActualDestino = cuenta_destino.getSaldo();

                Float nuevoSaldoEnDestino = saldoActualDestino;

                Float saldoActualOrigen = cuenta_origen.getSaldo();

                Float nuevoSaldoEnOrigen = saldoActualOrigen;
                
                if(nuevaOperacion.getTipo().equals("Transferencia")){
                    nuevoSaldoEnDestino = saldoActualDestino + nuevaOperacion.getValor();
                    nuevoSaldoEnOrigen = saldoActualOrigen - nuevaOperacion.getValor();
                }

                cuentaRepository.actualizarCuenta(cuenta_destino.getTipo(), cuenta_destino.getEstado(), cuenta_destino.getNumero_cueta(), nuevoSaldoEnDestino, nuevaOperacion.getFecha(), cuenta_destino.getFecha_creacion());
                cuentaRepository.actualizarCuenta(cuenta_origen.getTipo(), cuenta_origen.getEstado(), cuenta_origen.getNumero_cueta(), nuevoSaldoEnOrigen, nuevaOperacion.getFecha(), cuenta_origen.getFecha_creacion());
            }
        }    

        return "redirect:/cuentas";
    }


    
}
