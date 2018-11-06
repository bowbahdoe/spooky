
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryItemSerialNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItemSerialNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryItemID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryItemSerialNumber", propOrder = {
    "inventoryItemID",
    "serialNumber"
})
public class InventoryItemSerialNumber
    extends Entity
{

    @XmlElement(name = "InventoryItemID")
    protected Object inventoryItemID;
    @XmlElement(name = "SerialNumber")
    protected Object serialNumber;

    /**
     * Gets the value of the inventoryItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInventoryItemID() {
        return inventoryItemID;
    }

    /**
     * Sets the value of the inventoryItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInventoryItemID(Object value) {
        this.inventoryItemID = value;
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
