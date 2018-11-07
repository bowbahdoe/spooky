
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhone1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhone2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssetValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="KeyAccountIcon" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MarketSegmentID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ParentAccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SICCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StockMarket" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="StockSymbol" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WebAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ClientPortalActive" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskFireActive" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAddressInformation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddressToUse" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAttention" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddress1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddress2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToZipCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToCountryID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAdditionalAddressInformation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceMethod" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNonContractItemsToParentAccount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteEmailMessageID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTemplateID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceEmailMessageID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccountPhysicalLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SurveyAccountRating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "address1",
    "address2",
    "alternatePhone1",
    "alternatePhone2",
    "assetValue",
    "city",
    "competitorID",
    "country",
    "createDate",
    "fax",
    "keyAccountIcon",
    "lastActivityDate",
    "marketSegmentID",
    "accountName",
    "accountNumber",
    "ownerResourceID",
    "parentAccountID",
    "phone",
    "postalCode",
    "sicCode",
    "state",
    "stockMarket",
    "stockSymbol",
    "territoryID",
    "accountType",
    "webAddress",
    "active",
    "clientPortalActive",
    "taskFireActive",
    "taxExempt",
    "taxRegionID",
    "taxID",
    "additionalAddressInformation",
    "countryID",
    "billToAddressToUse",
    "billToAttention",
    "billToAddress1",
    "billToAddress2",
    "billToCity",
    "billToState",
    "billToZipCode",
    "billToCountryID",
    "billToAdditionalAddressInformation",
    "invoiceMethod",
    "invoiceNonContractItemsToParentAccount",
    "quoteTemplateID",
    "quoteEmailMessageID",
    "invoiceTemplateID",
    "invoiceEmailMessageID",
    "currencyID",
    "billToAccountPhysicalLocationID",
    "surveyAccountRating"
})
public class Account
    extends Entity
{

    @XmlElement(name = "Address1")
    protected Object address1;
    @XmlElement(name = "Address2")
    protected Object address2;
    @XmlElement(name = "AlternatePhone1")
    protected Object alternatePhone1;
    @XmlElement(name = "AlternatePhone2")
    protected Object alternatePhone2;
    @XmlElement(name = "AssetValue")
    protected Object assetValue;
    @XmlElement(name = "City")
    protected Object city;
    @XmlElement(name = "CompetitorID")
    protected Object competitorID;
    @XmlElement(name = "Country")
    protected Object country;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "Fax")
    protected Object fax;
    @XmlElement(name = "KeyAccountIcon")
    protected Object keyAccountIcon;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "MarketSegmentID")
    protected Object marketSegmentID;
    @XmlElement(name = "AccountName")
    protected Object accountName;
    @XmlElement(name = "AccountNumber")
    protected Object accountNumber;
    @XmlElement(name = "OwnerResourceID")
    protected Object ownerResourceID;
    @XmlElement(name = "ParentAccountID")
    protected Object parentAccountID;
    @XmlElement(name = "Phone")
    protected Object phone;
    @XmlElement(name = "PostalCode")
    protected Object postalCode;
    @XmlElement(name = "SICCode")
    protected Object sicCode;
    @XmlElement(name = "State")
    protected Object state;
    @XmlElement(name = "StockMarket")
    protected Object stockMarket;
    @XmlElement(name = "StockSymbol")
    protected Object stockSymbol;
    @XmlElement(name = "TerritoryID")
    protected Object territoryID;
    @XmlElement(name = "AccountType")
    protected Object accountType;
    @XmlElement(name = "WebAddress")
    protected Object webAddress;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "ClientPortalActive")
    protected Object clientPortalActive;
    @XmlElement(name = "TaskFireActive")
    protected Object taskFireActive;
    @XmlElement(name = "TaxExempt")
    protected Object taxExempt;
    @XmlElement(name = "TaxRegionID")
    protected Object taxRegionID;
    @XmlElement(name = "TaxID")
    protected Object taxID;
    @XmlElement(name = "AdditionalAddressInformation")
    protected Object additionalAddressInformation;
    @XmlElement(name = "CountryID")
    protected Object countryID;
    @XmlElement(name = "BillToAddressToUse")
    protected Object billToAddressToUse;
    @XmlElement(name = "BillToAttention")
    protected Object billToAttention;
    @XmlElement(name = "BillToAddress1")
    protected Object billToAddress1;
    @XmlElement(name = "BillToAddress2")
    protected Object billToAddress2;
    @XmlElement(name = "BillToCity")
    protected Object billToCity;
    @XmlElement(name = "BillToState")
    protected Object billToState;
    @XmlElement(name = "BillToZipCode")
    protected Object billToZipCode;
    @XmlElement(name = "BillToCountryID")
    protected Object billToCountryID;
    @XmlElement(name = "BillToAdditionalAddressInformation")
    protected Object billToAdditionalAddressInformation;
    @XmlElement(name = "InvoiceMethod")
    protected Object invoiceMethod;
    @XmlElement(name = "InvoiceNonContractItemsToParentAccount")
    protected Object invoiceNonContractItemsToParentAccount;
    @XmlElement(name = "QuoteTemplateID")
    protected Object quoteTemplateID;
    @XmlElement(name = "QuoteEmailMessageID")
    protected Object quoteEmailMessageID;
    @XmlElement(name = "InvoiceTemplateID")
    protected Object invoiceTemplateID;
    @XmlElement(name = "InvoiceEmailMessageID")
    protected Object invoiceEmailMessageID;
    @XmlElement(name = "CurrencyID")
    protected Object currencyID;
    @XmlElement(name = "BillToAccountPhysicalLocationID")
    protected Object billToAccountPhysicalLocationID;
    @XmlElement(name = "SurveyAccountRating")
    protected Object surveyAccountRating;

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
     * Gets the value of the alternatePhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAlternatePhone1() {
        return alternatePhone1;
    }

    /**
     * Sets the value of the alternatePhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAlternatePhone1(Object value) {
        this.alternatePhone1 = value;
    }

    /**
     * Gets the value of the alternatePhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAlternatePhone2() {
        return alternatePhone2;
    }

    /**
     * Sets the value of the alternatePhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAlternatePhone2(Object value) {
        this.alternatePhone2 = value;
    }

    /**
     * Gets the value of the assetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssetValue() {
        return assetValue;
    }

    /**
     * Sets the value of the assetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssetValue(Object value) {
        this.assetValue = value;
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
     * Gets the value of the competitorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompetitorID() {
        return competitorID;
    }

    /**
     * Sets the value of the competitorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompetitorID(Object value) {
        this.competitorID = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFax(Object value) {
        this.fax = value;
    }

    /**
     * Gets the value of the keyAccountIcon property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKeyAccountIcon() {
        return keyAccountIcon;
    }

    /**
     * Sets the value of the keyAccountIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKeyAccountIcon(Object value) {
        this.keyAccountIcon = value;
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
     * Gets the value of the marketSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMarketSegmentID() {
        return marketSegmentID;
    }

    /**
     * Sets the value of the marketSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMarketSegmentID(Object value) {
        this.marketSegmentID = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountName(Object value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountNumber(Object value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the ownerResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerResourceID() {
        return ownerResourceID;
    }

    /**
     * Sets the value of the ownerResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerResourceID(Object value) {
        this.ownerResourceID = value;
    }

    /**
     * Gets the value of the parentAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentAccountID() {
        return parentAccountID;
    }

    /**
     * Sets the value of the parentAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentAccountID(Object value) {
        this.parentAccountID = value;
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
     * Gets the value of the sicCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSICCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSICCode(Object value) {
        this.sicCode = value;
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
     * Gets the value of the stockMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStockMarket() {
        return stockMarket;
    }

    /**
     * Sets the value of the stockMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStockMarket(Object value) {
        this.stockMarket = value;
    }

    /**
     * Gets the value of the stockSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Sets the value of the stockSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStockSymbol(Object value) {
        this.stockSymbol = value;
    }

    /**
     * Gets the value of the territoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTerritoryID() {
        return territoryID;
    }

    /**
     * Sets the value of the territoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTerritoryID(Object value) {
        this.territoryID = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountType(Object value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWebAddress(Object value) {
        this.webAddress = value;
    }

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
     * Gets the value of the clientPortalActive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClientPortalActive() {
        return clientPortalActive;
    }

    /**
     * Sets the value of the clientPortalActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClientPortalActive(Object value) {
        this.clientPortalActive = value;
    }

    /**
     * Gets the value of the taskFireActive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskFireActive() {
        return taskFireActive;
    }

    /**
     * Sets the value of the taskFireActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskFireActive(Object value) {
        this.taskFireActive = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxExempt(Object value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxRegionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxRegionID() {
        return taxRegionID;
    }

    /**
     * Sets the value of the taxRegionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxRegionID(Object value) {
        this.taxRegionID = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaxID(Object value) {
        this.taxID = value;
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
     * Gets the value of the billToAddressToUse property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAddressToUse() {
        return billToAddressToUse;
    }

    /**
     * Sets the value of the billToAddressToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAddressToUse(Object value) {
        this.billToAddressToUse = value;
    }

    /**
     * Gets the value of the billToAttention property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAttention() {
        return billToAttention;
    }

    /**
     * Sets the value of the billToAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAttention(Object value) {
        this.billToAttention = value;
    }

    /**
     * Gets the value of the billToAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAddress1() {
        return billToAddress1;
    }

    /**
     * Sets the value of the billToAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAddress1(Object value) {
        this.billToAddress1 = value;
    }

    /**
     * Gets the value of the billToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAddress2() {
        return billToAddress2;
    }

    /**
     * Sets the value of the billToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAddress2(Object value) {
        this.billToAddress2 = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToCity(Object value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToState(Object value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billToZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToZipCode() {
        return billToZipCode;
    }

    /**
     * Sets the value of the billToZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToZipCode(Object value) {
        this.billToZipCode = value;
    }

    /**
     * Gets the value of the billToCountryID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToCountryID() {
        return billToCountryID;
    }

    /**
     * Sets the value of the billToCountryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToCountryID(Object value) {
        this.billToCountryID = value;
    }

    /**
     * Gets the value of the billToAdditionalAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAdditionalAddressInformation() {
        return billToAdditionalAddressInformation;
    }

    /**
     * Sets the value of the billToAdditionalAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAdditionalAddressInformation(Object value) {
        this.billToAdditionalAddressInformation = value;
    }

    /**
     * Gets the value of the invoiceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceMethod() {
        return invoiceMethod;
    }

    /**
     * Sets the value of the invoiceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceMethod(Object value) {
        this.invoiceMethod = value;
    }

    /**
     * Gets the value of the invoiceNonContractItemsToParentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceNonContractItemsToParentAccount() {
        return invoiceNonContractItemsToParentAccount;
    }

    /**
     * Sets the value of the invoiceNonContractItemsToParentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceNonContractItemsToParentAccount(Object value) {
        this.invoiceNonContractItemsToParentAccount = value;
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
     * Gets the value of the quoteEmailMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuoteEmailMessageID() {
        return quoteEmailMessageID;
    }

    /**
     * Sets the value of the quoteEmailMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuoteEmailMessageID(Object value) {
        this.quoteEmailMessageID = value;
    }

    /**
     * Gets the value of the invoiceTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceTemplateID() {
        return invoiceTemplateID;
    }

    /**
     * Sets the value of the invoiceTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceTemplateID(Object value) {
        this.invoiceTemplateID = value;
    }

    /**
     * Gets the value of the invoiceEmailMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInvoiceEmailMessageID() {
        return invoiceEmailMessageID;
    }

    /**
     * Sets the value of the invoiceEmailMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInvoiceEmailMessageID(Object value) {
        this.invoiceEmailMessageID = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyID(Object value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the billToAccountPhysicalLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBillToAccountPhysicalLocationID() {
        return billToAccountPhysicalLocationID;
    }

    /**
     * Sets the value of the billToAccountPhysicalLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBillToAccountPhysicalLocationID(Object value) {
        this.billToAccountPhysicalLocationID = value;
    }

    /**
     * Gets the value of the surveyAccountRating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSurveyAccountRating() {
        return surveyAccountRating;
    }

    /**
     * Sets the value of the surveyAccountRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSurveyAccountRating(Object value) {
        this.surveyAccountRating = value;
    }

}
