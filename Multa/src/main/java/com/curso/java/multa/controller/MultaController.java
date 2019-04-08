package com.curso.java.multa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.multa.model.MultaRepository;
import com.curso.java.multa.model.entity.Multa;


@RestController
public class MultaController {
	
	private final MultaRepository repository;
	
	public MultaController(MultaRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/multas")
	public List<Multa> Multas(){
		return repository.findAll();
	}
	
	@GetMapping("/multas/{id}")
	public Multa Multa(@PathVariable Integer id) {
		return repository.findById(id)
				.orElse(null);
	}
	
	@PostMapping("/multas")
	public Multa nuevoMulta(@RequestBody Multa multa) {
		return repository.save(multa);
	}
	
	@DeleteMapping("/multas/{id}")
	public void borrarMulta(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	@PutMapping("/multas/{id}")
	public Multa actualizarMulta(@RequestBody Multa multa,@PathVariable Integer id) {
		return repository.findById(id)
			.map(m -> {
					m.setMatricula(multa.getMatricula());
					m.setCantidad(multa.getCantidad());
					m.setCategoria(multa.getCategoria());
					return repository.save(m);
				})
			.orElseGet(()->{
				multa.setId(id);
				return repository.save(multa);
			});
			
	}
	

	
}