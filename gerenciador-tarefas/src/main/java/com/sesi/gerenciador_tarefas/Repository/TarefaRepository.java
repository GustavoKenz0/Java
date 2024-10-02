package com.sesi.gerenciador_tarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciador_tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
