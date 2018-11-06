
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillableAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillableToAccount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Billed" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CostType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DatePurchased" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalPurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StatusLastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StatusLastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitQuantity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyBillableAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyUnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractCost", propOrder = {
    "allocationCodeID",
    "billableAmount",
    "billableToAccount",
    "billed",
    "costType",
    "createDate",
    "creatorResourceID",
    "datePurchased",
    "description",
    "extendedCost",
    "internalPurchaseOrderNumber",
    "productID",
    "purchaseOrderNumber",
    "name",
    "contractServiceID",
    "contractServiceBundleID",
    "status",
    "statusLastModifiedBy",
    "statusLastModifiedDate",
    "unitCost",
    "unitPrice",
    "unitQuantity",
    "internalCurrencyBillableAmount",
    "internalCurrencyUnitPrice",
    "businessDivisionSubdivisionID",
    "contractID"
})
public class ContractCost
    extends Entity
{

    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "BillableAmount")
    protected Object billableAmount;
    @XmlElement(name = "BillableToAccount")
    protected Object billableToAccount;
    @XmlElement(name = "Billed")
    protected Object billed;
    @XmlElement(name = "CostType")
    protected Object costType;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "DatePurchased")
    protected Object datePurchased;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "ExtendedCost")
    protected Object extendedCost;
    @XmlElement(name = "InternalPurchaseOrderNumber")
    protected Object internalPurchaseOrderNumber;
    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "ContractServiceID")
    protected Object contractServiceID;
    @XmlElement(name = "ContractServiceBundleID")
    protected Object contractServiceBundleID;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "StatusLastModifiedBy")
    protected Object statusLastModifiedBy;
    @XmlElement(name = "StatusLastModifiedDate")
    protected Object statusLastModifiedDate;
    @XmlElement(name = "UnitCost")
    protected Object unitCost;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;
    @XmlElement(name = "UnitQuantity")
    protected Object unitQuantity;
    @XmlElement(name = "InternalCurrencyBillableAmount")
    protected Object internalCurrencyBillableAmount;
    @XmlElement(name = "InternalCurrencyUnitPrice")
    protected Object internalCurrencyUnitPrice;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;
    @XmlElement(name = "ContractID")
    protected Object contractID;

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
     * Gets the value of the billableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillableAmount() {
        return billableAmount;
    }

    /**
     * Sets the value of the billableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillableAmount(Object value) {
        this.billableAmount = value;
    }

    /**
     * Gets the value of the billableToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillableToAccount() {
        return billableToAccount;
    }

    /**
     * Sets the value of the billableToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillableToAccount(Object value) {
        this.billableToAccount = value;
    }

    /**
     * Gets the value of the billed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBilled() {
        return billed;
    }

    /**
     * Sets the value of the billed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBilled(Object value) {
        this.billed = value;
    }

    /**
     * Gets the value of the costType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCostType() {
        return costType;
    }

    /**
     * Sets the value of the costType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCostType(Object value) {
        this.costType = value;
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
     * Gets the value of the datePurchased property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatePurchased() {
        return datePurchased;
    }

    /**
     * Sets the value of the datePurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatePurchased(Object value) {
        this.datePurchased = value;
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
     * Gets the value of the extendedCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtendedCost() {
        return extendedCost;
    }

    /**
     * Sets the value of the extendedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtendedCost(Object value) {
        this.extendedCost = value;
    }

    /**
     * Gets the value of the internalPurchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalPurchaseOrderNumber() {
        return internalPurchaseOrderNumber;
    }

    /**
     * Sets the value of the internalPurchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalPurchaseOrderNumber(Object value) {
        this.internalPurchaseOrderNumber = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductID(Object value) {
        this.productID = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
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
     * Gets the value of the statusLastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatusLastModifiedBy() {
        return statusLastModifiedBy;
    }

    /**
     * Sets the value of the statusLastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatusLastModifiedBy(Object value) {
        this.statusLastModifiedBy = value;
    }

    /**
     * Gets the value of the statusLastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatusLastModifiedDate() {
        return statusLastModifiedDate;
    }

    /**
     * Sets the value of the statusLastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatusLastModifiedDate(Object value) {
        this.statusLastModifiedDate = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitCost(Object value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitPrice(Object value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * Sets the value of the unitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitQuantity(Object value) {
        this.unitQuantity = value;
    }

    /**
     * Gets the value of the internalCurrencyBillableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyBillableAmount() {
        return internalCurrencyBillableAmount;
    }

    /**
     * Sets the value of the internalCurrencyBillableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyBillableAmount(Object value) {
        this.internalCurrencyBillableAmount = value;
    }

    /**
     * Gets the value of the internalCurrencyUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyUnitPrice() {
        return internalCurrencyUnitPrice;
    }

    /**
     * Sets the value of the internalCurrencyUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyUnitPrice(Object value) {
        this.internalCurrencyUnitPrice = value;
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

}
