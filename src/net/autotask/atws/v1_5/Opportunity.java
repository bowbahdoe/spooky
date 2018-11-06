
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedField1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedField2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedField3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedField4" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AdvancedField5" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentScore" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Barriers" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DateStamp" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HelpNeeded" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastActivity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LeadReferral" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LossReason" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LossReasonDetail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NextStep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryCompetitor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Probability" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedCloseDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedLiveDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PromotionName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipAssessmentScore" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RevenueSpread" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="RevenueSpreadUnit" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SalesProcessPercentComplete" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Stage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalAssessmentScore" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ThroughDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountMonths" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UseQuoteTotals" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WinReason" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WinReasonDetail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OnetimeCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OnetimeRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuarterlyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QuarterlyRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="YearlyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="YearlyRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SemiannualCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SemiannualRevenue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDivisionSubdivisionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "accountID",
    "advancedField1",
    "advancedField2",
    "advancedField3",
    "advancedField4",
    "advancedField5",
    "amount",
    "assessmentScore",
    "barriers",
    "closedDate",
    "contactID",
    "cost",
    "createDate",
    "dateStamp",
    "helpNeeded",
    "lastActivity",
    "leadReferral",
    "lossReason",
    "lossReasonDetail",
    "market",
    "nextStep",
    "ownerResourceID",
    "primaryCompetitor",
    "probability",
    "productID",
    "projectedCloseDate",
    "projectedLiveDate",
    "promotionName",
    "rating",
    "relationshipAssessmentScore",
    "revenueSpread",
    "revenueSpreadUnit",
    "salesOrderID",
    "salesProcessPercentComplete",
    "stage",
    "status",
    "technicalAssessmentScore",
    "throughDate",
    "title",
    "totalAmountMonths",
    "useQuoteTotals",
    "winReason",
    "winReasonDetail",
    "onetimeCost",
    "onetimeRevenue",
    "monthlyCost",
    "monthlyRevenue",
    "quarterlyCost",
    "quarterlyRevenue",
    "yearlyCost",
    "yearlyRevenue",
    "semiannualCost",
    "semiannualRevenue",
    "businessDivisionSubdivisionID"
})
public class Opportunity
    extends Entity
{

    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "AdvancedField1")
    protected Object advancedField1;
    @XmlElement(name = "AdvancedField2")
    protected Object advancedField2;
    @XmlElement(name = "AdvancedField3")
    protected Object advancedField3;
    @XmlElement(name = "AdvancedField4")
    protected Object advancedField4;
    @XmlElement(name = "AdvancedField5")
    protected Object advancedField5;
    @XmlElement(name = "Amount")
    protected Object amount;
    @XmlElement(name = "AssessmentScore")
    protected Object assessmentScore;
    @XmlElement(name = "Barriers")
    protected Object barriers;
    @XmlElement(name = "ClosedDate")
    protected Object closedDate;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "Cost")
    protected Object cost;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "DateStamp")
    protected Object dateStamp;
    @XmlElement(name = "HelpNeeded")
    protected Object helpNeeded;
    @XmlElement(name = "LastActivity")
    protected Object lastActivity;
    @XmlElement(name = "LeadReferral")
    protected Object leadReferral;
    @XmlElement(name = "LossReason")
    protected Object lossReason;
    @XmlElement(name = "LossReasonDetail")
    protected Object lossReasonDetail;
    @XmlElement(name = "Market")
    protected Object market;
    @XmlElement(name = "NextStep")
    protected Object nextStep;
    @XmlElement(name = "OwnerResourceID")
    protected Object ownerResourceID;
    @XmlElement(name = "PrimaryCompetitor")
    protected Object primaryCompetitor;
    @XmlElement(name = "Probability")
    protected Object probability;
    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "ProjectedCloseDate")
    protected Object projectedCloseDate;
    @XmlElement(name = "ProjectedLiveDate")
    protected Object projectedLiveDate;
    @XmlElement(name = "PromotionName")
    protected Object promotionName;
    @XmlElement(name = "Rating")
    protected Object rating;
    @XmlElement(name = "RelationshipAssessmentScore")
    protected Object relationshipAssessmentScore;
    @XmlElement(name = "RevenueSpread")
    protected Object revenueSpread;
    @XmlElement(name = "RevenueSpreadUnit")
    protected Object revenueSpreadUnit;
    @XmlElement(name = "SalesOrderID")
    protected Object salesOrderID;
    @XmlElement(name = "SalesProcessPercentComplete")
    protected Object salesProcessPercentComplete;
    @XmlElement(name = "Stage")
    protected Object stage;
    @XmlElement(name = "Status")
    protected Object status;
    @XmlElement(name = "TechnicalAssessmentScore")
    protected Object technicalAssessmentScore;
    @XmlElement(name = "ThroughDate")
    protected Object throughDate;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "TotalAmountMonths")
    protected Object totalAmountMonths;
    @XmlElement(name = "UseQuoteTotals")
    protected Object useQuoteTotals;
    @XmlElement(name = "WinReason")
    protected Object winReason;
    @XmlElement(name = "WinReasonDetail")
    protected Object winReasonDetail;
    @XmlElement(name = "OnetimeCost")
    protected Object onetimeCost;
    @XmlElement(name = "OnetimeRevenue")
    protected Object onetimeRevenue;
    @XmlElement(name = "MonthlyCost")
    protected Object monthlyCost;
    @XmlElement(name = "MonthlyRevenue")
    protected Object monthlyRevenue;
    @XmlElement(name = "QuarterlyCost")
    protected Object quarterlyCost;
    @XmlElement(name = "QuarterlyRevenue")
    protected Object quarterlyRevenue;
    @XmlElement(name = "YearlyCost")
    protected Object yearlyCost;
    @XmlElement(name = "YearlyRevenue")
    protected Object yearlyRevenue;
    @XmlElement(name = "SemiannualCost")
    protected Object semiannualCost;
    @XmlElement(name = "SemiannualRevenue")
    protected Object semiannualRevenue;
    @XmlElement(name = "BusinessDivisionSubdivisionID")
    protected Object businessDivisionSubdivisionID;

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
     * Gets the value of the advancedField1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedField1() {
        return advancedField1;
    }

    /**
     * Sets the value of the advancedField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedField1(Object value) {
        this.advancedField1 = value;
    }

    /**
     * Gets the value of the advancedField2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedField2() {
        return advancedField2;
    }

    /**
     * Sets the value of the advancedField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedField2(Object value) {
        this.advancedField2 = value;
    }

    /**
     * Gets the value of the advancedField3 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedField3() {
        return advancedField3;
    }

    /**
     * Sets the value of the advancedField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedField3(Object value) {
        this.advancedField3 = value;
    }

    /**
     * Gets the value of the advancedField4 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedField4() {
        return advancedField4;
    }

    /**
     * Sets the value of the advancedField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedField4(Object value) {
        this.advancedField4 = value;
    }

    /**
     * Gets the value of the advancedField5 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvancedField5() {
        return advancedField5;
    }

    /**
     * Sets the value of the advancedField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvancedField5(Object value) {
        this.advancedField5 = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAmount(Object value) {
        this.amount = value;
    }

    /**
     * Gets the value of the assessmentScore property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssessmentScore() {
        return assessmentScore;
    }

    /**
     * Sets the value of the assessmentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssessmentScore(Object value) {
        this.assessmentScore = value;
    }

    /**
     * Gets the value of the barriers property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBarriers() {
        return barriers;
    }

    /**
     * Sets the value of the barriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBarriers(Object value) {
        this.barriers = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClosedDate(Object value) {
        this.closedDate = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCost(Object value) {
        this.cost = value;
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
     * Gets the value of the dateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDateStamp() {
        return dateStamp;
    }

    /**
     * Sets the value of the dateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDateStamp(Object value) {
        this.dateStamp = value;
    }

    /**
     * Gets the value of the helpNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHelpNeeded() {
        return helpNeeded;
    }

    /**
     * Sets the value of the helpNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHelpNeeded(Object value) {
        this.helpNeeded = value;
    }

    /**
     * Gets the value of the lastActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastActivity() {
        return lastActivity;
    }

    /**
     * Sets the value of the lastActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastActivity(Object value) {
        this.lastActivity = value;
    }

    /**
     * Gets the value of the leadReferral property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLeadReferral() {
        return leadReferral;
    }

    /**
     * Sets the value of the leadReferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLeadReferral(Object value) {
        this.leadReferral = value;
    }

    /**
     * Gets the value of the lossReason property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLossReason() {
        return lossReason;
    }

    /**
     * Sets the value of the lossReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLossReason(Object value) {
        this.lossReason = value;
    }

    /**
     * Gets the value of the lossReasonDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLossReasonDetail() {
        return lossReasonDetail;
    }

    /**
     * Sets the value of the lossReasonDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLossReasonDetail(Object value) {
        this.lossReasonDetail = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMarket(Object value) {
        this.market = value;
    }

    /**
     * Gets the value of the nextStep property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNextStep() {
        return nextStep;
    }

    /**
     * Sets the value of the nextStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNextStep(Object value) {
        this.nextStep = value;
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
     * Gets the value of the primaryCompetitor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrimaryCompetitor() {
        return primaryCompetitor;
    }

    /**
     * Sets the value of the primaryCompetitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrimaryCompetitor(Object value) {
        this.primaryCompetitor = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProbability(Object value) {
        this.probability = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductID(Object value) {
        this.productID = value;
    }

    /**
     * Gets the value of the projectedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectedCloseDate() {
        return projectedCloseDate;
    }

    /**
     * Sets the value of the projectedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectedCloseDate(Object value) {
        this.projectedCloseDate = value;
    }

    /**
     * Gets the value of the projectedLiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProjectedLiveDate() {
        return projectedLiveDate;
    }

    /**
     * Sets the value of the projectedLiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProjectedLiveDate(Object value) {
        this.projectedLiveDate = value;
    }

    /**
     * Gets the value of the promotionName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPromotionName() {
        return promotionName;
    }

    /**
     * Sets the value of the promotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPromotionName(Object value) {
        this.promotionName = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRating(Object value) {
        this.rating = value;
    }

    /**
     * Gets the value of the relationshipAssessmentScore property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelationshipAssessmentScore() {
        return relationshipAssessmentScore;
    }

    /**
     * Sets the value of the relationshipAssessmentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelationshipAssessmentScore(Object value) {
        this.relationshipAssessmentScore = value;
    }

    /**
     * Gets the value of the revenueSpread property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRevenueSpread() {
        return revenueSpread;
    }

    /**
     * Sets the value of the revenueSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRevenueSpread(Object value) {
        this.revenueSpread = value;
    }

    /**
     * Gets the value of the revenueSpreadUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRevenueSpreadUnit() {
        return revenueSpreadUnit;
    }

    /**
     * Sets the value of the revenueSpreadUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRevenueSpreadUnit(Object value) {
        this.revenueSpreadUnit = value;
    }

    /**
     * Gets the value of the salesOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Sets the value of the salesOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSalesOrderID(Object value) {
        this.salesOrderID = value;
    }

    /**
     * Gets the value of the salesProcessPercentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSalesProcessPercentComplete() {
        return salesProcessPercentComplete;
    }

    /**
     * Sets the value of the salesProcessPercentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSalesProcessPercentComplete(Object value) {
        this.salesProcessPercentComplete = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStage(Object value) {
        this.stage = value;
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
     * Gets the value of the technicalAssessmentScore property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTechnicalAssessmentScore() {
        return technicalAssessmentScore;
    }

    /**
     * Sets the value of the technicalAssessmentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTechnicalAssessmentScore(Object value) {
        this.technicalAssessmentScore = value;
    }

    /**
     * Gets the value of the throughDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getThroughDate() {
        return throughDate;
    }

    /**
     * Sets the value of the throughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setThroughDate(Object value) {
        this.throughDate = value;
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
     * Gets the value of the totalAmountMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalAmountMonths() {
        return totalAmountMonths;
    }

    /**
     * Sets the value of the totalAmountMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalAmountMonths(Object value) {
        this.totalAmountMonths = value;
    }

    /**
     * Gets the value of the useQuoteTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUseQuoteTotals() {
        return useQuoteTotals;
    }

    /**
     * Sets the value of the useQuoteTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUseQuoteTotals(Object value) {
        this.useQuoteTotals = value;
    }

    /**
     * Gets the value of the winReason property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWinReason() {
        return winReason;
    }

    /**
     * Sets the value of the winReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWinReason(Object value) {
        this.winReason = value;
    }

    /**
     * Gets the value of the winReasonDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWinReasonDetail() {
        return winReasonDetail;
    }

    /**
     * Sets the value of the winReasonDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWinReasonDetail(Object value) {
        this.winReasonDetail = value;
    }

    /**
     * Gets the value of the onetimeCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOnetimeCost() {
        return onetimeCost;
    }

    /**
     * Sets the value of the onetimeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOnetimeCost(Object value) {
        this.onetimeCost = value;
    }

    /**
     * Gets the value of the onetimeRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOnetimeRevenue() {
        return onetimeRevenue;
    }

    /**
     * Sets the value of the onetimeRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOnetimeRevenue(Object value) {
        this.onetimeRevenue = value;
    }

    /**
     * Gets the value of the monthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * Sets the value of the monthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonthlyCost(Object value) {
        this.monthlyCost = value;
    }

    /**
     * Gets the value of the monthlyRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonthlyRevenue() {
        return monthlyRevenue;
    }

    /**
     * Sets the value of the monthlyRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonthlyRevenue(Object value) {
        this.monthlyRevenue = value;
    }

    /**
     * Gets the value of the quarterlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuarterlyCost() {
        return quarterlyCost;
    }

    /**
     * Sets the value of the quarterlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuarterlyCost(Object value) {
        this.quarterlyCost = value;
    }

    /**
     * Gets the value of the quarterlyRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQuarterlyRevenue() {
        return quarterlyRevenue;
    }

    /**
     * Sets the value of the quarterlyRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQuarterlyRevenue(Object value) {
        this.quarterlyRevenue = value;
    }

    /**
     * Gets the value of the yearlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getYearlyCost() {
        return yearlyCost;
    }

    /**
     * Sets the value of the yearlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setYearlyCost(Object value) {
        this.yearlyCost = value;
    }

    /**
     * Gets the value of the yearlyRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getYearlyRevenue() {
        return yearlyRevenue;
    }

    /**
     * Sets the value of the yearlyRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setYearlyRevenue(Object value) {
        this.yearlyRevenue = value;
    }

    /**
     * Gets the value of the semiannualCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSemiannualCost() {
        return semiannualCost;
    }

    /**
     * Sets the value of the semiannualCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSemiannualCost(Object value) {
        this.semiannualCost = value;
    }

    /**
     * Gets the value of the semiannualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSemiannualRevenue() {
        return semiannualRevenue;
    }

    /**
     * Sets the value of the semiannualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSemiannualRevenue(Object value) {
        this.semiannualRevenue = value;
    }

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

}
