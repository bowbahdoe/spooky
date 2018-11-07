
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneralLedgerCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UseType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AllocationCodeType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCategoryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MarkupRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsExcludedFromNewContracts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationCode", propOrder = {
    "generalLedgerCode",
    "department",
    "name",
    "type",
    "useType",
    "description",
    "active",
    "unitCost",
    "unitPrice",
    "allocationCodeType",
    "taxable",
    "externalNumber",
    "taxCategoryID",
    "markupRate",
    "isExcludedFromNewContracts"
})
public class AllocationCode
    extends Entity
{

    @XmlElement(name = "GeneralLedgerCode")
    protected Object generalLedgerCode;
    @XmlElement(name = "Department")
    protected Object department;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "UseType")
    protected Object useType;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "UnitCost")
    protected Object unitCost;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;
    @XmlElement(name = "AllocationCodeType")
    protected Object allocationCodeType;
    @XmlElement(name = "Taxable")
    protected Object taxable;
    @XmlElement(name = "ExternalNumber")
    protected Object externalNumber;
    @XmlElement(name = "TaxCategoryID")
    protected Object taxCategoryID;
    @XmlElement(name = "MarkupRate")
    protected Object markupRate;
    @XmlElement(name = "IsExcludedFromNewContracts")
    protected Object isExcludedFromNewContracts;

    /**
     * Gets the value of the generalLedgerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGeneralLedgerCode() {
        return generalLedgerCode;
    }

    /**
     * Sets the value of the generalLedgerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGeneralLedgerCode(Object value) {
        this.generalLedgerCode = value;
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
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUseType(Object value) {
        this.useType = value;
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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActive(Object value) {
        this.active = value;
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
     * Gets the value of the allocationCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllocationCodeType() {
        return allocationCodeType;
    }

    /**
     * Sets the value of the allocationCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllocationCodeType(Object value) {
        this.allocationCodeType = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxable(Object value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the externalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalNumber() {
        return externalNumber;
    }

    /**
     * Sets the value of the externalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalNumber(Object value) {
        this.externalNumber = value;
    }

    /**
     * Gets the value of the taxCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxCategoryID() {
        return taxCategoryID;
    }

    /**
     * Sets the value of the taxCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxCategoryID(Object value) {
        this.taxCategoryID = value;
    }

    /**
     * Gets the value of the markupRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMarkupRate() {
        return markupRate;
    }

    /**
     * Sets the value of the markupRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMarkupRate(Object value) {
        this.markupRate = value;
    }

    /**
     * Gets the value of the isExcludedFromNewContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsExcludedFromNewContracts() {
        return isExcludedFromNewContracts;
    }

    /**
     * Sets the value of the isExcludedFromNewContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsExcludedFromNewContracts(Object value) {
        this.isExcludedFromNewContracts = value;
    }

}
