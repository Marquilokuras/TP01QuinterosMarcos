package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.CALCULOS;

@Controller
public class Controlador {

	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		
		return "index";
	}
	
	@GetMapping("/calculoPunto1")
	public String getPunto1Page(@RequestParam (name = "num1") int num1, Model model) {
		int PuntoN1 = 0;
		CALCULOS nuevaPunto1 = new CALCULOS();
		nuevaPunto1.setNumero1(num1);
		nuevaPunto1.ResolverPunto1();
		PuntoN1 = nuevaPunto1.ResolverPunto1();
		model.addAttribute("Punto1", PuntoN1);
		return "Punto1";
	}
	
	@GetMapping("/calculoPunto2")
	public String getPunto2Page(Model model) {
		String PuntoN2 = "null";
		CALCULOS nuevaPunto2 = new CALCULOS();
		nuevaPunto2.ResolverPunto1();
		PuntoN2 = nuevaPunto2.ResolverPunto2();
		model.addAttribute("Punto2", PuntoN2);
		return "Punto2";
	}
	
	@GetMapping("/calculoPunto3")
	public String getPunto3Page(Model model) {
		String PuntoN3 = "null";
		CALCULOS nuevaPunto3 = new CALCULOS();
		PuntoN3 = nuevaPunto3.ResolverPunto3();
		model.addAttribute("Punto3", PuntoN3);
		return "Punto3";
		
	}
	
	@GetMapping("/calculoPunto4")
	public String getPunto4Page(Model model) {
		String PuntoN4 = "null";
		CALCULOS nuevaPunto4 = new CALCULOS();
		PuntoN4 = nuevaPunto4.ResolverPunto4();
		model.addAttribute("Punto4", PuntoN4);
		return "Punto4";
	}
	
	@GetMapping("/calculoPunto5")
	public String getPunto5Page(Model model) {
		String PuntoN5 = "null";
		CALCULOS nuevaPunto5 = new CALCULOS();
		PuntoN5 = nuevaPunto5.ResolverPunto5();
		model.addAttribute("Punto5", PuntoN5);
		return "Punto5";
	}
	
	@GetMapping("/calculoPunto6")
	public String getPunto6Page(Model model) {
		String PuntoN6 = "null";
		CALCULOS nuevaPunto6 = new CALCULOS();
		PuntoN6 = nuevaPunto6.ResolverPunto6();
		model.addAttribute("Punto6", PuntoN6);
		return "Punto6";
	}
	
/*	@GetMapping("/calculoPunto7")
	public String getPunto7Page(Model model) {
		int PuntoN7 = 0;
		CALCULOS nuevaPunto7 = new CALCULOS();
		PuntoN7 = nuevaPunto7.ResolverPunto7();
		model.addAttribute("Punto7", PuntoN7);
		return "Punto7";
	}*/
	
	@GetMapping("/calculoPunto8")
	public String getPunto8Page(@RequestParam (name = "num1") int num1, Model model) {
		String PuntoN8 = "";
		CALCULOS nuevaPunto8 = new CALCULOS();
		nuevaPunto8.setNumero1(num1);
		PuntoN8 = nuevaPunto8.ResolverPunto8();
		model.addAttribute("Punto8", PuntoN8);
		return "Punto8";
	}
	
	@GetMapping("/calculoPunto9")
	public String getPunto9Page(Model model) {
		String PuntoN9 = "";
		CALCULOS nuevaPunto9 = new CALCULOS();
		PuntoN9 = nuevaPunto9.ResolverPunto9();
		model.addAttribute("Punto9", PuntoN9);
		return "Punto9";
	}
	
	@GetMapping("/calculoPunto10")
	public String getPunto10Page(Model model) {
		String PuntoN10 = "";
		CALCULOS nuevaPunto10 = new CALCULOS();
		PuntoN10 = nuevaPunto10.ResolverPunto10();
		model.addAttribute("Punto10", PuntoN10);
		return "Punto10";
	}
	
	@GetMapping("/calculoPunto11")
	public String getPunto11Page(Model model) {
		String PuntoN11 = "";
		CALCULOS nuevaPunto11 = new CALCULOS();
		PuntoN11 = nuevaPunto11.ResolverPunto11();
		model.addAttribute("Punto11", PuntoN11);
		return "Punto11";
	}
	
	@GetMapping("/calculoPunto12")
	public String getPunto12Page(@RequestParam (name = "num1") int num1, Model model) {
		double PuntoN12 = 0;
		CALCULOS nuevaPunto12 = new CALCULOS();
		nuevaPunto12.setNumero1(num1);
		nuevaPunto12.ResolverPunto12();
		PuntoN12 = nuevaPunto12.ResolverPunto12();
		model.addAttribute("Punto12", PuntoN12);
		return "Punto12";
	}
	
	
}
