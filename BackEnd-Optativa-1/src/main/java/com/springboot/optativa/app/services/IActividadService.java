package com.springboot.optativa.app.services;

import java.util.List;

import com.springboot.optativa.app.entities.Actividad;

public interface IActividadService {

	public boolean findByNombre(String nombre);
	
	public Actividad findByName(String nombre);
	
	public List<Actividad> findAll();
	
	public Actividad findById(Long id);
	
	public boolean existId(Long id);
	
	public void save(Actividad actividad);
	
	public void delete(Long Id);
}
