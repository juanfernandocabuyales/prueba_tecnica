package com.prueba.dto.request;

public class CrearActualizarPersonaRequest {

	private Persona personaDto;
	
	/**
	 * @return the personaDto
	 */
	public Persona getPersonaDto() {
		return personaDto;
	}

	/**
	 * @param personaDto the personaDto to set
	 */
	public void setPersonaDto(Persona personaDto) {
		this.personaDto = personaDto;
	}

	public static class Persona{
		
		private String idPersona;

		private String codigo;

		private String nombre;

		private String apellido;

		private String fechaNacimiento;

		private String usuario;

		private String clave;

		private String identificacion;

		private String codigoIdentificacion;

		private String codigoEstadoPersona;

		/**
		 * @return the idPersona
		 */
		public String getIdPersona() {
			return idPersona;
		}

		/**
		 * @param idPersona the idPersona to set
		 */
		public void setIdPersona(String idPersona) {
			this.idPersona = idPersona;
		}

		/**
		 * @return the codigo
		 */
		public String getCodigo() {
			return codigo;
		}

		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the apellido
		 */
		public String getApellido() {
			return apellido;
		}

		/**
		 * @param apellido the apellido to set
		 */
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		/**
		 * @return the fechaNacimiento
		 */
		public String getFechaNacimiento() {
			return fechaNacimiento;
		}

		/**
		 * @param fechaNacimiento the fechaNacimiento to set
		 */
		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		/**
		 * @return the usuario
		 */
		public String getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		/**
		 * @return the clave
		 */
		public String getClave() {
			return clave;
		}

		/**
		 * @param clave the clave to set
		 */
		public void setClave(String clave) {
			this.clave = clave;
		}

		/**
		 * @return the identificacion
		 */
		public String getIdentificacion() {
			return identificacion;
		}

		/**
		 * @param identificacion the identificacion to set
		 */
		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}

		/**
		 * @return the codigoIdentificacion
		 */
		public String getCodigoIdentificacion() {
			return codigoIdentificacion;
		}

		/**
		 * @param codigoIdentificacion the codigoIdentificacion to set
		 */
		public void setCodigoIdentificacion(String codigoIdentificacion) {
			this.codigoIdentificacion = codigoIdentificacion;
		}

		/**
		 * @return the codigoEstadoPersona
		 */
		public String getCodigoEstadoPersona() {
			return codigoEstadoPersona;
		}

		/**
		 * @param codigoEstadoPersona the codigoEstadoPersona to set
		 */
		public void setCodigoEstadoPersona(String codigoEstadoPersona) {
			this.codigoEstadoPersona = codigoEstadoPersona;
		}
	}
}
