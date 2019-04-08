package com.curso.java.spring.boot.model.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.java.spring.boot.model.entities.Cliente;


	public interface ClienteRepository  extends JpaRepository<Cliente, String>{

	
}
