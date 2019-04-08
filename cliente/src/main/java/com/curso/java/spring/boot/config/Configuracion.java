package com.curso.java.spring.boot.config;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.java.spring.boot.entities_model.Cliente;

public class Configuracion {
	
	public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

	}

}
