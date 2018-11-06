
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRegionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCategoryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsCompounded" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax", propOrder = {
    "taxRegionID",
    "taxCategoryID",
    "taxName",
    "taxRate",
    "isCompounded"
})
public class Tax
    extends Entity
{

    @XmlElement(name = "TaxRegionID")
    protected Object taxRegionID;
    @XmlElement(name = "TaxCategoryID")
    protected Object taxCategoryID;
    @XmlElement(name = "TaxName")
    protected Object taxName;
    @XmlElement(name = "TaxRate")
    protected Object taxRate;
    @XmlElement(name = "IsCompounded")
    protected Object isCompounded;

    /**
     * Gets the value of the taxRegionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxRegionID() {
        return taxRegionID;
    }

    /**
     * Sets the value of the taxRegionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxRegionID(Object value) {
        this.taxRegionID = value;
    }

    /**
     * Gets the value of the taxCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxCategoryID() {
        return taxCategoryID;
    }

    /**
     * Sets the value of the taxCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxCategoryID(Object value) {
        this.taxCategoryID = value;
    }

    /**
     * Gets the value of the taxName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxName(Object value) {
        this.taxName = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxRate(Object value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the isCompounded property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsCompounded() {
        return isCompounded;
    }

    /**
     * Sets the value of the isCompounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsCompounded(Object value) {
        this.isCompounded = value;
    }

}
