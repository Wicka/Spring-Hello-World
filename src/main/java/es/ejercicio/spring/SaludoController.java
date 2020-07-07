package es.ejercicio.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SaludoController {
	
	private static final String template ="Hello, %s";
	private final AtomicLong iCont = new AtomicLong();	
	
	
	//RECIBE LA URL localhost:8081/hola Y ME ESCRIBE hola EN EL NAVEGADOR
		
	 @RequestMapping("/hola")
	 
	    public String hola(@RequestParam(value="name1", required=false, defaultValue="Mundo") String nombre, Model model){
	       
		 model.addAttribute("name1", nombre);
	     
		 return "hola";
	    }

	 
	 // PASO EL NOMBRE USANDO THYMELEAF
	  
	  @GetMapping("/holath")
	  public String holath(@RequestParam(name="name2") String name, Model model) {
	    model.addAttribute( "saludo", new Saludo(iCont.incrementAndGet(), String.format(template, name)));
	    
	    return "holath";
	  }

	  
	 //METODO QUE PASA PARAMETRO DIRECTAMENTE ESCRIBIENDO EN LA URL ( localhost:8080?name="   "
	 
	 /*@GetMapping ("/")
		public Saludo saludo(@RequestParam(value="name", defaultValue="WORLD")String name) {
			return new Saludo(iCont.incrementAndGet(), String.format(template, name));
		}
		*/

}
