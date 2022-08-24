package edu.pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Anotación de Spring para indicar que esta clase es un controlador.
public class HomeController {

	// Definiendo la acción home con el método HTTP (POST, PUT, DELETE)
	@GetMapping("/home")
	public String inicio(Model model) {
		return "index";
	}

}
