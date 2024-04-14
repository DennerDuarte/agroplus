package br.com.fiap.agroplus.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InicioController {
	
	@GetMapping
	public String home() {
		return "Agro +";
	}

}
