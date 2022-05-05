package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.ProcesoFecha;

@Controller
public class ControllerProcesoFecha {

	
	@GetMapping("/calcularFechas")
	public ModelAndView getProcesoFecha() {
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(2000, 8, 15),LocalDate.now());
		
		String resultado = "";
		resultado = pf4.contarTiempoTranscurrido().toString(); 
		
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("paginaWebProcesoFecha");
		modelView.addObject("resultado", resultado);
		
		//consola
		System.out.println("el tiempo transcurrido es:"+ resultado);
		
		return modelView;
	}
}
