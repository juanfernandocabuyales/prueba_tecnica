package com.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<EntidadGeneral,Long> {

	List<EntidadGeneral> findByEntidadId(@Param("tipoEntidad") Long tipoEntidad);
	
}
