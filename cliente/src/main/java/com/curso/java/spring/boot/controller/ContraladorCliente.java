package com.curso.java.spring.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.spring.boot.model.entities.Cliente;
import com.curso.java.spring.boot.model.entities.ClienteRepository;

@RestController
public class ContraladorCliente {

	private final ClienteRepository repository;

	public ContraladorCliente(ClienteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/clientes")
	public List<Cliente> clientes(){
		return repository.findAll();
	}

	@GetMapping("/clientes/{id}")
	public Cliente cliente(@PathVariable String id) {
		return repository.findById(id)
				.orElse(null);
	}

	@PostMapping("/clientes")
	public Cliente nuevoCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}

	@DeleteMapping("/clientes/{id}")
	public void borrarCliente(@PathVariable String id) {
		repository.deleteById(id);
	}
	@PutMapping("/clientes/{id}")
	public Cliente actualizarCliente(@RequestBody Cliente cliente,@PathVariable String id) {
		return repository.findById(id)
				.map(c -> {
					c.setNombre(cliente.getNombre());
					c.setMatricula(cliente.getMatricula());
					return repository.save(c);
				})
				.orElseGet(()->{
					cliente.setMatricula(id);
					return repository.save(cliente);
				});

	}



}
