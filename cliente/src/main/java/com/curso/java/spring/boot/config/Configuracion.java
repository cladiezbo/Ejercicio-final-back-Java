package com.curso.java.spring.boot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.java.spring.boot.model.entities.Cliente;
import com.curso.java.spring.boot.model.entities.ClienteRepository;

@Configuration
public class Configuracion {
	
	@Bean
	public CommandLineRunner iniciarBaseDeDatos(ClienteRepository repo) {
		return args -> {
			repo.save(new Cliente("M10", "Claudia", "Diez", "Calle P"));
			repo.save(new Cliente("Er44", "Juana", "Gonzalez", "Calle H"));
			repo.save(new Cliente("WQ2", "Sandra", "Valdes", "Calle 3"));
		};
	}

}
