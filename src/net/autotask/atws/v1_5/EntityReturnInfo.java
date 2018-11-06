
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityReturnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityReturnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DatabaseAction" type="{http://autotask.net/ATWS/v1_5/}EntityReturnInfoDatabaseAction"/&gt;
 *         &lt;element name="DuplicateStatus" type="{http://autotask.net/ATWS/v1_5/}EntityDuplicateStatus"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityReturnInfo", propOrder = {
    "entityId",
    "databaseAction",
    "duplicateStatus",
    "message"
})
public class EntityReturnInfo {

    @XmlElement(name = "EntityId")
    protected long entityId;
    @XmlElement(name = "DatabaseAction", required = true)
    @XmlSchemaType(name = "string")
    protected EntityReturnInfoDatabaseAction databaseAction;
    @XmlElement(name = "DuplicateStatus", required = true)
    protected EntityDuplicateStatus duplicateStatus;
    @XmlElement(name = "Message")
    protected String message;

    /**
     * Gets the value of the entityId property.
     * 
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the databaseAction property.
     * 
     * @return
     *     possible object is
     *     {@link EntityReturnInfoDatabaseAction }
     *     
     */
    public EntityReturnInfoDatabaseAction getDatabaseAction() {
        return databaseAction;
    }

    /**
     * Sets the value of the databaseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityReturnInfoDatabaseAction }
     *     
     */
    public void setDatabaseAction(EntityReturnInfoDatabaseAction value) {
        this.databaseAction = value;
    }

    /**
     * Gets the value of the duplicateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDuplicateStatus }
     *     
     */
    public EntityDuplicateStatus getDuplicateStatus() {
        return duplicateStatus;
    }

    /**
     * Sets the value of the duplicateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDuplicateStatus }
     *     
     */
    public void setDuplicateStatus(EntityDuplicateStatus value) {
        this.duplicateStatus = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
