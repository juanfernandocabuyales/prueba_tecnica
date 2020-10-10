package com.prueba.repository;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "entidad_general")
public class EntidadGeneral implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "entidad_general_id", unique = true, nullable = false, precision = 12)
	private Long entidadId;
	
	@Column(name = "entidad_general_codigo", unique = true, nullable = false, precision = 12)
	private Long entidadCodigo;
	
	@Column(name ="entidad_general_nombre",length = 20)
	private String entidadNombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "entidad_general_fecha_creacion", nullable = false)
	private Date entidadFechaCreacion;
	
	@Column(name ="entidad_general_usuario_creacion",length = 20)
	private String entidadUsuarioCreacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "entidad_general_fecha_modificacion", nullable = false)
	private Date entidadFechaModificacion;
	
	@Column(name ="entidad_general_usuario_modificacion",length = 20)
	private String entidadUsuarioModificacion;
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadId
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadId
	 */	
	public Long getEntidadId() {
		return entidadId;
	}
	
	/**
	* @param entidadId El/La entidadId a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadId
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadId(Long entidadId) {
		this.entidadId = entidadId;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadCodigo
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadCodigo
	 */	
	public Long getEntidadCodigo() {
		return entidadCodigo;
	}
	
	/**
	* @param entidadCodigo El/La entidadCodigo a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadCodigo
	* @date oct. 09, 2020
	* @sprint 1
	*/
	public void setEntidadCodigo(Long entidadCodigo) {
		this.entidadCodigo = entidadCodigo;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadNombre
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadNombre
	 */	
	public String getEntidadNombre() {
		return entidadNombre;
	}
	
	/**
	* @param entidadNombre El/La entidadNombre a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadNombre
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadNombre(String entidadNombre) {
		this.entidadNombre = entidadNombre;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadFechaCreacion
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadFechaCreacion
	 */	
	public Date getEntidadFechaCreacion() {
		return entidadFechaCreacion;
	}
	
	/**
	* @param entidadFechaCreacion El/La entidadFechaCreacion a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadFechaCreacion
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadFechaCreacion(Date entidadFechaCreacion) {
		this.entidadFechaCreacion = entidadFechaCreacion;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadUsuarioCreacion
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadUsuarioCreacion
	 */	
	public String getEntidadUsuarioCreacion() {
		return entidadUsuarioCreacion;
	}
	
	/**
	* @param entidadUsuarioCreacion El/La entidadUsuarioCreacion a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadUsuarioCreacion
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadUsuarioCreacion(String entidadUsuarioCreacion) {
		this.entidadUsuarioCreacion = entidadUsuarioCreacion;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadFechaModificacion
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadFechaModificacion
	 */	
	public Date getEntidadFechaModificacion() {
		return entidadFechaModificacion;
	}
	
	/**
	* @param entidadFechaModificacion El/La entidadFechaModificacion a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadFechaModificacion
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadFechaModificacion(Date entidadFechaModificacion) {
		this.entidadFechaModificacion = entidadFechaModificacion;
	}
	
	/**
	 * @author Juan Cabuyales           
	 * @see <b>{@code }</b> Retorna el valor del atributo entidadUsuarioModificacion
	 * @date oct. 09, 2020
	 * @sprint 1
	 * @return El/La entidadUsuarioModificacion
	 */	
	public String getEntidadUsuarioModificacion() {
		return entidadUsuarioModificacion;
	}
	
	/**
	* @param entidadUsuarioModificacion El/La entidadUsuarioModificacion a setear
	* @author Juan Cabuyales           
	* @see <b>{@code }</b> Cambia el valor del atributo entidadUsuarioModificacion
	* @date oct. 09, 2020
	* @sprint 1
	*/	
	public void setEntidadUsuarioModificacion(String entidadUsuarioModificacion) {
		this.entidadUsuarioModificacion = entidadUsuarioModificacion;
	}
}
