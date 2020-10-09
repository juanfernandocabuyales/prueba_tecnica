package com.prueba.dto.response;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Dto con el atributo que representa la respuesta de una operacion
 * @date oct. 08, 2020
 * @sprint 1
 */
public class GeneralResponse {

	/** Almacena la respuesta de la peticion realizada*/
	private String mensaje;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo mensaje
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La mensaje
	 */	
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	* @param mensaje El/La mensaje a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo mensaje
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
