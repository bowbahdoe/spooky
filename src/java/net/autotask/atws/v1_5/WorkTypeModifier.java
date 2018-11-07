
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkTypeModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkTypeModifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModifierValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ModifierType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkTypeModifier", propOrder = {
    "modifierValue",
    "modifierType"
})
public class WorkTypeModifier
    extends Entity
{

    @XmlElement(name = "ModifierValue")
    protected Object modifierValue;
    @XmlElement(name = "ModifierType")
    protected Object modifierType;

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

}
