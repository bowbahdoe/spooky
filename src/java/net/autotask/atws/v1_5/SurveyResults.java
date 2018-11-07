
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveyResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SurveyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SurveyRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveyResults", propOrder = {
    "accountID",
    "companyRating",
    "contactID",
    "contactRating",
    "completeDate",
    "resourceRating",
    "sendDate",
    "surveyID",
    "surveyRating",
    "ticketID"
})
public class SurveyResults
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "CompanyRating")
    protected Object companyRating;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "ContactRating")
    protected Object contactRating;
    @XmlElement(name = "CompleteDate")
    protected Object completeDate;
    @XmlElement(name = "ResourceRating")
    protected Object resourceRating;
    @XmlElement(name = "SendDate")
    protected Object sendDate;
    @XmlElement(name = "SurveyID")
    protected Object surveyID;
    @XmlElement(name = "SurveyRating")
    protected Object surveyRating;
    @XmlElement(name = "TicketID")
    protected Object ticketID;

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
     * Gets the value of the companyRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyRating() {
        return companyRating;
    }

    /**
     * Sets the value of the companyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyRating(Object value) {
        this.companyRating = value;
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
     * Gets the value of the contactRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactRating() {
        return contactRating;
    }

    /**
     * Sets the value of the contactRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactRating(Object value) {
        this.contactRating = value;
    }

    /**
     * Gets the value of the completeDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the value of the completeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompleteDate(Object value) {
        this.completeDate = value;
    }

    /**
     * Gets the value of the resourceRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceRating() {
        return resourceRating;
    }

    /**
     * Sets the value of the resourceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceRating(Object value) {
        this.resourceRating = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSendDate(Object value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the surveyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurveyID() {
        return surveyID;
    }

    /**
     * Sets the value of the surveyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurveyID(Object value) {
        this.surveyID = value;
    }

    /**
     * Gets the value of the surveyRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurveyRating() {
        return surveyRating;
    }

    /**
     * Sets the value of the surveyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurveyRating(Object value) {
        this.surveyRating = value;
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

}
