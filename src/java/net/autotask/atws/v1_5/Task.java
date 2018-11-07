
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssignedResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssignedResourceRoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CanClientPortalUserCompleteTask" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HoursToBeScheduled" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsVisibleInClientPortal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PhaseID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RemainingHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskIsBillable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PriorityLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedByType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityPersonType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "allocationCodeID",
    "assignedResourceID",
    "assignedResourceRoleID",
    "canClientPortalUserCompleteTask",
    "completedDateTime",
    "createDateTime",
    "creatorResourceID",
    "departmentID",
    "description",
    "endDateTime",
    "estimatedHours",
    "externalID",
    "hoursToBeScheduled",
    "isVisibleInClientPortal",
    "lastActivityDateTime",
    "phaseID",
    "priority",
    "projectID",
    "purchaseOrderNumber",
    "remainingHours",
    "startDateTime",
    "status",
    "taskIsBillable",
    "taskNumber",
    "taskType",
    "title",
    "priorityLabel",
    "creatorType",
    "completedByResourceID",
    "completedByType",
    "lastActivityResourceID",
    "lastActivityPersonType"
})
public class Task
    extends Entity
{

    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "AssignedResourceID")
    protected Object assignedResourceID;
    @XmlElement(name = "AssignedResourceRoleID")
    protected Object assignedResourceRoleID;
    @XmlElement(name = "CanClientPortalUserCompleteTask")
    protected Object canClientPortalUserCompleteTask;
    @XmlElement(name = "CompletedDateTime")
    protected Object completedDateTime;
    @XmlElement(name = "CreateDateTime")
    protected Object createDateTime;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "DepartmentID")
    protected Object departmentID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "EndDateTime")
    protected Object endDateTime;
    @XmlElement(name = "EstimatedHours")
    protected Object estimatedHours;
    @XmlElement(name = "ExternalID")
    protected Object externalID;
    @XmlElement(name = "HoursToBeScheduled")
    protected Object hoursToBeScheduled;
    @XmlElement(name = "IsVisibleInClientPortal")
    protected Object isVisibleInClientPortal;
    @XmlElement(name = "LastActivityDateTime")
    protected Object lastActivityDateTime;
    @XmlElement(name = "PhaseID")
    protected Object phaseID;
    @XmlElement(name = "Priority")
    protected Object priority;
    @XmlElement(name = "ProjectID")
    protected Object projectID;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "RemainingHours")
    protected Object remainingHours;
    @XmlElement(name = "StartDateTime")
    protected Object startDateTime;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "TaskIsBillable")
    protected Object taskIsBillable;
    @XmlElement(name = "TaskNumber")
    protected Object taskNumber;
    @XmlElement(name = "TaskType")
    protected Object taskType;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "PriorityLabel")
    protected Object priorityLabel;
    @XmlElement(name = "CreatorType")
    protected Object creatorType;
    @XmlElement(name = "CompletedByResourceID")
    protected Object completedByResourceID;
    @XmlElement(name = "CompletedByType")
    protected Object completedByType;
    @XmlElement(name = "LastActivityResourceID")
    protected Object lastActivityResourceID;
    @XmlElement(name = "LastActivityPersonType")
    protected Object lastActivityPersonType;

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
     * Gets the value of the canClientPortalUserCompleteTask property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCanClientPortalUserCompleteTask() {
        return canClientPortalUserCompleteTask;
    }

    /**
     * Sets the value of the canClientPortalUserCompleteTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCanClientPortalUserCompleteTask(Object value) {
        this.canClientPortalUserCompleteTask = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedDateTime(Object value) {
        this.completedDateTime = value;
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
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartmentID(Object value) {
        this.departmentID = value;
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
     * Gets the value of the isVisibleInClientPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsVisibleInClientPortal() {
        return isVisibleInClientPortal;
    }

    /**
     * Sets the value of the isVisibleInClientPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsVisibleInClientPortal(Object value) {
        this.isVisibleInClientPortal = value;
    }

    /**
     * Gets the value of the lastActivityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityDateTime() {
        return lastActivityDateTime;
    }

    /**
     * Sets the value of the lastActivityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityDateTime(Object value) {
        this.lastActivityDateTime = value;
    }

    /**
     * Gets the value of the phaseID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPhaseID() {
        return phaseID;
    }

    /**
     * Sets the value of the phaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPhaseID(Object value) {
        this.phaseID = value;
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
     * Gets the value of the remainingHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRemainingHours() {
        return remainingHours;
    }

    /**
     * Sets the value of the remainingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRemainingHours(Object value) {
        this.remainingHours = value;
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
     * Gets the value of the taskIsBillable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskIsBillable() {
        return taskIsBillable;
    }

    /**
     * Sets the value of the taskIsBillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskIsBillable(Object value) {
        this.taskIsBillable = value;
    }

    /**
     * Gets the value of the taskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskNumber(Object value) {
        this.taskNumber = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskType(Object value) {
        this.taskType = value;
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
     * Gets the value of the priorityLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriorityLabel() {
        return priorityLabel;
    }

    /**
     * Sets the value of the priorityLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriorityLabel(Object value) {
        this.priorityLabel = value;
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
     * Gets the value of the completedByType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedByType() {
        return completedByType;
    }

    /**
     * Sets the value of the completedByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedByType(Object value) {
        this.completedByType = value;
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

}
