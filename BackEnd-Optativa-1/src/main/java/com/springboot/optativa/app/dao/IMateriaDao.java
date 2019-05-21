package com.springboot.optativa.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.optativa.app.entities.Materia;

public interface IMateriaDao extends CrudRepository<Materia, Long>{

	public Materia findByNombreMateria(String nombre);
}
