
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PromisedDueDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddress1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddress2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalBillToAddressInformation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalShipToAddressInformation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToCountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrder", propOrder = {
    "accountID",
    "title",
    "status",
    "contact",
    "ownerResourceID",
    "salesOrderDate",
    "promisedDueDate",
    "billToAddress1",
    "billToAddress2",
    "billToCity",
    "billToState",
    "billToPostalCode",
    "billToCountry",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToPostalCode",
    "shipToCountry",
    "opportunityID",
    "additionalBillToAddressInformation",
    "additionalShipToAddressInformation",
    "shipToCountryID",
    "billToCountryID",
    "businessDivisionSubdivisionID"
})
public class SalesOrder
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "Contact")
    protected Object contact;
    @XmlElement(name = "OwnerResourceID")
    protected Object ownerResourceID;
    @XmlElement(name = "SalesOrderDate")
    protected Object salesOrderDate;
    @XmlElement(name = "PromisedDueDate")
    protected Object promisedDueDate;
    @XmlElement(name = "BillToAddress1")
    protected Object billToAddress1;
    @XmlElement(name = "BillToAddress2")
    protected Object billToAddress2;
    @XmlElement(name = "BillToCity")
    protected Object billToCity;
    @XmlElement(name = "BillToState")
    protected Object billToState;
    @XmlElement(name = "BillToPostalCode")
    protected Object billToPostalCode;
    @XmlElement(name = "BillToCountry")
    protected Object billToCountry;
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
    @XmlElement(name = "ShipToCountry")
    protected Object shipToCountry;
    @XmlElement(name = "OpportunityID")
    protected Object opportunityID;
    @XmlElement(name = "AdditionalBillToAddressInformation")
    protected Object additionalBillToAddressInformation;
    @XmlElement(name = "AdditionalShipToAddressInformation")
    protected Object additionalShipToAddressInformation;
    @XmlElement(name = "ShipToCountryID")
    protected Object shipToCountryID;
    @XmlElement(name = "BillToCountryID")
    protected Object billToCountryID;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountID(Object value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTitle(Object value) {
        this.title = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContact(Object value) {
        this.contact = value;
    }

    /**
     * Gets the value of the ownerResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerResourceID() {
        return ownerResourceID;
    }

    /**
     * Sets the value of the ownerResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerResourceID(Object value) {
        this.ownerResourceID = value;
    }

    /**
     * Gets the value of the salesOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSalesOrderDate() {
        return salesOrderDate;
    }

    /**
     * Sets the value of the salesOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSalesOrderDate(Object value) {
        this.salesOrderDate = value;
    }

    /**
     * Gets the value of the promisedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPromisedDueDate() {
        return promisedDueDate;
    }

    /**
     * Sets the value of the promisedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPromisedDueDate(Object value) {
        this.promisedDueDate = value;
    }

    /**
     * Gets the value of the billToAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAddress1() {
        return billToAddress1;
    }

    /**
     * Sets the value of the billToAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAddress1(Object value) {
        this.billToAddress1 = value;
    }

    /**
     * Gets the value of the billToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAddress2() {
        return billToAddress2;
    }

    /**
     * Sets the value of the billToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAddress2(Object value) {
        this.billToAddress2 = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToCity(Object value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToState(Object value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToPostalCode() {
        return billToPostalCode;
    }

    /**
     * Sets the value of the billToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToPostalCode(Object value) {
        this.billToPostalCode = value;
    }

    /**
     * Gets the value of the billToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToCountry() {
        return billToCountry;
    }

    /**
     * Sets the value of the billToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToCountry(Object value) {
        this.billToCountry = value;
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
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToCountry(Object value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpportunityID(Object value) {
        this.opportunityID = value;
    }

    /**
     * Gets the value of the additionalBillToAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalBillToAddressInformation() {
        return additionalBillToAddressInformation;
    }

    /**
     * Sets the value of the additionalBillToAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalBillToAddressInformation(Object value) {
        this.additionalBillToAddressInformation = value;
    }

    /**
     * Gets the value of the additionalShipToAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalShipToAddressInformation() {
        return additionalShipToAddressInformation;
    }

    /**
     * Sets the value of the additionalShipToAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalShipToAddressInformation(Object value) {
        this.additionalShipToAddressInformation = value;
    }

    /**
     * Gets the value of the shipToCountryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToCountryID() {
        return shipToCountryID;
    }

    /**
     * Sets the value of the shipToCountryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToCountryID(Object value) {
        this.shipToCountryID = value;
    }

    /**
     * Gets the value of the billToCountryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToCountryID() {
        return billToCountryID;
    }

    /**
     * Sets the value of the billToCountryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToCountryID(Object value) {
        this.billToCountryID = value;
    }

    /**
     * Gets the value of the businessDivisionSubdivisionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBusinessDivisionSubdivisionID() {
        return businessDivisionSubdivisionID;
    }

    /**
     * Sets the value of the businessDivisionSubdivisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBusinessDivisionSubdivisionID(Object value) {
        this.businessDivisionSubdivisionID = value;
    }

}
