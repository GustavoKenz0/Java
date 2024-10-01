package com.sesi.gerenciador_tarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciador_tarefas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
