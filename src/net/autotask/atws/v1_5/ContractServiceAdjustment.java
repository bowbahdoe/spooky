
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractServiceAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractServiceAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitChange" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedUnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedUnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllowRepeatService" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractServiceAdjustment", propOrder = {
    "contractID",
    "serviceID",
    "effectiveDate",
    "unitChange",
    "adjustedUnitPrice",
    "adjustedUnitCost",
    "quoteItemID",
    "contractServiceID",
    "allowRepeatService"
})
public class ContractServiceAdjustment
    extends Entity
{

    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ServiceID")
    protected Object serviceID;
    @XmlElement(name = "EffectiveDate")
    protected Object effectiveDate;
    @XmlElement(name = "UnitChange")
    protected Object unitChange;
    @XmlElement(name = "AdjustedUnitPrice")
    protected Object adjustedUnitPrice;
    @XmlElement(name = "AdjustedUnitCost")
    protected Object adjustedUnitCost;
    @XmlElement(name = "QuoteItemID")
    protected Object quoteItemID;
    @XmlElement(name = "ContractServiceID")
    protected Object contractServiceID;
    @XmlElement(name = "AllowRepeatService")
    protected Object allowRepeatService;

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
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceID(Object value) {
        this.serviceID = value;
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
     * Gets the value of the adjustedUnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdjustedUnitCost() {
        return adjustedUnitCost;
    }

    /**
     * Sets the value of the adjustedUnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdjustedUnitCost(Object value) {
        this.adjustedUnitCost = value;
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
     * Gets the value of the contractServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractServiceID() {
        return contractServiceID;
    }

    /**
     * Sets the value of the contractServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractServiceID(Object value) {
        this.contractServiceID = value;
    }

    /**
     * Gets the value of the allowRepeatService property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllowRepeatService() {
        return allowRepeatService;
    }

    /**
     * Sets the value of the allowRepeatService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllowRepeatService(Object value) {
        this.allowRepeatService = value;
    }

}
