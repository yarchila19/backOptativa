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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name= "categorias")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCategoria")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria")
	private Long idcategoria;
	
	@Column(name = "nombre_categoria")
	private String nombreCategoria;
	
	@Column(name = "nota_categoria")
	private Long notaCategoria;
	
	@Column(name= "porcentaje")
	private Long porcentajeCategoria;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "materia")
	private Materia materia;
	
	@JsonBackReference
	@OneToMany(mappedBy = "categoria")
	private List<Actividad> actividades;
	
	public Categoria() {
		this.actividades = new ArrayList<Actividad>();
	}

	/**
	 * @return the idcategoria
	 */
	public Long getIdcategoria() {
		return idcategoria;
	}

	/**
	 * @param idcategoria the idcategoria to set
	 */
	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}

	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	/**
	 * @return the notaCategoria
	 */
	public Long getNotaCategoria() {
		return notaCategoria;
	}

	/**
	 * @param notaCategoria the notaCategoria to set
	 */
	public void setNotaCategoria(Long notaCategoria) {
		this.notaCategoria = notaCategoria;
	}

	/**
	 * @return the porcentajeCategoria
	 */
	public Long getPorcentajeCategoria() {
		return porcentajeCategoria;
	}

	/**
	 * @param porcentajeCategoria the porcentajeCategoria to set
	 */
	public void setPorcentajeCategoria(Long porcentajeCategoria) {
		this.porcentajeCategoria = porcentajeCategoria;
	}

	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
	 * @return the actividades
	 */
	public List<Actividad> getActividades() {
		return actividades;
	}

	/**
	 * @param actividades the actividades to set
	 */
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	
}
