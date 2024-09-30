package com.sesi.gerenciador_tarefas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.gerenciador_tarefas.TarefaCategoriaRepository;
import com.sesi.gerenciador_tarefas.model.TarefaCategoria;

@Configuration
public class CarregaBaseDeDados {

	@Autowired
	private TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@Bean
	CommandLineRunner executar() {
		return args -> {
			TarefaCategoria categoria = new TarefaCategoria();
			categoria.setNome("Estudos");
			
			tarefaCategoriaRepository.save(categoria);
			
			TarefaCategoria categoria1 = new TarefaCategoria();
			categoria1.setNome("Pesquisa");
			
			tarefaCategoriaRepository.save(categoria1);
		};
	}
}
