package com.prueba.interfaces;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;

public interface IPersonaService {

	ConsultarPersonaIdResponse consultarPersonaId(ConsultarPersonaIdRequest request);
}
