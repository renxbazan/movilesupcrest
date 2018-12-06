// Generated with g9.

package com.upc.moviles.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class PerfilMenu implements Serializable {

    /** Primary key. */
    protected static final String PK = "PerfilMenuPrimary";

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

    private int idperfi;
    private String idItemMenu;

    /** Default constructor. */
    public PerfilMenu() {
        super();
    }

    /**
     * Access method for idperfi.
     *
     * @return the current value of idperfi
     */
    public int getIdperfi() {
        return idperfi;
    }

    /**
     * Setter method for idperfi.
     *
     * @param aIdperfi the new value for idperfi
     */
    public void setIdperfi(int aIdperfi) {
        idperfi = aIdperfi;
    }

    /**
     * Access method for idItemMenu.
     *
     * @return the current value of idItemMenu
     */
    public String getIdItemMenu() {
        return idItemMenu;
    }

    /**
     * Setter method for idItemMenu.
     *
     * @param aIdItemMenu the new value for idItemMenu
     */
    public void setIdItemMenu(String aIdItemMenu) {
        idItemMenu = aIdItemMenu;
    }

    /**
     * Compares the key for this instance with another PerfilMenu.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerfilMenu and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerfilMenu)) {
            return false;
        }
        PerfilMenu that = (PerfilMenu) other;
        if (this.getIdperfi() != that.getIdperfi()) {
            return false;
        }
        Object myIdItemMenu = this.getIdItemMenu();
        Object yourIdItemMenu = that.getIdItemMenu();
        if (myIdItemMenu==null ? yourIdItemMenu!=null : !myIdItemMenu.equals(yourIdItemMenu)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerfilMenu.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerfilMenu)) return false;
        return this.equalKeys(other) && ((PerfilMenu)other).equalKeys(this);
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
        i = getIdperfi();
        result = 37*result + i;
        if (getIdItemMenu() == null) {
            i = 0;
        } else {
            i = getIdItemMenu().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[PerfilMenu |");
        sb.append(" idperfi=").append(getIdperfi());
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
        ret.put("idperfi", Integer.valueOf(getIdperfi()));
        ret.put("idItemMenu", getIdItemMenu());
        return ret;
    }

}
