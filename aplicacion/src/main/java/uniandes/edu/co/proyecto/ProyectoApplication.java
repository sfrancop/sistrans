package uniandes.edu.co.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uniandes.edu.co.proyecto.modelo.Cuenta;
import uniandes.edu.co.proyecto.modelo.Nombre;
import uniandes.edu.co.proyecto.repositorio.NombreRepository;
import uniandes.edu.co.proyecto.repositorio.CuentaRepository;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {
	
	@Autowired
	private NombreRepository nombreRepository;

	/*
	@Autowired
	private CuentaRepository cuentaRepository;
	*/

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	
	@Override
	public void run(String... args){
		Collection<Nombre> nombres = nombreRepository.darNombres();
		System.out.println("######EMPIEZA A IMPRIMIIIIR --------------");
		for (Nombre nombre : nombres) {
			System.out.println(nombre.getNombre());
		}

	}
	
	/* 
	@Override
	public void run(String... args){
		Collection<Cuenta> cuentas = cuentaRepository.darCuentas();
		System.out.println("######EMPIEZA A IMPRIMIIIIR --------------");
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}

	}
	*/
}
