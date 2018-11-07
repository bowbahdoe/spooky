
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityDuplicateStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDuplicateStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Found" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MatchInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ignored" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityDuplicateStatus", propOrder = {
    "found",
    "matchInfo",
    "ignored"
})
public class EntityDuplicateStatus {

    @XmlElement(name = "Found")
    protected boolean found;
    @XmlElement(name = "MatchInfo")
    protected String matchInfo;
    @XmlElement(name = "Ignored")
    protected boolean ignored;

    /**
     * Gets the value of the found property.
     * 
     */
    public boolean isFound() {
        return found;
    }

    /**
     * Sets the value of the found property.
     * 
     */
    public void setFound(boolean value) {
        this.found = value;
    }

    /**
     * Gets the value of the matchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchInfo() {
        return matchInfo;
    }

    /**
     * Sets the value of the matchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchInfo(String value) {
        this.matchInfo = value;
    }

    /**
     * Gets the value of the ignored property.
     * 
     */
    public boolean isIgnored() {
        return ignored;
    }

    /**
     * Sets the value of the ignored property.
     * 
     */
    public void setIgnored(boolean value) {
        this.ignored = value;
    }

}
