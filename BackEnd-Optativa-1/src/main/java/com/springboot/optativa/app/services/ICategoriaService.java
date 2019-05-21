package com.springboot.optativa.app.services;

import java.util.List;

import com.springboot.optativa.app.entities.Categoria;

public interface ICategoriaService {

	public Categoria findByNombre(String nombre);
	
	public boolean findByName(String nombre);
	
	public List<Categoria> findAll();
	
	public Categoria findById(Long id);
	
	public boolean existId(Long id);
	
	public void save(Categoria categoria);
}
