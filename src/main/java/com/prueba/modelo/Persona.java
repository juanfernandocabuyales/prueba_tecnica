package com.prueba.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Juan Cabuyales           
 * @see <b>{@code }</b> Clase que representa la tabla Persona
 * @date oct. 08, 2020
 * @sprint 1
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "persona_id", unique = true, nullable = false, precision = 12)
	private Long personaId;

	@Column(name = "persona_codigo", unique = true, nullable = false, precision = 12)
	private Long personaCodigo;

	@Column(name ="persona_nombre",length = 100)
	private String personaNombre;

	@Column(name ="persona_apellido",length = 100)
	private String personaApellido;

	@Temporal(TemporalType.DATE)
	@Column(name = "persona_fecha_nacimiento", nullable = false)
	private Date personaFechaNacimiento;

	@Column(name ="persona_username",length = 20)
	private String personaUserName;

	@Column(name ="persona_password",length = 50)
	private String personaPassword;

	@Column(name = "persona_identificacion", unique = true, nullable = false, precision = 12)
	private Long personaIdentificacion;

	@Column(name = "persona_codigo_tipo_identificacion", unique = true, nullable = false, precision = 12)
	private Long personaCodIdentificacion;

	@Column(name = "persona_codigo_estado", unique = true, nullable = false, precision = 12)
	private Long personaCodEstado;

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaId
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaId
	 */	
	public Long getPersonaId() {
		return personaId;
	}

	/**
	 * @param personaId El/La personaId a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaId
	 * @date oct. 08, 2020
	 * @sprint 1
	 */	
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaCodigo
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaCodigo
	 */	
	public Long getPersonaCodigo() {
		return personaCodigo;
	}

	/**
	 * @param personaCodigo El/La personaCodigo a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaCodigo
	 * @date oct. 08, 2020
	 * @sprint 1
	 */	
	public void setPersonaCodigo(Long personaCodigo) {
		this.personaCodigo = personaCodigo;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaNombre
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaNombre
	 */
	public String getPersonaNombre() {
		return personaNombre;
	}

	/**
	 * @param personaNombre El/La personaNombre a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaNombre
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaNombre(String personaNombre) {
		this.personaNombre = personaNombre;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaApellido
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaApellido
	 */
	public String getPersonaApellido() {
		return personaApellido;
	}

	/**
	 * @param personaApellido El/La personaApellido a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaApellido
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaApellido(String personaApellido) {
		this.personaApellido = personaApellido;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaFechaNacimiento
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaFechaNacimiento
	 */
	public Date getPersonaFechaNacimiento() {
		return personaFechaNacimiento;
	}

	/**
	 * @param personaFechaNacimiento El/La personaFechaNacimiento a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaFechaNacimiento
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaFechaNacimiento(Date personaFechaNacimiento) {
		this.personaFechaNacimiento = personaFechaNacimiento;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaUserName
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaUserName
	 */
	public String getPersonaUserName() {
		return personaUserName;
	}

	/**
	 * @param personaUserName El/La personaUserName a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaUserName
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaUserName(String personaUserName) {
		this.personaUserName = personaUserName;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaPassword
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaPassword
	 */
	public String getPersonaPassword() {
		return personaPassword;
	}

	/**
	 * @param personaPassword El/La personaPassword a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaPassword
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaPassword(String personaPassword) {
		this.personaPassword = personaPassword;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaIdentificacion
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaIdentificacion
	 */
	public Long getPersonaIdentificacion() {
		return personaIdentificacion;
	}

	/**
	 * @param personaIdentificacion El/La personaIdentificacion a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaIdentificacion
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaIdentificacion(Long personaIdentificacion) {
		this.personaIdentificacion = personaIdentificacion;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaCodIdentificacion
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaCodIdentificacion
	 */
	public Long getPersonaCodIdentificacion() {
		return personaCodIdentificacion;
	}

	/**
	 * @param personaCodIdentificacion El/La personaCodIdentificacion a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaCodIdentificacion
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaCodIdentificacion(Long personaCodIdentificacion) {
		this.personaCodIdentificacion = personaCodIdentificacion;
	}

	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo personaCodEstado
	 * @date oct. 08, 2020
	 * @sprint 1
	 * @return El/La personaCodEstado
	 */
	public Long getPersonaCodEstado() {
		return personaCodEstado;
	}

	/**
	 * @param personaCodEstado El/La personaCodEstado a setear
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Cambia el valor del atributo personaCodEstado
	 * @date oct. 08, 2020
	 * @sprint 1
	 */
	public void setPersonaCodEstado(Long personaCodEstado) {
		this.personaCodEstado = personaCodEstado;
	}
}
