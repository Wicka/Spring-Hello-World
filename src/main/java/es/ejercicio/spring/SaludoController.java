package es.ejercicio.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> f917d0e74dc86d6f3299e06d4c880b5e834323a4
>>>>>>> 702a8f233dac8ce68a454f521a61bb536aa5e6d7
>>>>>>> f5044f54f0b8d29ec7867d6c07a480b385713ee8
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SaludoController {
	
	private static final String template ="Hello, %s";
<<<<<<< HEAD
	private final AtomicLong iCont = new AtomicLong();	
	
	
=======
<<<<<<< HEAD
	private final AtomicLong iCont = new AtomicLong();	
	
	
=======
<<<<<<< HEAD
	private final AtomicLong iCont = new AtomicLong();	
	
=======
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
>>>>>>> f917d0e74dc86d6f3299e06d4c880b5e834323a4
	
>>>>>>> 702a8f233dac8ce68a454f521a61bb536aa5e6d7
>>>>>>> f5044f54f0b8d29ec7867d6c07a480b385713ee8
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
