
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceListWorkTypeModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceListWorkTypeModifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkTypeModifierID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ModifierValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ModifierType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UsesInternalCurrencyPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceListWorkTypeModifier", propOrder = {
    "workTypeModifierID",
    "modifierValue",
    "modifierType",
    "currencyID",
    "usesInternalCurrencyPrice"
})
public class PriceListWorkTypeModifier
    extends Entity
{

    @XmlElement(name = "WorkTypeModifierID")
    protected Object workTypeModifierID;
    @XmlElement(name = "ModifierValue")
    protected Object modifierValue;
    @XmlElement(name = "ModifierType")
    protected Object modifierType;
    @XmlElement(name = "CurrencyID")
    protected Object currencyID;
    @XmlElement(name = "UsesInternalCurrencyPrice")
    protected Object usesInternalCurrencyPrice;

    /**
     * Gets the value of the workTypeModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWorkTypeModifierID() {
        return workTypeModifierID;
    }

    /**
     * Sets the value of the workTypeModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWorkTypeModifierID(Object value) {
        this.workTypeModifierID = value;
    }

    /**
     * Gets the value of the modifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModifierValue() {
        return modifierValue;
    }

    /**
     * Sets the value of the modifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModifierValue(Object value) {
        this.modifierValue = value;
    }

    /**
     * Gets the value of the modifierType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModifierType() {
        return modifierType;
    }

    /**
     * Sets the value of the modifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModifierType(Object value) {
        this.modifierType = value;
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

}
