package com.springboot.optativa.app.services;

import java.util.List;

import com.springboot.optativa.app.entities.Materia;

public interface IMateriaService {

	public boolean validarByNombre(String nombre);
	
	public Materia findByNombre(String nombre);
	
	public void save(Materia materia);
	
	public void delete(Long id);
	
	public List<Materia> findAll();
	
	public boolean existId(Long id);
	
	public Materia findById(Long id);
}
