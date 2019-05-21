package com.springboot.optativa.app.pojos;

public class ActividadPojo {

	private Long id;
	private String nombreActividad;
	private Long notaActividad;
	private Long idCategoria;
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
	 * @return the idCategoria
	 */
	public Long getIdCategoria() {
		return idCategoria;
	}
	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
