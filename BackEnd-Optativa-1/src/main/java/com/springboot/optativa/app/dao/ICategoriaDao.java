package com.springboot.optativa.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.optativa.app.entities.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

	public Categoria findByNombreCategoria(String nombre);
	
}

