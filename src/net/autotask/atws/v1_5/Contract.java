
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillingPreference" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Compliance" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractPeriodType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsDefaultContract" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OverageBillingRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SetupFee" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeReportingRequiresStartAndStopTimes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RenewedContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SetupFeeAllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExclusionContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyOverageBillingRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencySetupFee" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "accountID",
    "billingPreference",
    "compliance",
    "contactID",
    "contactName",
    "contractCategory",
    "contractName",
    "contractNumber",
    "contractPeriodType",
    "contractType",
    "isDefaultContract",
    "description",
    "endDate",
    "estimatedCost",
    "estimatedHours",
    "estimatedRevenue",
    "overageBillingRate",
    "setupFee",
    "startDate",
    "status",
    "timeReportingRequiresStartAndStopTimes",
    "serviceLevelAgreementID",
    "purchaseOrderNumber",
    "opportunityID",
    "renewedContractID",
    "setupFeeAllocationCodeID",
    "exclusionContractID",
    "internalCurrencyOverageBillingRate",
    "internalCurrencySetupFee",
    "businessDivisionSubdivisionID"
})
public class Contract
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "BillingPreference")
    protected Object billingPreference;
    @XmlElement(name = "Compliance")
    protected Object compliance;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "ContactName")
    protected Object contactName;
    @XmlElement(name = "ContractCategory")
    protected Object contractCategory;
    @XmlElement(name = "ContractName")
    protected Object contractName;
    @XmlElement(name = "ContractNumber")
    protected Object contractNumber;
    @XmlElement(name = "ContractPeriodType")
    protected Object contractPeriodType;
    @XmlElement(name = "ContractType")
    protected Object contractType;
    @XmlElement(name = "IsDefaultContract")
    protected Object isDefaultContract;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "EndDate")
    protected Object endDate;
    @XmlElement(name = "EstimatedCost")
    protected Object estimatedCost;
    @XmlElement(name = "EstimatedHours")
    protected Object estimatedHours;
    @XmlElement(name = "EstimatedRevenue")
    protected Object estimatedRevenue;
    @XmlElement(name = "OverageBillingRate")
    protected Object overageBillingRate;
    @XmlElement(name = "SetupFee")
    protected Object setupFee;
    @XmlElement(name = "StartDate")
    protected Object startDate;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "TimeReportingRequiresStartAndStopTimes")
    protected Object timeReportingRequiresStartAndStopTimes;
    @XmlElement(name = "ServiceLevelAgreementID")
    protected Object serviceLevelAgreementID;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "OpportunityID")
    protected Object opportunityID;
    @XmlElement(name = "RenewedContractID")
    protected Object renewedContractID;
    @XmlElement(name = "SetupFeeAllocationCodeID")
    protected Object setupFeeAllocationCodeID;
    @XmlElement(name = "ExclusionContractID")
    protected Object exclusionContractID;
    @XmlElement(name = "InternalCurrencyOverageBillingRate")
    protected Object internalCurrencyOverageBillingRate;
    @XmlElement(name = "InternalCurrencySetupFee")
    protected Object internalCurrencySetupFee;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;

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
     * Gets the value of the billingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillingPreference() {
        return billingPreference;
    }

    /**
     * Sets the value of the billingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillingPreference(Object value) {
        this.billingPreference = value;
    }

    /**
     * Gets the value of the compliance property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompliance() {
        return compliance;
    }

    /**
     * Sets the value of the compliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompliance(Object value) {
        this.compliance = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactName(Object value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contractCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractCategory() {
        return contractCategory;
    }

    /**
     * Sets the value of the contractCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractCategory(Object value) {
        this.contractCategory = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractName(Object value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractNumber(Object value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractPeriodType() {
        return contractPeriodType;
    }

    /**
     * Sets the value of the contractPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractPeriodType(Object value) {
        this.contractPeriodType = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractType(Object value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the isDefaultContract property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsDefaultContract() {
        return isDefaultContract;
    }

    /**
     * Sets the value of the isDefaultContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsDefaultContract(Object value) {
        this.isDefaultContract = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndDate(Object value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the estimatedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * Sets the value of the estimatedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedCost(Object value) {
        this.estimatedCost = value;
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
     * Gets the value of the estimatedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedRevenue() {
        return estimatedRevenue;
    }

    /**
     * Sets the value of the estimatedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedRevenue(Object value) {
        this.estimatedRevenue = value;
    }

    /**
     * Gets the value of the overageBillingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOverageBillingRate() {
        return overageBillingRate;
    }

    /**
     * Sets the value of the overageBillingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOverageBillingRate(Object value) {
        this.overageBillingRate = value;
    }

    /**
     * Gets the value of the setupFee property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSetupFee() {
        return setupFee;
    }

    /**
     * Sets the value of the setupFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSetupFee(Object value) {
        this.setupFee = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartDate(Object value) {
        this.startDate = value;
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
     * Gets the value of the timeReportingRequiresStartAndStopTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimeReportingRequiresStartAndStopTimes() {
        return timeReportingRequiresStartAndStopTimes;
    }

    /**
     * Sets the value of the timeReportingRequiresStartAndStopTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimeReportingRequiresStartAndStopTimes(Object value) {
        this.timeReportingRequiresStartAndStopTimes = value;
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
     * Gets the value of the renewedContractID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRenewedContractID() {
        return renewedContractID;
    }

    /**
     * Sets the value of the renewedContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRenewedContractID(Object value) {
        this.renewedContractID = value;
    }

    /**
     * Gets the value of the setupFeeAllocationCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSetupFeeAllocationCodeID() {
        return setupFeeAllocationCodeID;
    }

    /**
     * Sets the value of the setupFeeAllocationCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSetupFeeAllocationCodeID(Object value) {
        this.setupFeeAllocationCodeID = value;
    }

    /**
     * Gets the value of the exclusionContractID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExclusionContractID() {
        return exclusionContractID;
    }

    /**
     * Sets the value of the exclusionContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExclusionContractID(Object value) {
        this.exclusionContractID = value;
    }

    /**
     * Gets the value of the internalCurrencyOverageBillingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyOverageBillingRate() {
        return internalCurrencyOverageBillingRate;
    }

    /**
     * Sets the value of the internalCurrencyOverageBillingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyOverageBillingRate(Object value) {
        this.internalCurrencyOverageBillingRate = value;
    }

    /**
     * Gets the value of the internalCurrencySetupFee property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencySetupFee() {
        return internalCurrencySetupFee;
    }

    /**
     * Sets the value of the internalCurrencySetupFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencySetupFee(Object value) {
        this.internalCurrencySetupFee = value;
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

}
