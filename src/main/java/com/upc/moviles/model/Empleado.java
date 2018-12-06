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
public class Empleado implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String primerNombre;
    private String segundoNombre;
    private String fecNacimiento;
    private String sexo;
    private String nroDocumento;
    private String correoElectronico;
    private String estadoRegistro;
    private String codUsuarioCreador;
    private Date fecCreacion;
    private String codUsuarioUpdate;
    private String fecUpdate;


    /** Default constructor. */
    public Empleado() {
        super();
    }

   

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	/**
     * Access method for apellidoPaterno.
     *
     * @return the current value of apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Setter method for apellidoPaterno.
     *
     * @param aApellidoPaterno the new value for apellidoPaterno
     */
    public void setApellidoPaterno(String aApellidoPaterno) {
        apellidoPaterno = aApellidoPaterno;
    }

    /**
     * Access method for apellidoMaterno.
     *
     * @return the current value of apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Setter method for apellidoMaterno.
     *
     * @param aApellidoMaterno the new value for apellidoMaterno
     */
    public void setApellidoMaterno(String aApellidoMaterno) {
        apellidoMaterno = aApellidoMaterno;
    }

    /**
     * Access method for primerNombre.
     *
     * @return the current value of primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Setter method for primerNombre.
     *
     * @param aPrimerNombre the new value for primerNombre
     */
    public void setPrimerNombre(String aPrimerNombre) {
        primerNombre = aPrimerNombre;
    }

    /**
     * Access method for segundoNombre.
     *
     * @return the current value of segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Setter method for segundoNombre.
     *
     * @param aSegundoNombre the new value for segundoNombre
     */
    public void setSegundoNombre(String aSegundoNombre) {
        segundoNombre = aSegundoNombre;
    }

    /**
     * Access method for fecNacimiento.
     *
     * @return the current value of fecNacimiento
     */
    public String getFecNacimiento() {
        return fecNacimiento;
    }

    /**
     * Setter method for fecNacimiento.
     *
     * @param aFecNacimiento the new value for fecNacimiento
     */
    public void setFecNacimiento(String aFecNacimiento) {
        fecNacimiento = aFecNacimiento;
    }

    /**
     * Access method for sexo.
     *
     * @return the current value of sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Setter method for sexo.
     *
     * @param aSexo the new value for sexo
     */
    public void setSexo(String aSexo) {
        sexo = aSexo;
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
     * @param aNroDocumento the new value for nroDocumento
     */
    public void setNroDocumento(String aNroDocumento) {
        nroDocumento = aNroDocumento;
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
     * @param aCorreoElectronico the new value for correoElectronico
     */
    public void setCorreoElectronico(String aCorreoElectronico) {
        correoElectronico = aCorreoElectronico;
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
     * @param aEstadoRegistro the new value for estadoRegistro
     */
    public void setEstadoRegistro(String aEstadoRegistro) {
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
    public String getFecUpdate() {
        return fecUpdate;
    }

    /**
     * Setter method for fecUpdate.
     *
     * @param aFecUpdate the new value for fecUpdate
     */
    public void setFecUpdate(String aFecUpdate) {
        fecUpdate = aFecUpdate;
    }



}
