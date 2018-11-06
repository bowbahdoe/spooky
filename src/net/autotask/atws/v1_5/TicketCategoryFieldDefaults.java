
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketCategoryFieldDefaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketCategoryFieldDefaults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IssueTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QueueID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SubIssueTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketCategoryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WorkTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketCategoryFieldDefaults", propOrder = {
    "businessDivisionSubdivisionID",
    "description",
    "estimatedHours",
    "issueTypeID",
    "purchaseOrderNumber",
    "queueID",
    "resolution",
    "serviceLevelAgreementID",
    "sourceID",
    "subIssueTypeID",
    "ticketCategoryID",
    "ticketTypeID",
    "title",
    "workTypeID",
    "status",
    "priority"
})
public class TicketCategoryFieldDefaults
    extends Entity
{

    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "EstimatedHours")
    protected Object estimatedHours;
    @XmlElement(name = "IssueTypeID")
    protected Object issueTypeID;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "QueueID")
    protected Object queueID;
    @XmlElement(name = "Resolution")
    protected Object resolution;
    @XmlElement(name = "ServiceLevelAgreementID")
    protected Object serviceLevelAgreementID;
    @XmlElement(name = "SourceID")
    protected Object sourceID;
    @XmlElement(name = "SubIssueTypeID")
    protected Object subIssueTypeID;
    @XmlElement(name = "TicketCategoryID")
    protected Object ticketCategoryID;
    @XmlElement(name = "TicketTypeID")
    protected Object ticketTypeID;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "WorkTypeID")
    protected Object workTypeID;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "Priority")
    protected Object priority;

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
     * Gets the value of the estimatedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Sets the value of the estimatedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEstimatedHours(Object value) {
        this.estimatedHours = value;
    }

    /**
     * Gets the value of the issueTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssueTypeID() {
        return issueTypeID;
    }

    /**
     * Sets the value of the issueTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssueTypeID(Object value) {
        this.issueTypeID = value;
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
     * Gets the value of the queueID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQueueID() {
        return queueID;
    }

    /**
     * Sets the value of the queueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQueueID(Object value) {
        this.queueID = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolution(Object value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the serviceLevelAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }

    /**
     * Sets the value of the serviceLevelAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementID(Object value) {
        this.serviceLevelAgreementID = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceID(Object value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the subIssueTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubIssueTypeID() {
        return subIssueTypeID;
    }

    /**
     * Sets the value of the subIssueTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubIssueTypeID(Object value) {
        this.subIssueTypeID = value;
    }

    /**
     * Gets the value of the ticketCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketCategoryID() {
        return ticketCategoryID;
    }

    /**
     * Sets the value of the ticketCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketCategoryID(Object value) {
        this.ticketCategoryID = value;
    }

    /**
     * Gets the value of the ticketTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketTypeID() {
        return ticketTypeID;
    }

    /**
     * Sets the value of the ticketTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketTypeID(Object value) {
        this.ticketTypeID = value;
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
     * Gets the value of the workTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWorkTypeID() {
        return workTypeID;
    }

    /**
     * Sets the value of the workTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWorkTypeID(Object value) {
        this.workTypeID = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriority(Object value) {
        this.priority = value;
    }

}
