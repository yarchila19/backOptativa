package com.springboot.optativa.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "estudiantes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idEstudiante")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestudiante")
	private Long idEstudiante;
	
	@Column(name= "nombre_estudiante")
	private String nombreEstudiante;
	
	@Column(name = "apellido_estudiante")
	private String apellidoEstudiante;
	
	@Column(name = "correo", unique = true)
	private String correo;
	
	@Column(name = "contrasenia")
	private String contrasenia;
	
	@JsonBackReference
	@OneToMany(mappedBy = "estudiante")
	private List<Materia> materias;
	
	@JsonBackReference
	@OneToMany(mappedBy = "estudiante")
	private List<EstudianteLogro> logrosDelEstudiante;
	
	public Estudiante() {
		this.materias = new ArrayList<Materia>();
		this.logrosDelEstudiante = new ArrayList<EstudianteLogro>();
	}

	/**
	 * @return the idEstudiante
	 */
	public Long getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * @param idEstudiante the idEstudiante to set
	 */
	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * @return the nombreEstudiante
	 */
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	/**
	 * @param nombreEstudiante the nombreEstudiante to set
	 */
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	/**
	 * @return the apellidoEstudiante
	 */
	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	/**
	 * @param apellidoEstudiante the apellidoEstudiante to set
	 */
	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the materias
	 */
	public List<Materia> getMaterias() {
		return materias;
	}

	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	/**
	 * @return the logrosDelEstudiante
	 */
	public List<EstudianteLogro> getLogrosDelEstudiante() {
		return logrosDelEstudiante;
	}

	/**
	 * @param logrosDelEstudiante the logrosDelEstudiante to set
	 */
	public void setLogrosDelEstudiante(List<EstudianteLogro> logrosDelEstudiante) {
		this.logrosDelEstudiante = logrosDelEstudiante;
	}
	
	

}

