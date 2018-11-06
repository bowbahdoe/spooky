
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExtProjectType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExtPNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ActualHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ActualBilledHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LaborEstimatedRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LaborEstimatedCosts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LaborEstimatedMarginPercentage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCostsRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCostsBudget" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCostEstimatedMarginPercentage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrdersRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrdersBudget" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SGDA" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalEstimatedRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedSalesCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectLeadResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyOwnerResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedPercentage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StatusDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "Project", propOrder = {
    "projectName",
    "accountID",
    "type",
    "extProjectType",
    "extPNumber",
    "projectNumber",
    "description",
    "createDateTime",
    "creatorResourceID",
    "startDateTime",
    "endDateTime",
    "duration",
    "actualHours",
    "actualBilledHours",
    "estimatedTime",
    "laborEstimatedRevenue",
    "laborEstimatedCosts",
    "laborEstimatedMarginPercentage",
    "projectCostsRevenue",
    "projectCostsBudget",
    "projectCostEstimatedMarginPercentage",
    "changeOrdersRevenue",
    "changeOrdersBudget",
    "sgda",
    "originalEstimatedRevenue",
    "estimatedSalesCost",
    "status",
    "contractID",
    "projectLeadResourceID",
    "companyOwnerResourceID",
    "completedPercentage",
    "completedDateTime",
    "statusDetail",
    "statusDateTime",
    "department",
    "lineOfBusiness",
    "purchaseOrderNumber",
    "businessDivisionSubdivisionID",
    "lastActivityResourceID",
    "lastActivityDateTime",
    "lastActivityPersonType"
})
public class Project
    extends Entity
{

    @XmlElement(name = "ProjectName")
    protected Object projectName;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "ExtProjectType")
    protected Object extProjectType;
    @XmlElement(name = "ExtPNumber")
    protected Object extPNumber;
    @XmlElement(name = "ProjectNumber")
    protected Object projectNumber;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "CreateDateTime")
    protected Object createDateTime;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "StartDateTime")
    protected Object startDateTime;
    @XmlElement(name = "EndDateTime")
    protected Object endDateTime;
    @XmlElement(name = "Duration")
    protected Object duration;
    @XmlElement(name = "ActualHours")
    protected Object actualHours;
    @XmlElement(name = "ActualBilledHours")
    protected Object actualBilledHours;
    @XmlElement(name = "EstimatedTime")
    protected Object estimatedTime;
    @XmlElement(name = "LaborEstimatedRevenue")
    protected Object laborEstimatedRevenue;
    @XmlElement(name = "LaborEstimatedCosts")
    protected Object laborEstimatedCosts;
    @XmlElement(name = "LaborEstimatedMarginPercentage")
    protected Object laborEstimatedMarginPercentage;
    @XmlElement(name = "ProjectCostsRevenue")
    protected Object projectCostsRevenue;
    @XmlElement(name = "ProjectCostsBudget")
    protected Object projectCostsBudget;
    @XmlElement(name = "ProjectCostEstimatedMarginPercentage")
    protected Object projectCostEstimatedMarginPercentage;
    @XmlElement(name = "ChangeOrdersRevenue")
    protected Object changeOrdersRevenue;
    @XmlElement(name = "ChangeOrdersBudget")
    protected Object changeOrdersBudget;
    @XmlElement(name = "SGDA")
    protected Object sgda;
    @XmlElement(name = "OriginalEstimatedRevenue")
    protected Object originalEstimatedRevenue;
    @XmlElement(name = "EstimatedSalesCost")
    protected Object estimatedSalesCost;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ProjectLeadResourceID")
    protected Object projectLeadResourceID;
    @XmlElement(name = "CompanyOwnerResourceID")
    protected Object companyOwnerResourceID;
    @XmlElement(name = "CompletedPercentage")
    protected Object completedPercentage;
    @XmlElement(name = "CompletedDateTime")
    protected Object completedDateTime;
    @XmlElement(name = "StatusDetail")
    protected Object statusDetail;
    @XmlElement(name = "StatusDateTime")
    protected Object statusDateTime;
    @XmlElement(name = "Department")
    protected Object department;
    @XmlElement(name = "LineOfBusiness")
    protected Object lineOfBusiness;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;
    @XmlElement(name = "LastActivityResourceID")
    protected Object lastActivityResourceID;
    @XmlElement(name = "LastActivityDateTime")
    protected Object lastActivityDateTime;
    @XmlElement(name = "LastActivityPersonType")
    protected Object lastActivityPersonType;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectName(Object value) {
        this.projectName = value;
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
     * Gets the value of the extProjectType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtProjectType() {
        return extProjectType;
    }

    /**
     * Sets the value of the extProjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtProjectType(Object value) {
        this.extProjectType = value;
    }

    /**
     * Gets the value of the extPNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtPNumber() {
        return extPNumber;
    }

    /**
     * Sets the value of the extPNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtPNumber(Object value) {
        this.extPNumber = value;
    }

    /**
     * Gets the value of the projectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectNumber() {
        return projectNumber;
    }

    /**
     * Sets the value of the projectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectNumber(Object value) {
        this.projectNumber = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDuration(Object value) {
        this.duration = value;
    }

    /**
     * Gets the value of the actualHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActualHours() {
        return actualHours;
    }

    /**
     * Sets the value of the actualHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActualHours(Object value) {
        this.actualHours = value;
    }

    /**
     * Gets the value of the actualBilledHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActualBilledHours() {
        return actualBilledHours;
    }

    /**
     * Sets the value of the actualBilledHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActualBilledHours(Object value) {
        this.actualBilledHours = value;
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedTime(Object value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the laborEstimatedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLaborEstimatedRevenue() {
        return laborEstimatedRevenue;
    }

    /**
     * Sets the value of the laborEstimatedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLaborEstimatedRevenue(Object value) {
        this.laborEstimatedRevenue = value;
    }

    /**
     * Gets the value of the laborEstimatedCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLaborEstimatedCosts() {
        return laborEstimatedCosts;
    }

    /**
     * Sets the value of the laborEstimatedCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLaborEstimatedCosts(Object value) {
        this.laborEstimatedCosts = value;
    }

    /**
     * Gets the value of the laborEstimatedMarginPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLaborEstimatedMarginPercentage() {
        return laborEstimatedMarginPercentage;
    }

    /**
     * Sets the value of the laborEstimatedMarginPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLaborEstimatedMarginPercentage(Object value) {
        this.laborEstimatedMarginPercentage = value;
    }

    /**
     * Gets the value of the projectCostsRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectCostsRevenue() {
        return projectCostsRevenue;
    }

    /**
     * Sets the value of the projectCostsRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectCostsRevenue(Object value) {
        this.projectCostsRevenue = value;
    }

    /**
     * Gets the value of the projectCostsBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectCostsBudget() {
        return projectCostsBudget;
    }

    /**
     * Sets the value of the projectCostsBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectCostsBudget(Object value) {
        this.projectCostsBudget = value;
    }

    /**
     * Gets the value of the projectCostEstimatedMarginPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectCostEstimatedMarginPercentage() {
        return projectCostEstimatedMarginPercentage;
    }

    /**
     * Sets the value of the projectCostEstimatedMarginPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectCostEstimatedMarginPercentage(Object value) {
        this.projectCostEstimatedMarginPercentage = value;
    }

    /**
     * Gets the value of the changeOrdersRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeOrdersRevenue() {
        return changeOrdersRevenue;
    }

    /**
     * Sets the value of the changeOrdersRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeOrdersRevenue(Object value) {
        this.changeOrdersRevenue = value;
    }

    /**
     * Gets the value of the changeOrdersBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeOrdersBudget() {
        return changeOrdersBudget;
    }

    /**
     * Sets the value of the changeOrdersBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeOrdersBudget(Object value) {
        this.changeOrdersBudget = value;
    }

    /**
     * Gets the value of the sgda property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSGDA() {
        return sgda;
    }

    /**
     * Sets the value of the sgda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSGDA(Object value) {
        this.sgda = value;
    }

    /**
     * Gets the value of the originalEstimatedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOriginalEstimatedRevenue() {
        return originalEstimatedRevenue;
    }

    /**
     * Sets the value of the originalEstimatedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOriginalEstimatedRevenue(Object value) {
        this.originalEstimatedRevenue = value;
    }

    /**
     * Gets the value of the estimatedSalesCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedSalesCost() {
        return estimatedSalesCost;
    }

    /**
     * Sets the value of the estimatedSalesCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedSalesCost(Object value) {
        this.estimatedSalesCost = value;
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
     * Gets the value of the projectLeadResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectLeadResourceID() {
        return projectLeadResourceID;
    }

    /**
     * Sets the value of the projectLeadResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectLeadResourceID(Object value) {
        this.projectLeadResourceID = value;
    }

    /**
     * Gets the value of the companyOwnerResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyOwnerResourceID() {
        return companyOwnerResourceID;
    }

    /**
     * Sets the value of the companyOwnerResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyOwnerResourceID(Object value) {
        this.companyOwnerResourceID = value;
    }

    /**
     * Gets the value of the completedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedPercentage() {
        return completedPercentage;
    }

    /**
     * Sets the value of the completedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedPercentage(Object value) {
        this.completedPercentage = value;
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
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatusDetail(Object value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the statusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatusDateTime() {
        return statusDateTime;
    }

    /**
     * Sets the value of the statusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatusDateTime(Object value) {
        this.statusDateTime = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartment(Object value) {
        this.department = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineOfBusiness(Object value) {
        this.lineOfBusiness = value;
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
