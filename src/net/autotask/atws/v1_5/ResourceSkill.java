
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceSkill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSkill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SkillDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SkillID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SkillLevel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSkill", propOrder = {
    "resourceID",
    "skillDescription",
    "skillID",
    "skillLevel"
})
public class ResourceSkill
    extends Entity
{

    @XmlElement(name = "ResourceID")
    protected Object resourceID;
    @XmlElement(name = "SkillDescription")
    protected Object skillDescription;
    @XmlElement(name = "SkillID")
    protected Object skillID;
    @XmlElement(name = "SkillLevel")
    protected Object skillLevel;

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceID(Object value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the skillDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSkillDescription() {
        return skillDescription;
    }

    /**
     * Sets the value of the skillDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSkillDescription(Object value) {
        this.skillDescription = value;
    }

    /**
     * Gets the value of the skillID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSkillID() {
        return skillID;
    }

    /**
     * Sets the value of the skillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSkillID(Object value) {
        this.skillID = value;
    }

    /**
     * Gets the value of the skillLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSkillLevel() {
        return skillLevel;
    }

    /**
     * Sets the value of the skillLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSkillLevel(Object value) {
        this.skillLevel = value;
    }

}
