package com.prueba.dto.request;

public class ObtenerTokenRequest {

	private String usuario;
	
	private String clave;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo usuario
	 * @date oct. 13, 2020
	 * @sprint 1
	 * @return El/La usuario
	 */	
	public String getUsuario() {
		return usuario;
	}
	
	/**
	* @param usuario El/La usuario a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo usuario
	* @date oct. 13, 2020
	* @sprint 1
	*/	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo clave
	 * @date oct. 13, 2020
	 * @sprint 1
	 * @return El/La clave
	 */	
	public String getClave() {
		return clave;
	}
	
	/**
	* @param clave El/La clave a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo clave
	* @date oct. 13, 2020
	* @sprint 1
	*/	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
