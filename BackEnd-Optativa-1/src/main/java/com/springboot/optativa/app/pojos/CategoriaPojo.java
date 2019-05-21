package com.springboot.optativa.app.pojos;

public class CategoriaPojo {

	private Long id;
	private String nombreCategoria;
	private Long notaCategoria;
	private Long porcentajeCategoria;
	private Long idMateria;
	
	public CategoriaPojo(Long id, String nombreCategoria, Long notaCategoria, Long porcentajeCategoria,
			Long idMateria) {
		super();
		this.id = id;
		this.nombreCategoria = nombreCategoria;
		this.notaCategoria = notaCategoria;
		this.porcentajeCategoria = porcentajeCategoria;
		this.idMateria = idMateria;
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
	
}
