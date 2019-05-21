package com.springboot.optativa.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.optativa.app.entities.Actividad;

public interface IActividadDao extends CrudRepository<Actividad, Long>{

	public Actividad findByNombreActividad(String nombre);
}
