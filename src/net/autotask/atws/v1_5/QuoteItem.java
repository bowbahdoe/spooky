
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CostID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HighestCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsTaxable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsOptional" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LaborID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LineDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MarkupRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PercentageDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCategoryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TotalEffectiveTax" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyUnitPrice" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyUnitDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyLineDiscount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem", propOrder = {
    "averageCost",
    "costID",
    "description",
    "expenseID",
    "highestCost",
    "isTaxable",
    "isOptional",
    "laborID",
    "lineDiscount",
    "markupRate",
    "name",
    "percentageDiscount",
    "periodType",
    "productID",
    "quantity",
    "quoteID",
    "serviceID",
    "serviceBundleID",
    "shippingID",
    "taxCategoryID",
    "totalEffectiveTax",
    "type",
    "unitCost",
    "unitDiscount",
    "unitPrice",
    "internalCurrencyUnitPrice",
    "internalCurrencyUnitDiscount",
    "internalCurrencyLineDiscount"
})
public class QuoteItem
    extends Entity
{

    @XmlElement(name = "AverageCost")
    protected Object averageCost;
    @XmlElement(name = "CostID")
    protected Object costID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "ExpenseID")
    protected Object expenseID;
    @XmlElement(name = "HighestCost")
    protected Object highestCost;
    @XmlElement(name = "IsTaxable")
    protected Object isTaxable;
    @XmlElement(name = "IsOptional")
    protected Object isOptional;
    @XmlElement(name = "LaborID")
    protected Object laborID;
    @XmlElement(name = "LineDiscount")
    protected Object lineDiscount;
    @XmlElement(name = "MarkupRate")
    protected Object markupRate;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "PercentageDiscount")
    protected Object percentageDiscount;
    @XmlElement(name = "PeriodType")
    protected Object periodType;
    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "Quantity")
    protected Object quantity;
    @XmlElement(name = "QuoteID")
    protected Object quoteID;
    @XmlElement(name = "ServiceID")
    protected Object serviceID;
    @XmlElement(name = "ServiceBundleID")
    protected Object serviceBundleID;
    @XmlElement(name = "ShippingID")
    protected Object shippingID;
    @XmlElement(name = "TaxCategoryID")
    protected Object taxCategoryID;
    @XmlElement(name = "TotalEffectiveTax")
    protected Object totalEffectiveTax;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "UnitCost")
    protected Object unitCost;
    @XmlElement(name = "UnitDiscount")
    protected Object unitDiscount;
    @XmlElement(name = "UnitPrice")
    protected Object unitPrice;
    @XmlElement(name = "InternalCurrencyUnitPrice")
    protected Object internalCurrencyUnitPrice;
    @XmlElement(name = "InternalCurrencyUnitDiscount")
    protected Object internalCurrencyUnitDiscount;
    @XmlElement(name = "InternalCurrencyLineDiscount")
    protected Object internalCurrencyLineDiscount;

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAverageCost(Object value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the costID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCostID() {
        return costID;
    }

    /**
     * Sets the value of the costID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCostID(Object value) {
        this.costID = value;
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
     * Gets the value of the expenseID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseID() {
        return expenseID;
    }

    /**
     * Sets the value of the expenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseID(Object value) {
        this.expenseID = value;
    }

    /**
     * Gets the value of the highestCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHighestCost() {
        return highestCost;
    }

    /**
     * Sets the value of the highestCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHighestCost(Object value) {
        this.highestCost = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsTaxable(Object value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the isOptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsOptional() {
        return isOptional;
    }

    /**
     * Sets the value of the isOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsOptional(Object value) {
        this.isOptional = value;
    }

    /**
     * Gets the value of the laborID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLaborID() {
        return laborID;
    }

    /**
     * Sets the value of the laborID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLaborID(Object value) {
        this.laborID = value;
    }

    /**
     * Gets the value of the lineDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLineDiscount() {
        return lineDiscount;
    }

    /**
     * Sets the value of the lineDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLineDiscount(Object value) {
        this.lineDiscount = value;
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
     * Gets the value of the shippingID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShippingID() {
        return shippingID;
    }

    /**
     * Sets the value of the shippingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShippingID(Object value) {
        this.shippingID = value;
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
     * Gets the value of the totalEffectiveTax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalEffectiveTax() {
        return totalEffectiveTax;
    }

    /**
     * Sets the value of the totalEffectiveTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalEffectiveTax(Object value) {
        this.totalEffectiveTax = value;
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
     * Gets the value of the internalCurrencyUnitDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyUnitDiscount() {
        return internalCurrencyUnitDiscount;
    }

    /**
     * Sets the value of the internalCurrencyUnitDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyUnitDiscount(Object value) {
        this.internalCurrencyUnitDiscount = value;
    }

    /**
     * Gets the value of the internalCurrencyLineDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyLineDiscount() {
        return internalCurrencyLineDiscount;
    }

    /**
     * Sets the value of the internalCurrencyLineDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyLineDiscount(Object value) {
        this.internalCurrencyLineDiscount = value;
    }

}
