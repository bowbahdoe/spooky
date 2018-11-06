
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBundle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PercentageDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UpdateResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="old_selected_service_sum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundle", propOrder = {
    "allocationCodeID",
    "createDate",
    "creatorResourceID",
    "description",
    "invoiceDescription",
    "isActive",
    "lastModifiedDate",
    "name",
    "percentageDiscount",
    "periodType",
    "serviceLevelAgreementID",
    "unitCost",
    "unitDiscount",
    "unitPrice",
    "updateResourceID",
    "oldSelectedServiceSum"
})
public class ServiceBundle
    extends Entity
{

    @XmlElement(name = "AllocationCodeID")
    protected Object allocationCodeID;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "InvoiceDescription")
    protected Object invoiceDescription;
    @XmlElement(name = "IsActive")
    protected Object isActive;
    @XmlElement(name = "LastModifiedDate")
    protected Object lastModifiedDate;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "PercentageDiscount")
    protected Object percentageDiscount;
    @XmlElement(name = "PeriodType")
    protected Object periodType;
    @XmlElement(name = "ServiceLevelAgreementID")
    protected Object serviceLevelAgreementID;
    @XmlElement(name = "UnitCost")
    protected Object unitCost;
    @XmlElement(name = "UnitDiscount")
    protected Object unitDiscount;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;
    @XmlElement(name = "UpdateResourceID")
    protected Object updateResourceID;
    @XmlElement(name = "old_selected_service_sum")
    protected Object oldSelectedServiceSum;

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
     * Gets the value of the invoiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceDescription() {
        return invoiceDescription;
    }

    /**
     * Sets the value of the invoiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceDescription(Object value) {
        this.invoiceDescription = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsActive(Object value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedDate(Object value) {
        this.lastModifiedDate = value;
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
     * Gets the value of the percentageDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPercentageDiscount() {
        return percentageDiscount;
    }

    /**
     * Sets the value of the percentageDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPercentageDiscount(Object value) {
        this.percentageDiscount = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPeriodType(Object value) {
        this.periodType = value;
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
     * Gets the value of the unitDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitDiscount() {
        return unitDiscount;
    }

    /**
     * Sets the value of the unitDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitDiscount(Object value) {
        this.unitDiscount = value;
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
     * Gets the value of the updateResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUpdateResourceID() {
        return updateResourceID;
    }

    /**
     * Sets the value of the updateResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUpdateResourceID(Object value) {
        this.updateResourceID = value;
    }

    /**
     * Gets the value of the oldSelectedServiceSum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOldSelectedServiceSum() {
        return oldSelectedServiceSum;
    }

    /**
     * Sets the value of the oldSelectedServiceSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOldSelectedServiceSum(Object value) {
        this.oldSelectedServiceSum = value;
    }

}
