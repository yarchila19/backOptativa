package com.springboot.optativa.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "materias")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idMateria")
public class Materia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idmateria")
	private Long idMateria;
	
	@Column(name = "nombre_materia")
	private String nombreMateria;
	
	@Column(name = "nota_materia")
	private Long notaMateria;
	
	@Column(name = "hora")
	private Long hora;
	
	@ManyToOne
	@JoinColumn(name = "estudiante")
	private Estudiante estudiante;
	
	@JsonBackReference
	@OneToMany(mappedBy = "materia")
	private List<Categoria> categorias;

	public Materia() {
		this.categorias = new ArrayList<Categoria>();
	}

	/**
	 * @return the idMateria
	 */
	public Long getIdMateria() {
		return idMateria;
	}

	/**
	 * @param idMateria the idMateria to set
	 */
	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	/**
	 * @return the nombreMateria
	 */
	public String getNombreMateria() {
		return nombreMateria;
	}

	/**
	 * @param nombreMateria the nombreMateria to set
	 */
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	/**
	 * @return the notaMateria
	 */
	public Long getNotaMateria() {
		return notaMateria;
	}

	/**
	 * @param notaMateria the notaMateria to set
	 */
	public void setNotaMateria(Long notaMateria) {
		this.notaMateria = notaMateria;
	}

	/**
	 * @return the hora
	 */
	public Long getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Long hora) {
		this.hora = hora;
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
	 * @return the categorias
	 */
	public List<Categoria> getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias the categorias to set
	 */
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
}

