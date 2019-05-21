package com.springboot.optativa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.optativa.app.entities.Actividad;
import com.springboot.optativa.app.pojos.ActividadPojo;
import com.springboot.optativa.app.respuestas.Respuesta;
import com.springboot.optativa.app.services.IActividadService;
import com.springboot.optativa.app.services.ICategoriaService;

@RestController
@RequestMapping(value = "/actividades")
public class ActividadController {
	
	@Autowired
	private IActividadService actividadService;
	
	@Autowired 
	private ICategoriaService categoriaService;
	
	@PostMapping(value = "/guardar")
	public Respuesta saveActividad(@RequestBody ActividadPojo actividadPojo) {
		if(actividadService.findByNombre(actividadPojo.getNombreActividad())) {
			Actividad actividadPersist = new Actividad();
			actividadPersist.setNombreActividad(actividadPojo.getNombreActividad());
			actividadPersist.setNotaActividad(actividadPojo.getNotaActividad());
			actividadPersist.setCategoria(categoriaService.findById(actividadPojo.getIdCategoria()));
			actividadService.save(actividadPersist);
			return new Respuesta(HttpStatus.CREATED.value(), "Actividad creada");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "Actividad no creada");
		}
	}

	@GetMapping(value = "/listar")
	private List<Actividad> listar(){
		return actividadService.findAll();
	}
	
	@DeleteMapping(value ="/eliminar/{id}")
	private Respuesta delete(@PathVariable Long id) {
		if(actividadService.existId(id)) {
			actividadService.delete(id);
			return new Respuesta(HttpStatus.OK.value(), "Actividad eliminada");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "Actividad no eliminada");
		}
	}
	
	
}
