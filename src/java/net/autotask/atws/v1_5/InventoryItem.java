
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOnHand" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityMinimum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityMaximum" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Bin" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OnOrder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BackOrder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Picked" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryItem", propOrder = {
    "productID",
    "inventoryLocationID",
    "quantityOnHand",
    "quantityMinimum",
    "quantityMaximum",
    "referenceNumber",
    "bin",
    "onOrder",
    "backOrder",
    "reserved",
    "picked"
})
public class InventoryItem
    extends Entity
{

    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "InventoryLocationID")
    protected Object inventoryLocationID;
    @XmlElement(name = "QuantityOnHand")
    protected Object quantityOnHand;
    @XmlElement(name = "QuantityMinimum")
    protected Object quantityMinimum;
    @XmlElement(name = "QuantityMaximum")
    protected Object quantityMaximum;
    @XmlElement(name = "ReferenceNumber")
    protected Object referenceNumber;
    @XmlElement(name = "Bin")
    protected Object bin;
    @XmlElement(name = "OnOrder")
    protected Object onOrder;
    @XmlElement(name = "BackOrder")
    protected Object backOrder;
    @XmlElement(name = "Reserved")
    protected Object reserved;
    @XmlElement(name = "Picked")
    protected Object picked;

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
     * Gets the value of the inventoryLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInventoryLocationID() {
        return inventoryLocationID;
    }

    /**
     * Sets the value of the inventoryLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInventoryLocationID(Object value) {
        this.inventoryLocationID = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityOnHand(Object value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the quantityMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityMinimum() {
        return quantityMinimum;
    }

    /**
     * Sets the value of the quantityMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityMinimum(Object value) {
        this.quantityMinimum = value;
    }

    /**
     * Gets the value of the quantityMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityMaximum() {
        return quantityMaximum;
    }

    /**
     * Sets the value of the quantityMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityMaximum(Object value) {
        this.quantityMaximum = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReferenceNumber(Object value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBin() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBin(Object value) {
        this.bin = value;
    }

    /**
     * Gets the value of the onOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOnOrder() {
        return onOrder;
    }

    /**
     * Sets the value of the onOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOnOrder(Object value) {
        this.onOrder = value;
    }

    /**
     * Gets the value of the backOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBackOrder() {
        return backOrder;
    }

    /**
     * Sets the value of the backOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBackOrder(Object value) {
        this.backOrder = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReserved(Object value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the picked property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPicked() {
        return picked;
    }

    /**
     * Sets the value of the picked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPicked(Object value) {
        this.picked = value;
    }

}
