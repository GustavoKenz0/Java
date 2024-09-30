package com.sesi.gerenciador_tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciador_tarefas.model.TarefaCategoria;

public interface TarefaCategoriaRepository extends JpaRepository<TarefaCategoria, Integer>{

}
