package com.prueba.interfaces;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.request.ObtenerTokenRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;
import com.prueba.dto.response.ObtenerTokenResponse;

public interface IPersonaService {

	ConsultarPersonaIdResponse consultarPersonaId(ConsultarPersonaIdRequest request);
	
	CrearActualizarPersonaResponse actualizarPersona (CrearActualizarPersonaRequest request);
	
	ConsultarPersonaIdResponse eliminarPersona(ConsultarPersonaIdRequest request);
	
	CrearActualizarPersonaResponse crearPersona (CrearActualizarPersonaRequest request);
	
	ObtenerTokenResponse generarToken(ObtenerTokenRequest request);
}
