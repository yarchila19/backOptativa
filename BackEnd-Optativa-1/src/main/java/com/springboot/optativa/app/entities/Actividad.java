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
@Table(name = "actividades")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idActividad")
public class Actividad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idactividad")
	private Long idActividad;
	
	@Column(name = "nombre_actividad")
	private String nombreActividad;
	
	@Column(name = "nota_actividad")
	private Long notaActividad;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "categoria")
	private Categoria categoria;

	
	public Actividad() {
		super();
	}

	/**
	 * @return the idActividad
	 */
	public Long getIdActividad() {
		return idActividad;
	}

	/**
	 * @param idActividad the idActividad to set
	 */
	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
	}

	/**
	 * @return the nombreActividad
	 */
	public String getNombreActividad() {
		return nombreActividad;
	}

	/**
	 * @param nombreActividad the nombreActividad to set
	 */
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	/**
	 * @return the notaActividad
	 */
	public Long getNotaActividad() {
		return notaActividad;
	}

	/**
	 * @param notaActividad the notaActividad to set
	 */
	public void setNotaActividad(Long notaActividad) {
		this.notaActividad = notaActividad;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}

