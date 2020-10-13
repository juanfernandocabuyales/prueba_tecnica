package com.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.prueba.dto.request.ConsultarPersonaIdRequest;
import com.prueba.dto.request.CrearActualizarPersonaRequest;
import com.prueba.dto.request.GeneralRequest;
import com.prueba.dto.request.ObtenerTokenRequest;
import com.prueba.dto.response.ConsultarPersonaIdResponse;
import com.prueba.dto.response.CrearActualizarPersonaResponse;
import com.prueba.dto.response.GeneralResponse;
import com.prueba.dto.response.ObtenerTokenResponse;
import com.prueba.interfaces.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController extends BaseController {

	@Autowired
	private IPersonaService personaService;

	@GetMapping(value = "/consultarPersonaId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarPersonaId(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		ConsultarPersonaIdRequest consultarPersonaIdRequest = gson.fromJson(request.getPeticion(), ConsultarPersonaIdRequest.class);

		ConsultarPersonaIdResponse consultarPersonaIdResponse = personaService.consultarPersonaId(consultarPersonaIdRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(consultarPersonaIdResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}

	@PutMapping(value="/actualizarPersona",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> actualizarPersona(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		CrearActualizarPersonaRequest crearActualizarPersonaRequest = gson.fromJson(request.getPeticion(), CrearActualizarPersonaRequest.class);

		CrearActualizarPersonaResponse crearActualizarPersonaResponse = personaService.actualizarPersona(crearActualizarPersonaRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(crearActualizarPersonaResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.GONE);
	}
	
	@PostMapping(value="/crearPersona",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> crearPersona(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		CrearActualizarPersonaRequest crearActualizarPersonaRequest = gson.fromJson(request.getPeticion(), CrearActualizarPersonaRequest.class);

		CrearActualizarPersonaResponse crearActualizarPersonaResponse = personaService.crearPersona(crearActualizarPersonaRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(crearActualizarPersonaResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}
	
	@PostMapping(value="/getToken",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getToken(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		ObtenerTokenRequest obtenerTokenRequest = gson.fromJson(request.getPeticion(), ObtenerTokenRequest.class);

		ObtenerTokenResponse obtenerTokenResponse = personaService.generarToken(obtenerTokenRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(obtenerTokenResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}

	@DeleteMapping(value="/eliminarPersona",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> eliminarPersona(@RequestBody GeneralRequest request){

		Gson gson = new Gson();

		ConsultarPersonaIdRequest consultarPersonaIdRequest = gson.fromJson(request.getPeticion(), ConsultarPersonaIdRequest.class);

		ConsultarPersonaIdResponse consultarPersonaIdResponse = personaService.eliminarPersona(consultarPersonaIdRequest);

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(consultarPersonaIdResponse));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}	
}
