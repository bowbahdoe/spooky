
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledProductTypeUdfAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledProductTypeUdfAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstalledProductTypeId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefinedFieldDefinitionId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledProductTypeUdfAssociation", propOrder = {
    "installedProductTypeId",
    "userDefinedFieldDefinitionId",
    "required",
    "sortOrder"
})
public class InstalledProductTypeUdfAssociation
    extends Entity
{

    @XmlElement(name = "InstalledProductTypeId")
    protected Object installedProductTypeId;
    @XmlElement(name = "UserDefinedFieldDefinitionId")
    protected Object userDefinedFieldDefinitionId;
    @XmlElement(name = "Required")
    protected Object required;
    @XmlElement(name = "SortOrder")
    protected Object sortOrder;

    /**
     * Gets the value of the installedProductTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstalledProductTypeId() {
        return installedProductTypeId;
    }

    /**
     * Sets the value of the installedProductTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstalledProductTypeId(Object value) {
        this.installedProductTypeId = value;
    }

    /**
     * Gets the value of the userDefinedFieldDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserDefinedFieldDefinitionId() {
        return userDefinedFieldDefinitionId;
    }

    /**
     * Sets the value of the userDefinedFieldDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserDefinedFieldDefinitionId(Object value) {
        this.userDefinedFieldDefinitionId = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequired(Object value) {
        this.required = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSortOrder(Object value) {
        this.sortOrder = value;
    }

}
