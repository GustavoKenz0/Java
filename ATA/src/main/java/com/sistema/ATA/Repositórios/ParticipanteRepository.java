package com.sistema.ATA.Repositórios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.ATA.model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}