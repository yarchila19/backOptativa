package com.springboot.optativa.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.IMateriaDao;
import com.springboot.optativa.app.entities.Materia;
import com.springboot.optativa.app.services.IMateriaService;

@Service
public class MateriaImplements implements IMateriaService {

	@Autowired
	private IMateriaDao materiaDao;
	
	@Override
	public boolean validarByNombre(String nombre) {
		// TODO Auto-generated method stub
		Materia materia = materiaDao.findByNombreMateria(nombre);
		if(materia == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Materia findByNombre(String nombre) {
		// TODO Auto-generated method stub
		Materia materia = materiaDao.findByNombreMateria(nombre);
		if(materia == null) {
			return null;
		}else {
			return materia;
		}
	}

	@Override
	public void save(Materia materia) {
		// TODO Auto-generated method stub
		materiaDao.save(materia);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		materiaDao.deleteById(id);
	}

	@Override
	public List<Materia> findAll() {
		// TODO Auto-generated method stub
		return (List<Materia>) materiaDao.findAll();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return materiaDao.existsById(id);
	}

	@Override
	public Materia findById(Long id) {
		// TODO Auto-generated method stub
		return materiaDao.findById(id).get();
	}

}
