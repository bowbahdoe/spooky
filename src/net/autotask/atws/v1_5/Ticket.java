
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ticket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DueDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InstalledProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IssueType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QueueID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssignedResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssignedResourceRoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubIssueType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionPlanDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolvedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseDueDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionPlanDueDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolvedDueDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementHasBeenMet" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProblemTicketId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeApprovalBoard" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeApprovalType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeInfoField1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeInfoField2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeInfoField3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeInfoField4" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeInfoField5" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastCustomerNotificationDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastCustomerVisibleActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HoursToBeScheduled" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMAlertID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseInitiatingResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseAssignedResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountPhysicalLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityPersonType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementPausedNextEventHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticket", propOrder = {
    "accountID",
    "allocationCodeID",
    "completedDate",
    "contactID",
    "contractID",
    "createDate",
    "creatorResourceID",
    "description",
    "dueDateTime",
    "estimatedHours",
    "installedProductID",
    "issueType",
    "lastActivityDate",
    "priority",
    "queueID",
    "assignedResourceID",
    "assignedResourceRoleID",
    "source",
    "status",
    "subIssueType",
    "ticketNumber",
    "title",
    "firstResponseDateTime",
    "resolutionPlanDateTime",
    "resolvedDateTime",
    "firstResponseDueDateTime",
    "resolutionPlanDueDateTime",
    "resolvedDueDateTime",
    "serviceLevelAgreementID",
    "serviceLevelAgreementHasBeenMet",
    "resolution",
    "purchaseOrderNumber",
    "ticketType",
    "problemTicketId",
    "opportunityId",
    "changeApprovalBoard",
    "changeApprovalType",
    "changeApprovalStatus",
    "changeInfoField1",
    "changeInfoField2",
    "changeInfoField3",
    "changeInfoField4",
    "changeInfoField5",
    "lastCustomerNotificationDateTime",
    "lastCustomerVisibleActivityDateTime",
    "contractServiceID",
    "contractServiceBundleID",
    "hoursToBeScheduled",
    "monitorTypeID",
    "monitorID",
    "aemAlertID",
    "ticketCategory",
    "externalID",
    "firstResponseInitiatingResourceID",
    "firstResponseAssignedResourceID",
    "projectID",
    "businessDivisionSubdivisionID",
    "creatorType",
    "completedByResourceID",
    "accountPhysicalLocationID",
    "lastActivityPersonType",
    "lastActivityResourceID",
    "serviceLevelAgreementPausedNextEventHours"
})
public class Ticket
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "CompletedDate")
    protected Object completedDate;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "DueDateTime")
    protected Object dueDateTime;
    @XmlElement(name = "EstimatedHours")
    protected Object estimatedHours;
    @XmlElement(name = "InstalledProductID")
    protected Object installedProductID;
    @XmlElement(name = "IssueType")
    protected Object issueType;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "Priority")
    protected Object priority;
    @XmlElement(name = "QueueID")
    protected Object queueID;
    @XmlElement(name = "AssignedResourceID")
    protected Object assignedResourceID;
    @XmlElement(name = "AssignedResourceRoleID")
    protected Object assignedResourceRoleID;
    @XmlElement(name = "Source")
    protected Object source;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "SubIssueType")
    protected Object subIssueType;
    @XmlElement(name = "TicketNumber")
    protected Object ticketNumber;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "FirstResponseDateTime")
    protected Object firstResponseDateTime;
    @XmlElement(name = "ResolutionPlanDateTime")
    protected Object resolutionPlanDateTime;
    @XmlElement(name = "ResolvedDateTime")
    protected Object resolvedDateTime;
    @XmlElement(name = "FirstResponseDueDateTime")
    protected Object firstResponseDueDateTime;
    @XmlElement(name = "ResolutionPlanDueDateTime")
    protected Object resolutionPlanDueDateTime;
    @XmlElement(name = "ResolvedDueDateTime")
    protected Object resolvedDueDateTime;
    @XmlElement(name = "ServiceLevelAgreementID")
    protected Object serviceLevelAgreementID;
    @XmlElement(name = "ServiceLevelAgreementHasBeenMet")
    protected Object serviceLevelAgreementHasBeenMet;
    @XmlElement(name = "Resolution")
    protected Object resolution;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "TicketType")
    protected Object ticketType;
    @XmlElement(name = "ProblemTicketId")
    protected Object problemTicketId;
    @XmlElement(name = "OpportunityId")
    protected Object opportunityId;
    @XmlElement(name = "ChangeApprovalBoard")
    protected Object changeApprovalBoard;
    @XmlElement(name = "ChangeApprovalType")
    protected Object changeApprovalType;
    @XmlElement(name = "ChangeApprovalStatus")
    protected Object changeApprovalStatus;
    @XmlElement(name = "ChangeInfoField1")
    protected Object changeInfoField1;
    @XmlElement(name = "ChangeInfoField2")
    protected Object changeInfoField2;
    @XmlElement(name = "ChangeInfoField3")
    protected Object changeInfoField3;
    @XmlElement(name = "ChangeInfoField4")
    protected Object changeInfoField4;
    @XmlElement(name = "ChangeInfoField5")
    protected Object changeInfoField5;
    @XmlElement(name = "LastCustomerNotificationDateTime")
    protected Object lastCustomerNotificationDateTime;
    @XmlElement(name = "LastCustomerVisibleActivityDateTime")
    protected Object lastCustomerVisibleActivityDateTime;
    @XmlElement(name = "ContractServiceID")
    protected Object contractServiceID;
    @XmlElement(name = "ContractServiceBundleID")
    protected Object contractServiceBundleID;
    @XmlElement(name = "HoursToBeScheduled")
    protected Object hoursToBeScheduled;
    @XmlElement(name = "MonitorTypeID")
    protected Object monitorTypeID;
    @XmlElement(name = "MonitorID")
    protected Object monitorID;
    @XmlElement(name = "AEMAlertID")
    protected Object aemAlertID;
    @XmlElement(name = "TicketCategory")
    protected Object ticketCategory;
    @XmlElement(name = "ExternalID")
    protected Object externalID;
    @XmlElement(name = "FirstResponseInitiatingResourceID")
    protected Object firstResponseInitiatingResourceID;
    @XmlElement(name = "FirstResponseAssignedResourceID")
    protected Object firstResponseAssignedResourceID;
    @XmlElement(name = "ProjectID")
    protected Object projectID;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;
    @XmlElement(name = "CreatorType")
    protected Object creatorType;
    @XmlElement(name = "CompletedByResourceID")
    protected Object completedByResourceID;
    @XmlElement(name = "AccountPhysicalLocationID")
    protected Object accountPhysicalLocationID;
    @XmlElement(name = "LastActivityPersonType")
    protected Object lastActivityPersonType;
    @XmlElement(name = "LastActivityResourceID")
    protected Object lastActivityResourceID;
    @XmlElement(name = "ServiceLevelAgreementPausedNextEventHours")
    protected Object serviceLevelAgreementPausedNextEventHours;

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
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedDate(Object value) {
        this.completedDate = value;
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
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDate(Object value) {
        this.createDate = value;
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

    /**
     * Gets the value of the dueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDueDateTime() {
        return dueDateTime;
    }

    /**
     * Sets the value of the dueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDueDateTime(Object value) {
        this.dueDateTime = value;
    }

    /**
     * Gets the value of the estimatedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Sets the value of the estimatedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedHours(Object value) {
        this.estimatedHours = value;
    }

    /**
     * Gets the value of the installedProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstalledProductID() {
        return installedProductID;
    }

    /**
     * Sets the value of the installedProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstalledProductID(Object value) {
        this.installedProductID = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssueType(Object value) {
        this.issueType = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriority(Object value) {
        this.priority = value;
    }

    /**
     * Gets the value of the queueID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQueueID() {
        return queueID;
    }

    /**
     * Sets the value of the queueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQueueID(Object value) {
        this.queueID = value;
    }

    /**
     * Gets the value of the assignedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssignedResourceID() {
        return assignedResourceID;
    }

    /**
     * Sets the value of the assignedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssignedResourceID(Object value) {
        this.assignedResourceID = value;
    }

    /**
     * Gets the value of the assignedResourceRoleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssignedResourceRoleID() {
        return assignedResourceRoleID;
    }

    /**
     * Sets the value of the assignedResourceRoleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssignedResourceRoleID(Object value) {
        this.assignedResourceRoleID = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSource(Object value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatus(Object value) {
        this.status = value;
    }

    /**
     * Gets the value of the subIssueType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubIssueType() {
        return subIssueType;
    }

    /**
     * Sets the value of the subIssueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubIssueType(Object value) {
        this.subIssueType = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketNumber(Object value) {
        this.ticketNumber = value;
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
     * Gets the value of the firstResponseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseDateTime() {
        return firstResponseDateTime;
    }

    /**
     * Sets the value of the firstResponseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseDateTime(Object value) {
        this.firstResponseDateTime = value;
    }

    /**
     * Gets the value of the resolutionPlanDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionPlanDateTime() {
        return resolutionPlanDateTime;
    }

    /**
     * Sets the value of the resolutionPlanDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionPlanDateTime(Object value) {
        this.resolutionPlanDateTime = value;
    }

    /**
     * Gets the value of the resolvedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolvedDateTime() {
        return resolvedDateTime;
    }

    /**
     * Sets the value of the resolvedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolvedDateTime(Object value) {
        this.resolvedDateTime = value;
    }

    /**
     * Gets the value of the firstResponseDueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseDueDateTime() {
        return firstResponseDueDateTime;
    }

    /**
     * Sets the value of the firstResponseDueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseDueDateTime(Object value) {
        this.firstResponseDueDateTime = value;
    }

    /**
     * Gets the value of the resolutionPlanDueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionPlanDueDateTime() {
        return resolutionPlanDueDateTime;
    }

    /**
     * Sets the value of the resolutionPlanDueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionPlanDueDateTime(Object value) {
        this.resolutionPlanDueDateTime = value;
    }

    /**
     * Gets the value of the resolvedDueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolvedDueDateTime() {
        return resolvedDueDateTime;
    }

    /**
     * Sets the value of the resolvedDueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolvedDueDateTime(Object value) {
        this.resolvedDueDateTime = value;
    }

    /**
     * Gets the value of the serviceLevelAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }

    /**
     * Sets the value of the serviceLevelAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementID(Object value) {
        this.serviceLevelAgreementID = value;
    }

    /**
     * Gets the value of the serviceLevelAgreementHasBeenMet property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementHasBeenMet() {
        return serviceLevelAgreementHasBeenMet;
    }

    /**
     * Sets the value of the serviceLevelAgreementHasBeenMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementHasBeenMet(Object value) {
        this.serviceLevelAgreementHasBeenMet = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolution(Object value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPurchaseOrderNumber(Object value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketType(Object value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the problemTicketId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProblemTicketId() {
        return problemTicketId;
    }

    /**
     * Sets the value of the problemTicketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProblemTicketId(Object value) {
        this.problemTicketId = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpportunityId(Object value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the changeApprovalBoard property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeApprovalBoard() {
        return changeApprovalBoard;
    }

    /**
     * Sets the value of the changeApprovalBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeApprovalBoard(Object value) {
        this.changeApprovalBoard = value;
    }

    /**
     * Gets the value of the changeApprovalType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeApprovalType() {
        return changeApprovalType;
    }

    /**
     * Sets the value of the changeApprovalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeApprovalType(Object value) {
        this.changeApprovalType = value;
    }

    /**
     * Gets the value of the changeApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeApprovalStatus() {
        return changeApprovalStatus;
    }

    /**
     * Sets the value of the changeApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeApprovalStatus(Object value) {
        this.changeApprovalStatus = value;
    }

    /**
     * Gets the value of the changeInfoField1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeInfoField1() {
        return changeInfoField1;
    }

    /**
     * Sets the value of the changeInfoField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeInfoField1(Object value) {
        this.changeInfoField1 = value;
    }

    /**
     * Gets the value of the changeInfoField2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeInfoField2() {
        return changeInfoField2;
    }

    /**
     * Sets the value of the changeInfoField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeInfoField2(Object value) {
        this.changeInfoField2 = value;
    }

    /**
     * Gets the value of the changeInfoField3 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeInfoField3() {
        return changeInfoField3;
    }

    /**
     * Sets the value of the changeInfoField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeInfoField3(Object value) {
        this.changeInfoField3 = value;
    }

    /**
     * Gets the value of the changeInfoField4 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeInfoField4() {
        return changeInfoField4;
    }

    /**
     * Sets the value of the changeInfoField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeInfoField4(Object value) {
        this.changeInfoField4 = value;
    }

    /**
     * Gets the value of the changeInfoField5 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeInfoField5() {
        return changeInfoField5;
    }

    /**
     * Sets the value of the changeInfoField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeInfoField5(Object value) {
        this.changeInfoField5 = value;
    }

    /**
     * Gets the value of the lastCustomerNotificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastCustomerNotificationDateTime() {
        return lastCustomerNotificationDateTime;
    }

    /**
     * Sets the value of the lastCustomerNotificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastCustomerNotificationDateTime(Object value) {
        this.lastCustomerNotificationDateTime = value;
    }

    /**
     * Gets the value of the lastCustomerVisibleActivityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastCustomerVisibleActivityDateTime() {
        return lastCustomerVisibleActivityDateTime;
    }

    /**
     * Sets the value of the lastCustomerVisibleActivityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastCustomerVisibleActivityDateTime(Object value) {
        this.lastCustomerVisibleActivityDateTime = value;
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

    /**
     * Gets the value of the hoursToBeScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHoursToBeScheduled() {
        return hoursToBeScheduled;
    }

    /**
     * Sets the value of the hoursToBeScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHoursToBeScheduled(Object value) {
        this.hoursToBeScheduled = value;
    }

    /**
     * Gets the value of the monitorTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonitorTypeID() {
        return monitorTypeID;
    }

    /**
     * Sets the value of the monitorTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonitorTypeID(Object value) {
        this.monitorTypeID = value;
    }

    /**
     * Gets the value of the monitorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonitorID() {
        return monitorID;
    }

    /**
     * Sets the value of the monitorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonitorID(Object value) {
        this.monitorID = value;
    }

    /**
     * Gets the value of the aemAlertID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMAlertID() {
        return aemAlertID;
    }

    /**
     * Sets the value of the aemAlertID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMAlertID(Object value) {
        this.aemAlertID = value;
    }

    /**
     * Gets the value of the ticketCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketCategory() {
        return ticketCategory;
    }

    /**
     * Sets the value of the ticketCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketCategory(Object value) {
        this.ticketCategory = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalID(Object value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the firstResponseInitiatingResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseInitiatingResourceID() {
        return firstResponseInitiatingResourceID;
    }

    /**
     * Sets the value of the firstResponseInitiatingResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseInitiatingResourceID(Object value) {
        this.firstResponseInitiatingResourceID = value;
    }

    /**
     * Gets the value of the firstResponseAssignedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseAssignedResourceID() {
        return firstResponseAssignedResourceID;
    }

    /**
     * Sets the value of the firstResponseAssignedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseAssignedResourceID(Object value) {
        this.firstResponseAssignedResourceID = value;
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
     * Gets the value of the businessDivisionSubdivisionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }

    /**
     * Sets the value of the businessDivisionSubdivisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBusinessDivisionSubdivisionID(Object value) {
        this.businessDivisionSubdivisionID = value;
    }

    /**
     * Gets the value of the creatorType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreatorType() {
        return creatorType;
    }

    /**
     * Sets the value of the creatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreatorType(Object value) {
        this.creatorType = value;
    }

    /**
     * Gets the value of the completedByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedByResourceID() {
        return completedByResourceID;
    }

    /**
     * Sets the value of the completedByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedByResourceID(Object value) {
        this.completedByResourceID = value;
    }

    /**
     * Gets the value of the accountPhysicalLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }

    /**
     * Sets the value of the accountPhysicalLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountPhysicalLocationID(Object value) {
        this.accountPhysicalLocationID = value;
    }

    /**
     * Gets the value of the lastActivityPersonType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityPersonType() {
        return lastActivityPersonType;
    }

    /**
     * Sets the value of the lastActivityPersonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityPersonType(Object value) {
        this.lastActivityPersonType = value;
    }

    /**
     * Gets the value of the lastActivityResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityResourceID() {
        return lastActivityResourceID;
    }

    /**
     * Sets the value of the lastActivityResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityResourceID(Object value) {
        this.lastActivityResourceID = value;
    }

    /**
     * Gets the value of the serviceLevelAgreementPausedNextEventHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementPausedNextEventHours() {
        return serviceLevelAgreementPausedNextEventHours;
    }

    /**
     * Sets the value of the serviceLevelAgreementPausedNextEventHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementPausedNextEventHours(Object value) {
        this.serviceLevelAgreementPausedNextEventHours = value;
    }

}
