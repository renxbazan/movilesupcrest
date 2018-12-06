// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TablaTipoDocumento implements Serializable {

    /** Primary key. */
    protected static final String PK = "tipoDocumento";

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

    private int tipoDocumento;
    private String descripcion;
    private String desResumida;
    private String codUsuarioCreador;
    private Date fecCreacion;
    private String codUsuarioUpdate;
    private Date fecUpdate;
    private String estadoRegistro;
    private Set<Cliente> cliente;
    private Set<Empleado> empleado;

    /** Default constructor. */
    public TablaTipoDocumento() {
        super();
    }

    /**
     * Access method for tipoDocumento.
     *
     * @return the current value of tipoDocumento
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Setter method for tipoDocumento.
     *
     * @param aTipoDocumento the new value for tipoDocumento
     */
    public void setTipoDocumento(int aTipoDocumento) {
        tipoDocumento = aTipoDocumento;
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
     * Access method for desResumida.
     *
     * @return the current value of desResumida
     */
    public String getDesResumida() {
        return desResumida;
    }

    /**
     * Setter method for desResumida.
     *
     * @param aDesResumida the new value for desResumida
     */
    public void setDesResumida(String aDesResumida) {
        desResumida = aDesResumida;
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
     * Access method for cliente.
     *
     * @return the current value of cliente
     */
    public Set<Cliente> getCliente() {
        return cliente;
    }

    /**
     * Setter method for cliente.
     *
     * @param aCliente the new value for cliente
     */
    public void setCliente(Set<Cliente> aCliente) {
        cliente = aCliente;
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
     * Compares the key for this instance with another TablaTipoDocumento.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TablaTipoDocumento and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TablaTipoDocumento)) {
            return false;
        }
        TablaTipoDocumento that = (TablaTipoDocumento) other;
        if (this.getTipoDocumento() != that.getTipoDocumento()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TablaTipoDocumento.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TablaTipoDocumento)) return false;
        return this.equalKeys(other) && ((TablaTipoDocumento)other).equalKeys(this);
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
        i = getTipoDocumento();
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
        StringBuffer sb = new StringBuffer("[TablaTipoDocumento |");
        sb.append(" tipoDocumento=").append(getTipoDocumento());
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
        ret.put("tipoDocumento", Integer.valueOf(getTipoDocumento()));
        return ret;
    }

}
