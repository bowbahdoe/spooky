
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketChangeRequestApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketChangeRequestApproval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApproveRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApproveRejectNote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketChangeRequestApproval", propOrder = {
    "ticketID",
    "resourceID",
    "contactID",
    "approveRejectDateTime",
    "approveRejectNote",
    "isApproved"
})
public class TicketChangeRequestApproval
    extends Entity
{

    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "ResourceID")
    protected Object resourceID;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "ApproveRejectDateTime")
    protected Object approveRejectDateTime;
    @XmlElement(name = "ApproveRejectNote")
    protected Object approveRejectNote;
    @XmlElement(name = "IsApproved")
    protected Object isApproved;

    /**
     * Gets the value of the ticketID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketID(Object value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceID(Object value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactID(Object value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the approveRejectDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApproveRejectDateTime() {
        return approveRejectDateTime;
    }

    /**
     * Sets the value of the approveRejectDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApproveRejectDateTime(Object value) {
        this.approveRejectDateTime = value;
    }

    /**
     * Gets the value of the approveRejectNote property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApproveRejectNote() {
        return approveRejectNote;
    }

    /**
     * Sets the value of the approveRejectNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApproveRejectNote(Object value) {
        this.approveRejectNote = value;
    }

    /**
     * Gets the value of the isApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsApproved(Object value) {
        this.isApproved = value;
    }

}
