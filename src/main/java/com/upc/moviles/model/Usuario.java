// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Usuario implements Serializable {

    /** Primary key. */
    protected static final String PK = "UsuarioPrimary";

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

    private int idusuario;
    private String username;
    private String clave;
    private int codEmpleado;
    private int idPerfi;
    private Set<Empleado> empleado;

    /** Default constructor. */
    public Usuario() {
        super();
    }

    /**
     * Access method for idusuario.
     *
     * @return the current value of idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * Setter method for idusuario.
     *
     * @param aIdusuario the new value for idusuario
     */
    public void setIdusuario(int aIdusuario) {
        idusuario = aIdusuario;
    }

    /**
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for clave.
     *
     * @return the current value of clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Setter method for clave.
     *
     * @param aClave the new value for clave
     */
    public void setClave(String aClave) {
        clave = aClave;
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
     * @param aCodEmpleado the new value for codEmpleado
     */
    public void setCodEmpleado(int aCodEmpleado) {
        codEmpleado = aCodEmpleado;
    }

    /**
     * Access method for idPerfi.
     *
     * @return the current value of idPerfi
     */
    public int getIdPerfi() {
        return idPerfi;
    }

    /**
     * Setter method for idPerfi.
     *
     * @param aIdPerfi the new value for idPerfi
     */
    public void setIdPerfi(int aIdPerfi) {
        idPerfi = aIdPerfi;
    }

    /**
     * Access method for empleado.
     *
     * @return the current value of empleado
     */
    public Set<Empleado> getEmpleado() {
        return empleado;
    }

    /**
     * Setter method for empleado.
     *
     * @param aEmpleado the new value for empleado
     */
    public void setEmpleado(Set<Empleado> aEmpleado) {
        empleado = aEmpleado;
    }

    /**
     * Compares the key for this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuario)) {
            return false;
        }
        Usuario that = (Usuario) other;
        if (this.getIdusuario() != that.getIdusuario()) {
            return false;
        }
        if (this.getIdPerfi() != that.getIdPerfi()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuario)) return false;
        return this.equalKeys(other) && ((Usuario)other).equalKeys(this);
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
        i = getIdusuario();
        result = 37*result + i;
        i = getIdPerfi();
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
        StringBuffer sb = new StringBuffer("[Usuario |");
        sb.append(" idusuario=").append(getIdusuario());
        sb.append(" idPerfi=").append(getIdPerfi());
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
        ret.put("idusuario", Integer.valueOf(getIdusuario()));
        ret.put("idPerfi", Integer.valueOf(getIdPerfi()));
        return ret;
    }

}
