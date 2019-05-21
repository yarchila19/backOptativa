package com.springboot.optativa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.optativa.app.entities.Categoria;
import com.springboot.optativa.app.pojos.CategoriaPojo;
import com.springboot.optativa.app.respuestas.Respuesta;
import com.springboot.optativa.app.services.ICategoriaService;
import com.springboot.optativa.app.services.IMateriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@PostMapping(value = "/guardar")
	public Respuesta saveCategoria(@RequestBody CategoriaPojo categoriaPojo) {
		if(categoriaService.findByName(categoriaPojo.getNombreCategoria())) {
			Categoria categoriaPersist = new Categoria();
			categoriaPersist.setNombreCategoria(categoriaPojo.getNombreCategoria());
			categoriaPersist.setNotaCategoria(categoriaPojo.getNotaCategoria());
			categoriaPersist.setPorcentajeCategoria(categoriaPojo.getPorcentajeCategoria());
			categoriaPersist.setMateria(materiaService.findById(categoriaPojo.getIdMateria()));
			categoriaService.save(categoriaPersist);
			return new Respuesta(HttpStatus.CREATED.value(), "Categoria creada");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "La categoria ya existe");
		}
	
	}
	
	@GetMapping(value = "/listar")
	public List<Categoria> listar(){
		return categoriaService.findAll();
	}
	
	
}
