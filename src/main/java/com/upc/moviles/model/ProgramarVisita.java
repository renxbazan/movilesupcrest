// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgramarVisita implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String fecVisita;
	private int horaVisita;
	private int codUsuarioCreador;
	private Date fecCreacion;
	private String codUsuarioUpdate;
	private String fecUpdate;
	private String estadoRegistro;
	private String comentario;
	private int codEmpleado;
	private int codSucursal;

	/** Default constructor. */
	public ProgramarVisita() {
		super();
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFecVisita() {
		return fecVisita;
	}

	/**
	 * Setter method for fecVisita.
	 *
	 * @param aFecVisita
	 *            the new value for fecVisita
	 */
	public void setFecVisita(String aFecVisita) {
		fecVisita = aFecVisita;
	}

	/**
	 * Access method for horaVisita.
	 *
	 * @return the current value of horaVisita
	 */
	public int getHoraVisita() {
		return horaVisita;
	}

	/**
	 * Setter method for horaVisita.
	 *
	 * @param aHoraVisita
	 *            the new value for horaVisita
	 */
	public void setHoraVisita(int aHoraVisita) {
		horaVisita = aHoraVisita;
	}

	public int getCodUsuarioCreador() {
		return codUsuarioCreador;
	}

	public void setCodUsuarioCreador(int codUsuarioCreador) {
		this.codUsuarioCreador = codUsuarioCreador;
	}

	/**
	 * Access method for fecCreacion.
	 *
	 * @return the current value of fecCreacion
	 */
	public Date getFecCreacion() {
		return fecCreacion;
	}

	/**
	 * Setter method for fecCreacion.
	 *
	 * @param aFecCreacion
	 *            the new value for fecCreacion
	 */
	public void setFecCreacion(Date aFecCreacion) {
		fecCreacion = aFecCreacion;
	}

	/**
	 * Access method for codUsuarioUpdate.
	 *
	 * @return the current value of codUsuarioUpdate
	 */
	public String getCodUsuarioUpdate() {
		return codUsuarioUpdate;
	}

	/**
	 * Setter method for codUsuarioUpdate.
	 *
	 * @param aCodUsuarioUpdate
	 *            the new value for codUsuarioUpdate
	 */
	public void setCodUsuarioUpdate(String aCodUsuarioUpdate) {
		codUsuarioUpdate = aCodUsuarioUpdate;
	}

	/**
	 * Access method for fecUpdate.
	 *
	 * @return the current value of fecUpdate
	 */
	public String getFecUpdate() {
		return fecUpdate;
	}

	/**
	 * Setter method for fecUpdate.
	 *
	 * @param aFecUpdate
	 *            the new value for fecUpdate
	 */
	public void setFecUpdate(String aFecUpdate) {
		fecUpdate = aFecUpdate;
	}

	/**
	 * Access method for estadoRegistro.
	 *
	 * @return the current value of estadoRegistro
	 */
	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	/**
	 * Setter method for estadoRegistro.
	 *
	 * @param aEstadoRegistro
	 *            the new value for estadoRegistro
	 */
	public void setEstadoRegistro(String aEstadoRegistro) {
		estadoRegistro = aEstadoRegistro;
	}

	/**
	 * Access method for comentario.
	 *
	 * @return the current value of comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * Setter method for comentario.
	 *
	 * @param aComentario
	 *            the new value for comentario
	 */
	public void setComentario(String aComentario) {
		comentario = aComentario;
	}

	/**
	 * Access method for codEmpleado.
	 *
	 * @return the current value of codEmpleado
	 */
	public int getCodEmpleado() {
		return codEmpleado;
	}

	/**
	 * Setter method for codEmpleado.
	 *
	 * @param aCodEmpleado
	 *            the new value for codEmpleado
	 */
	public void setCodEmpleado(int aCodEmpleado) {
		codEmpleado = aCodEmpleado;
	}

	/**
	 * Access method for codSucursal.
	 *
	 * @return the current value of codSucursal
	 */
	public int getCodSucursal() {
		return codSucursal;
	}

	/**
	 * Setter method for codSucursal.
	 *
	 * @param aCodSucursal
	 *            the new value for codSucursal
	 */
	public void setCodSucursal(int aCodSucursal) {
		codSucursal = aCodSucursal;
	}

}
