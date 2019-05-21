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
@Table(name = "logros")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idLogro")
public class Logro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idLogro")
	private Long idLogro;
	
	@Column( name= "nombre_logro")
	private String nombreLogro;
	
	@JsonBackReference
	@OneToMany(mappedBy = "logro")
	private List<EstudianteLogro> estudiantesDelLogro;

	public Logro() {
		this.estudiantesDelLogro = new ArrayList<EstudianteLogro>();
	}

	/**
	 * @return the idLogro
	 */
	public Long getIdLogro() {
		return idLogro;
	}

	/**
	 * @param idLogro the idLogro to set
	 */
	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
	}

	/**
	 * @return the nombreLogro
	 */
	public String getNombreLogro() {
		return nombreLogro;
	}

	/**
	 * @param nombreLogro the nombreLogro to set
	 */
	public void setNombreLogro(String nombreLogro) {
		this.nombreLogro = nombreLogro;
	}

	/**
	 * @return the estudiantesDelLogro
	 */
	public List<EstudianteLogro> getEstudiantesDelLogro() {
		return estudiantesDelLogro;
	}

	/**
	 * @param estudiantesDelLogro the estudiantesDelLogro to set
	 */
	public void setEstudiantesDelLogro(List<EstudianteLogro> estudiantesDelLogro) {
		this.estudiantesDelLogro = estudiantesDelLogro;
	}
	
}
