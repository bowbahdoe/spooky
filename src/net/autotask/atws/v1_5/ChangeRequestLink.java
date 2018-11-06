
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeRequestLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRequestLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeRequestTicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProblemOrIncidentTicketID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRequestLink", propOrder = {
    "changeRequestTicketID",
    "problemOrIncidentTicketID"
})
public class ChangeRequestLink
    extends Entity
{

    @XmlElement(name = "ChangeRequestTicketID")
    protected Object changeRequestTicketID;
    @XmlElement(name = "ProblemOrIncidentTicketID")
    protected Object problemOrIncidentTicketID;

    /**
     * Gets the value of the changeRequestTicketID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChangeRequestTicketID() {
        return changeRequestTicketID;
    }

    /**
     * Sets the value of the changeRequestTicketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChangeRequestTicketID(Object value) {
        this.changeRequestTicketID = value;
    }

    /**
     * Gets the value of the problemOrIncidentTicketID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProblemOrIncidentTicketID() {
        return problemOrIncidentTicketID;
    }

    /**
     * Sets the value of the problemOrIncidentTicketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProblemOrIncidentTicketID(Object value) {
        this.problemOrIncidentTicketID = value;
    }

}
