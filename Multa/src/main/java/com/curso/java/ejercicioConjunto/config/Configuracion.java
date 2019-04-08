package com.curso.java.ejercicioConjunto.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.java.ejercicioConjunto.modelo.Multa;
import com.curso.java.ejercicioConjunto.modelo.MultaRepository;

@Configuration
public class Configuracion {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(MultaRepository repo) {
		return args -> {
			repo.save(new Multa("2354 CDF", "A",100));
			repo.save(new Multa("7485 GTH", "B",40));
			repo.save(new Multa("0264 FOD", "C",2300));
		};
		
	}
	
}