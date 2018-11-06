
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanQuery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasUserDefinedFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInfo", propOrder = {
    "name",
    "canUpdate",
    "canDelete",
    "canCreate",
    "canQuery",
    "hasUserDefinedFields"
})
public class EntityInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CanUpdate")
    protected boolean canUpdate;
    @XmlElement(name = "CanDelete")
    protected boolean canDelete;
    @XmlElement(name = "CanCreate")
    protected boolean canCreate;
    @XmlElement(name = "CanQuery")
    protected boolean canQuery;
    @XmlElement(name = "HasUserDefinedFields")
    protected boolean hasUserDefinedFields;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the canUpdate property.
     * 
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     * 
     */
    public void setCanUpdate(boolean value) {
        this.canUpdate = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     */
    public boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     */
    public void setCanDelete(boolean value) {
        this.canDelete = value;
    }

    /**
     * Gets the value of the canCreate property.
     * 
     */
    public boolean isCanCreate() {
        return canCreate;
    }

    /**
     * Sets the value of the canCreate property.
     * 
     */
    public void setCanCreate(boolean value) {
        this.canCreate = value;
    }

    /**
     * Gets the value of the canQuery property.
     * 
     */
    public boolean isCanQuery() {
        return canQuery;
    }

    /**
     * Sets the value of the canQuery property.
     * 
     */
    public void setCanQuery(boolean value) {
        this.canQuery = value;
    }

    /**
     * Gets the value of the hasUserDefinedFields property.
     * 
     */
    public boolean isHasUserDefinedFields() {
        return hasUserDefinedFields;
    }

    /**
     * Sets the value of the hasUserDefinedFields property.
     * 
     */
    public void setHasUserDefinedFields(boolean value) {
        this.hasUserDefinedFields = value;
    }

}
