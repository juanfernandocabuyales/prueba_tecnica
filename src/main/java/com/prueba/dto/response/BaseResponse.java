package com.prueba.dto.response;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Dto con los atributos basicos de cada operacion
 * 						realizada en el aplicativo
 * @date oct. 08, 2020
 * @sprint 1
 */
public class BaseResponse {

	/** Almacena el resultado de la operacion*/
	private String codigoRespuesta;
	
	/** Almacena el mensaje en caso de fallar la operacion*/
	private String mensajeRespuesta;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo codigoRespuesta
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La codigoRespuesta
	 */	
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	
	/**
	* @param codigoRespuesta El/La codigoRespuesta a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo codigoRespuesta
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo mensajeRespuesta
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La mensajeRespuesta
	 */	
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	
	/**
	* @param mensajeRespuesta El/La mensajeRespuesta a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo mensajeRespuesta
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
}
