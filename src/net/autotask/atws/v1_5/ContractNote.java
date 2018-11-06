
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractNote", propOrder = {
    "contractID",
    "creatorResourceID",
    "lastActivityDate",
    "title",
    "description"
})
public class ContractNote
    extends Entity
{

    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "Description")
    protected Object description;

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
     * Gets the value of the creatorResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreatorResourceID() {
        return creatorResourceID;
    }

    /**
     * Sets the value of the creatorResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreatorResourceID(Object value) {
        this.creatorResourceID = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityDate(Object value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTitle(Object value) {
        this.title = value;
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

}
