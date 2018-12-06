// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sucursal implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
    private Long id;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String contacto;
    private String telefonoContacto;
    private String latitud;
    private String longitud;
    private Long codCliente;

    /** Default constructor. */
    public Sucursal() {
        super();
    }

   

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	/**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
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
     * @param aDireccion the new value for direccion
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
     * @param aTelefono the new value for telefono
     */
    public void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    /**
     * Access method for contacto.
     *
     * @return the current value of contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Setter method for contacto.
     *
     * @param aContacto the new value for contacto
     */
    public void setContacto(String aContacto) {
        contacto = aContacto;
    }

    /**
     * Access method for telefonoContacto.
     *
     * @return the current value of telefonoContacto
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * Setter method for telefonoContacto.
     *
     * @param aTelefonoContacto the new value for telefonoContacto
     */
    public void setTelefonoContacto(String aTelefonoContacto) {
        telefonoContacto = aTelefonoContacto;
    }

    /**
     * Access method for latitud.
     *
     * @return the current value of latitud
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Setter method for latitud.
     *
     * @param aLatitud the new value for latitud
     */
    public void setLatitud(String aLatitud) {
        latitud = aLatitud;
    }

    /**
     * Access method for longitud.
     *
     * @return the current value of longitud
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Setter method for longitud.
     *
     * @param aLongitud the new value for longitud
     */
    public void setLongitud(String aLongitud) {
        longitud = aLongitud;
    }

	public Long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}


}
