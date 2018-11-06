
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Notification" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAddressInformation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BulkEmailOptOut" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BulkEmailOptOutTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SurveyOptOut" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FacebookUrl" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TwitterUrl" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LinkedInUrl" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountPhysicalLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SolicitationOptOut" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SolicitationOptOutTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "active",
    "addressLine",
    "addressLine1",
    "alternatePhone",
    "city",
    "country",
    "createDate",
    "eMailAddress",
    "eMailAddress2",
    "eMailAddress3",
    "extension",
    "faxNumber",
    "firstName",
    "accountID",
    "lastName",
    "lastActivityDate",
    "lastModifiedDate",
    "middleInitial",
    "mobilePhone",
    "note",
    "notification",
    "phone",
    "roomNumber",
    "state",
    "title",
    "zipCode",
    "additionalAddressInformation",
    "externalID",
    "countryID",
    "bulkEmailOptOut",
    "bulkEmailOptOutTime",
    "surveyOptOut",
    "namePrefix",
    "nameSuffix",
    "facebookUrl",
    "twitterUrl",
    "linkedInUrl",
    "primaryContact",
    "accountPhysicalLocationID",
    "solicitationOptOut",
    "solicitationOptOutTime"
})
public class Contact
    extends Entity
{

    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "AddressLine")
    protected Object addressLine;
    @XmlElement(name = "AddressLine1")
    protected Object addressLine1;
    @XmlElement(name = "AlternatePhone")
    protected Object alternatePhone;
    @XmlElement(name = "City")
    protected Object city;
    @XmlElement(name = "Country")
    protected Object country;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "EMailAddress")
    protected Object eMailAddress;
    @XmlElement(name = "EMailAddress2")
    protected Object eMailAddress2;
    @XmlElement(name = "EMailAddress3")
    protected Object eMailAddress3;
    @XmlElement(name = "Extension")
    protected Object extension;
    @XmlElement(name = "FaxNumber")
    protected Object faxNumber;
    @XmlElement(name = "FirstName")
    protected Object firstName;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "LastName")
    protected Object lastName;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "LastModifiedDate")
    protected Object lastModifiedDate;
    @XmlElement(name = "MiddleInitial")
    protected Object middleInitial;
    @XmlElement(name = "MobilePhone")
    protected Object mobilePhone;
    @XmlElement(name = "Note")
    protected Object note;
    @XmlElement(name = "Notification")
    protected Object notification;
    @XmlElement(name = "Phone")
    protected Object phone;
    @XmlElement(name = "RoomNumber")
    protected Object roomNumber;
    @XmlElement(name = "State")
    protected Object state;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "ZipCode")
    protected Object zipCode;
    @XmlElement(name = "AdditionalAddressInformation")
    protected Object additionalAddressInformation;
    @XmlElement(name = "ExternalID")
    protected Object externalID;
    @XmlElement(name = "CountryID")
    protected Object countryID;
    @XmlElement(name = "BulkEmailOptOut")
    protected Object bulkEmailOptOut;
    @XmlElement(name = "BulkEmailOptOutTime")
    protected Object bulkEmailOptOutTime;
    @XmlElement(name = "SurveyOptOut")
    protected Object surveyOptOut;
    @XmlElement(name = "NamePrefix")
    protected Object namePrefix;
    @XmlElement(name = "NameSuffix")
    protected Object nameSuffix;
    @XmlElement(name = "FacebookUrl")
    protected Object facebookUrl;
    @XmlElement(name = "TwitterUrl")
    protected Object twitterUrl;
    @XmlElement(name = "LinkedInUrl")
    protected Object linkedInUrl;
    @XmlElement(name = "PrimaryContact")
    protected Object primaryContact;
    @XmlElement(name = "AccountPhysicalLocationID")
    protected Object accountPhysicalLocationID;
    @XmlElement(name = "SolicitationOptOut")
    protected Object solicitationOptOut;
    @XmlElement(name = "SolicitationOptOutTime")
    protected Object solicitationOptOutTime;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActive(Object value) {
        this.active = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddressLine(Object value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddressLine1(Object value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the alternatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAlternatePhone() {
        return alternatePhone;
    }

    /**
     * Sets the value of the alternatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAlternatePhone(Object value) {
        this.alternatePhone = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCity(Object value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCountry(Object value) {
        this.country = value;
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
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEMailAddress(Object value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the eMailAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEMailAddress2() {
        return eMailAddress2;
    }

    /**
     * Sets the value of the eMailAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEMailAddress2(Object value) {
        this.eMailAddress2 = value;
    }

    /**
     * Gets the value of the eMailAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEMailAddress3() {
        return eMailAddress3;
    }

    /**
     * Sets the value of the eMailAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEMailAddress3(Object value) {
        this.eMailAddress3 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFaxNumber(Object value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstName(Object value) {
        this.firstName = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastName(Object value) {
        this.lastName = value;
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
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedDate(Object value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMiddleInitial(Object value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMobilePhone(Object value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNote(Object value) {
        this.note = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotification(Object value) {
        this.notification = value;
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
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRoomNumber(Object value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setState(Object value) {
        this.state = value;
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
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setZipCode(Object value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the additionalAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalAddressInformation() {
        return additionalAddressInformation;
    }

    /**
     * Sets the value of the additionalAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalAddressInformation(Object value) {
        this.additionalAddressInformation = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExternalID(Object value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCountryID(Object value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the bulkEmailOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBulkEmailOptOut() {
        return bulkEmailOptOut;
    }

    /**
     * Sets the value of the bulkEmailOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBulkEmailOptOut(Object value) {
        this.bulkEmailOptOut = value;
    }

    /**
     * Gets the value of the bulkEmailOptOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBulkEmailOptOutTime() {
        return bulkEmailOptOutTime;
    }

    /**
     * Sets the value of the bulkEmailOptOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBulkEmailOptOutTime(Object value) {
        this.bulkEmailOptOutTime = value;
    }

    /**
     * Gets the value of the surveyOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurveyOptOut() {
        return surveyOptOut;
    }

    /**
     * Sets the value of the surveyOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurveyOptOut(Object value) {
        this.surveyOptOut = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNamePrefix(Object value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNameSuffix(Object value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the facebookUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFacebookUrl() {
        return facebookUrl;
    }

    /**
     * Sets the value of the facebookUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFacebookUrl(Object value) {
        this.facebookUrl = value;
    }

    /**
     * Gets the value of the twitterUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTwitterUrl() {
        return twitterUrl;
    }

    /**
     * Sets the value of the twitterUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTwitterUrl(Object value) {
        this.twitterUrl = value;
    }

    /**
     * Gets the value of the linkedInUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkedInUrl() {
        return linkedInUrl;
    }

    /**
     * Sets the value of the linkedInUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkedInUrl(Object value) {
        this.linkedInUrl = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrimaryContact(Object value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the accountPhysicalLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }

    /**
     * Sets the value of the accountPhysicalLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountPhysicalLocationID(Object value) {
        this.accountPhysicalLocationID = value;
    }

    /**
     * Gets the value of the solicitationOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSolicitationOptOut() {
        return solicitationOptOut;
    }

    /**
     * Sets the value of the solicitationOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSolicitationOptOut(Object value) {
        this.solicitationOptOut = value;
    }

    /**
     * Gets the value of the solicitationOptOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSolicitationOptOutTime() {
        return solicitationOptOutTime;
    }

    /**
     * Sets the value of the solicitationOptOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSolicitationOptOutTime(Object value) {
        this.solicitationOptOutTime = value;
    }

}
