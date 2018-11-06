
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MarkupRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MSRP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultVendorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VendorProductNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturerProductName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductAllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Serialized" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CostAllocationCodeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DoesNotRequireProcurement" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "name",
    "description",
    "sku",
    "link",
    "productCategory",
    "externalProductID",
    "unitCost",
    "markupRate",
    "unitPrice",
    "msrp",
    "defaultVendorID",
    "vendorProductNumber",
    "manufacturerName",
    "manufacturerProductName",
    "active",
    "periodType",
    "productAllocationCodeID",
    "serialized",
    "costAllocationCodeID",
    "doesNotRequireProcurement",
    "internalProductID"
})
public class Product
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "SKU")
    protected Object sku;
    @XmlElement(name = "Link")
    protected Object link;
    @XmlElement(name = "ProductCategory")
    protected Object productCategory;
    @XmlElement(name = "ExternalProductID")
    protected Object externalProductID;
    @XmlElement(name = "UnitCost")
    protected Object unitCost;
    @XmlElement(name = "MarkupRate")
    protected Object markupRate;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;
    @XmlElement(name = "MSRP")
    protected Object msrp;
    @XmlElement(name = "DefaultVendorID")
    protected Object defaultVendorID;
    @XmlElement(name = "VendorProductNumber")
    protected Object vendorProductNumber;
    @XmlElement(name = "ManufacturerName")
    protected Object manufacturerName;
    @XmlElement(name = "ManufacturerProductName")
    protected Object manufacturerProductName;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "PeriodType")
    protected Object periodType;
    @XmlElement(name = "ProductAllocationCodeID")
    protected Object productAllocationCodeID;
    @XmlElement(name = "Serialized")
    protected Object serialized;
    @XmlElement(name = "CostAllocationCodeID")
    protected Object costAllocationCodeID;
    @XmlElement(name = "DoesNotRequireProcurement")
    protected Object doesNotRequireProcurement;
    @XmlElement(name = "InternalProductID")
    protected Object internalProductID;

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
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSKU(Object value) {
        this.sku = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLink(Object value) {
        this.link = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductCategory(Object value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalProductID(Object value) {
        this.externalProductID = value;
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
     * Gets the value of the msrp property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMSRP() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMSRP(Object value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the defaultVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultVendorID() {
        return defaultVendorID;
    }

    /**
     * Sets the value of the defaultVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultVendorID(Object value) {
        this.defaultVendorID = value;
    }

    /**
     * Gets the value of the vendorProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVendorProductNumber() {
        return vendorProductNumber;
    }

    /**
     * Sets the value of the vendorProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVendorProductNumber(Object value) {
        this.vendorProductNumber = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufacturerName(Object value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the manufacturerProductName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufacturerProductName() {
        return manufacturerProductName;
    }

    /**
     * Sets the value of the manufacturerProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufacturerProductName(Object value) {
        this.manufacturerProductName = value;
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
     * Gets the value of the productAllocationCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductAllocationCodeID() {
        return productAllocationCodeID;
    }

    /**
     * Sets the value of the productAllocationCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductAllocationCodeID(Object value) {
        this.productAllocationCodeID = value;
    }

    /**
     * Gets the value of the serialized property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSerialized() {
        return serialized;
    }

    /**
     * Sets the value of the serialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSerialized(Object value) {
        this.serialized = value;
    }

    /**
     * Gets the value of the costAllocationCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCostAllocationCodeID() {
        return costAllocationCodeID;
    }

    /**
     * Sets the value of the costAllocationCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCostAllocationCodeID(Object value) {
        this.costAllocationCodeID = value;
    }

    /**
     * Gets the value of the doesNotRequireProcurement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDoesNotRequireProcurement() {
        return doesNotRequireProcurement;
    }

    /**
     * Sets the value of the doesNotRequireProcurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDoesNotRequireProcurement(Object value) {
        this.doesNotRequireProcurement = value;
    }

    /**
     * Gets the value of the internalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalProductID() {
        return internalProductID;
    }

    /**
     * Sets the value of the internalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalProductID(Object value) {
        this.internalProductID = value;
    }

}
