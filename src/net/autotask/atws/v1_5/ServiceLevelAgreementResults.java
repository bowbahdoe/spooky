
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevelAgreementResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLevelAgreementResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseElapsedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseInitiatingResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstResponseMet" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionPlanElapsedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionPlanResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionPlanMet" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionElapsedHours" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionMet" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLevelAgreementResults", propOrder = {
    "ticketID",
    "serviceLevelAgreementName",
    "firstResponseElapsedHours",
    "firstResponseInitiatingResourceID",
    "firstResponseResourceID",
    "firstResponseMet",
    "resolutionPlanElapsedHours",
    "resolutionPlanResourceID",
    "resolutionPlanMet",
    "resolutionElapsedHours",
    "resolutionResourceID",
    "resolutionMet"
})
public class ServiceLevelAgreementResults
    extends Entity
{

    @XmlElement(name = "TicketID")
    protected Object ticketID;
    @XmlElement(name = "ServiceLevelAgreementName")
    protected Object serviceLevelAgreementName;
    @XmlElement(name = "FirstResponseElapsedHours")
    protected Object firstResponseElapsedHours;
    @XmlElement(name = "FirstResponseInitiatingResourceID")
    protected Object firstResponseInitiatingResourceID;
    @XmlElement(name = "FirstResponseResourceID")
    protected Object firstResponseResourceID;
    @XmlElement(name = "FirstResponseMet")
    protected Object firstResponseMet;
    @XmlElement(name = "ResolutionPlanElapsedHours")
    protected Object resolutionPlanElapsedHours;
    @XmlElement(name = "ResolutionPlanResourceID")
    protected Object resolutionPlanResourceID;
    @XmlElement(name = "ResolutionPlanMet")
    protected Object resolutionPlanMet;
    @XmlElement(name = "ResolutionElapsedHours")
    protected Object resolutionElapsedHours;
    @XmlElement(name = "ResolutionResourceID")
    protected Object resolutionResourceID;
    @XmlElement(name = "ResolutionMet")
    protected Object resolutionMet;

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
     * Gets the value of the serviceLevelAgreementName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementName() {
        return serviceLevelAgreementName;
    }

    /**
     * Sets the value of the serviceLevelAgreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementName(Object value) {
        this.serviceLevelAgreementName = value;
    }

    /**
     * Gets the value of the firstResponseElapsedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseElapsedHours() {
        return firstResponseElapsedHours;
    }

    /**
     * Sets the value of the firstResponseElapsedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseElapsedHours(Object value) {
        this.firstResponseElapsedHours = value;
    }

    /**
     * Gets the value of the firstResponseInitiatingResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseInitiatingResourceID() {
        return firstResponseInitiatingResourceID;
    }

    /**
     * Sets the value of the firstResponseInitiatingResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseInitiatingResourceID(Object value) {
        this.firstResponseInitiatingResourceID = value;
    }

    /**
     * Gets the value of the firstResponseResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseResourceID() {
        return firstResponseResourceID;
    }

    /**
     * Sets the value of the firstResponseResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseResourceID(Object value) {
        this.firstResponseResourceID = value;
    }

    /**
     * Gets the value of the firstResponseMet property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstResponseMet() {
        return firstResponseMet;
    }

    /**
     * Sets the value of the firstResponseMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstResponseMet(Object value) {
        this.firstResponseMet = value;
    }

    /**
     * Gets the value of the resolutionPlanElapsedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionPlanElapsedHours() {
        return resolutionPlanElapsedHours;
    }

    /**
     * Sets the value of the resolutionPlanElapsedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionPlanElapsedHours(Object value) {
        this.resolutionPlanElapsedHours = value;
    }

    /**
     * Gets the value of the resolutionPlanResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionPlanResourceID() {
        return resolutionPlanResourceID;
    }

    /**
     * Sets the value of the resolutionPlanResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionPlanResourceID(Object value) {
        this.resolutionPlanResourceID = value;
    }

    /**
     * Gets the value of the resolutionPlanMet property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionPlanMet() {
        return resolutionPlanMet;
    }

    /**
     * Sets the value of the resolutionPlanMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionPlanMet(Object value) {
        this.resolutionPlanMet = value;
    }

    /**
     * Gets the value of the resolutionElapsedHours property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionElapsedHours() {
        return resolutionElapsedHours;
    }

    /**
     * Sets the value of the resolutionElapsedHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionElapsedHours(Object value) {
        this.resolutionElapsedHours = value;
    }

    /**
     * Gets the value of the resolutionResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionResourceID() {
        return resolutionResourceID;
    }

    /**
     * Sets the value of the resolutionResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionResourceID(Object value) {
        this.resolutionResourceID = value;
    }

    /**
     * Gets the value of the resolutionMet property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolutionMet() {
        return resolutionMet;
    }

    /**
     * Sets the value of the resolutionMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolutionMet(Object value) {
        this.resolutionMet = value;
    }

}
