// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Empleado implements Serializable {


    private int id;
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
    private Usuario usuario;
    private TablaTipoEmpleado tablaTipoEmpleado;
    private TablaTipoDocumento tablaTipoDocumento;

    /** Default constructor. */
    public Empleado() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
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

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Access method for tablaTipoEmpleado.
     *
     * @return the current value of tablaTipoEmpleado
     */
    public TablaTipoEmpleado getTablaTipoEmpleado() {
        return tablaTipoEmpleado;
    }

    /**
     * Setter method for tablaTipoEmpleado.
     *
     * @param aTablaTipoEmpleado the new value for tablaTipoEmpleado
     */
    public void setTablaTipoEmpleado(TablaTipoEmpleado aTablaTipoEmpleado) {
        tablaTipoEmpleado = aTablaTipoEmpleado;
    }

    /**
     * Access method for tablaTipoDocumento.
     *
     * @return the current value of tablaTipoDocumento
     */
    public TablaTipoDocumento getTablaTipoDocumento() {
        return tablaTipoDocumento;
    }

    /**
     * Setter method for tablaTipoDocumento.
     *
     * @param aTablaTipoDocumento the new value for tablaTipoDocumento
     */
    public void setTablaTipoDocumento(TablaTipoDocumento aTablaTipoDocumento) {
        tablaTipoDocumento = aTablaTipoDocumento;
    }

    /** Temporary value holder for group key fragment usuarioIdusuario */
    private transient int tempUsuarioIdusuario;

    /**
     * Gets the key fragment idusuario for member usuario.
     * If this.usuario is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsuarioIdusuario.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Usuario
     */
    public int getUsuarioIdusuario() {
        return (getUsuario() == null ? tempUsuarioIdusuario : getUsuario().getIdusuario());
    }

    /**
     * Sets the key fragment idusuario from member usuario.
     * If this.usuario is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsuarioIdusuario.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdusuario New value for the key fragment
     * @see Usuario
     */
    public void setUsuarioIdusuario(int aIdusuario) {
        if (getUsuario() == null) {
            tempUsuarioIdusuario = aIdusuario;
        } else {
            getUsuario().setIdusuario(aIdusuario);
        }
    }

    /** Temporary value holder for group key fragment usuarioIdPerfi */
    private transient int tempUsuarioIdPerfi;

    /**
     * Gets the key fragment idPerfi for member usuario.
     * If this.usuario is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsuarioIdPerfi.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Usuario
     */
    public int getUsuarioIdPerfi() {
        return (getUsuario() == null ? tempUsuarioIdPerfi : getUsuario().getIdPerfi());
    }

    /**
     * Sets the key fragment idPerfi from member usuario.
     * If this.usuario is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsuarioIdPerfi.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdPerfi New value for the key fragment
     * @see Usuario
     */
    public void setUsuarioIdPerfi(int aIdPerfi) {
        if (getUsuario() == null) {
            tempUsuarioIdPerfi = aIdPerfi;
        } else {
            getUsuario().setIdPerfi(aIdPerfi);
        }
    }

    /**
     * Compares the key for this instance with another Empleado.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Empleado and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Empleado)) {
            return false;
        }
        Empleado that = (Empleado) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        if (this.getUsuarioIdusuario() != that.getUsuarioIdusuario()) {
            return false;
        }
        if (this.getUsuarioIdPerfi() != that.getUsuarioIdPerfi()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Empleado.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Empleado)) return false;
        return this.equalKeys(other) && ((Empleado)other).equalKeys(this);
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
        i = getId();
        result = 37*result + i;
        i = getUsuarioIdusuario();
        result = 37*result + i;
        i = getUsuarioIdPerfi();
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
        StringBuffer sb = new StringBuffer("[Empleado |");
        sb.append(" id=").append(getId());
        sb.append(" usuarioIdusuario=").append(getUsuarioIdusuario());
        sb.append(" usuarioIdPerfi=").append(getUsuarioIdPerfi());
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
        ret.put("id", Integer.valueOf(getId()));
        ret.put("usuarioIdusuario", Integer.valueOf(getUsuarioIdusuario()));
        ret.put("usuarioIdPerfi", Integer.valueOf(getUsuarioIdPerfi()));
        return ret;
    }

}
