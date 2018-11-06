
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseApproval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RejectNote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseApproval", propOrder = {
    "costType",
    "isApproved",
    "rejectNote"
})
public class PurchaseApproval
    extends Entity
{

    @XmlElement(name = "CostType")
    protected Object costType;
    @XmlElement(name = "IsApproved")
    protected Object isApproved;
    @XmlElement(name = "RejectNote")
    protected Object rejectNote;

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
     * Gets the value of the isApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsApproved(Object value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the rejectNote property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRejectNote() {
        return rejectNote;
    }

    /**
     * Sets the value of the rejectNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRejectNote(Object value) {
        this.rejectNote = value;
    }

}
