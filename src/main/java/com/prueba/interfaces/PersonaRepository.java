package com.prueba.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.modelo.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long > {
	
	List<Persona> findByPersonaId(Long personaId);
}
