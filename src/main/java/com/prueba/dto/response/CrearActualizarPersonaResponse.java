package com.prueba.dto.response;

import com.prueba.repository.Persona;

public class CrearActualizarPersonaResponse extends BaseResponse {

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
}
