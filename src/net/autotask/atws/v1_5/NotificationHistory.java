
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationSentTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NotificationHistoryTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EntityTitle" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EntityNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsTemplateJob" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InitiatingResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InitiatingContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RecipientEmailAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RecipientDisplayName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeEntryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationHistory", propOrder = {
    "notificationSentTime",
    "templateName",
    "notificationHistoryTypeID",
    "entityTitle",
    "entityNumber",
    "isDeleted",
    "isActive",
    "isTemplateJob",
    "initiatingResourceID",
    "initiatingContactID",
    "recipientEmailAddress",
    "recipientDisplayName",
    "accountID",
    "quoteID",
    "opportunityID",
    "projectID",
    "taskID",
    "ticketID",
    "timeEntryID"
})
public class NotificationHistory
    extends Entity
{

    @XmlElement(name = "NotificationSentTime")
    protected Object notificationSentTime;
    @XmlElement(name = "TemplateName")
    protected Object templateName;
    @XmlElement(name = "NotificationHistoryTypeID")
    protected Object notificationHistoryTypeID;
    @XmlElement(name = "EntityTitle")
    protected Object entityTitle;
    @XmlElement(name = "EntityNumber")
    protected Object entityNumber;
    @XmlElement(name = "IsDeleted")
    protected boolean isDeleted;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "IsTemplateJob")
    protected boolean isTemplateJob;
    @XmlElement(name = "InitiatingResourceID")
    protected Object initiatingResourceID;
    @XmlElement(name = "InitiatingContactID")
    protected Object initiatingContactID;
    @XmlElement(name = "RecipientEmailAddress")
    protected Object recipientEmailAddress;
    @XmlElement(name = "RecipientDisplayName")
    protected Object recipientDisplayName;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "QuoteID")
    protected Object quoteID;
    @XmlElement(name = "OpportunityID")
    protected Object opportunityID;
    @XmlElement(name = "ProjectID")
    protected Object projectID;
    @XmlElement(name = "TaskID")
    protected Object taskID;
    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "TimeEntryID")
    protected Object timeEntryID;

    /**
     * Gets the value of the notificationSentTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotificationSentTime() {
        return notificationSentTime;
    }

    /**
     * Sets the value of the notificationSentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotificationSentTime(Object value) {
        this.notificationSentTime = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTemplateName(Object value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the notificationHistoryTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotificationHistoryTypeID() {
        return notificationHistoryTypeID;
    }

    /**
     * Sets the value of the notificationHistoryTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotificationHistoryTypeID(Object value) {
        this.notificationHistoryTypeID = value;
    }

    /**
     * Gets the value of the entityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityTitle() {
        return entityTitle;
    }

    /**
     * Sets the value of the entityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityTitle(Object value) {
        this.entityTitle = value;
    }

    /**
     * Gets the value of the entityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityNumber() {
        return entityNumber;
    }

    /**
     * Sets the value of the entityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityNumber(Object value) {
        this.entityNumber = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     */
    public void setIsDeleted(boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isTemplateJob property.
     * 
     */
    public boolean isIsTemplateJob() {
        return isTemplateJob;
    }

    /**
     * Sets the value of the isTemplateJob property.
     * 
     */
    public void setIsTemplateJob(boolean value) {
        this.isTemplateJob = value;
    }

    /**
     * Gets the value of the initiatingResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInitiatingResourceID() {
        return initiatingResourceID;
    }

    /**
     * Sets the value of the initiatingResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInitiatingResourceID(Object value) {
        this.initiatingResourceID = value;
    }

    /**
     * Gets the value of the initiatingContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInitiatingContactID() {
        return initiatingContactID;
    }

    /**
     * Sets the value of the initiatingContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInitiatingContactID(Object value) {
        this.initiatingContactID = value;
    }

    /**
     * Gets the value of the recipientEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRecipientEmailAddress() {
        return recipientEmailAddress;
    }

    /**
     * Sets the value of the recipientEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRecipientEmailAddress(Object value) {
        this.recipientEmailAddress = value;
    }

    /**
     * Gets the value of the recipientDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRecipientDisplayName() {
        return recipientDisplayName;
    }

    /**
     * Sets the value of the recipientDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRecipientDisplayName(Object value) {
        this.recipientDisplayName = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountID(Object value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the quoteID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteID() {
        return quoteID;
    }

    /**
     * Sets the value of the quoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteID(Object value) {
        this.quoteID = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpportunityID(Object value) {
        this.opportunityID = value;
    }

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectID(Object value) {
        this.projectID = value;
    }

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

}
