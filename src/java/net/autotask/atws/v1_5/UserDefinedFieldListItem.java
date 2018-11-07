
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedFieldListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedFieldListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UdfFieldId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ValueForExport" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ValueForDisplay" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedFieldListItem", propOrder = {
    "udfFieldId",
    "valueForExport",
    "valueForDisplay",
    "createDate"
})
public class UserDefinedFieldListItem
    extends Entity
{

    @XmlElement(name = "UdfFieldId")
    protected Object udfFieldId;
    @XmlElement(name = "ValueForExport")
    protected Object valueForExport;
    @XmlElement(name = "ValueForDisplay")
    protected Object valueForDisplay;
    @XmlElement(name = "CreateDate")
    protected Object createDate;

    /**
     * Gets the value of the udfFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUdfFieldId() {
        return udfFieldId;
    }

    /**
     * Sets the value of the udfFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUdfFieldId(Object value) {
        this.udfFieldId = value;
    }

    /**
     * Gets the value of the valueForExport property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValueForExport() {
        return valueForExport;
    }

    /**
     * Sets the value of the valueForExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValueForExport(Object value) {
        this.valueForExport = value;
    }

    /**
     * Gets the value of the valueForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValueForDisplay() {
        return valueForDisplay;
    }

    /**
     * Sets the value of the valueForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValueForDisplay(Object value) {
        this.valueForDisplay = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDate(Object value) {
        this.createDate = value;
    }

}
