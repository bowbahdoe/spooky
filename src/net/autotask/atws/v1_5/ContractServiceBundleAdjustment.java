
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractServiceBundleAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractServiceBundleAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitChange" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedUnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllowRepeatServiceBundle" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractServiceBundleAdjustment", propOrder = {
    "contractID",
    "serviceBundleID",
    "effectiveDate",
    "unitChange",
    "adjustedUnitPrice",
    "quoteItemID",
    "contractServiceBundleID",
    "allowRepeatServiceBundle"
})
public class ContractServiceBundleAdjustment
    extends Entity
{

    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ServiceBundleID")
    protected Object serviceBundleID;
    @XmlElement(name = "EffectiveDate")
    protected Object effectiveDate;
    @XmlElement(name = "UnitChange")
    protected Object unitChange;
    @XmlElement(name = "AdjustedUnitPrice")
    protected Object adjustedUnitPrice;
    @XmlElement(name = "QuoteItemID")
    protected Object quoteItemID;
    @XmlElement(name = "ContractServiceBundleID")
    protected Object contractServiceBundleID;
    @XmlElement(name = "AllowRepeatServiceBundle")
    protected Object allowRepeatServiceBundle;

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractID(Object value) {
        this.contractID = value;
    }

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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEffectiveDate(Object value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the unitChange property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitChange() {
        return unitChange;
    }

    /**
     * Sets the value of the unitChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitChange(Object value) {
        this.unitChange = value;
    }

    /**
     * Gets the value of the adjustedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdjustedUnitPrice() {
        return adjustedUnitPrice;
    }

    /**
     * Sets the value of the adjustedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdjustedUnitPrice(Object value) {
        this.adjustedUnitPrice = value;
    }

    /**
     * Gets the value of the quoteItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteItemID() {
        return quoteItemID;
    }

    /**
     * Sets the value of the quoteItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteItemID(Object value) {
        this.quoteItemID = value;
    }

    /**
     * Gets the value of the contractServiceBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }

    /**
     * Sets the value of the contractServiceBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractServiceBundleID(Object value) {
        this.contractServiceBundleID = value;
    }

    /**
     * Gets the value of the allowRepeatServiceBundle property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllowRepeatServiceBundle() {
        return allowRepeatServiceBundle;
    }

    /**
     * Sets the value of the allowRepeatServiceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllowRepeatServiceBundle(Object value) {
        this.allowRepeatServiceBundle = value;
    }

}
