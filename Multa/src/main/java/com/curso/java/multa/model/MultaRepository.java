package com.curso.java.multa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.java.multa.model.entity.Multa;

public interface MultaRepository  extends JpaRepository<Multa, Integer>{
	
}
