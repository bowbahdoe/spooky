
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedFieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedFieldDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UdfType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsFieldMapping" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsEncrypted" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MergeVariableName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CrmToProjectUdfId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayFormat" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="IsVisibleToClientPortal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedFieldDefinition", propOrder = {
    "name",
    "description",
    "udfType",
    "dataType",
    "defaultValue",
    "isFieldMapping",
    "isProtected",
    "isEncrypted",
    "isRequired",
    "isActive",
    "createDate",
    "mergeVariableName",
    "crmToProjectUdfId",
    "displayFormat",
    "sortOrder",
    "numberOfDecimalPlaces",
    "isVisibleToClientPortal"
})
public class UserDefinedFieldDefinition
    extends Entity
{

    @XmlElement(name = "Name")
    protected Object name;
    @XmlElement(name = "Description")
    protected Object description;
    @XmlElement(name = "UdfType")
    protected Object udfType;
    @XmlElement(name = "DataType")
    protected Object dataType;
    @XmlElement(name = "DefaultValue")
    protected Object defaultValue;
    @XmlElement(name = "IsFieldMapping")
    protected Object isFieldMapping;
    @XmlElement(name = "IsProtected")
    protected Object isProtected;
    @XmlElement(name = "IsEncrypted")
    protected Object isEncrypted;
    @XmlElement(name = "IsRequired")
    protected Object isRequired;
    @XmlElement(name = "IsActive")
    protected Object isActive;
    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "MergeVariableName")
    protected Object mergeVariableName;
    @XmlElement(name = "CrmToProjectUdfId")
    protected Object crmToProjectUdfId;
    @XmlElement(name = "DisplayFormat")
    protected Object displayFormat;
    @XmlElement(name = "SortOrder")
    protected Object sortOrder;
    @XmlElement(name = "NumberOfDecimalPlaces")
    protected Object numberOfDecimalPlaces;
    @XmlElement(name = "IsVisibleToClientPortal")
    protected Object isVisibleToClientPortal;

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
     * Gets the value of the udfType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUdfType() {
        return udfType;
    }

    /**
     * Sets the value of the udfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUdfType(Object value) {
        this.udfType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataType(Object value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultValue(Object value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isFieldMapping property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsFieldMapping() {
        return isFieldMapping;
    }

    /**
     * Sets the value of the isFieldMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsFieldMapping(Object value) {
        this.isFieldMapping = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsProtected(Object value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the isEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Sets the value of the isEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsEncrypted(Object value) {
        this.isEncrypted = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsRequired(Object value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsActive(Object value) {
        this.isActive = value;
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
     * Gets the value of the mergeVariableName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMergeVariableName() {
        return mergeVariableName;
    }

    /**
     * Sets the value of the mergeVariableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMergeVariableName(Object value) {
        this.mergeVariableName = value;
    }

    /**
     * Gets the value of the crmToProjectUdfId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCrmToProjectUdfId() {
        return crmToProjectUdfId;
    }

    /**
     * Sets the value of the crmToProjectUdfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCrmToProjectUdfId(Object value) {
        this.crmToProjectUdfId = value;
    }

    /**
     * Gets the value of the displayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisplayFormat() {
        return displayFormat;
    }

    /**
     * Sets the value of the displayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisplayFormat(Object value) {
        this.displayFormat = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSortOrder(Object value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the numberOfDecimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumberOfDecimalPlaces() {
        return numberOfDecimalPlaces;
    }

    /**
     * Sets the value of the numberOfDecimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumberOfDecimalPlaces(Object value) {
        this.numberOfDecimalPlaces = value;
    }

    /**
     * Gets the value of the isVisibleToClientPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIsVisibleToClientPortal() {
        return isVisibleToClientPortal;
    }

    /**
     * Sets the value of the isVisibleToClientPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIsVisibleToClientPortal(Object value) {
        this.isVisibleToClientPortal = value;
    }

}
