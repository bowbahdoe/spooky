
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRetainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractRetainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DatePurchased" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OverrideHourlyRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AmountApproved" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyAmountApproved" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRetainer", propOrder = {
    "contractID",
    "status",
    "isPaid",
    "datePurchased",
    "startDate",
    "endDate",
    "amount",
    "invoiceNumber",
    "paymentNumber",
    "paymentID",
    "overrideHourlyRate",
    "amountApproved",
    "internalCurrencyAmount",
    "internalCurrencyAmountApproved"
})
public class ContractRetainer
    extends Entity
{

    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "IsPaid")
    protected Object isPaid;
    @XmlElement(name = "DatePurchased")
    protected Object datePurchased;
    @XmlElement(name = "StartDate")
    protected Object startDate;
    @XmlElement(name = "EndDate")
    protected Object endDate;
    @XmlElement(name = "Amount")
    protected Object amount;
    @XmlElement(name = "InvoiceNumber")
    protected Object invoiceNumber;
    @XmlElement(name = "PaymentNumber")
    protected Object paymentNumber;
    protected Object paymentID;
    @XmlElement(name = "OverrideHourlyRate")
    protected Object overrideHourlyRate;
    @XmlElement(name = "AmountApproved")
    protected Object amountApproved;
    @XmlElement(name = "InternalCurrencyAmount")
    protected Object internalCurrencyAmount;
    @XmlElement(name = "InternalCurrencyAmountApproved")
    protected Object internalCurrencyAmountApproved;

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractID(Object value) {
        this.contractID = value;
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
     * Gets the value of the isPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsPaid(Object value) {
        this.isPaid = value;
    }

    /**
     * Gets the value of the datePurchased property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatePurchased() {
        return datePurchased;
    }

    /**
     * Sets the value of the datePurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatePurchased(Object value) {
        this.datePurchased = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartDate(Object value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndDate(Object value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAmount(Object value) {
        this.amount = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceNumber(Object value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the paymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Sets the value of the paymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentNumber(Object value) {
        this.paymentNumber = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentID(Object value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the overrideHourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOverrideHourlyRate() {
        return overrideHourlyRate;
    }

    /**
     * Sets the value of the overrideHourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOverrideHourlyRate(Object value) {
        this.overrideHourlyRate = value;
    }

    /**
     * Gets the value of the amountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAmountApproved() {
        return amountApproved;
    }

    /**
     * Sets the value of the amountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAmountApproved(Object value) {
        this.amountApproved = value;
    }

    /**
     * Gets the value of the internalCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyAmount() {
        return internalCurrencyAmount;
    }

    /**
     * Sets the value of the internalCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyAmount(Object value) {
        this.internalCurrencyAmount = value;
    }

    /**
     * Gets the value of the internalCurrencyAmountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyAmountApproved() {
        return internalCurrencyAmountApproved;
    }

    /**
     * Sets the value of the internalCurrencyAmountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyAmountApproved(Object value) {
        this.internalCurrencyAmountApproved = value;
    }

}
