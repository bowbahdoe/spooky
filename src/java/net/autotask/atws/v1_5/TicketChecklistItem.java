
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketChecklistItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketChecklistItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Completed" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedByResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Important" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="KnowledgebaseArticleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketChecklistItem", propOrder = {
    "completed",
    "completedByResourceID",
    "completedDateTime",
    "important",
    "itemName",
    "knowledgebaseArticleID",
    "position",
    "ticketID"
})
public class TicketChecklistItem
    extends Entity
{

    @XmlElement(name = "Completed")
    protected Object completed;
    @XmlElement(name = "CompletedByResourceID")
    protected Object completedByResourceID;
    @XmlElement(name = "CompletedDateTime")
    protected Object completedDateTime;
    @XmlElement(name = "Important")
    protected Object important;
    @XmlElement(name = "ItemName")
    protected Object itemName;
    @XmlElement(name = "KnowledgebaseArticleID")
    protected Object knowledgebaseArticleID;
    @XmlElement(name = "Position")
    protected Object position;
    @XmlElement(name = "TicketID")
    protected Object ticketID;

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompleted(Object value) {
        this.completed = value;
    }

    /**
     * Gets the value of the completedByResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedByResourceID() {
        return completedByResourceID;
    }

    /**
     * Sets the value of the completedByResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedByResourceID(Object value) {
        this.completedByResourceID = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompletedDateTime(Object value) {
        this.completedDateTime = value;
    }

    /**
     * Gets the value of the important property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImportant() {
        return important;
    }

    /**
     * Sets the value of the important property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImportant(Object value) {
        this.important = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemName(Object value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the knowledgebaseArticleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKnowledgebaseArticleID() {
        return knowledgebaseArticleID;
    }

    /**
     * Sets the value of the knowledgebaseArticleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKnowledgebaseArticleID(Object value) {
        this.knowledgebaseArticleID = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPosition(Object value) {
        this.position = value;
    }

    /**
     * Gets the value of the ticketID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTicketID(Object value) {
        this.ticketID = value;
    }

}
