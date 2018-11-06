
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderReceive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderReceive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchaseOrderItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityPreviouslyReceived" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityNowReceiving" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderReceive", propOrder = {
    "purchaseOrderItemID",
    "quantityPreviouslyReceived",
    "quantityNowReceiving",
    "receiveDate",
    "quantityBackOrdered",
    "receivedByResourceID",
    "serialNumber"
})
public class PurchaseOrderReceive
    extends Entity
{

    @XmlElement(name = "PurchaseOrderItemID")
    protected Object purchaseOrderItemID;
    @XmlElement(name = "QuantityPreviouslyReceived")
    protected Object quantityPreviouslyReceived;
    @XmlElement(name = "QuantityNowReceiving")
    protected Object quantityNowReceiving;
    @XmlElement(name = "ReceiveDate")
    protected Object receiveDate;
    @XmlElement(name = "QuantityBackOrdered")
    protected Object quantityBackOrdered;
    @XmlElement(name = "ReceivedByResourceID")
    protected Object receivedByResourceID;
    @XmlElement(name = "SerialNumber")
    protected Object serialNumber;

    /**
     * Gets the value of the purchaseOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPurchaseOrderItemID() {
        return purchaseOrderItemID;
    }

    /**
     * Sets the value of the purchaseOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPurchaseOrderItemID(Object value) {
        this.purchaseOrderItemID = value;
    }

    /**
     * Gets the value of the quantityPreviouslyReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityPreviouslyReceived() {
        return quantityPreviouslyReceived;
    }

    /**
     * Sets the value of the quantityPreviouslyReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityPreviouslyReceived(Object value) {
        this.quantityPreviouslyReceived = value;
    }

    /**
     * Gets the value of the quantityNowReceiving property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityNowReceiving() {
        return quantityNowReceiving;
    }

    /**
     * Sets the value of the quantityNowReceiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityNowReceiving(Object value) {
        this.quantityNowReceiving = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReceiveDate(Object value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuantityBackOrdered(Object value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the receivedByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReceivedByResourceID() {
        return receivedByResourceID;
    }

    /**
     * Sets the value of the receivedByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReceivedByResourceID(Object value) {
        this.receivedByResourceID = value;
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

}
