
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sxml"
})
@XmlRootElement(name = "query")
public class Query {

    @XmlElement(name = "sXML")
    protected String sxml;

    /**
     * Gets the value of the sxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSXML() {
        return sxml;
    }

    /**
     * Sets the value of the sxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSXML(String value) {
        this.sxml = value;
    }

}
