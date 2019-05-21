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

import com.springboot.optativa.app.entities.Materia;
import com.springboot.optativa.app.pojos.MateriaPojo;
import com.springboot.optativa.app.respuestas.Respuesta;
import com.springboot.optativa.app.services.IEstudianteService;
import com.springboot.optativa.app.services.IMateriaService;


@RestController
@RequestMapping(value = "/materias")
public class MateriaController {

	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@PostMapping(value = "/guardar")
	private Respuesta saveMateria(@RequestBody MateriaPojo materiaPojo) {
		if(materiaService.validarByNombre(materiaPojo.getNombreMateria())) {
			Materia materiaPersist = new Materia();
			materiaPersist.setNombreMateria(materiaPojo.getNombreMateria());
			materiaPersist.setNotaMateria(materiaPojo.getNotaMateria());
			materiaPersist.setHora(materiaPojo.getHora());
			materiaPersist.setEstudiante(estudianteService.findById(materiaPojo.getEstudiante()));
			materiaService.save(materiaPersist);
			return new Respuesta(HttpStatus.CREATED.value(), "Materia creada");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "La materia ya existe");
		}
	}
	
	@GetMapping(value = "/listar")
	private List<Materia> listar(){
		return materiaService.findAll();
	}
	
	@DeleteMapping(value = "/eliminar/{id}")
	public Respuesta delete(@PathVariable Long id) {
		if(materiaService.existId(id)) {
			materiaService.delete(id);
			return new Respuesta(HttpStatus.OK.value(), "Materia eliminada");
		}else {
			return new Respuesta(HttpStatus.CONFLICT.value(), "No se puede aliminar la materia");
		}
	}
	
	@PostMapping(value = "/actulalizar")
	public Respuesta updateMateria(@RequestBody MateriaPojo materiaPojo) {
		Materia materiaModificada = materiaService.findById(materiaPojo.getId());
		materiaModificada.setNombreMateria(materiaPojo.getNombreMateria());
		materiaModificada.setNotaMateria(materiaPojo.getNotaMateria());
		materiaModificada.setHora(materiaPojo.getHora());
		materiaModificada.setEstudiante(estudianteService.findById(materiaPojo.getEstudiante()));
		materiaService.save(materiaModificada);
		return new Respuesta(HttpStatus.OK.value(), "Materia actualizada");
	}
}
