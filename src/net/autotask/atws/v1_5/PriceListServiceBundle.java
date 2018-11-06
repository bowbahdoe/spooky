
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceListServiceBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceListServiceBundle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UsesInternalCurrencyPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceListServiceBundle", propOrder = {
    "serviceBundleID",
    "currencyID",
    "usesInternalCurrencyPrice",
    "unitPrice"
})
public class PriceListServiceBundle
    extends Entity
{

    @XmlElement(name = "ServiceBundleID")
    protected Object serviceBundleID;
    @XmlElement(name = "CurrencyID")
    protected Object currencyID;
    @XmlElement(name = "UsesInternalCurrencyPrice")
    protected Object usesInternalCurrencyPrice;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;

    /**
     * Gets the value of the serviceBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceBundleID() {
        return serviceBundleID;
    }

    /**
     * Sets the value of the serviceBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceBundleID(Object value) {
        this.serviceBundleID = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyID(Object value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the usesInternalCurrencyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUsesInternalCurrencyPrice() {
        return usesInternalCurrencyPrice;
    }

    /**
     * Sets the value of the usesInternalCurrencyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUsesInternalCurrencyPrice(Object value) {
        this.usesInternalCurrencyPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitPrice(Object value) {
        this.unitPrice = value;
    }

}
