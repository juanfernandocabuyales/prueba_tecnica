package com.prueba.dto.request;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Dto que representa la consulta
 * 			            de una persona por Id
 * @date oct. 08, 2020
 * @sprint 1
 */
public class ConsultarPersonaIdRequest {

	/** Almacena el id de la persona a consultar*/
	private String idPersona;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo idPersona
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La idPersona
	 */	
	public String getIdPersona() {
		return idPersona;
	}
	
	/**
	* @param idPersona El/La idPersona a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo idPersona
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
}
