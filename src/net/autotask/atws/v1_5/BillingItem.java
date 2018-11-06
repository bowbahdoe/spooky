
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountManagerWhenApprovedID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OurCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemApproverID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeEntryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WebServiceDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NonBillable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxDollars" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractCostID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectCostID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketCostID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MilestoneID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VendorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemFullDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemGroupDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InstalledProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyExtendedPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyTaxDollars" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyTotalAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "BillingItem", propOrder = {
    "accountManagerWhenApprovedID",
    "type",
    "subType",
    "itemName",
    "description",
    "quantity",
    "rate",
    "totalAmount",
    "ourCost",
    "itemDate",
    "approvedTime",
    "invoiceID",
    "itemApproverID",
    "accountID",
    "ticketID",
    "taskID",
    "projectID",
    "allocationCodeID",
    "roleID",
    "timeEntryID",
    "contractID",
    "webServiceDate",
    "nonBillable",
    "taxDollars",
    "purchaseOrderNumber",
    "extendedPrice",
    "expenseItemID",
    "contractCostID",
    "projectCostID",
    "ticketCostID",
    "lineItemID",
    "milestoneID",
    "serviceID",
    "serviceBundleID",
    "vendorID",
    "lineItemFullDescription",
    "lineItemGroupDescription",
    "installedProductID",
    "internalCurrencyExtendedPrice",
    "internalCurrencyRate",
    "internalCurrencyTaxDollars",
    "internalCurrencyTotalAmount",
    "businessDivisionSubdivisionID"
})
public class BillingItem
    extends Entity
{

    @XmlElement(name = "AccountManagerWhenApprovedID")
    protected Object accountManagerWhenApprovedID;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "SubType")
    protected Object subType;
    @XmlElement(name = "ItemName")
    protected Object itemName;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "Quantity")
    protected Object quantity;
    @XmlElement(name = "Rate")
    protected Object rate;
    @XmlElement(name = "TotalAmount")
    protected Object totalAmount;
    @XmlElement(name = "OurCost")
    protected Object ourCost;
    @XmlElement(name = "ItemDate")
    protected Object itemDate;
    @XmlElement(name = "ApprovedTime")
    protected Object approvedTime;
    @XmlElement(name = "InvoiceID")
    protected Object invoiceID;
    @XmlElement(name = "ItemApproverID")
    protected Object itemApproverID;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "TaskID")
    protected Object taskID;
    @XmlElement(name = "ProjectID")
    protected Object projectID;
    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "RoleID")
    protected Object roleID;
    @XmlElement(name = "TimeEntryID")
    protected Object timeEntryID;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "WebServiceDate")
    protected Object webServiceDate;
    @XmlElement(name = "NonBillable")
    protected Object nonBillable;
    @XmlElement(name = "TaxDollars")
    protected Object taxDollars;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "ExtendedPrice")
    protected Object extendedPrice;
    @XmlElement(name = "ExpenseItemID")
    protected Object expenseItemID;
    @XmlElement(name = "ContractCostID")
    protected Object contractCostID;
    @XmlElement(name = "ProjectCostID")
    protected Object projectCostID;
    @XmlElement(name = "TicketCostID")
    protected Object ticketCostID;
    @XmlElement(name = "LineItemID")
    protected Object lineItemID;
    @XmlElement(name = "MilestoneID")
    protected Object milestoneID;
    @XmlElement(name = "ServiceID")
    protected Object serviceID;
    @XmlElement(name = "ServiceBundleID")
    protected Object serviceBundleID;
    @XmlElement(name = "VendorID")
    protected Object vendorID;
    @XmlElement(name = "LineItemFullDescription")
    protected Object lineItemFullDescription;
    @XmlElement(name = "LineItemGroupDescription")
    protected Object lineItemGroupDescription;
    @XmlElement(name = "InstalledProductID")
    protected Object installedProductID;
    @XmlElement(name = "InternalCurrencyExtendedPrice")
    protected Object internalCurrencyExtendedPrice;
    @XmlElement(name = "InternalCurrencyRate")
    protected Object internalCurrencyRate;
    @XmlElement(name = "InternalCurrencyTaxDollars")
    protected Object internalCurrencyTaxDollars;
    @XmlElement(name = "InternalCurrencyTotalAmount")
    protected Object internalCurrencyTotalAmount;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;

    /**
     * Gets the value of the accountManagerWhenApprovedID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountManagerWhenApprovedID() {
        return accountManagerWhenApprovedID;
    }

    /**
     * Sets the value of the accountManagerWhenApprovedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountManagerWhenApprovedID(Object value) {
        this.accountManagerWhenApprovedID = value;
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
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubType(Object value) {
        this.subType = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemName(Object value) {
        this.itemName = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantity(Object value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRate(Object value) {
        this.rate = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalAmount(Object value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the ourCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOurCost() {
        return ourCost;
    }

    /**
     * Sets the value of the ourCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOurCost(Object value) {
        this.ourCost = value;
    }

    /**
     * Gets the value of the itemDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemDate() {
        return itemDate;
    }

    /**
     * Sets the value of the itemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemDate(Object value) {
        this.itemDate = value;
    }

    /**
     * Gets the value of the approvedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovedTime() {
        return approvedTime;
    }

    /**
     * Sets the value of the approvedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovedTime(Object value) {
        this.approvedTime = value;
    }

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceID(Object value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the itemApproverID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemApproverID() {
        return itemApproverID;
    }

    /**
     * Sets the value of the itemApproverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemApproverID(Object value) {
        this.itemApproverID = value;
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
     * Gets the value of the webServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWebServiceDate() {
        return webServiceDate;
    }

    /**
     * Sets the value of the webServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWebServiceDate(Object value) {
        this.webServiceDate = value;
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
     * Gets the value of the taxDollars property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxDollars() {
        return taxDollars;
    }

    /**
     * Sets the value of the taxDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxDollars(Object value) {
        this.taxDollars = value;
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
     * Gets the value of the extendedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtendedPrice() {
        return extendedPrice;
    }

    /**
     * Sets the value of the extendedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtendedPrice(Object value) {
        this.extendedPrice = value;
    }

    /**
     * Gets the value of the expenseItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseItemID() {
        return expenseItemID;
    }

    /**
     * Sets the value of the expenseItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseItemID(Object value) {
        this.expenseItemID = value;
    }

    /**
     * Gets the value of the contractCostID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractCostID() {
        return contractCostID;
    }

    /**
     * Sets the value of the contractCostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractCostID(Object value) {
        this.contractCostID = value;
    }

    /**
     * Gets the value of the projectCostID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectCostID() {
        return projectCostID;
    }

    /**
     * Sets the value of the projectCostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectCostID(Object value) {
        this.projectCostID = value;
    }

    /**
     * Gets the value of the ticketCostID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketCostID() {
        return ticketCostID;
    }

    /**
     * Sets the value of the ticketCostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketCostID(Object value) {
        this.ticketCostID = value;
    }

    /**
     * Gets the value of the lineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineItemID() {
        return lineItemID;
    }

    /**
     * Sets the value of the lineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineItemID(Object value) {
        this.lineItemID = value;
    }

    /**
     * Gets the value of the milestoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMilestoneID() {
        return milestoneID;
    }

    /**
     * Sets the value of the milestoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMilestoneID(Object value) {
        this.milestoneID = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceID(Object value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceBundleID() {
        return serviceBundleID;
    }

    /**
     * Sets the value of the serviceBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceBundleID(Object value) {
        this.serviceBundleID = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVendorID(Object value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the lineItemFullDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineItemFullDescription() {
        return lineItemFullDescription;
    }

    /**
     * Sets the value of the lineItemFullDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineItemFullDescription(Object value) {
        this.lineItemFullDescription = value;
    }

    /**
     * Gets the value of the lineItemGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineItemGroupDescription() {
        return lineItemGroupDescription;
    }

    /**
     * Sets the value of the lineItemGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineItemGroupDescription(Object value) {
        this.lineItemGroupDescription = value;
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
     * Gets the value of the internalCurrencyExtendedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyExtendedPrice() {
        return internalCurrencyExtendedPrice;
    }

    /**
     * Sets the value of the internalCurrencyExtendedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyExtendedPrice(Object value) {
        this.internalCurrencyExtendedPrice = value;
    }

    /**
     * Gets the value of the internalCurrencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyRate() {
        return internalCurrencyRate;
    }

    /**
     * Sets the value of the internalCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyRate(Object value) {
        this.internalCurrencyRate = value;
    }

    /**
     * Gets the value of the internalCurrencyTaxDollars property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyTaxDollars() {
        return internalCurrencyTaxDollars;
    }

    /**
     * Sets the value of the internalCurrencyTaxDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyTaxDollars(Object value) {
        this.internalCurrencyTaxDollars = value;
    }

    /**
     * Gets the value of the internalCurrencyTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyTotalAmount() {
        return internalCurrencyTotalAmount;
    }

    /**
     * Sets the value of the internalCurrencyTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyTotalAmount(Object value) {
        this.internalCurrencyTotalAmount = value;
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
