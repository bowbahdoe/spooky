
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatorResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="eQuoteActive" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GroupByID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryQuote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProposalProjectID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SoldToLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowEachTaxInGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowTaxCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CalculateTaxSeparately" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GroupByProductCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote", propOrder = {
    "accountID",
    "billToLocationID",
    "comment",
    "contactID",
    "createDate",
    "creatorResourceID",
    "description",
    "effectiveDate",
    "eQuoteActive",
    "expirationDate",
    "externalQuoteNumber",
    "groupByID",
    "lastActivityDate",
    "lastModifiedBy",
    "name",
    "opportunityID",
    "paymentTerm",
    "paymentType",
    "primaryQuote",
    "proposalProjectID",
    "purchaseOrderNumber",
    "quoteTemplateID",
    "shippingType",
    "shipToLocationID",
    "soldToLocationID",
    "taxGroup",
    "quoteNumber",
    "showEachTaxInGroup",
    "showTaxCategory",
    "calculateTaxSeparately",
    "groupByProductCategory"
})
public class Quote
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "BillToLocationID")
    protected Object billToLocationID;
    @XmlElement(name = "Comment")
    protected Object comment;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "CreatorResourceID")
    protected Object creatorResourceID;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "EffectiveDate")
    protected Object effectiveDate;
    protected Object eQuoteActive;
    @XmlElement(name = "ExpirationDate")
    protected Object expirationDate;
    @XmlElement(name = "ExternalQuoteNumber")
    protected Object externalQuoteNumber;
    @XmlElement(name = "GroupByID")
    protected Object groupByID;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "LastModifiedBy")
    protected Object lastModifiedBy;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "OpportunityID")
    protected Object opportunityID;
    @XmlElement(name = "PaymentTerm")
    protected Object paymentTerm;
    @XmlElement(name = "PaymentType")
    protected Object paymentType;
    @XmlElement(name = "PrimaryQuote")
    protected Object primaryQuote;
    @XmlElement(name = "ProposalProjectID")
    protected Object proposalProjectID;
    @XmlElement(name = "PurchaseOrderNumber")
    protected Object purchaseOrderNumber;
    @XmlElement(name = "QuoteTemplateID")
    protected Object quoteTemplateID;
    @XmlElement(name = "ShippingType")
    protected Object shippingType;
    @XmlElement(name = "ShipToLocationID")
    protected Object shipToLocationID;
    @XmlElement(name = "SoldToLocationID")
    protected Object soldToLocationID;
    @XmlElement(name = "TaxGroup")
    protected Object taxGroup;
    @XmlElement(name = "QuoteNumber")
    protected Object quoteNumber;
    @XmlElement(name = "ShowEachTaxInGroup")
    protected Object showEachTaxInGroup;
    @XmlElement(name = "ShowTaxCategory")
    protected Object showTaxCategory;
    @XmlElement(name = "CalculateTaxSeparately")
    protected Object calculateTaxSeparately;
    @XmlElement(name = "GroupByProductCategory")
    protected Object groupByProductCategory;

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
     * Gets the value of the billToLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToLocationID() {
        return billToLocationID;
    }

    /**
     * Sets the value of the billToLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToLocationID(Object value) {
        this.billToLocationID = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComment(Object value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactID(Object value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDate(Object value) {
        this.createDate = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEffectiveDate(Object value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the eQuoteActive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEQuoteActive() {
        return eQuoteActive;
    }

    /**
     * Sets the value of the eQuoteActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEQuoteActive(Object value) {
        this.eQuoteActive = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExpirationDate(Object value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the externalQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalQuoteNumber() {
        return externalQuoteNumber;
    }

    /**
     * Sets the value of the externalQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalQuoteNumber(Object value) {
        this.externalQuoteNumber = value;
    }

    /**
     * Gets the value of the groupByID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGroupByID() {
        return groupByID;
    }

    /**
     * Sets the value of the groupByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGroupByID(Object value) {
        this.groupByID = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityDate(Object value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedBy(Object value) {
        this.lastModifiedBy = value;
    }

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
     * Gets the value of the primaryQuote property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrimaryQuote() {
        return primaryQuote;
    }

    /**
     * Sets the value of the primaryQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrimaryQuote(Object value) {
        this.primaryQuote = value;
    }

    /**
     * Gets the value of the proposalProjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProposalProjectID() {
        return proposalProjectID;
    }

    /**
     * Sets the value of the proposalProjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProposalProjectID(Object value) {
        this.proposalProjectID = value;
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
     * Gets the value of the quoteTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteTemplateID() {
        return quoteTemplateID;
    }

    /**
     * Sets the value of the quoteTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteTemplateID(Object value) {
        this.quoteTemplateID = value;
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
     * Gets the value of the shipToLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipToLocationID() {
        return shipToLocationID;
    }

    /**
     * Sets the value of the shipToLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipToLocationID(Object value) {
        this.shipToLocationID = value;
    }

    /**
     * Gets the value of the soldToLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSoldToLocationID() {
        return soldToLocationID;
    }

    /**
     * Sets the value of the soldToLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSoldToLocationID(Object value) {
        this.soldToLocationID = value;
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
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteNumber(Object value) {
        this.quoteNumber = value;
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
     * Gets the value of the calculateTaxSeparately property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCalculateTaxSeparately() {
        return calculateTaxSeparately;
    }

    /**
     * Sets the value of the calculateTaxSeparately property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCalculateTaxSeparately(Object value) {
        this.calculateTaxSeparately = value;
    }

    /**
     * Gets the value of the groupByProductCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGroupByProductCategory() {
        return groupByProductCategory;
    }

    /**
     * Sets the value of the groupByProductCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGroupByProductCategory(Object value) {
        this.groupByProductCategory = value;
    }

}
