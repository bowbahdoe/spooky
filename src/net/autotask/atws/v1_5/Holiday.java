
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HolidayName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HolidayDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HolidaySetID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday", propOrder = {
    "holidayName",
    "holidayDate",
    "holidaySetID"
})
public class Holiday
    extends Entity
{

    @XmlElement(name = "HolidayName")
    protected Object holidayName;
    @XmlElement(name = "HolidayDate")
    protected Object holidayDate;
    @XmlElement(name = "HolidaySetID")
    protected Object holidaySetID;

    /**
     * Gets the value of the holidayName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidayName() {
        return holidayName;
    }

    /**
     * Sets the value of the holidayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidayName(Object value) {
        this.holidayName = value;
    }

    /**
     * Gets the value of the holidayDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidayDate() {
        return holidayDate;
    }

    /**
     * Sets the value of the holidayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidayDate(Object value) {
        this.holidayDate = value;
    }

    /**
     * Gets the value of the holidaySetID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidaySetID() {
        return holidaySetID;
    }

    /**
     * Sets the value of the holidaySetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidaySetID(Object value) {
        this.holidaySetID = value;
    }

}
