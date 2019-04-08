package com.curso.java.spring.boot.entities_model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.java.spring.boot.entities_model.Cliente;


	public interface ClienteRepository  extends JpaRepository<Cliente, String>{

	
}
