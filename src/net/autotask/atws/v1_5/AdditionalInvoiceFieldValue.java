
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInvoiceFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInvoiceFieldValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalInvoiceFieldID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceBatchID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FieldValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInvoiceFieldValue", propOrder = {
    "additionalInvoiceFieldID",
    "invoiceBatchID",
    "fieldValue"
})
public class AdditionalInvoiceFieldValue
    extends Entity
{

    @XmlElement(name = "AdditionalInvoiceFieldID")
    protected Object additionalInvoiceFieldID;
    @XmlElement(name = "InvoiceBatchID")
    protected Object invoiceBatchID;
    @XmlElement(name = "FieldValue")
    protected Object fieldValue;

    /**
     * Gets the value of the additionalInvoiceFieldID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalInvoiceFieldID() {
        return additionalInvoiceFieldID;
    }

    /**
     * Sets the value of the additionalInvoiceFieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalInvoiceFieldID(Object value) {
        this.additionalInvoiceFieldID = value;
    }

    /**
     * Gets the value of the invoiceBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceBatchID() {
        return invoiceBatchID;
    }

    /**
     * Sets the value of the invoiceBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceBatchID(Object value) {
        this.invoiceBatchID = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFieldValue(Object value) {
        this.fieldValue = value;
    }

}
