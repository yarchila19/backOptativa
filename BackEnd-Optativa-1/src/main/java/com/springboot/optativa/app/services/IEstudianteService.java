package com.springboot.optativa.app.services;

import com.springboot.optativa.app.entities.Estudiante;

public interface IEstudianteService {

	public boolean findByCorreo(String correo);
	
	public Estudiante findByGmail(String correo);
	
	public Estudiante findById(Long id);
	
	public boolean existId(Long id);
	
	public void save(Estudiante estudiante);
	
	public void delete(Long id);
}
