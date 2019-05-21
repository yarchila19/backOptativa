package com.springboot.optativa.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.optativa.app.entities.Estudiante;
import com.springboot.optativa.app.pojos.EstudiantePojo;
import com.springboot.optativa.app.respuestas.Respuesta;
import com.springboot.optativa.app.services.IEstudianteService;

@RestController
@RequestMapping(value = "/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	@PostMapping(value = "/guardar")
	public Respuesta saveEstudiante(@RequestBody EstudiantePojo estudiantePojo) {
		if(estudianteService.findByCorreo(estudiantePojo.getCorreo())) {
			Estudiante estudiantePersist = new Estudiante();
			estudiantePersist.setNombreEstudiante(estudiantePojo.getNombreEstudiante());
			estudiantePersist.setApellidoEstudiante(estudiantePojo.getApellidoEstudiante());
			estudiantePersist.setCorreo(estudiantePojo.getCorreo());
			estudiantePersist.setContrasenia(estudiantePojo.getContrasenia());
			estudianteService.save(estudiantePersist);
			return new Respuesta(HttpStatus.CREATED.value(), "Completado");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "El usuario ya existe");
		}
	}
}
