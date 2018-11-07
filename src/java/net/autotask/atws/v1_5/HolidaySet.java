
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolidaySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HolidaySet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HolidaySetName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HolidaySetDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolidaySet", propOrder = {
    "holidaySetName",
    "holidaySetDescription"
})
public class HolidaySet
    extends Entity
{

    @XmlElement(name = "HolidaySetName")
    protected Object holidaySetName;
    @XmlElement(name = "HolidaySetDescription")
    protected Object holidaySetDescription;

    /**
     * Gets the value of the holidaySetName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidaySetName() {
        return holidaySetName;
    }

    /**
     * Sets the value of the holidaySetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidaySetName(Object value) {
        this.holidaySetName = value;
    }

    /**
     * Gets the value of the holidaySetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidaySetDescription() {
        return holidaySetDescription;
    }

    /**
     * Sets the value of the holidaySetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidaySetDescription(Object value) {
        this.holidaySetDescription = value;
    }

}
