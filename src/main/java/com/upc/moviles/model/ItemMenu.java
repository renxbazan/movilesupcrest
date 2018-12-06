// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class ItemMenu implements Serializable {

    /** Primary key. */
    protected static final String PK = "idItemMenu";

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

    private int idItemMenu;
    private String descripcion;
    private String tipo;
    private int orden;
    private String link;

    /** Default constructor. */
    public ItemMenu() {
        super();
    }

    /**
     * Access method for idItemMenu.
     *
     * @return the current value of idItemMenu
     */
    public int getIdItemMenu() {
        return idItemMenu;
    }

    /**
     * Setter method for idItemMenu.
     *
     * @param aIdItemMenu the new value for idItemMenu
     */
    public void setIdItemMenu(int aIdItemMenu) {
        idItemMenu = aIdItemMenu;
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
     * Access method for tipo.
     *
     * @return the current value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter method for tipo.
     *
     * @param aTipo the new value for tipo
     */
    public void setTipo(String aTipo) {
        tipo = aTipo;
    }

    /**
     * Access method for orden.
     *
     * @return the current value of orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Setter method for orden.
     *
     * @param aOrden the new value for orden
     */
    public void setOrden(int aOrden) {
        orden = aOrden;
    }

    /**
     * Access method for link.
     *
     * @return the current value of link
     */
    public String getLink() {
        return link;
    }

    /**
     * Setter method for link.
     *
     * @param aLink the new value for link
     */
    public void setLink(String aLink) {
        link = aLink;
    }

    /**
     * Compares the key for this instance with another ItemMenu.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ItemMenu and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ItemMenu)) {
            return false;
        }
        ItemMenu that = (ItemMenu) other;
        if (this.getIdItemMenu() != that.getIdItemMenu()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ItemMenu.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ItemMenu)) return false;
        return this.equalKeys(other) && ((ItemMenu)other).equalKeys(this);
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
        i = getIdItemMenu();
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
        StringBuffer sb = new StringBuffer("[ItemMenu |");
        sb.append(" idItemMenu=").append(getIdItemMenu());
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
        ret.put("idItemMenu", Integer.valueOf(getIdItemMenu()));
        return ret;
    }

}
