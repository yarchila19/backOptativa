package com.springboot.optativa.app.pojos;

public class EstudiantePojo {

	private Long idEstudiante;
	private String nombreEstudiante;
	private String apellidoEstudiante;
	private String correo;
	private String contrasenia;
	
	public EstudiantePojo(Long idEstudiante, String nombreEstudiante, String apellidoEstudiante, String correo,
			String contrasenia) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.apellidoEstudiante = apellidoEstudiante;
		this.correo = correo;
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the id
	 */
	public Long getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long idEstudiante) {
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
	
	
}
