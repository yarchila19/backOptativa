package com.springboot.optativa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.optativa.app.entities.Logro;
import com.springboot.optativa.app.respuestas.Respuesta;
import com.springboot.optativa.app.services.ILogroService;

@RestController
@RequestMapping(value = "/logros")
public class LogroController {

	@Autowired
	private ILogroService logroService;
	
	@GetMapping(value = "/listar")
	public List<Logro> listar(){
		return logroService.findAll();
	}
	@PostMapping(value = "/guardar")
	public Respuesta saveEstudiante(@RequestBody Logro logro) {
		if(logroService.findByNombre(logro.getNombreLogro())) {
			Logro logroPersist = new Logro();
			logroPersist.setNombreLogro(logro.getNombreLogro());
			logroService.save(logroPersist);
			return new Respuesta(HttpStatus.CREATED.value(), "Completado");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "El usuario ya existe");
		}
	}
	
}
