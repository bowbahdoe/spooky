
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsQueryable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsReference" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReferenceEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPickList" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PicklistValues" type="{http://autotask.net/ATWS/v1_5/}ArrayOfPickListValue" minOccurs="0"/&gt;
 *         &lt;element name="PicklistParentValueField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
    "name",
    "label",
    "type",
    "length",
    "description",
    "isRequired",
    "isReadOnly",
    "isQueryable",
    "isReference",
    "referenceEntityType",
    "isPickList",
    "picklistValues",
    "picklistParentValueField",
    "defaultValue"
})
public class Field {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsRequired")
    protected boolean isRequired;
    @XmlElement(name = "IsReadOnly")
    protected boolean isReadOnly;
    @XmlElement(name = "IsQueryable")
    protected boolean isQueryable;
    @XmlElement(name = "IsReference")
    protected boolean isReference;
    @XmlElement(name = "ReferenceEntityType")
    protected String referenceEntityType;
    @XmlElement(name = "IsPickList")
    protected boolean isPickList;
    @XmlElement(name = "PicklistValues")
    protected ArrayOfPickListValue picklistValues;
    @XmlElement(name = "PicklistParentValueField")
    protected String picklistParentValueField;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     */
    public void setIsRequired(boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     */
    public void setIsReadOnly(boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isQueryable property.
     * 
     */
    public boolean isIsQueryable() {
        return isQueryable;
    }

    /**
     * Sets the value of the isQueryable property.
     * 
     */
    public void setIsQueryable(boolean value) {
        this.isQueryable = value;
    }

    /**
     * Gets the value of the isReference property.
     * 
     */
    public boolean isIsReference() {
        return isReference;
    }

    /**
     * Sets the value of the isReference property.
     * 
     */
    public void setIsReference(boolean value) {
        this.isReference = value;
    }

    /**
     * Gets the value of the referenceEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceEntityType() {
        return referenceEntityType;
    }

    /**
     * Sets the value of the referenceEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceEntityType(String value) {
        this.referenceEntityType = value;
    }

    /**
     * Gets the value of the isPickList property.
     * 
     */
    public boolean isIsPickList() {
        return isPickList;
    }

    /**
     * Sets the value of the isPickList property.
     * 
     */
    public void setIsPickList(boolean value) {
        this.isPickList = value;
    }

    /**
     * Gets the value of the picklistValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPickListValue }
     *     
     */
    public ArrayOfPickListValue getPicklistValues() {
        return picklistValues;
    }

    /**
     * Sets the value of the picklistValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPickListValue }
     *     
     */
    public void setPicklistValues(ArrayOfPickListValue value) {
        this.picklistValues = value;
    }

    /**
     * Gets the value of the picklistParentValueField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklistParentValueField() {
        return picklistParentValueField;
    }

    /**
     * Sets the value of the picklistParentValueField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklistParentValueField(String value) {
        this.picklistParentValueField = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

}
