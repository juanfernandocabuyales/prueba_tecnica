package com.prueba.dto.response;

import com.prueba.repository.Persona;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Dto que representa el resultado al consultar una
 * 						persona por Id
 * @date oct. 08, 2020
 * @sprint 1
 */
public class ConsultarPersonaIdResponse extends BaseResponse {
	
	/** Almacena la persona que corresponde al id consultado*/
	private Persona personaConsulta;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaConsulta
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaConsulta
	 */	
	public Persona getPersonaConsulta() {
		return personaConsulta;
	}
	
	/**
	* @param personaConsulta El/La personaConsulta a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo personaConsulta
	* @date oct. 08, 2020
	* @sprint 1
	*/	
	public void setPersonaConsulta(Persona personaConsulta) {
		this.personaConsulta = personaConsulta;
	}
}
