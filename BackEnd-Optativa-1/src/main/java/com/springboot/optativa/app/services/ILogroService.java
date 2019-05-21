package com.springboot.optativa.app.services;

import java.util.List;

import com.springboot.optativa.app.entities.Logro;

public interface ILogroService {

	public boolean findByNombre(String nombre);
	
	public Logro findByName(String nombre);
	
	public Logro findById(Long id);
	
	public boolean existId(Long id);
	
	public List<Logro> findAll();
	
	public void save(Logro logro);
}
