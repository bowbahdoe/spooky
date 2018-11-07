
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAddressInfo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HolidaySetID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NoHoursOnHolidays" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FirstDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SundayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SundayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SundayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SundayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MondayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MondayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MondayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MondayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FridayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FridayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FridayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FridayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayBusinessHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayBusinessHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayExtendedHoursStartTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayExtendedHoursEndTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLocation", propOrder = {
    "name",
    "address1",
    "address2",
    "city",
    "state",
    "postalCode",
    "additionalAddressInfo",
    "countryID",
    "holidaySetID",
    "noHoursOnHolidays",
    "_default",
    "firstDayOfWeek",
    "dateFormat",
    "timeFormat",
    "numberFormat",
    "timeZoneID",
    "sundayBusinessHoursStartTime",
    "sundayBusinessHoursEndTime",
    "sundayExtendedHoursStartTime",
    "sundayExtendedHoursEndTime",
    "mondayBusinessHoursStartTime",
    "mondayBusinessHoursEndTime",
    "mondayExtendedHoursStartTime",
    "mondayExtendedHoursEndTime",
    "tuesdayBusinessHoursStartTime",
    "tuesdayBusinessHoursEndTime",
    "tuesdayExtendedHoursStartTime",
    "tuesdayExtendedHoursEndTime",
    "wednesdayBusinessHoursStartTime",
    "wednesdayBusinessHoursEndTime",
    "wednesdayExtendedHoursStartTime",
    "wednesdayExtendedHoursEndTime",
    "thursdayBusinessHoursStartTime",
    "thursdayBusinessHoursEndTime",
    "thursdayExtendedHoursStartTime",
    "thursdayExtendedHoursEndTime",
    "fridayBusinessHoursStartTime",
    "fridayBusinessHoursEndTime",
    "fridayExtendedHoursStartTime",
    "fridayExtendedHoursEndTime",
    "saturdayBusinessHoursStartTime",
    "saturdayBusinessHoursEndTime",
    "saturdayExtendedHoursStartTime",
    "saturdayExtendedHoursEndTime"
})
public class BusinessLocation
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Address1")
    protected Object address1;
    @XmlElement(name = "Address2")
    protected Object address2;
    @XmlElement(name = "City")
    protected Object city;
    @XmlElement(name = "State")
    protected Object state;
    @XmlElement(name = "PostalCode")
    protected Object postalCode;
    @XmlElement(name = "AdditionalAddressInfo")
    protected Object additionalAddressInfo;
    @XmlElement(name = "CountryID")
    protected Object countryID;
    @XmlElement(name = "HolidaySetID")
    protected Object holidaySetID;
    @XmlElement(name = "NoHoursOnHolidays")
    protected Object noHoursOnHolidays;
    @XmlElement(name = "Default")
    protected Object _default;
    @XmlElement(name = "FirstDayOfWeek")
    protected Object firstDayOfWeek;
    @XmlElement(name = "DateFormat")
    protected Object dateFormat;
    @XmlElement(name = "TimeFormat")
    protected Object timeFormat;
    @XmlElement(name = "NumberFormat")
    protected Object numberFormat;
    @XmlElement(name = "TimeZoneID")
    protected Object timeZoneID;
    @XmlElement(name = "SundayBusinessHoursStartTime")
    protected Object sundayBusinessHoursStartTime;
    @XmlElement(name = "SundayBusinessHoursEndTime")
    protected Object sundayBusinessHoursEndTime;
    @XmlElement(name = "SundayExtendedHoursStartTime")
    protected Object sundayExtendedHoursStartTime;
    @XmlElement(name = "SundayExtendedHoursEndTime")
    protected Object sundayExtendedHoursEndTime;
    @XmlElement(name = "MondayBusinessHoursStartTime")
    protected Object mondayBusinessHoursStartTime;
    @XmlElement(name = "MondayBusinessHoursEndTime")
    protected Object mondayBusinessHoursEndTime;
    @XmlElement(name = "MondayExtendedHoursStartTime")
    protected Object mondayExtendedHoursStartTime;
    @XmlElement(name = "MondayExtendedHoursEndTime")
    protected Object mondayExtendedHoursEndTime;
    @XmlElement(name = "TuesdayBusinessHoursStartTime")
    protected Object tuesdayBusinessHoursStartTime;
    @XmlElement(name = "TuesdayBusinessHoursEndTime")
    protected Object tuesdayBusinessHoursEndTime;
    @XmlElement(name = "TuesdayExtendedHoursStartTime")
    protected Object tuesdayExtendedHoursStartTime;
    @XmlElement(name = "TuesdayExtendedHoursEndTime")
    protected Object tuesdayExtendedHoursEndTime;
    @XmlElement(name = "WednesdayBusinessHoursStartTime")
    protected Object wednesdayBusinessHoursStartTime;
    @XmlElement(name = "WednesdayBusinessHoursEndTime")
    protected Object wednesdayBusinessHoursEndTime;
    @XmlElement(name = "WednesdayExtendedHoursStartTime")
    protected Object wednesdayExtendedHoursStartTime;
    @XmlElement(name = "WednesdayExtendedHoursEndTime")
    protected Object wednesdayExtendedHoursEndTime;
    @XmlElement(name = "ThursdayBusinessHoursStartTime")
    protected Object thursdayBusinessHoursStartTime;
    @XmlElement(name = "ThursdayBusinessHoursEndTime")
    protected Object thursdayBusinessHoursEndTime;
    @XmlElement(name = "ThursdayExtendedHoursStartTime")
    protected Object thursdayExtendedHoursStartTime;
    @XmlElement(name = "ThursdayExtendedHoursEndTime")
    protected Object thursdayExtendedHoursEndTime;
    @XmlElement(name = "FridayBusinessHoursStartTime")
    protected Object fridayBusinessHoursStartTime;
    @XmlElement(name = "FridayBusinessHoursEndTime")
    protected Object fridayBusinessHoursEndTime;
    @XmlElement(name = "FridayExtendedHoursStartTime")
    protected Object fridayExtendedHoursStartTime;
    @XmlElement(name = "FridayExtendedHoursEndTime")
    protected Object fridayExtendedHoursEndTime;
    @XmlElement(name = "SaturdayBusinessHoursStartTime")
    protected Object saturdayBusinessHoursStartTime;
    @XmlElement(name = "SaturdayBusinessHoursEndTime")
    protected Object saturdayBusinessHoursEndTime;
    @XmlElement(name = "SaturdayExtendedHoursStartTime")
    protected Object saturdayExtendedHoursStartTime;
    @XmlElement(name = "SaturdayExtendedHoursEndTime")
    protected Object saturdayExtendedHoursEndTime;

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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddress1(Object value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddress2(Object value) {
        this.address2 = value;
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
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPostalCode(Object value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the additionalAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }

    /**
     * Sets the value of the additionalAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdditionalAddressInfo(Object value) {
        this.additionalAddressInfo = value;
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
     * Gets the value of the holidaySetID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHolidaySetID() {
        return holidaySetID;
    }

    /**
     * Sets the value of the holidaySetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHolidaySetID(Object value) {
        this.holidaySetID = value;
    }

    /**
     * Gets the value of the noHoursOnHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoHoursOnHolidays() {
        return noHoursOnHolidays;
    }

    /**
     * Sets the value of the noHoursOnHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoHoursOnHolidays(Object value) {
        this.noHoursOnHolidays = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefault(Object value) {
        this._default = value;
    }

    /**
     * Gets the value of the firstDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Sets the value of the firstDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFirstDayOfWeek(Object value) {
        this.firstDayOfWeek = value;
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
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimeZoneID(Object value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the sundayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSundayBusinessHoursStartTime() {
        return sundayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the sundayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSundayBusinessHoursStartTime(Object value) {
        this.sundayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the sundayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSundayBusinessHoursEndTime() {
        return sundayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the sundayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSundayBusinessHoursEndTime(Object value) {
        this.sundayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the sundayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSundayExtendedHoursStartTime() {
        return sundayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the sundayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSundayExtendedHoursStartTime(Object value) {
        this.sundayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the sundayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSundayExtendedHoursEndTime() {
        return sundayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the sundayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSundayExtendedHoursEndTime(Object value) {
        this.sundayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the mondayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMondayBusinessHoursStartTime() {
        return mondayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the mondayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMondayBusinessHoursStartTime(Object value) {
        this.mondayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the mondayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMondayBusinessHoursEndTime() {
        return mondayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the mondayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMondayBusinessHoursEndTime(Object value) {
        this.mondayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the mondayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMondayExtendedHoursStartTime() {
        return mondayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the mondayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMondayExtendedHoursStartTime(Object value) {
        this.mondayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the mondayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMondayExtendedHoursEndTime() {
        return mondayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the mondayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMondayExtendedHoursEndTime(Object value) {
        this.mondayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the tuesdayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTuesdayBusinessHoursStartTime() {
        return tuesdayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the tuesdayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTuesdayBusinessHoursStartTime(Object value) {
        this.tuesdayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the tuesdayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTuesdayBusinessHoursEndTime() {
        return tuesdayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the tuesdayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTuesdayBusinessHoursEndTime(Object value) {
        this.tuesdayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the tuesdayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTuesdayExtendedHoursStartTime() {
        return tuesdayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the tuesdayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTuesdayExtendedHoursStartTime(Object value) {
        this.tuesdayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the tuesdayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTuesdayExtendedHoursEndTime() {
        return tuesdayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the tuesdayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTuesdayExtendedHoursEndTime(Object value) {
        this.tuesdayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the wednesdayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWednesdayBusinessHoursStartTime() {
        return wednesdayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the wednesdayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWednesdayBusinessHoursStartTime(Object value) {
        this.wednesdayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the wednesdayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWednesdayBusinessHoursEndTime() {
        return wednesdayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the wednesdayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWednesdayBusinessHoursEndTime(Object value) {
        this.wednesdayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the wednesdayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWednesdayExtendedHoursStartTime() {
        return wednesdayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the wednesdayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWednesdayExtendedHoursStartTime(Object value) {
        this.wednesdayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the wednesdayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWednesdayExtendedHoursEndTime() {
        return wednesdayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the wednesdayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWednesdayExtendedHoursEndTime(Object value) {
        this.wednesdayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the thursdayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThursdayBusinessHoursStartTime() {
        return thursdayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the thursdayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThursdayBusinessHoursStartTime(Object value) {
        this.thursdayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the thursdayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThursdayBusinessHoursEndTime() {
        return thursdayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the thursdayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThursdayBusinessHoursEndTime(Object value) {
        this.thursdayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the thursdayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThursdayExtendedHoursStartTime() {
        return thursdayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the thursdayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThursdayExtendedHoursStartTime(Object value) {
        this.thursdayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the thursdayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThursdayExtendedHoursEndTime() {
        return thursdayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the thursdayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThursdayExtendedHoursEndTime(Object value) {
        this.thursdayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the fridayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFridayBusinessHoursStartTime() {
        return fridayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the fridayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFridayBusinessHoursStartTime(Object value) {
        this.fridayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the fridayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFridayBusinessHoursEndTime() {
        return fridayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the fridayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFridayBusinessHoursEndTime(Object value) {
        this.fridayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the fridayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFridayExtendedHoursStartTime() {
        return fridayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the fridayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFridayExtendedHoursStartTime(Object value) {
        this.fridayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the fridayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFridayExtendedHoursEndTime() {
        return fridayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the fridayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFridayExtendedHoursEndTime(Object value) {
        this.fridayExtendedHoursEndTime = value;
    }

    /**
     * Gets the value of the saturdayBusinessHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaturdayBusinessHoursStartTime() {
        return saturdayBusinessHoursStartTime;
    }

    /**
     * Sets the value of the saturdayBusinessHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaturdayBusinessHoursStartTime(Object value) {
        this.saturdayBusinessHoursStartTime = value;
    }

    /**
     * Gets the value of the saturdayBusinessHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaturdayBusinessHoursEndTime() {
        return saturdayBusinessHoursEndTime;
    }

    /**
     * Sets the value of the saturdayBusinessHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaturdayBusinessHoursEndTime(Object value) {
        this.saturdayBusinessHoursEndTime = value;
    }

    /**
     * Gets the value of the saturdayExtendedHoursStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaturdayExtendedHoursStartTime() {
        return saturdayExtendedHoursStartTime;
    }

    /**
     * Sets the value of the saturdayExtendedHoursStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaturdayExtendedHoursStartTime(Object value) {
        this.saturdayExtendedHoursStartTime = value;
    }

    /**
     * Gets the value of the saturdayExtendedHoursEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSaturdayExtendedHoursEndTime() {
        return saturdayExtendedHoursEndTime;
    }

    /**
     * Sets the value of the saturdayExtendedHoursEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSaturdayExtendedHoursEndTime(Object value) {
        this.saturdayExtendedHoursEndTime = value;
    }

}
