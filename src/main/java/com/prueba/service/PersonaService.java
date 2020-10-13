package com.prueba.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.request.ObtenerTokenRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;
import com.prueba.dto.response.ObtenerTokenResponse;
import com.prueba.interfaces.IPersonaService;
import com.prueba.repository.Persona;
import com.prueba.repository.PersonaRepository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonaService implements IPersonaService{

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private Environment env;
	
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

	@Override
	public CrearActualizarPersonaResponse crearPersona(CrearActualizarPersonaRequest request) {
		CrearActualizarPersonaResponse crearActualizarPersonaResponse = new CrearActualizarPersonaResponse();
		try {
			Persona personaActualiza = new Persona();
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
			crearActualizarPersonaResponse.setMensajeRespuesta("Fallo la creacion de la persona");
		}
		return crearActualizarPersonaResponse;
	}

	@Override
	public ObtenerTokenResponse generarToken(ObtenerTokenRequest request) {
		ObtenerTokenResponse obtenerTokenResponse = new ObtenerTokenResponse();
		try {
			
			Persona persona = personaRepository.findByPersonaUserName(request.getUsuario()).get(0);
			
			if(persona == null) {
				obtenerTokenResponse.setCodigoRespuesta("1");
				obtenerTokenResponse.setMensajeRespuesta("No existe una persona con el username " + request.getUsuario());
			}else {				
				if(persona.getPersonaPassword().equals(request.getClave())) {
					obtenerTokenResponse.setCodigoRespuesta("0");
					obtenerTokenResponse.setMensajeRespuesta("OK");					
					/** Se genera el token para el usuario con duracion de un minuto*/
					obtenerTokenResponse.setToken(generarToken(persona.getPersonaUserName(),Long.parseLong(env.getProperty("tiempo_jwt"))));
				}else {
					obtenerTokenResponse.setCodigoRespuesta("1");
					obtenerTokenResponse.setMensajeRespuesta("La clave ingresada no corresponde al usuario");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obtenerTokenResponse;
	}
	
	
	private String generarToken(String pUsuario,long pTiempo) {
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("USER");		
		
		long now = (new Date()).getTime();
		Date validity = new Date(
				now + (pTiempo * 60000));
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(pUsuario)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setExpiration(validity)
				.signWith(SignatureAlgorithm.HS512,
						env.getProperty("llave_jwt").getBytes()).compact();
		return "Bearer " + token;
	}
		

}
