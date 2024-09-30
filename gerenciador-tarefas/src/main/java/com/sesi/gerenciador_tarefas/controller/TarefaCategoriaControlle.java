package com.sesi.gerenciador_tarefas.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sesi.gerenciador_tarefas.TarefaCategoriaRepository;
import com.sesi.gerenciador_tarefas.model.TarefaCategoria;

@Controller
public class TarefaCategoriaControlle {

	TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@GetMapping("/listarCategoria")
	public String listarCategoria(Model modelo) {
		modelo.addAttribute("categorias", tarefaCategoriaRepository.findAll());
		return "listarTarefaCategoria";
	}
	
	@GetMapping("editarCategoria/{id}")
	public String editarCategoria(@PathVariable("id") int id, Model modelo) {
		Optional<TarefaCategoria> categoriaOpt = tarefaCategoriaRepository.findById(id);
		
		if(categoriaOpt.isPresent()) {
			modelo.addAttribute("categoria", categoriaOpt.get());
			return "formularioTarefaCategoria";
		}else {
			return "redirect/:listarTarefaCategoria";
		}
		
	}
	
	
}
