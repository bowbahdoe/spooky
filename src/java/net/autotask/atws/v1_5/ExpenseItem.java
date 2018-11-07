
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReportID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GLCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Reimbursable" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HaveReceipt" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillableToAccount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EntertainmentLocation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Miles" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Rejected" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OdometerStart" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OdometerEnd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseCurrencyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementCurrencyReimbursementAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseItem", propOrder = {
    "expenseReportID",
    "description",
    "expenseDate",
    "expenseCategory",
    "glCode",
    "workType",
    "expenseAmount",
    "paymentType",
    "reimbursable",
    "haveReceipt",
    "billableToAccount",
    "accountID",
    "projectID",
    "taskID",
    "ticketID",
    "entertainmentLocation",
    "miles",
    "origin",
    "destination",
    "rejected",
    "purchaseOrderNumber",
    "odometerStart",
    "odometerEnd",
    "expenseCurrencyID",
    "receiptAmount",
    "reimbursementAmount",
    "reimbursementCurrencyReimbursementAmount"
})
public class ExpenseItem
    extends Entity
{

    @XmlElement(name = "ExpenseReportID")
    protected Object expenseReportID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "ExpenseDate")
    protected Object expenseDate;
    @XmlElement(name = "ExpenseCategory")
    protected Object expenseCategory;
    @XmlElement(name = "GLCode")
    protected Object glCode;
    @XmlElement(name = "WorkType")
    protected Object workType;
    @XmlElement(name = "ExpenseAmount")
    protected Object expenseAmount;
    @XmlElement(name = "PaymentType")
    protected Object paymentType;
    @XmlElement(name = "Reimbursable")
    protected Object reimbursable;
    @XmlElement(name = "HaveReceipt")
    protected Object haveReceipt;
    @XmlElement(name = "BillableToAccount")
    protected Object billableToAccount;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "ProjectID")
    protected Object projectID;
    @XmlElement(name = "TaskID")
    protected Object taskID;
    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "EntertainmentLocation")
    protected Object entertainmentLocation;
    @XmlElement(name = "Miles")
    protected Object miles;
    @XmlElement(name = "Origin")
    protected Object origin;
    @XmlElement(name = "Destination")
    protected Object destination;
    @XmlElement(name = "Rejected")
    protected Object rejected;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "OdometerStart")
    protected Object odometerStart;
    @XmlElement(name = "OdometerEnd")
    protected Object odometerEnd;
    @XmlElement(name = "ExpenseCurrencyID")
    protected Object expenseCurrencyID;
    @XmlElement(name = "ReceiptAmount")
    protected Object receiptAmount;
    @XmlElement(name = "ReimbursementAmount")
    protected Object reimbursementAmount;
    @XmlElement(name = "ReimbursementCurrencyReimbursementAmount")
    protected Object reimbursementCurrencyReimbursementAmount;

    /**
     * Gets the value of the expenseReportID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseReportID() {
        return expenseReportID;
    }

    /**
     * Sets the value of the expenseReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseReportID(Object value) {
        this.expenseReportID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the expenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseDate() {
        return expenseDate;
    }

    /**
     * Sets the value of the expenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseDate(Object value) {
        this.expenseDate = value;
    }

    /**
     * Gets the value of the expenseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseCategory() {
        return expenseCategory;
    }

    /**
     * Sets the value of the expenseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseCategory(Object value) {
        this.expenseCategory = value;
    }

    /**
     * Gets the value of the glCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGLCode() {
        return glCode;
    }

    /**
     * Sets the value of the glCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGLCode(Object value) {
        this.glCode = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWorkType(Object value) {
        this.workType = value;
    }

    /**
     * Gets the value of the expenseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseAmount() {
        return expenseAmount;
    }

    /**
     * Sets the value of the expenseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseAmount(Object value) {
        this.expenseAmount = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentType(Object value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the reimbursable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursable() {
        return reimbursable;
    }

    /**
     * Sets the value of the reimbursable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursable(Object value) {
        this.reimbursable = value;
    }

    /**
     * Gets the value of the haveReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHaveReceipt() {
        return haveReceipt;
    }

    /**
     * Sets the value of the haveReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHaveReceipt(Object value) {
        this.haveReceipt = value;
    }

    /**
     * Gets the value of the billableToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillableToAccount() {
        return billableToAccount;
    }

    /**
     * Sets the value of the billableToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillableToAccount(Object value) {
        this.billableToAccount = value;
    }

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
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectID(Object value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskID(Object value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the ticketID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketID(Object value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the entertainmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntertainmentLocation() {
        return entertainmentLocation;
    }

    /**
     * Sets the value of the entertainmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntertainmentLocation(Object value) {
        this.entertainmentLocation = value;
    }

    /**
     * Gets the value of the miles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMiles() {
        return miles;
    }

    /**
     * Sets the value of the miles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMiles(Object value) {
        this.miles = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrigin(Object value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDestination(Object value) {
        this.destination = value;
    }

    /**
     * Gets the value of the rejected property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRejected() {
        return rejected;
    }

    /**
     * Sets the value of the rejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRejected(Object value) {
        this.rejected = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPurchaseOrderNumber(Object value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the odometerStart property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOdometerStart() {
        return odometerStart;
    }

    /**
     * Sets the value of the odometerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOdometerStart(Object value) {
        this.odometerStart = value;
    }

    /**
     * Gets the value of the odometerEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOdometerEnd() {
        return odometerEnd;
    }

    /**
     * Sets the value of the odometerEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOdometerEnd(Object value) {
        this.odometerEnd = value;
    }

    /**
     * Gets the value of the expenseCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpenseCurrencyID() {
        return expenseCurrencyID;
    }

    /**
     * Sets the value of the expenseCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpenseCurrencyID(Object value) {
        this.expenseCurrencyID = value;
    }

    /**
     * Gets the value of the receiptAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * Sets the value of the receiptAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReceiptAmount(Object value) {
        this.receiptAmount = value;
    }

    /**
     * Gets the value of the reimbursementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursementAmount() {
        return reimbursementAmount;
    }

    /**
     * Sets the value of the reimbursementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursementAmount(Object value) {
        this.reimbursementAmount = value;
    }

    /**
     * Gets the value of the reimbursementCurrencyReimbursementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReimbursementCurrencyReimbursementAmount() {
        return reimbursementCurrencyReimbursementAmount;
    }

    /**
     * Sets the value of the reimbursementCurrencyReimbursementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReimbursementCurrencyReimbursementAmount(Object value) {
        this.reimbursementCurrencyReimbursementAmount = value;
    }

}
