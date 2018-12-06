// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TablaTipoVisita implements Serializable {

    /** Primary key. */
    protected static final String PK = "codTipoVisita";

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

    private int codTipoVisita;
    private String descripcion;
    private Set<ProgramarVisita> programarVisita;

    /** Default constructor. */
    public TablaTipoVisita() {
        super();
    }

    /**
     * Access method for codTipoVisita.
     *
     * @return the current value of codTipoVisita
     */
    public int getCodTipoVisita() {
        return codTipoVisita;
    }

    /**
     * Setter method for codTipoVisita.
     *
     * @param aCodTipoVisita the new value for codTipoVisita
     */
    public void setCodTipoVisita(int aCodTipoVisita) {
        codTipoVisita = aCodTipoVisita;
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
     * Access method for programarVisita.
     *
     * @return the current value of programarVisita
     */
    public Set<ProgramarVisita> getProgramarVisita() {
        return programarVisita;
    }

    /**
     * Setter method for programarVisita.
     *
     * @param aProgramarVisita the new value for programarVisita
     */
    public void setProgramarVisita(Set<ProgramarVisita> aProgramarVisita) {
        programarVisita = aProgramarVisita;
    }

    /**
     * Compares the key for this instance with another TablaTipoVisita.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TablaTipoVisita and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TablaTipoVisita)) {
            return false;
        }
        TablaTipoVisita that = (TablaTipoVisita) other;
        if (this.getCodTipoVisita() != that.getCodTipoVisita()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TablaTipoVisita.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TablaTipoVisita)) return false;
        return this.equalKeys(other) && ((TablaTipoVisita)other).equalKeys(this);
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
        i = getCodTipoVisita();
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
        StringBuffer sb = new StringBuffer("[TablaTipoVisita |");
        sb.append(" codTipoVisita=").append(getCodTipoVisita());
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
        ret.put("codTipoVisita", Integer.valueOf(getCodTipoVisita()));
        return ret;
    }

}
