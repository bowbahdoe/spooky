
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Country"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFormatID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsDefaultCountry" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
    "addressFormatID",
    "active",
    "countryCode",
    "displayName",
    "invoiceTemplateID",
    "isDefaultCountry",
    "name",
    "quoteTemplateID"
})
public class Country
    extends Entity
{

    @XmlElement(name = "AddressFormatID")
    protected Object addressFormatID;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "CountryCode")
    protected Object countryCode;
    @XmlElement(name = "DisplayName")
    protected Object displayName;
    @XmlElement(name = "InvoiceTemplateID")
    protected Object invoiceTemplateID;
    @XmlElement(name = "IsDefaultCountry")
    protected Object isDefaultCountry;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "QuoteTemplateID")
    protected Object quoteTemplateID;

    /**
     * Gets the value of the addressFormatID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddressFormatID() {
        return addressFormatID;
    }

    /**
     * Sets the value of the addressFormatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddressFormatID(Object value) {
        this.addressFormatID = value;
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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCountryCode(Object value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayName(Object value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the invoiceTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceTemplateID() {
        return invoiceTemplateID;
    }

    /**
     * Sets the value of the invoiceTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceTemplateID(Object value) {
        this.invoiceTemplateID = value;
    }

    /**
     * Gets the value of the isDefaultCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsDefaultCountry() {
        return isDefaultCountry;
    }

    /**
     * Sets the value of the isDefaultCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsDefaultCountry(Object value) {
        this.isDefaultCountry = value;
    }

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
     * Gets the value of the quoteTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteTemplateID() {
        return quoteTemplateID;
    }

    /**
     * Sets the value of the quoteTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteTemplateID(Object value) {
        this.quoteTemplateID = value;
    }

}
