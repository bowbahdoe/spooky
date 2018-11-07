
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplaySymbol" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UpdateResourceId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsInternalCurrency" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyPositiveFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyNegativeFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "name",
    "description",
    "displaySymbol",
    "exchangeRate",
    "lastModifiedDateTime",
    "updateResourceId",
    "isInternalCurrency",
    "active",
    "currencyPositiveFormat",
    "currencyNegativeFormat"
})
public class Currency
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "DisplaySymbol")
    protected Object displaySymbol;
    @XmlElement(name = "ExchangeRate")
    protected Object exchangeRate;
    @XmlElement(name = "LastModifiedDateTime")
    protected Object lastModifiedDateTime;
    @XmlElement(name = "UpdateResourceId")
    protected Object updateResourceId;
    @XmlElement(name = "IsInternalCurrency")
    protected Object isInternalCurrency;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "CurrencyPositiveFormat")
    protected Object currencyPositiveFormat;
    @XmlElement(name = "CurrencyNegativeFormat")
    protected Object currencyNegativeFormat;

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
     * Gets the value of the displaySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * Sets the value of the displaySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplaySymbol(Object value) {
        this.displaySymbol = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExchangeRate(Object value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedDateTime(Object value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the updateResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUpdateResourceId() {
        return updateResourceId;
    }

    /**
     * Sets the value of the updateResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUpdateResourceId(Object value) {
        this.updateResourceId = value;
    }

    /**
     * Gets the value of the isInternalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsInternalCurrency() {
        return isInternalCurrency;
    }

    /**
     * Sets the value of the isInternalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsInternalCurrency(Object value) {
        this.isInternalCurrency = value;
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
     * Gets the value of the currencyPositiveFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyPositiveFormat() {
        return currencyPositiveFormat;
    }

    /**
     * Sets the value of the currencyPositiveFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyPositiveFormat(Object value) {
        this.currencyPositiveFormat = value;
    }

    /**
     * Gets the value of the currencyNegativeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyNegativeFormat() {
        return currencyNegativeFormat;
    }

    /**
     * Sets the value of the currencyNegativeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyNegativeFormat(Object value) {
        this.currencyNegativeFormat = value;
    }

}
