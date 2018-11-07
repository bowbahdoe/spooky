
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayTaxCategory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayTaxCategorySuperscripts" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplaySeparateLineItemForEachTax" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="GroupBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemizeItemsInEachGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SortBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemizeServicesAndBundles" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayZeroAmountRecurringServicesAndBundles" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayRecurringServiceContractLabor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayFixedPriceContractLabor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RateCostExpression" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CoveredByRecurringServiceFixedPricePerTicketContractLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CoveredByBlockRetainerContractLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NonBillableLaborLabel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PageLayout" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerms" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PageNumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ShowGridHeader" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceTemplate", propOrder = {
    "displayTaxCategory",
    "displayTaxCategorySuperscripts",
    "displaySeparateLineItemForEachTax",
    "groupBy",
    "itemizeItemsInEachGroup",
    "sortBy",
    "itemizeServicesAndBundles",
    "displayZeroAmountRecurringServicesAndBundles",
    "displayRecurringServiceContractLabor",
    "displayFixedPriceContractLabor",
    "rateCostExpression",
    "coveredByRecurringServiceFixedPricePerTicketContractLabel",
    "coveredByBlockRetainerContractLabel",
    "nonBillableLaborLabel",
    "pageLayout",
    "paymentTerms",
    "pageNumberFormat",
    "dateFormat",
    "numberFormat",
    "timeFormat",
    "name",
    "showGridHeader",
    "showVerticalGridLines",
    "currencyPositiveFormat",
    "currencyNegativeFormat"
})
public class InvoiceTemplate
    extends Entity
{

    @XmlElement(name = "DisplayTaxCategory")
    protected Object displayTaxCategory;
    @XmlElement(name = "DisplayTaxCategorySuperscripts")
    protected Object displayTaxCategorySuperscripts;
    @XmlElement(name = "DisplaySeparateLineItemForEachTax")
    protected Object displaySeparateLineItemForEachTax;
    @XmlElement(name = "GroupBy")
    protected Object groupBy;
    @XmlElement(name = "ItemizeItemsInEachGroup")
    protected Object itemizeItemsInEachGroup;
    @XmlElement(name = "SortBy")
    protected Object sortBy;
    @XmlElement(name = "ItemizeServicesAndBundles")
    protected Object itemizeServicesAndBundles;
    @XmlElement(name = "DisplayZeroAmountRecurringServicesAndBundles")
    protected Object displayZeroAmountRecurringServicesAndBundles;
    @XmlElement(name = "DisplayRecurringServiceContractLabor")
    protected Object displayRecurringServiceContractLabor;
    @XmlElement(name = "DisplayFixedPriceContractLabor")
    protected Object displayFixedPriceContractLabor;
    @XmlElement(name = "RateCostExpression")
    protected Object rateCostExpression;
    @XmlElement(name = "CoveredByRecurringServiceFixedPricePerTicketContractLabel")
    protected Object coveredByRecurringServiceFixedPricePerTicketContractLabel;
    @XmlElement(name = "CoveredByBlockRetainerContractLabel")
    protected Object coveredByBlockRetainerContractLabel;
    @XmlElement(name = "NonBillableLaborLabel")
    protected Object nonBillableLaborLabel;
    @XmlElement(name = "PageLayout")
    protected Object pageLayout;
    @XmlElement(name = "PaymentTerms")
    protected Object paymentTerms;
    @XmlElement(name = "PageNumberFormat")
    protected Object pageNumberFormat;
    @XmlElement(name = "DateFormat")
    protected Object dateFormat;
    @XmlElement(name = "NumberFormat")
    protected Object numberFormat;
    @XmlElement(name = "TimeFormat")
    protected Object timeFormat;
    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "ShowGridHeader")
    protected Object showGridHeader;
    @XmlElement(name = "ShowVerticalGridLines")
    protected Object showVerticalGridLines;
    @XmlElement(name = "CurrencyPositiveFormat")
    protected Object currencyPositiveFormat;
    @XmlElement(name = "CurrencyNegativeFormat")
    protected Object currencyNegativeFormat;

    /**
     * Gets the value of the displayTaxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayTaxCategory() {
        return displayTaxCategory;
    }

    /**
     * Sets the value of the displayTaxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayTaxCategory(Object value) {
        this.displayTaxCategory = value;
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
     * Gets the value of the displaySeparateLineItemForEachTax property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplaySeparateLineItemForEachTax() {
        return displaySeparateLineItemForEachTax;
    }

    /**
     * Sets the value of the displaySeparateLineItemForEachTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplaySeparateLineItemForEachTax(Object value) {
        this.displaySeparateLineItemForEachTax = value;
    }

    /**
     * Gets the value of the groupBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGroupBy(Object value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the itemizeItemsInEachGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemizeItemsInEachGroup() {
        return itemizeItemsInEachGroup;
    }

    /**
     * Sets the value of the itemizeItemsInEachGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemizeItemsInEachGroup(Object value) {
        this.itemizeItemsInEachGroup = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSortBy(Object value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the itemizeServicesAndBundles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemizeServicesAndBundles() {
        return itemizeServicesAndBundles;
    }

    /**
     * Sets the value of the itemizeServicesAndBundles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemizeServicesAndBundles(Object value) {
        this.itemizeServicesAndBundles = value;
    }

    /**
     * Gets the value of the displayZeroAmountRecurringServicesAndBundles property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayZeroAmountRecurringServicesAndBundles() {
        return displayZeroAmountRecurringServicesAndBundles;
    }

    /**
     * Sets the value of the displayZeroAmountRecurringServicesAndBundles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayZeroAmountRecurringServicesAndBundles(Object value) {
        this.displayZeroAmountRecurringServicesAndBundles = value;
    }

    /**
     * Gets the value of the displayRecurringServiceContractLabor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayRecurringServiceContractLabor() {
        return displayRecurringServiceContractLabor;
    }

    /**
     * Sets the value of the displayRecurringServiceContractLabor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayRecurringServiceContractLabor(Object value) {
        this.displayRecurringServiceContractLabor = value;
    }

    /**
     * Gets the value of the displayFixedPriceContractLabor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayFixedPriceContractLabor() {
        return displayFixedPriceContractLabor;
    }

    /**
     * Sets the value of the displayFixedPriceContractLabor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayFixedPriceContractLabor(Object value) {
        this.displayFixedPriceContractLabor = value;
    }

    /**
     * Gets the value of the rateCostExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRateCostExpression() {
        return rateCostExpression;
    }

    /**
     * Sets the value of the rateCostExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRateCostExpression(Object value) {
        this.rateCostExpression = value;
    }

    /**
     * Gets the value of the coveredByRecurringServiceFixedPricePerTicketContractLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoveredByRecurringServiceFixedPricePerTicketContractLabel() {
        return coveredByRecurringServiceFixedPricePerTicketContractLabel;
    }

    /**
     * Sets the value of the coveredByRecurringServiceFixedPricePerTicketContractLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoveredByRecurringServiceFixedPricePerTicketContractLabel(Object value) {
        this.coveredByRecurringServiceFixedPricePerTicketContractLabel = value;
    }

    /**
     * Gets the value of the coveredByBlockRetainerContractLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoveredByBlockRetainerContractLabel() {
        return coveredByBlockRetainerContractLabel;
    }

    /**
     * Sets the value of the coveredByBlockRetainerContractLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoveredByBlockRetainerContractLabel(Object value) {
        this.coveredByBlockRetainerContractLabel = value;
    }

    /**
     * Gets the value of the nonBillableLaborLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNonBillableLaborLabel() {
        return nonBillableLaborLabel;
    }

    /**
     * Sets the value of the nonBillableLaborLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNonBillableLaborLabel(Object value) {
        this.nonBillableLaborLabel = value;
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
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPaymentTerms(Object value) {
        this.paymentTerms = value;
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
