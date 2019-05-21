package com.springboot.optativa.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.ILogroDao;
import com.springboot.optativa.app.entities.Logro;
import com.springboot.optativa.app.services.ILogroService;

@Service
public class LogroImplements implements ILogroService {

	@Autowired
	private ILogroDao logroDao;
	
	@Override
	public boolean findByNombre(String nombre) {
		// TODO Auto-generated method stub
		Logro logro = logroDao.findByNombreLogro(nombre);
		if(logro == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Logro findByName(String nombre) {
		// TODO Auto-generated method stub
		Logro logro = logroDao.findByNombreLogro(nombre);
		if(logro == null) {
			return null;
		}else {
			return logro;
		}
	}

	@Override
	public Logro findById(Long id) {
		// TODO Auto-generated method stub
		return logroDao.findById(id).get();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return logroDao.existsById(id);
	}

	@Override
	public List<Logro> findAll() {
		// TODO Auto-generated method stub
		return (List<Logro>) logroDao.findAll();
	}

	@Override
	public void save(Logro logro) {
		// TODO Auto-generated method stub
		logroDao.save(logro);
	}

}
