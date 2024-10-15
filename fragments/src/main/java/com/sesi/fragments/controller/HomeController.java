package com.sesi.fragments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model modelo) {
		modelo.addAttribute("titulo", "Home - Meu site");
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "cadastroProduto";
	}
}
