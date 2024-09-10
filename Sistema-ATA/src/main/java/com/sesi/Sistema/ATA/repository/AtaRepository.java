package com.sesi.Sistema.ATA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.Sistema.ATA.model.Ata;

@Repository
public interface AtaRepository extends JpaRepository <Ata, Long>{

}
