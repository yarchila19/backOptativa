package com.springboot.optativa.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.IActividadDao;
import com.springboot.optativa.app.entities.Actividad;
import com.springboot.optativa.app.services.IActividadService;

@Service
public class ActividadImplements implements IActividadService {

	@Autowired
	private IActividadDao actividadDao;
	
	@Override
	public boolean findByNombre(String nombre) {
		Actividad actividad = actividadDao.findByNombreActividad(nombre);
		if(actividad == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Actividad findByName(String nombre) {
		// TODO Auto-generated method stub
		Actividad actividad = actividadDao.findByNombreActividad(nombre);
		if(actividad == null) {
			return null;
		}else {
			return actividad;
		}
	}

	@Override
	public List<Actividad> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividad>) actividadDao.findAll();
	}

	@Override
	public void save(Actividad actividad) {
		// TODO Auto-generated method stub
		actividadDao.save(actividad);
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		actividadDao.deleteById(Id);
	}

	@Override
	public Actividad findById(Long id) {
		// TODO Auto-generated method stub
		return actividadDao.findById(id).get();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return actividadDao.existsById(id);
	}

}
