package com.prueba.dto.response;

public class ObtenerTokenResponse extends BaseResponse {

	/** Almacena el token de acceso para los servicios expuestos*/
	private String token;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo token
	 * @date oct. 13, 2020
	 * @sprint 1
	 * @return El/La token
	 */	
	public String getToken() {
		return token;
	}
	
	/**
	* @param token El/La token a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo token
	* @date oct. 13, 2020
	* @sprint 1
	*/	
	public void setToken(String token) {
		this.token = token;
	}
}
