
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SystemRole" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HourlyFactor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HourlyRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItemDefaultTaxCategoryId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsExcludedFromNewContracts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RoleType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "name",
    "description",
    "systemRole",
    "hourlyFactor",
    "hourlyRate",
    "quoteItemDefaultTaxCategoryId",
    "active",
    "isExcludedFromNewContracts",
    "roleType"
})
public class Role
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "SystemRole")
    protected Object systemRole;
    @XmlElement(name = "HourlyFactor")
    protected Object hourlyFactor;
    @XmlElement(name = "HourlyRate")
    protected Object hourlyRate;
    @XmlElement(name = "QuoteItemDefaultTaxCategoryId")
    protected Object quoteItemDefaultTaxCategoryId;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "IsExcludedFromNewContracts")
    protected Object isExcludedFromNewContracts;
    @XmlElement(name = "RoleType")
    protected Object roleType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the systemRole property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSystemRole() {
        return systemRole;
    }

    /**
     * Sets the value of the systemRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSystemRole(Object value) {
        this.systemRole = value;
    }

    /**
     * Gets the value of the hourlyFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHourlyFactor() {
        return hourlyFactor;
    }

    /**
     * Sets the value of the hourlyFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHourlyFactor(Object value) {
        this.hourlyFactor = value;
    }

    /**
     * Gets the value of the hourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the value of the hourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHourlyRate(Object value) {
        this.hourlyRate = value;
    }

    /**
     * Gets the value of the quoteItemDefaultTaxCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteItemDefaultTaxCategoryId() {
        return quoteItemDefaultTaxCategoryId;
    }

    /**
     * Sets the value of the quoteItemDefaultTaxCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteItemDefaultTaxCategoryId(Object value) {
        this.quoteItemDefaultTaxCategoryId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActive(Object value) {
        this.active = value;
    }

    /**
     * Gets the value of the isExcludedFromNewContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsExcludedFromNewContracts() {
        return isExcludedFromNewContracts;
    }

    /**
     * Sets the value of the isExcludedFromNewContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsExcludedFromNewContracts(Object value) {
        this.isExcludedFromNewContracts = value;
    }

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRoleType(Object value) {
        this.roleType = value;
    }

}
