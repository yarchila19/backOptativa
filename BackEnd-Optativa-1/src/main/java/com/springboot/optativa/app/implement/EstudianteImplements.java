package com.springboot.optativa.app.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.IEstudianteDao;
import com.springboot.optativa.app.entities.Estudiante;
import com.springboot.optativa.app.services.IEstudianteService;

@Service
public class EstudianteImplements implements IEstudianteService {

	@Autowired
	private IEstudianteDao estudianteDao;
	
	@Override
	public Estudiante findByGmail(String correo) {
		Estudiante estudiante = estudianteDao.findByCorreo(correo);
		if(estudiante == null) {
			return null;
		}else {
			return estudiante;
		}
	}
	
	@Override
	public boolean findByCorreo(String correo) {
		// TODO Auto-generated method stub
		Estudiante estudiante = estudianteDao.findByCorreo(correo);
		if(estudiante == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Estudiante findById(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.findById(id).get();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.existsById(id);
	}

	@Override
	public void save(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteDao.save(estudiante);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estudianteDao.deleteById(id);
	}

}
