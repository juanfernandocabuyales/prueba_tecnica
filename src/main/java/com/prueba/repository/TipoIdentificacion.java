package com.prueba.repository;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource(rel="tiposIdentificacion", path="tipoIdentificacion")
public class TipoIdentificacion extends EntidadGeneral implements Serializable {

	private static final long serialVersionUID = 1L;
}
