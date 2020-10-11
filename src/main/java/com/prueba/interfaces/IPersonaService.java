package com.prueba.interfaces;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;

public interface IPersonaService {

	ConsultarPersonaIdResponse consultarPersonaId(ConsultarPersonaIdRequest request);
	
	CrearActualizarPersonaResponse actualizarPersona (CrearActualizarPersonaRequest request);
}
