package com.curso.java.multa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.java.multa.model.MultaRepository;
import com.curso.java.multa.model.entity.Multa;

@Configuration
public class Configuracion {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(MultaRepository repo) {
		return args -> {
			repo.save(new Multa("2354 CDF", "A", 100.0));
			repo.save(new Multa("7485 GTH", "B", 40.0));
			repo.save(new Multa("0264 FOD", "C", 2300.0));
		};
		
	}
	
}