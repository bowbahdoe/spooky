
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryTransfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FromLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ToLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityTransferred" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TransferByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TransferDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UpdateNote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryTransfer", propOrder = {
    "productID",
    "fromLocationID",
    "toLocationID",
    "quantityTransferred",
    "transferByResourceID",
    "transferDate",
    "notes",
    "serialNumber",
    "updateNote"
})
public class InventoryTransfer
    extends Entity
{

    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "FromLocationID")
    protected Object fromLocationID;
    @XmlElement(name = "ToLocationID")
    protected Object toLocationID;
    @XmlElement(name = "QuantityTransferred")
    protected Object quantityTransferred;
    @XmlElement(name = "TransferByResourceID")
    protected Object transferByResourceID;
    @XmlElement(name = "TransferDate")
    protected Object transferDate;
    @XmlElement(name = "Notes")
    protected Object notes;
    @XmlElement(name = "SerialNumber")
    protected Object serialNumber;
    @XmlElement(name = "UpdateNote")
    protected Object updateNote;

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
     * Gets the value of the fromLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFromLocationID() {
        return fromLocationID;
    }

    /**
     * Sets the value of the fromLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFromLocationID(Object value) {
        this.fromLocationID = value;
    }

    /**
     * Gets the value of the toLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToLocationID() {
        return toLocationID;
    }

    /**
     * Sets the value of the toLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToLocationID(Object value) {
        this.toLocationID = value;
    }

    /**
     * Gets the value of the quantityTransferred property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityTransferred() {
        return quantityTransferred;
    }

    /**
     * Sets the value of the quantityTransferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityTransferred(Object value) {
        this.quantityTransferred = value;
    }

    /**
     * Gets the value of the transferByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTransferByResourceID() {
        return transferByResourceID;
    }

    /**
     * Sets the value of the transferByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTransferByResourceID(Object value) {
        this.transferByResourceID = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTransferDate(Object value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotes(Object value) {
        this.notes = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSerialNumber(Object value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the updateNote property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUpdateNote() {
        return updateNote;
    }

    /**
     * Sets the value of the updateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUpdateNote(Object value) {
        this.updateNote = value;
    }

}
