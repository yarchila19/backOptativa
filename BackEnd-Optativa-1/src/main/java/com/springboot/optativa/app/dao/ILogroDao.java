package com.springboot.optativa.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.optativa.app.entities.Logro;

public interface ILogroDao extends CrudRepository<Logro, Long> {

	public Logro findByNombreLogro(String nombre);
}
