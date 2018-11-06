
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalAllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateWorked" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HoursWorked" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HoursToBill" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OffsetHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SummaryNotes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalNotes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorUserID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedUserID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowOnInvoice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NonBillable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillingApprovalLevelMostRecent" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillingApprovalResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillingApprovalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEntry", propOrder = {
    "taskID",
    "ticketID",
    "internalAllocationCodeID",
    "type",
    "dateWorked",
    "startDateTime",
    "endDateTime",
    "hoursWorked",
    "hoursToBill",
    "offsetHours",
    "summaryNotes",
    "internalNotes",
    "roleID",
    "createDateTime",
    "resourceID",
    "creatorUserID",
    "lastModifiedUserID",
    "lastModifiedDateTime",
    "allocationCodeID",
    "contractID",
    "showOnInvoice",
    "nonBillable",
    "billingApprovalLevelMostRecent",
    "billingApprovalResourceID",
    "billingApprovalDateTime",
    "contractServiceID",
    "contractServiceBundleID"
})
public class TimeEntry
    extends Entity
{

    @XmlElement(name = "TaskID")
    protected Object taskID;
    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "InternalAllocationCodeID")
    protected Object internalAllocationCodeID;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "DateWorked")
    protected Object dateWorked;
    @XmlElement(name = "StartDateTime")
    protected Object startDateTime;
    @XmlElement(name = "EndDateTime")
    protected Object endDateTime;
    @XmlElement(name = "HoursWorked")
    protected Object hoursWorked;
    @XmlElement(name = "HoursToBill")
    protected Object hoursToBill;
    @XmlElement(name = "OffsetHours")
    protected Object offsetHours;
    @XmlElement(name = "SummaryNotes")
    protected Object summaryNotes;
    @XmlElement(name = "InternalNotes")
    protected Object internalNotes;
    @XmlElement(name = "RoleID")
    protected Object roleID;
    @XmlElement(name = "CreateDateTime")
    protected Object createDateTime;
    @XmlElement(name = "ResourceID")
    protected Object resourceID;
    @XmlElement(name = "CreatorUserID")
    protected Object creatorUserID;
    @XmlElement(name = "LastModifiedUserID")
    protected Object lastModifiedUserID;
    @XmlElement(name = "LastModifiedDateTime")
    protected Object lastModifiedDateTime;
    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ShowOnInvoice")
    protected Object showOnInvoice;
    @XmlElement(name = "NonBillable")
    protected Object nonBillable;
    @XmlElement(name = "BillingApprovalLevelMostRecent")
    protected Object billingApprovalLevelMostRecent;
    @XmlElement(name = "BillingApprovalResourceID")
    protected Object billingApprovalResourceID;
    @XmlElement(name = "BillingApprovalDateTime")
    protected Object billingApprovalDateTime;
    @XmlElement(name = "ContractServiceID")
    protected Object contractServiceID;
    @XmlElement(name = "ContractServiceBundleID")
    protected Object contractServiceBundleID;

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskID(Object value) {
        this.taskID = value;
    }

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
     * Gets the value of the internalAllocationCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalAllocationCodeID() {
        return internalAllocationCodeID;
    }

    /**
     * Sets the value of the internalAllocationCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalAllocationCodeID(Object value) {
        this.internalAllocationCodeID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setType(Object value) {
        this.type = value;
    }

    /**
     * Gets the value of the dateWorked property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDateWorked() {
        return dateWorked;
    }

    /**
     * Sets the value of the dateWorked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDateWorked(Object value) {
        this.dateWorked = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartDateTime(Object value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndDateTime(Object value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the hoursWorked property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets the value of the hoursWorked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHoursWorked(Object value) {
        this.hoursWorked = value;
    }

    /**
     * Gets the value of the hoursToBill property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHoursToBill() {
        return hoursToBill;
    }

    /**
     * Sets the value of the hoursToBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHoursToBill(Object value) {
        this.hoursToBill = value;
    }

    /**
     * Gets the value of the offsetHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOffsetHours() {
        return offsetHours;
    }

    /**
     * Sets the value of the offsetHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOffsetHours(Object value) {
        this.offsetHours = value;
    }

    /**
     * Gets the value of the summaryNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSummaryNotes() {
        return summaryNotes;
    }

    /**
     * Sets the value of the summaryNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSummaryNotes(Object value) {
        this.summaryNotes = value;
    }

    /**
     * Gets the value of the internalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalNotes() {
        return internalNotes;
    }

    /**
     * Sets the value of the internalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalNotes(Object value) {
        this.internalNotes = value;
    }

    /**
     * Gets the value of the roleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRoleID(Object value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDateTime(Object value) {
        this.createDateTime = value;
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
     * Gets the value of the creatorUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreatorUserID() {
        return creatorUserID;
    }

    /**
     * Sets the value of the creatorUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreatorUserID(Object value) {
        this.creatorUserID = value;
    }

    /**
     * Gets the value of the lastModifiedUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedUserID() {
        return lastModifiedUserID;
    }

    /**
     * Sets the value of the lastModifiedUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedUserID(Object value) {
        this.lastModifiedUserID = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedDateTime(Object value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the allocationCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllocationCodeID() {
        return allocationCodeID;
    }

    /**
     * Sets the value of the allocationCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllocationCodeID(Object value) {
        this.allocationCodeID = value;
    }

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
     * Gets the value of the showOnInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShowOnInvoice() {
        return showOnInvoice;
    }

    /**
     * Sets the value of the showOnInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShowOnInvoice(Object value) {
        this.showOnInvoice = value;
    }

    /**
     * Gets the value of the nonBillable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNonBillable() {
        return nonBillable;
    }

    /**
     * Sets the value of the nonBillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNonBillable(Object value) {
        this.nonBillable = value;
    }

    /**
     * Gets the value of the billingApprovalLevelMostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillingApprovalLevelMostRecent() {
        return billingApprovalLevelMostRecent;
    }

    /**
     * Sets the value of the billingApprovalLevelMostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillingApprovalLevelMostRecent(Object value) {
        this.billingApprovalLevelMostRecent = value;
    }

    /**
     * Gets the value of the billingApprovalResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillingApprovalResourceID() {
        return billingApprovalResourceID;
    }

    /**
     * Sets the value of the billingApprovalResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillingApprovalResourceID(Object value) {
        this.billingApprovalResourceID = value;
    }

    /**
     * Gets the value of the billingApprovalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillingApprovalDateTime() {
        return billingApprovalDateTime;
    }

    /**
     * Sets the value of the billingApprovalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillingApprovalDateTime(Object value) {
        this.billingApprovalDateTime = value;
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

}
