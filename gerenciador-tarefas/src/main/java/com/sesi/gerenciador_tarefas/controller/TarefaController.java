package com.sesi.gerenciador_tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.gerenciador_tarefas.Repository.TarefaRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@GetMapping("/listarTarefas")
	public String listarTarefas(Model modelo) {
		modelo.addAttribute("tarefas", tarefaRepository.findAll());
		return "listarTarefa";
	}
	
}
