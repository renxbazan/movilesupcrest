// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sucursal implements Serializable {

    /** Primary key. */
    protected static final String PK = "codSucursal";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    private Serializable lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Serializable getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Serializable aLockFlag) {
        lockFlag = aLockFlag;
    }

    private int codSucursal;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String contacto;
    private String telefonoContacto;
    private String latitud;
    private String longitud;
    private Cliente cliente;

    /** Default constructor. */
    public Sucursal() {
        super();
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
     * @param aCodSucursal the new value for codSucursal
     */
    public void setCodSucursal(int aCodSucursal) {
        codSucursal = aCodSucursal;
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

    /**
     * Access method for cliente.
     *
     * @return the current value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Setter method for cliente.
     *
     * @param aCliente the new value for cliente
     */
    public void setCliente(Cliente aCliente) {
        cliente = aCliente;
    }

    /**
     * Compares the key for this instance with another Sucursal.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sucursal and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sucursal)) {
            return false;
        }
        Sucursal that = (Sucursal) other;
        if (this.getCodSucursal() != that.getCodSucursal()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sucursal.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sucursal)) return false;
        return this.equalKeys(other) && ((Sucursal)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCodSucursal();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Sucursal |");
        sb.append(" codSucursal=").append(getCodSucursal());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codSucursal", Integer.valueOf(getCodSucursal()));
        return ret;
    }

}
