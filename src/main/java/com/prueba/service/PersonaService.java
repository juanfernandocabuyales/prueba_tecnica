package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.interfaces.IPersonaService;
import com.prueba.repository.Persona;
import com.prueba.repository.PersonaRepository;

import org.springframework.context.annotation.ScopedProxyMode;

@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonaService implements IPersonaService{

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public ConsultarPersonaIdResponse consultarPersonaId(ConsultarPersonaIdRequest request) {
		ConsultarPersonaIdResponse consultarPersonaIdResponse = new ConsultarPersonaIdResponse();
		try {
			List<Persona> personaConsulta = personaRepository.findByPersonaId(Long.parseLong(request.getIdPersona()));
			if(personaConsulta == null) {
				consultarPersonaIdResponse.setCodigoRespuesta("1");
				consultarPersonaIdResponse.setMensajeRespuesta("No se encontro una persona correspondiente al id: " + request.getIdPersona());				
			}else {
				consultarPersonaIdResponse.setCodigoRespuesta("0");
				consultarPersonaIdResponse.setMensajeRespuesta("OK");
				consultarPersonaIdResponse.setPersonaConsulta(personaConsulta.get(0));
			}
		}catch(Exception e) {
			e.printStackTrace();
			consultarPersonaIdResponse.setCodigoRespuesta("1");
			consultarPersonaIdResponse.setMensajeRespuesta("Fallo la consulta");
		}
		return consultarPersonaIdResponse;
	}

}
