package com.springboot.optativa.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optativa.app.dao.ICategoriaDao;
import com.springboot.optativa.app.entities.Categoria;
import com.springboot.optativa.app.services.ICategoriaService;

@Service
public class CategoriaImplements implements ICategoriaService {

	@Autowired
	private ICategoriaDao categoriaDao;

	@Override
	public boolean findByName(String nombre) {
		// TODO Auto-generated method stub
		Categoria categoria = categoriaDao.findByNombreCategoria(nombre);
		if(categoria == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Categoria findByNombre(String nombre) {
		Categoria categoria = categoriaDao.findByNombreCategoria(nombre);
		if(categoria == null) {
			return null;
		}else {
			return categoria;
		}
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.existsById(id);
	}

	@Override
	public void save(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaDao.save(categoria);
	}

	@Override
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).get();
	}
}
