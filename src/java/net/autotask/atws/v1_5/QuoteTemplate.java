
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CalculateTaxSeparately" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayCurrencySymbol" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayTaxCategorySuperscripts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivityBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PageLayout" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PageNumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowEachTaxInGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowGridHeader" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowTaxCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowVerticalGridLines" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyPositiveFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyNegativeFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteTemplate", propOrder = {
    "active",
    "calculateTaxSeparately",
    "createdBy",
    "createDate",
    "dateFormat",
    "description",
    "displayCurrencySymbol",
    "displayTaxCategorySuperscripts",
    "lastActivityDate",
    "lastActivityBy",
    "name",
    "numberFormat",
    "pageLayout",
    "pageNumberFormat",
    "showEachTaxInGroup",
    "showGridHeader",
    "showTaxCategory",
    "showVerticalGridLines",
    "currencyPositiveFormat",
    "currencyNegativeFormat"
})
public class QuoteTemplate
    extends Entity
{

    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "CalculateTaxSeparately")
    protected Object calculateTaxSeparately;
    @XmlElement(name = "CreatedBy")
    protected Object createdBy;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "DateFormat")
    protected Object dateFormat;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "DisplayCurrencySymbol")
    protected Object displayCurrencySymbol;
    @XmlElement(name = "DisplayTaxCategorySuperscripts")
    protected Object displayTaxCategorySuperscripts;
    @XmlElement(name = "LastActivityDate")
    protected Object lastActivityDate;
    @XmlElement(name = "LastActivityBy")
    protected Object lastActivityBy;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "NumberFormat")
    protected Object numberFormat;
    @XmlElement(name = "PageLayout")
    protected Object pageLayout;
    @XmlElement(name = "PageNumberFormat")
    protected Object pageNumberFormat;
    @XmlElement(name = "ShowEachTaxInGroup")
    protected Object showEachTaxInGroup;
    @XmlElement(name = "ShowGridHeader")
    protected Object showGridHeader;
    @XmlElement(name = "ShowTaxCategory")
    protected Object showTaxCategory;
    @XmlElement(name = "ShowVerticalGridLines")
    protected Object showVerticalGridLines;
    @XmlElement(name = "CurrencyPositiveFormat")
    protected Object currencyPositiveFormat;
    @XmlElement(name = "CurrencyNegativeFormat")
    protected Object currencyNegativeFormat;

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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreatedBy(Object value) {
        this.createdBy = value;
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
     * Gets the value of the displayCurrencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayCurrencySymbol() {
        return displayCurrencySymbol;
    }

    /**
     * Sets the value of the displayCurrencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayCurrencySymbol(Object value) {
        this.displayCurrencySymbol = value;
    }

    /**
     * Gets the value of the displayTaxCategorySuperscripts property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayTaxCategorySuperscripts() {
        return displayTaxCategorySuperscripts;
    }

    /**
     * Sets the value of the displayTaxCategorySuperscripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayTaxCategorySuperscripts(Object value) {
        this.displayTaxCategorySuperscripts = value;
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
     * Gets the value of the lastActivityBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivityBy() {
        return lastActivityBy;
    }

    /**
     * Sets the value of the lastActivityBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivityBy(Object value) {
        this.lastActivityBy = value;
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
     * Gets the value of the pageLayout property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageLayout() {
        return pageLayout;
    }

    /**
     * Sets the value of the pageLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageLayout(Object value) {
        this.pageLayout = value;
    }

    /**
     * Gets the value of the pageNumberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPageNumberFormat() {
        return pageNumberFormat;
    }

    /**
     * Sets the value of the pageNumberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPageNumberFormat(Object value) {
        this.pageNumberFormat = value;
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
     * Gets the value of the showGridHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShowGridHeader() {
        return showGridHeader;
    }

    /**
     * Sets the value of the showGridHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShowGridHeader(Object value) {
        this.showGridHeader = value;
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
     * Gets the value of the showVerticalGridLines property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShowVerticalGridLines() {
        return showVerticalGridLines;
    }

    /**
     * Sets the value of the showVerticalGridLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShowVerticalGridLines(Object value) {
        this.showVerticalGridLines = value;
    }

    /**
     * Gets the value of the currencyPositiveFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyPositiveFormat() {
        return currencyPositiveFormat;
    }

    /**
     * Sets the value of the currencyPositiveFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyPositiveFormat(Object value) {
        this.currencyPositiveFormat = value;
    }

    /**
     * Gets the value of the currencyNegativeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCurrencyNegativeFormat() {
        return currencyNegativeFormat;
    }

    /**
     * Sets the value of the currencyNegativeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCurrencyNegativeFormat(Object value) {
        this.currencyNegativeFormat = value;
    }

}
