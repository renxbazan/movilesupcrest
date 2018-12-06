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
public class InspeccionTecnica implements Serializable {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id", unique = true, nullable = false)
	  private Long id;
    private String nombreArea;
    private String dimensionesArea;
    private String temperaturaRequerida;
    private String nroPersonas;
    private String nroComputadoras;
    private String observaciones;
    private String marca;
    private int estadoRegistro;
    private String codUsuarioCreador;
    private Date fecCreacion;
    private String codUsuarioUpdate;
    private Date fecUpdate;
    private Long codVisita;

    /** Default constructor. */
    public InspeccionTecnica() {
        super();
    }



    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	/**
     * Access method for nombreArea.
     *
     * @return the current value of nombreArea
     */
    public String getNombreArea() {
        return nombreArea;
    }

    /**
     * Setter method for nombreArea.
     *
     * @param aNombreArea the new value for nombreArea
     */
    public void setNombreArea(String aNombreArea) {
        nombreArea = aNombreArea;
    }

    /**
     * Access method for dimensionesArea.
     *
     * @return the current value of dimensionesArea
     */
    public String getDimensionesArea() {
        return dimensionesArea;
    }

    /**
     * Setter method for dimensionesArea.
     *
     * @param aDimensionesArea the new value for dimensionesArea
     */
    public void setDimensionesArea(String aDimensionesArea) {
        dimensionesArea = aDimensionesArea;
    }

    /**
     * Access method for temperaturaRequerida.
     *
     * @return the current value of temperaturaRequerida
     */
    public String getTemperaturaRequerida() {
        return temperaturaRequerida;
    }

    /**
     * Setter method for temperaturaRequerida.
     *
     * @param aTemperaturaRequerida the new value for temperaturaRequerida
     */
    public void setTemperaturaRequerida(String aTemperaturaRequerida) {
        temperaturaRequerida = aTemperaturaRequerida;
    }

    /**
     * Access method for nroPersonas.
     *
     * @return the current value of nroPersonas
     */
    public String getNroPersonas() {
        return nroPersonas;
    }

    /**
     * Setter method for nroPersonas.
     *
     * @param aNroPersonas the new value for nroPersonas
     */
    public void setNroPersonas(String aNroPersonas) {
        nroPersonas = aNroPersonas;
    }

    /**
     * Access method for nroComputadoras.
     *
     * @return the current value of nroComputadoras
     */
    public String getNroComputadoras() {
        return nroComputadoras;
    }

    /**
     * Setter method for nroComputadoras.
     *
     * @param aNroComputadoras the new value for nroComputadoras
     */
    public void setNroComputadoras(String aNroComputadoras) {
        nroComputadoras = aNroComputadoras;
    }

    /**
     * Access method for observaciones.
     *
     * @return the current value of observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Setter method for observaciones.
     *
     * @param aObservaciones the new value for observaciones
     */
    public void setObservaciones(String aObservaciones) {
        observaciones = aObservaciones;
    }

    /**
     * Access method for marca.
     *
     * @return the current value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter method for marca.
     *
     * @param aMarca the new value for marca
     */
    public void setMarca(String aMarca) {
        marca = aMarca;
    }

    /**
     * Access method for estadoRegistro.
     *
     * @return the current value of estadoRegistro
     */
    public int getEstadoRegistro() {
        return estadoRegistro;
    }

    /**
     * Setter method for estadoRegistro.
     *
     * @param aEstadoRegistro the new value for estadoRegistro
     */
    public void setEstadoRegistro(int aEstadoRegistro) {
        estadoRegistro = aEstadoRegistro;
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
     * @param aCodUsuarioCreador the new value for codUsuarioCreador
     */
    public void setCodUsuarioCreador(String aCodUsuarioCreador) {
        codUsuarioCreador = aCodUsuarioCreador;
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
     * @param aFecCreacion the new value for fecCreacion
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
     * @param aCodUsuarioUpdate the new value for codUsuarioUpdate
     */
    public void setCodUsuarioUpdate(String aCodUsuarioUpdate) {
        codUsuarioUpdate = aCodUsuarioUpdate;
    }

    /**
     * Access method for fecUpdate.
     *
     * @return the current value of fecUpdate
     */
    public Date getFecUpdate() {
        return fecUpdate;
    }

    /**
     * Setter method for fecUpdate.
     *
     * @param aFecUpdate the new value for fecUpdate
     */
    public void setFecUpdate(Date aFecUpdate) {
        fecUpdate = aFecUpdate;
    }



	public Long getCodVisita() {
		return codVisita;
	}



	public void setCodVisita(Long codVisita) {
		this.codVisita = codVisita;
	}


}
