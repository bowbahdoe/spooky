
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://autotask.net/ATWS/v1_5/}ArrayOfField" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserDefinedFields" type="{http://autotask.net/ATWS/v1_5/}ArrayOfUserDefinedField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "fields",
    "id",
    "userDefinedFields"
})
@XmlSeeAlso({
    AttachmentInfo.class,
    QuoteLocation.class,
    ClassificationIcon.class,
    Tax.class,
    TaxCategory.class,
    TaxRegion.class,
    AccountLocation.class,
    ResourceSkill.class,
    Service.class,
    ServiceBundle.class,
    ShippingType.class,
    Skill.class,
    Quote.class,
    QuoteTemplate.class,
    SalesOrder.class,
    Country.class,
    QuoteItem.class,
    PurchaseOrderItem.class,
    PurchaseOrder.class,
    PurchaseOrderReceive.class,
    InventoryTransfer.class,
    InventoryItemSerialNumber.class,
    InventoryItem.class,
    InventoryLocation.class,
    Opportunity.class,
    ContractServiceBundleUnit.class,
    ContractServiceUnit.class,
    ContractServiceAdjustment.class,
    ContractServiceBundleAdjustment.class,
    ContractRetainer.class,
    ContractBlock.class,
    ContractTicketPurchase.class,
    ContractFactor.class,
    ContractRate.class,
    ContractRoleCost.class,
    ContractMilestone.class,
    ContractNote.class,
    ContractServiceBundle.class,
    ContractService.class,
    TimeEntry.class,
    Appointment.class,
    ServiceCallTask.class,
    ServiceCallTicket.class,
    ServiceCall.class,
    ServiceCallTaskResource.class,
    ServiceCallTicketResource.class,
    Task.class,
    Product.class,
    ProductVendor.class,
    Project.class,
    Phase.class,
    Role.class,
    Invoice.class,
    AllocationCode.class,
    Ticket.class,
    Contact.class,
    TicketNote.class,
    AccountNote.class,
    AccountToDo.class,
    ActionType.class,
    Account.class,
    AccountTeam.class,
    Contract.class,
    ContractExclusionAllocationCode.class,
    ContractExclusionRole.class,
    InstalledProduct.class,
    InstalledProductType.class,
    InstalledProductTypeUdfAssociation.class,
    Subscription.class,
    SubscriptionPeriod.class,
    Resource.class,
    BillingItem.class,
    ClientPortalUser.class,
    ExpenseReport.class,
    ExpenseItem.class,
    TaskNote.class,
    ProjectNote.class,
    BillingItemApprovalLevel.class,
    ContractCost.class,
    ProjectCost.class,
    ChangeRequestLink.class,
    TicketChangeRequestApproval.class,
    TicketCost.class,
    InternalLocation.class,
    UserDefinedFieldDefinition.class,
    UserDefinedFieldListItem.class,
    AdditionalInvoiceFieldValue.class,
    InvoiceTemplate.class,
    PaymentTerm.class,
    Department.class,
    TaskPredecessor.class,
    TaskSecondaryResource.class,
    TicketAdditionalContact.class,
    TicketSecondaryResource.class,
    ResourceRole.class,
    ServiceBundleService.class,
    AccountAlert.class,
    NotificationHistory.class,
    WorkTypeModifier.class,
    Currency.class,
    PriceListService.class,
    PriceListProduct.class,
    PriceListMaterialCode.class,
    PriceListRole.class,
    PriceListServiceBundle.class,
    PriceListWorkTypeModifier.class,
    ResourceRoleDepartment.class,
    ResourceRoleQueue.class,
    HolidaySet.class,
    Holiday.class,
    BusinessLocation.class,
    BusinessDivision.class,
    BusinessSubdivision.class,
    BusinessDivisionSubdivision.class,
    BusinessDivisionSubdivisionResource.class,
    AccountPhysicalLocation.class,
    TicketChecklistItem.class,
    TicketCategory.class,
    TicketCategoryFieldDefaults.class,
    ServiceLevelAgreementResults.class,
    PurchaseApproval.class,
    Survey.class,
    SurveyResults.class,
    ResourceServiceDeskRole.class
})
public abstract class Entity {

    @XmlElement(name = "Fields")
    protected ArrayOfField fields;
    protected long id;
    @XmlElement(name = "UserDefinedFields")
    protected ArrayOfUserDefinedField userDefinedFields;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setFields(ArrayOfField value) {
        this.fields = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the userDefinedFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserDefinedField }
     *     
     */
    public ArrayOfUserDefinedField getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * Sets the value of the userDefinedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserDefinedField }
     *     
     */
    public void setUserDefinedFields(ArrayOfUserDefinedField value) {
        this.userDefinedFields = value;
    }

}
