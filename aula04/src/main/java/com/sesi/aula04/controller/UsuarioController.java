package com.sesi.aula04.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sesi.aula04.Repository.UsuarioRepository;
import com.sesi.aula04.model.Usuario;


@Controller //dizer que está classe é o controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Exibe o formulario
	@GetMapping("/formulario")
	public String mostrarFormulario(Model modelo) {
		modelo.addAttribute("usuario", new Usuario());
		return "formulario";
	}
	
	//Adiciona usuario
	@PostMapping("/salvarUsuario")
	public String salvarUsuario(@ModelAttribute Usuario usuario) {
		usuarioRepository.save(usuario);
		return "redirect:/usuarios";
	}
	
	//Lista usuario
	@GetMapping("/usuarios") //dizendo que a pagina web vai se chamar usuario
	public String listarUsuario(Model modelo) {
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		
		return "usuarios"; //retorna o arquivo html "usuarios.html"	
	}
	
	//remover usuario
	@GetMapping("removerUsuario/{id}")
	public String removerUsuario(@PathVariable int id) {
		usuarioRepository.deleteById(id);
		return "redirect:/usuarios";
	}
	
}
