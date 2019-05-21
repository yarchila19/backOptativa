package com.springboot.optativa.app.services;

import com.springboot.optativa.app.entities.EstudianteLogro;

public interface IEstudianteLogroService {

	public EstudianteLogro findById(Long id);
	
	public void save(EstudianteLogro estudianteLogro);
}
