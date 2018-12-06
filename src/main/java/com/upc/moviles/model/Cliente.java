// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String indTipoPersona;
	private String razonSocialApeNombres;
	private String razonSocialAbreviada;
	private String nroDocumento;
	private String paginaWeb;
	private String correoElectronico;
	private String codUsuarioCreador;
	private String fecCreacion;
	private String codUsuarioUpdate;
	private String estadoRegistro;
	private String direccion;
	private String telefono;
	private String fecUpdate;

	/** Default constructor. */
	public Cliente() {
		super();
	}


	/**
	 * Access method for indTipoPersona.
	 *
	 * @return the current value of indTipoPersona
	 */
	public String getIndTipoPersona() {
		return indTipoPersona;
	}

	/**
	 * Setter method for indTipoPersona.
	 *
	 * @param aIndTipoPersona
	 *            the new value for indTipoPersona
	 */
	public void setIndTipoPersona(String aIndTipoPersona) {
		indTipoPersona = aIndTipoPersona;
	}

	/**
	 * Access method for razonSocialApeNombres.
	 *
	 * @return the current value of razonSocialApeNombres
	 */
	public String getRazonSocialApeNombres() {
		return razonSocialApeNombres;
	}

	/**
	 * Setter method for razonSocialApeNombres.
	 *
	 * @param aRazonSocialApeNombres
	 *            the new value for razonSocialApeNombres
	 */
	public void setRazonSocialApeNombres(String aRazonSocialApeNombres) {
		razonSocialApeNombres = aRazonSocialApeNombres;
	}

	/**
	 * Access method for razonSocialAbreviada.
	 *
	 * @return the current value of razonSocialAbreviada
	 */
	public String getRazonSocialAbreviada() {
		return razonSocialAbreviada;
	}

	/**
	 * Setter method for razonSocialAbreviada.
	 *
	 * @param aRazonSocialAbreviada
	 *            the new value for razonSocialAbreviada
	 */
	public void setRazonSocialAbreviada(String aRazonSocialAbreviada) {
		razonSocialAbreviada = aRazonSocialAbreviada;
	}

	/**
	 * Access method for nroDocumento.
	 *
	 * @return the current value of nroDocumento
	 */
	public String getNroDocumento() {
		return nroDocumento;
	}

	/**
	 * Setter method for nroDocumento.
	 *
	 * @param aNroDocumento
	 *            the new value for nroDocumento
	 */
	public void setNroDocumento(String aNroDocumento) {
		nroDocumento = aNroDocumento;
	}

	/**
	 * Access method for paginaWeb.
	 *
	 * @return the current value of paginaWeb
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Setter method for paginaWeb.
	 *
	 * @param aPaginaWeb
	 *            the new value for paginaWeb
	 */
	public void setPaginaWeb(String aPaginaWeb) {
		paginaWeb = aPaginaWeb;
	}

	/**
	 * Access method for correoElectronico.
	 *
	 * @return the current value of correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Setter method for correoElectronico.
	 *
	 * @param aCorreoElectronico
	 *            the new value for correoElectronico
	 */
	public void setCorreoElectronico(String aCorreoElectronico) {
		correoElectronico = aCorreoElectronico;
	}

	/**
	 * Access method for codUsuarioCreador.
	 *
	 * @return the current value of codUsuarioCreador
	 */
	public String getCodUsuarioCreador() {
		return codUsuarioCreador;
	}

	/**
	 * Setter method for codUsuarioCreador.
	 *
	 * @param aCodUsuarioCreador
	 *            the new value for codUsuarioCreador
	 */
	public void setCodUsuarioCreador(String aCodUsuarioCreador) {
		codUsuarioCreador = aCodUsuarioCreador;
	}

	/**
	 * Access method for fecCreacion.
	 *
	 * @return the current value of fecCreacion
	 */
	public String getFecCreacion() {
		return fecCreacion;
	}

	/**
	 * Setter method for fecCreacion.
	 *
	 * @param aFecCreacion
	 *            the new value for fecCreacion
	 */
	public void setFecCreacion(String aFecCreacion) {
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
	 * Access method for direccion.
	 *
	 * @return the current value of direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Setter method for direccion.
	 *
	 * @param aDireccion
	 *            the new value for direccion
	 */
	public void setDireccion(String aDireccion) {
		direccion = aDireccion;
	}

	/**
	 * Access method for telefono.
	 *
	 * @return the current value of telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Setter method for telefono.
	 *
	 * @param aTelefono
	 *            the new value for telefono
	 */
	public void setTelefono(String aTelefono) {
		telefono = aTelefono;
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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

}
