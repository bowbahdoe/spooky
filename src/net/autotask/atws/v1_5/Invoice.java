
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTotal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WebServiceDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsVoided" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VoidedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VoidedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegionName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceEditorTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "accountID",
    "creatorResourceID",
    "invoiceDateTime",
    "createDateTime",
    "invoiceNumber",
    "comments",
    "invoiceTotal",
    "totalTaxValue",
    "fromDate",
    "toDate",
    "orderNumber",
    "paymentTerm",
    "webServiceDate",
    "isVoided",
    "voidedDate",
    "voidedByResourceID",
    "paidDate",
    "taxGroup",
    "taxRegionName",
    "dueDate",
    "batchID",
    "invoiceEditorTemplateID"
})
public class Invoice
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "InvoiceDateTime")
    protected Object invoiceDateTime;
    @XmlElement(name = "CreateDateTime")
    protected Object createDateTime;
    @XmlElement(name = "InvoiceNumber")
    protected Object invoiceNumber;
    @XmlElement(name = "Comments")
    protected Object comments;
    @XmlElement(name = "InvoiceTotal")
    protected Object invoiceTotal;
    @XmlElement(name = "TotalTaxValue")
    protected Object totalTaxValue;
    @XmlElement(name = "FromDate")
    protected Object fromDate;
    @XmlElement(name = "ToDate")
    protected Object toDate;
    @XmlElement(name = "OrderNumber")
    protected Object orderNumber;
    @XmlElement(name = "PaymentTerm")
    protected Object paymentTerm;
    @XmlElement(name = "WebServiceDate")
    protected Object webServiceDate;
    @XmlElement(name = "IsVoided")
    protected Object isVoided;
    @XmlElement(name = "VoidedDate")
    protected Object voidedDate;
    @XmlElement(name = "VoidedByResourceID")
    protected Object voidedByResourceID;
    @XmlElement(name = "PaidDate")
    protected Object paidDate;
    @XmlElement(name = "TaxGroup")
    protected Object taxGroup;
    @XmlElement(name = "TaxRegionName")
    protected Object taxRegionName;
    @XmlElement(name = "DueDate")
    protected Object dueDate;
    @XmlElement(name = "BatchID")
    protected Object batchID;
    @XmlElement(name = "InvoiceEditorTemplateID")
    protected Object invoiceEditorTemplateID;

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
     * Gets the value of the invoiceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceDateTime() {
        return invoiceDateTime;
    }

    /**
     * Sets the value of the invoiceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceDateTime(Object value) {
        this.invoiceDateTime = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComments(Object value) {
        this.comments = value;
    }

    /**
     * Gets the value of the invoiceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * Sets the value of the invoiceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceTotal(Object value) {
        this.invoiceTotal = value;
    }

    /**
     * Gets the value of the totalTaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalTaxValue() {
        return totalTaxValue;
    }

    /**
     * Sets the value of the totalTaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalTaxValue(Object value) {
        this.totalTaxValue = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFromDate(Object value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToDate(Object value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrderNumber(Object value) {
        this.orderNumber = value;
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
     * Gets the value of the webServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWebServiceDate() {
        return webServiceDate;
    }

    /**
     * Sets the value of the webServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWebServiceDate(Object value) {
        this.webServiceDate = value;
    }

    /**
     * Gets the value of the isVoided property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsVoided() {
        return isVoided;
    }

    /**
     * Sets the value of the isVoided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsVoided(Object value) {
        this.isVoided = value;
    }

    /**
     * Gets the value of the voidedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVoidedDate() {
        return voidedDate;
    }

    /**
     * Sets the value of the voidedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVoidedDate(Object value) {
        this.voidedDate = value;
    }

    /**
     * Gets the value of the voidedByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVoidedByResourceID() {
        return voidedByResourceID;
    }

    /**
     * Sets the value of the voidedByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVoidedByResourceID(Object value) {
        this.voidedByResourceID = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaidDate(Object value) {
        this.paidDate = value;
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
     * Gets the value of the taxRegionName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxRegionName() {
        return taxRegionName;
    }

    /**
     * Sets the value of the taxRegionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxRegionName(Object value) {
        this.taxRegionName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDueDate(Object value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBatchID(Object value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the invoiceEditorTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceEditorTemplateID() {
        return invoiceEditorTemplateID;
    }

    /**
     * Sets the value of the invoiceEditorTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceEditorTemplateID(Object value) {
        this.invoiceEditorTemplateID = value;
    }

}
