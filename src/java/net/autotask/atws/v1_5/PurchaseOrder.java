
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubmitDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CancelDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralMemo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VendorInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalPONumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseForAccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Freight" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowTaxCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowEachTaxInGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LatestEstimatedArrivalDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UseItemDescriptionsFrom" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrder", propOrder = {
    "vendorID",
    "status",
    "creatorResourceID",
    "createDateTime",
    "submitDateTime",
    "cancelDateTime",
    "shipToName",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToPostalCode",
    "generalMemo",
    "phone",
    "fax",
    "vendorInvoiceNumber",
    "externalPONumber",
    "purchaseForAccountID",
    "shippingType",
    "shippingDate",
    "freight",
    "taxGroup",
    "paymentTerm",
    "showTaxCategory",
    "showEachTaxInGroup",
    "latestEstimatedArrivalDate",
    "useItemDescriptionsFrom"
})
public class PurchaseOrder
    extends Entity
{

    @XmlElement(name = "VendorID")
    protected Object vendorID;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "CreateDateTime")
    protected Object createDateTime;
    @XmlElement(name = "SubmitDateTime")
    protected Object submitDateTime;
    @XmlElement(name = "CancelDateTime")
    protected Object cancelDateTime;
    @XmlElement(name = "ShipToName")
    protected Object shipToName;
    @XmlElement(name = "ShipToAddress1")
    protected Object shipToAddress1;
    @XmlElement(name = "ShipToAddress2")
    protected Object shipToAddress2;
    @XmlElement(name = "ShipToCity")
    protected Object shipToCity;
    @XmlElement(name = "ShipToState")
    protected Object shipToState;
    @XmlElement(name = "ShipToPostalCode")
    protected Object shipToPostalCode;
    @XmlElement(name = "GeneralMemo")
    protected Object generalMemo;
    @XmlElement(name = "Phone")
    protected Object phone;
    @XmlElement(name = "Fax")
    protected Object fax;
    @XmlElement(name = "VendorInvoiceNumber")
    protected Object vendorInvoiceNumber;
    @XmlElement(name = "ExternalPONumber")
    protected Object externalPONumber;
    @XmlElement(name = "PurchaseForAccountID")
    protected Object purchaseForAccountID;
    @XmlElement(name = "ShippingType")
    protected Object shippingType;
    @XmlElement(name = "ShippingDate")
    protected Object shippingDate;
    @XmlElement(name = "Freight")
    protected Object freight;
    @XmlElement(name = "TaxGroup")
    protected Object taxGroup;
    @XmlElement(name = "PaymentTerm")
    protected Object paymentTerm;
    @XmlElement(name = "ShowTaxCategory")
    protected Object showTaxCategory;
    @XmlElement(name = "ShowEachTaxInGroup")
    protected Object showEachTaxInGroup;
    @XmlElement(name = "LatestEstimatedArrivalDate")
    protected Object latestEstimatedArrivalDate;
    @XmlElement(name = "UseItemDescriptionsFrom")
    protected Object useItemDescriptionsFrom;

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVendorID(Object value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatus(Object value) {
        this.status = value;
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
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDateTime(Object value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the submitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubmitDateTime() {
        return submitDateTime;
    }

    /**
     * Sets the value of the submitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubmitDateTime(Object value) {
        this.submitDateTime = value;
    }

    /**
     * Gets the value of the cancelDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCancelDateTime() {
        return cancelDateTime;
    }

    /**
     * Sets the value of the cancelDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCancelDateTime(Object value) {
        this.cancelDateTime = value;
    }

    /**
     * Gets the value of the shipToName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToName() {
        return shipToName;
    }

    /**
     * Sets the value of the shipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToName(Object value) {
        this.shipToName = value;
    }

    /**
     * Gets the value of the shipToAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Sets the value of the shipToAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToAddress1(Object value) {
        this.shipToAddress1 = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToAddress2(Object value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToCity(Object value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToState(Object value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Sets the value of the shipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToPostalCode(Object value) {
        this.shipToPostalCode = value;
    }

    /**
     * Gets the value of the generalMemo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGeneralMemo() {
        return generalMemo;
    }

    /**
     * Sets the value of the generalMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGeneralMemo(Object value) {
        this.generalMemo = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPhone(Object value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFax(Object value) {
        this.fax = value;
    }

    /**
     * Gets the value of the vendorInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }

    /**
     * Sets the value of the vendorInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVendorInvoiceNumber(Object value) {
        this.vendorInvoiceNumber = value;
    }

    /**
     * Gets the value of the externalPONumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalPONumber() {
        return externalPONumber;
    }

    /**
     * Sets the value of the externalPONumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalPONumber(Object value) {
        this.externalPONumber = value;
    }

    /**
     * Gets the value of the purchaseForAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPurchaseForAccountID() {
        return purchaseForAccountID;
    }

    /**
     * Sets the value of the purchaseForAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPurchaseForAccountID(Object value) {
        this.purchaseForAccountID = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShippingType(Object value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the shippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets the value of the shippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShippingDate(Object value) {
        this.shippingDate = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFreight(Object value) {
        this.freight = value;
    }

    /**
     * Gets the value of the taxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxGroup(Object value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentTerm(Object value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the showTaxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShowTaxCategory() {
        return showTaxCategory;
    }

    /**
     * Sets the value of the showTaxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShowTaxCategory(Object value) {
        this.showTaxCategory = value;
    }

    /**
     * Gets the value of the showEachTaxInGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShowEachTaxInGroup() {
        return showEachTaxInGroup;
    }

    /**
     * Sets the value of the showEachTaxInGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShowEachTaxInGroup(Object value) {
        this.showEachTaxInGroup = value;
    }

    /**
     * Gets the value of the latestEstimatedArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLatestEstimatedArrivalDate() {
        return latestEstimatedArrivalDate;
    }

    /**
     * Sets the value of the latestEstimatedArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLatestEstimatedArrivalDate(Object value) {
        this.latestEstimatedArrivalDate = value;
    }

    /**
     * Gets the value of the useItemDescriptionsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUseItemDescriptionsFrom() {
        return useItemDescriptionsFrom;
    }

    /**
     * Sets the value of the useItemDescriptionsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUseItemDescriptionsFrom(Object value) {
        this.useItemDescriptionsFrom = value;
    }

}
