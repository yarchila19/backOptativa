package com.springboot.optativa.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.optativa.app.entities.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long>{

	public Estudiante findByCorreo(String correo);
	
}