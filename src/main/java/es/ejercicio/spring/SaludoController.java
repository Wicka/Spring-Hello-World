package es.ejercicio.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	
	private static final String template ="Hello, %s";
	private final AtomicLong iCont = new AtomicLong();
	
	@GetMapping ("/")
	public Saludo saludo(@RequestParam(value="name", defaultValue="WORLD")String name) {
		return new Saludo(iCont.incrementAndGet(), String.format(template, name));
	}
	
	
	

}
