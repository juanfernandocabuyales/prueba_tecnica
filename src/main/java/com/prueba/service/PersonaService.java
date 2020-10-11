package com.prueba.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;
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

	@Override
	public CrearActualizarPersonaResponse actualizarPersona(CrearActualizarPersonaRequest request) {
		CrearActualizarPersonaResponse crearActualizarPersonaResponse = new CrearActualizarPersonaResponse();
		try {
			Persona personaActualiza = new Persona();
			personaActualiza.setPersonaId(Long.parseLong(request.getPersonaDto().getIdPersona()));
			personaActualiza.setPersonaCodigo(Long.parseLong(request.getPersonaDto().getCodigo()));
			personaActualiza.setPersonaApellido(request.getPersonaDto().getApellido());
			personaActualiza.setPersonaNombre(request.getPersonaDto().getNombre());
			personaActualiza.setPersonaFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(request.getPersonaDto().getFechaNacimiento()));
			personaActualiza.setPersonaUserName(request.getPersonaDto().getUsuario());
			personaActualiza.setPersonaPassword(request.getPersonaDto().getClave());
			personaActualiza.setPersonaIdentificacion(Long.parseLong(request.getPersonaDto().getIdentificacion()));
			personaActualiza.setPersonaCodIdentificacion(Long.parseLong(request.getPersonaDto().getCodigoIdentificacion()));
			personaActualiza.setPersonaCodEstado(Long.parseLong(request.getPersonaDto().getCodigoEstadoPersona()));
			
			personaActualiza = personaRepository.save(personaActualiza);
			
			personaActualiza.setPersonaFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(request.getPersonaDto().getFechaNacimiento()));
			
			crearActualizarPersonaResponse.setCodigoRespuesta("0");
			crearActualizarPersonaResponse.setMensajeRespuesta("OK");
			crearActualizarPersonaResponse.setPersonaDto(personaActualiza);
		}catch(Exception e) {
			e.printStackTrace();
			crearActualizarPersonaResponse.setCodigoRespuesta("1");
			crearActualizarPersonaResponse.setMensajeRespuesta("Fallo la actualizacion de la persona");
		}
		return crearActualizarPersonaResponse;
	}

	@Override
	public ConsultarPersonaIdResponse eliminarPersona(ConsultarPersonaIdRequest request) {
		ConsultarPersonaIdResponse consultarPersonaIdResponse = new ConsultarPersonaIdResponse();
		try {
			List<Persona> personaConsulta = personaRepository.findByPersonaId(Long.parseLong(request.getIdPersona()));
			personaRepository.delete(personaConsulta.get(0));
			consultarPersonaIdResponse.setCodigoRespuesta("0");
			consultarPersonaIdResponse.setMensajeRespuesta("OK");
			consultarPersonaIdResponse.setPersonaConsulta(personaConsulta.get(0));
		}catch(Exception e) {
			e.printStackTrace();
			consultarPersonaIdResponse.setCodigoRespuesta("1");
			consultarPersonaIdResponse.setMensajeRespuesta("Fallo la eliminacion de la persona");
		}
		return consultarPersonaIdResponse;
	}

}
