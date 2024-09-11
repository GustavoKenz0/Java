package com.sistema.ATA.Repositórios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.ATA.model.Ata;

public interface AtaRepository extends JpaRepository<Ata, Long> {
}
