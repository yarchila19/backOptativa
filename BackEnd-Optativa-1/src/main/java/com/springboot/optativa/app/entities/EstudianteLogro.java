package com.springboot.optativa.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "estudiantes_logros")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idEstudianteLogro")
public class EstudianteLogro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestudiante_logro")
	private Long idEstudianteLogro;
	
	@Column(name = "estado")
	private Long estadoLogro;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name= "estudiante")
	private Estudiante estudiante;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "logro")
	private Logro logro;

	public EstudianteLogro() {
		super();
	}

	/**
	 * @return the idEstudianteLogro
	 */
	public Long getIdEstudianteLogro() {
		return idEstudianteLogro;
	}

	/**
	 * @param idEstudianteLogro the idEstudianteLogro to set
	 */
	public void setIdEstudianteLogro(Long idEstudianteLogro) {
		this.idEstudianteLogro = idEstudianteLogro;
	}

	/**
	 * @return the estadoLogro
	 */
	public Long getEstadoLogro() {
		return estadoLogro;
	}

	/**
	 * @param estadoLogro the estadoLogro to set
	 */
	public void setEstadoLogro(Long estadoLogro) {
		this.estadoLogro = estadoLogro;
	}

	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the logro
	 */
	public Logro getLogro() {
		return logro;
	}

	/**
	 * @param logro the logro to set
	 */
	public void setLogro(Logro logro) {
		this.logro = logro;
	}
	
	
}
