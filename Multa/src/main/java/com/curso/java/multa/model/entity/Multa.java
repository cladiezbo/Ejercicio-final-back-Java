package com.curso.java.multa.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	private String matricula;
	private String categoria;
	private Double cantidad;
	
	public Double getCantidad() {
		return cantidad;
	}

	public Multa(String matricula, String categoria, double cantidad) {
		super();
		this.matricula = matricula;
		this.categoria = categoria;
		this.cantidad=cantidad;
	}

	public Multa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
