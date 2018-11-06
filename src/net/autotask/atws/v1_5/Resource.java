
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Email2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Email3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EmailTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EmailTypeCode2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EmailTypeCode3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Greeting" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OfficeExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OfficePhone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TravelAvailabilityPct" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultServiceDeskRoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PayrollType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountingReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HireDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SurveyResourceRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "active",
    "email",
    "email2",
    "email3",
    "emailTypeCode",
    "emailTypeCode2",
    "emailTypeCode3",
    "firstName",
    "gender",
    "greeting",
    "homePhone",
    "initials",
    "lastName",
    "locationID",
    "middleName",
    "mobilePhone",
    "officeExtension",
    "officePhone",
    "resourceType",
    "suffix",
    "title",
    "travelAvailabilityPct",
    "userName",
    "userType",
    "defaultServiceDeskRoleID",
    "dateFormat",
    "timeFormat",
    "password",
    "payrollType",
    "numberFormat",
    "accountingReferenceID",
    "internalCost",
    "hireDate",
    "surveyResourceRating"
})
public class Resource
    extends Entity
{

    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "Email")
    protected Object email;
    @XmlElement(name = "Email2")
    protected Object email2;
    @XmlElement(name = "Email3")
    protected Object email3;
    @XmlElement(name = "EmailTypeCode")
    protected Object emailTypeCode;
    @XmlElement(name = "EmailTypeCode2")
    protected Object emailTypeCode2;
    @XmlElement(name = "EmailTypeCode3")
    protected Object emailTypeCode3;
    @XmlElement(name = "FirstName")
    protected Object firstName;
    @XmlElement(name = "Gender")
    protected Object gender;
    @XmlElement(name = "Greeting")
    protected Object greeting;
    @XmlElement(name = "HomePhone")
    protected Object homePhone;
    @XmlElement(name = "Initials")
    protected Object initials;
    @XmlElement(name = "LastName")
    protected Object lastName;
    @XmlElement(name = "LocationID")
    protected Object locationID;
    @XmlElement(name = "MiddleName")
    protected Object middleName;
    @XmlElement(name = "MobilePhone")
    protected Object mobilePhone;
    @XmlElement(name = "OfficeExtension")
    protected Object officeExtension;
    @XmlElement(name = "OfficePhone")
    protected Object officePhone;
    @XmlElement(name = "ResourceType")
    protected Object resourceType;
    @XmlElement(name = "Suffix")
    protected Object suffix;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "TravelAvailabilityPct")
    protected Object travelAvailabilityPct;
    @XmlElement(name = "UserName")
    protected Object userName;
    @XmlElement(name = "UserType")
    protected Object userType;
    @XmlElement(name = "DefaultServiceDeskRoleID")
    protected Object defaultServiceDeskRoleID;
    @XmlElement(name = "DateFormat")
    protected Object dateFormat;
    @XmlElement(name = "TimeFormat")
    protected Object timeFormat;
    @XmlElement(name = "Password")
    protected Object password;
    @XmlElement(name = "PayrollType")
    protected Object payrollType;
    @XmlElement(name = "NumberFormat")
    protected Object numberFormat;
    @XmlElement(name = "AccountingReferenceID")
    protected Object accountingReferenceID;
    @XmlElement(name = "InternalCost")
    protected Object internalCost;
    @XmlElement(name = "HireDate")
    protected Object hireDate;
    @XmlElement(name = "SurveyResourceRating")
    protected Object surveyResourceRating;

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmail(Object value) {
        this.email = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmail2(Object value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the email3 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmail3() {
        return email3;
    }

    /**
     * Sets the value of the email3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmail3(Object value) {
        this.email3 = value;
    }

    /**
     * Gets the value of the emailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmailTypeCode() {
        return emailTypeCode;
    }

    /**
     * Sets the value of the emailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmailTypeCode(Object value) {
        this.emailTypeCode = value;
    }

    /**
     * Gets the value of the emailTypeCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmailTypeCode2() {
        return emailTypeCode2;
    }

    /**
     * Sets the value of the emailTypeCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmailTypeCode2(Object value) {
        this.emailTypeCode2 = value;
    }

    /**
     * Gets the value of the emailTypeCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmailTypeCode3() {
        return emailTypeCode3;
    }

    /**
     * Sets the value of the emailTypeCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmailTypeCode3(Object value) {
        this.emailTypeCode3 = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGender(Object value) {
        this.gender = value;
    }

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGreeting(Object value) {
        this.greeting = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHomePhone(Object value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInitials(Object value) {
        this.initials = value;
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
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationID(Object value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMiddleName(Object value) {
        this.middleName = value;
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
     * Gets the value of the officeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfficeExtension() {
        return officeExtension;
    }

    /**
     * Sets the value of the officeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfficeExtension(Object value) {
        this.officeExtension = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfficePhone(Object value) {
        this.officePhone = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceType(Object value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSuffix(Object value) {
        this.suffix = value;
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
     * Gets the value of the travelAvailabilityPct property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTravelAvailabilityPct() {
        return travelAvailabilityPct;
    }

    /**
     * Sets the value of the travelAvailabilityPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTravelAvailabilityPct(Object value) {
        this.travelAvailabilityPct = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserName(Object value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserType(Object value) {
        this.userType = value;
    }

    /**
     * Gets the value of the defaultServiceDeskRoleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultServiceDeskRoleID() {
        return defaultServiceDeskRoleID;
    }

    /**
     * Sets the value of the defaultServiceDeskRoleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultServiceDeskRoleID(Object value) {
        this.defaultServiceDeskRoleID = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDateFormat(Object value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimeFormat(Object value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPassword(Object value) {
        this.password = value;
    }

    /**
     * Gets the value of the payrollType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPayrollType() {
        return payrollType;
    }

    /**
     * Sets the value of the payrollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPayrollType(Object value) {
        this.payrollType = value;
    }

    /**
     * Gets the value of the numberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets the value of the numberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumberFormat(Object value) {
        this.numberFormat = value;
    }

    /**
     * Gets the value of the accountingReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountingReferenceID() {
        return accountingReferenceID;
    }

    /**
     * Sets the value of the accountingReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountingReferenceID(Object value) {
        this.accountingReferenceID = value;
    }

    /**
     * Gets the value of the internalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCost() {
        return internalCost;
    }

    /**
     * Sets the value of the internalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCost(Object value) {
        this.internalCost = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHireDate(Object value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the surveyResourceRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurveyResourceRating() {
        return surveyResourceRating;
    }

    /**
     * Sets the value of the surveyResourceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurveyResourceRating(Object value) {
        this.surveyResourceRating = value;
    }

}
