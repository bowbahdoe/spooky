
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingItemApprovalLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingItemApprovalLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeEntryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalLevel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingItemApprovalLevel", propOrder = {
    "timeEntryID",
    "approvalResourceID",
    "approvalDateTime",
    "approvalLevel"
})
public class BillingItemApprovalLevel
    extends Entity
{

    @XmlElement(name = "TimeEntryID")
    protected Object timeEntryID;
    @XmlElement(name = "ApprovalResourceID")
    protected Object approvalResourceID;
    @XmlElement(name = "ApprovalDateTime")
    protected Object approvalDateTime;
    @XmlElement(name = "ApprovalLevel")
    protected Object approvalLevel;

    /**
     * Gets the value of the timeEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimeEntryID() {
        return timeEntryID;
    }

    /**
     * Sets the value of the timeEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimeEntryID(Object value) {
        this.timeEntryID = value;
    }

    /**
     * Gets the value of the approvalResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovalResourceID() {
        return approvalResourceID;
    }

    /**
     * Sets the value of the approvalResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovalResourceID(Object value) {
        this.approvalResourceID = value;
    }

    /**
     * Gets the value of the approvalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovalDateTime() {
        return approvalDateTime;
    }

    /**
     * Sets the value of the approvalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovalDateTime(Object value) {
        this.approvalDateTime = value;
    }

    /**
     * Gets the value of the approvalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovalLevel() {
        return approvalLevel;
    }

    /**
     * Sets the value of the approvalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovalLevel(Object value) {
        this.approvalLevel = value;
    }

}
