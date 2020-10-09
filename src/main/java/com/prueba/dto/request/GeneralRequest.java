package com.prueba.dto.request;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Dto que contiene la peticion que se va a realizar
 * @date oct. 08, 2020
 * @sprint 1
 */
public class GeneralRequest {

	/** Almacena los datos de la operacion a realizar*/
	private String peticion;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo peticion
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La peticion
	 */	
	public String getPeticion() {
		return peticion;
	}
	
	/**
	* @param peticion El/La peticion a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo peticion
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}
}
