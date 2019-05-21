package com.springboot.optativa.app.pojos;

public class MateriaPojo {

	private Long id;
	private String nombreMateria;
	private Long notaMateria;
	private Long hora;
	private Long estudiante;
	
	public MateriaPojo(Long id, String nombreMateria, Long notaMateria, Long hora, Long estudiante) {
		super();
		this.id = id;
		this.nombreMateria = nombreMateria;
		this.notaMateria = notaMateria;
		this.hora = hora;
		this.estudiante = estudiante;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the nota
	 */
	public Long getNotaMateria() {
		return notaMateria;
	}

	/**
	 * @param nota the nota to set
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
	 * @return the idEstudiante
	 */
	public Long getEstudiante() {
		return estudiante;
	}

	/**
	 * @param idEstudiante the idEstudiante to set
	 */
	public void setEstudiante(Long estudiante) {
		this.estudiante = estudiante;
	}
	
	
}
