package com.sesi.imc_calculator.imc_calculator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.imc_calculator.imc_calculator.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
