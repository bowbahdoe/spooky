
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayColorRGB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalDefault" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketCategory", propOrder = {
    "name",
    "nickname",
    "active",
    "displayColorRGB",
    "globalDefault"
})
public class TicketCategory
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Nickname")
    protected Object nickname;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "DisplayColorRGB")
    protected Object displayColorRGB;
    @XmlElement(name = "GlobalDefault")
    protected Object globalDefault;

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
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNickname(Object value) {
        this.nickname = value;
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
     * Gets the value of the displayColorRGB property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayColorRGB() {
        return displayColorRGB;
    }

    /**
     * Sets the value of the displayColorRGB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayColorRGB(Object value) {
        this.displayColorRGB = value;
    }

    /**
     * Gets the value of the globalDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGlobalDefault() {
        return globalDefault;
    }

    /**
     * Sets the value of the globalDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGlobalDefault(Object value) {
        this.globalDefault = value;
    }

}
