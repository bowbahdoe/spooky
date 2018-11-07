
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Submit" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubmitDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubmitterID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApproverID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WeekEnding" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseTotal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CashAdvanceAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RejectionReason" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AmountDue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuickBooksReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementCurrencyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementCurrencyCashAdvanceAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementCurrencyAmountDue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "ExpenseReport", propOrder = {
    "name",
    "status",
    "submit",
    "submitDate",
    "submitterID",
    "approverID",
    "weekEnding",
    "expenseTotal",
    "cashAdvanceAmount",
    "rejectionReason",
    "amountDue",
    "departmentNumber",
    "quickBooksReferenceNumber",
    "approvedDate",
    "reimbursementCurrencyID",
    "reimbursementCurrencyCashAdvanceAmount",
    "reimbursementCurrencyAmountDue",
    "businessDivisionSubdivisionID"
})
public class ExpenseReport
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "Submit")
    protected Object submit;
    @XmlElement(name = "SubmitDate")
    protected Object submitDate;
    @XmlElement(name = "SubmitterID")
    protected Object submitterID;
    @XmlElement(name = "ApproverID")
    protected Object approverID;
    @XmlElement(name = "WeekEnding")
    protected Object weekEnding;
    @XmlElement(name = "ExpenseTotal")
    protected Object expenseTotal;
    @XmlElement(name = "CashAdvanceAmount")
    protected Object cashAdvanceAmount;
    @XmlElement(name = "RejectionReason")
    protected Object rejectionReason;
    @XmlElement(name = "AmountDue")
    protected Object amountDue;
    @XmlElement(name = "DepartmentNumber")
    protected Object departmentNumber;
    @XmlElement(name = "QuickBooksReferenceNumber")
    protected Object quickBooksReferenceNumber;
    @XmlElement(name = "ApprovedDate")
    protected Object approvedDate;
    @XmlElement(name = "ReimbursementCurrencyID")
    protected Object reimbursementCurrencyID;
    @XmlElement(name = "ReimbursementCurrencyCashAdvanceAmount")
    protected Object reimbursementCurrencyCashAdvanceAmount;
    @XmlElement(name = "ReimbursementCurrencyAmountDue")
    protected Object reimbursementCurrencyAmountDue;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
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
     * Gets the value of the submit property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubmit() {
        return submit;
    }

    /**
     * Sets the value of the submit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubmit(Object value) {
        this.submit = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubmitDate(Object value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the submitterID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubmitterID() {
        return submitterID;
    }

    /**
     * Sets the value of the submitterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubmitterID(Object value) {
        this.submitterID = value;
    }

    /**
     * Gets the value of the approverID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApproverID() {
        return approverID;
    }

    /**
     * Sets the value of the approverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApproverID(Object value) {
        this.approverID = value;
    }

    /**
     * Gets the value of the weekEnding property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWeekEnding() {
        return weekEnding;
    }

    /**
     * Sets the value of the weekEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWeekEnding(Object value) {
        this.weekEnding = value;
    }

    /**
     * Gets the value of the expenseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseTotal() {
        return expenseTotal;
    }

    /**
     * Sets the value of the expenseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseTotal(Object value) {
        this.expenseTotal = value;
    }

    /**
     * Gets the value of the cashAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCashAdvanceAmount() {
        return cashAdvanceAmount;
    }

    /**
     * Sets the value of the cashAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCashAdvanceAmount(Object value) {
        this.cashAdvanceAmount = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRejectionReason(Object value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAmountDue(Object value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartmentNumber(Object value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the quickBooksReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuickBooksReferenceNumber() {
        return quickBooksReferenceNumber;
    }

    /**
     * Sets the value of the quickBooksReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuickBooksReferenceNumber(Object value) {
        this.quickBooksReferenceNumber = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApprovedDate(Object value) {
        this.approvedDate = value;
    }

    /**
     * Gets the value of the reimbursementCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursementCurrencyID() {
        return reimbursementCurrencyID;
    }

    /**
     * Sets the value of the reimbursementCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursementCurrencyID(Object value) {
        this.reimbursementCurrencyID = value;
    }

    /**
     * Gets the value of the reimbursementCurrencyCashAdvanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursementCurrencyCashAdvanceAmount() {
        return reimbursementCurrencyCashAdvanceAmount;
    }

    /**
     * Sets the value of the reimbursementCurrencyCashAdvanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursementCurrencyCashAdvanceAmount(Object value) {
        this.reimbursementCurrencyCashAdvanceAmount = value;
    }

    /**
     * Gets the value of the reimbursementCurrencyAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursementCurrencyAmountDue() {
        return reimbursementCurrencyAmountDue;
    }

    /**
     * Sets the value of the reimbursementCurrencyAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursementCurrencyAmountDue(Object value) {
        this.reimbursementCurrencyAmountDue = value;
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
