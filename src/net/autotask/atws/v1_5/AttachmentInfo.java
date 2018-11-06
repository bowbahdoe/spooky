
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ParentType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FullPath" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AttachDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AttachedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AttachedByContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Publish" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentInfo", propOrder = {
    "parentID",
    "parentType",
    "type",
    "title",
    "fullPath",
    "attachDate",
    "fileSize",
    "attachedByResourceID",
    "attachedByContactID",
    "publish",
    "contentType",
    "opportunityID"
})
public class AttachmentInfo
    extends Entity
{

    @XmlElement(name = "ParentID")
    protected Object parentID;
    @XmlElement(name = "ParentType")
    protected Object parentType;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "Title")
    protected Object title;
    @XmlElement(name = "FullPath")
    protected Object fullPath;
    @XmlElement(name = "AttachDate")
    protected Object attachDate;
    @XmlElement(name = "FileSize")
    protected Object fileSize;
    @XmlElement(name = "AttachedByResourceID")
    protected Object attachedByResourceID;
    @XmlElement(name = "AttachedByContactID")
    protected Object attachedByContactID;
    @XmlElement(name = "Publish")
    protected Object publish;
    @XmlElement(name = "ContentType")
    protected Object contentType;
    @XmlElement(name = "OpportunityID")
    protected Object opportunityID;

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentID(Object value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the parentType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentType(Object value) {
        this.parentType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setType(Object value) {
        this.type = value;
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
     * Gets the value of the fullPath property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFullPath() {
        return fullPath;
    }

    /**
     * Sets the value of the fullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFullPath(Object value) {
        this.fullPath = value;
    }

    /**
     * Gets the value of the attachDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttachDate() {
        return attachDate;
    }

    /**
     * Sets the value of the attachDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttachDate(Object value) {
        this.attachDate = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFileSize(Object value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the attachedByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttachedByResourceID() {
        return attachedByResourceID;
    }

    /**
     * Sets the value of the attachedByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttachedByResourceID(Object value) {
        this.attachedByResourceID = value;
    }

    /**
     * Gets the value of the attachedByContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttachedByContactID() {
        return attachedByContactID;
    }

    /**
     * Sets the value of the attachedByContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttachedByContactID(Object value) {
        this.attachedByContactID = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPublish(Object value) {
        this.publish = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContentType(Object value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpportunityID(Object value) {
        this.opportunityID = value;
    }

}
