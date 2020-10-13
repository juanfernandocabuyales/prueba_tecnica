package com.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long > {
	
	List<Persona> findByPersonaId(Long personaId);
	
	List<Persona> findByPersonaUserName(String personaUserName);
	
}
