package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.ControllerProcesoFecha;

//import ar.edu.unju.edm.model.Punto1Calculadora;

//import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tpn01QuinterosMarcosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tpn01QuinterosMarcosApplication.class, args);
		
		//no se hace esto
		ControllerProcesoFecha controlador = new ControllerProcesoFecha();
		controlador.getProcesoFecha();
	}
    
}
