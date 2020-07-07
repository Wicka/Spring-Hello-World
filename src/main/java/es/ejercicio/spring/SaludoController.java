package es.ejercicio.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SaludoController {
	
	private static final String template ="Hello, %s";
	private final AtomicLong iCont = new AtomicLong();
	
	/*@GetMapping ("/")
	public Saludo saludo(@RequestParam(value="name", defaultValue="WORLD")String name) {
		return new Saludo(iCont.incrementAndGet(), String.format(template, name));
	}
	*/
	
	 @RequestMapping("/hola")
	    public String hola(@RequestParam(value="nombre", required=false, defaultValue="Mundo") String nombre, Model model){
	       
		 model.addAttribute("nombre", nombre);
	     
		 return "hola";
	    }
	

}
