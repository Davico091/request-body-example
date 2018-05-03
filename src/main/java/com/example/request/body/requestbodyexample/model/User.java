package com.example.request.body.requestbodyexample.model;

import java.io.Serializable;
import java.util.Map;

public class User implements Serializable {

	
	private String nombre;
	private String apellido;
	private Map<String, String> mapper;
	
	
	public Map<String, String> getMapper() {
		return mapper;
	}
	public void setMapper(Map<String, String> mapper) {
		this.mapper = mapper;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
