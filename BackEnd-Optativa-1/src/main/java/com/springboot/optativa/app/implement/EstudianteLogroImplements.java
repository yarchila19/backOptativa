package com.springboot.optativa.app.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.IEstudianteLogroDao;
import com.springboot.optativa.app.entities.EstudianteLogro;
import com.springboot.optativa.app.services.IEstudianteLogroService;

@Service
public class EstudianteLogroImplements implements IEstudianteLogroService {

	@Autowired
	private IEstudianteLogroDao estudianteLogroDao;
	
	@Override
	public EstudianteLogro findById(Long id) {
		// TODO Auto-generated method stub
		return estudianteLogroDao.findById(id).get();
	}

	@Override
	public void save(EstudianteLogro estudianteLogro) {
		// TODO Auto-generated method stub
		estudianteLogroDao.save(estudianteLogro);
	}

}
