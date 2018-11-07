
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATWSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATWSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EntityResults" type="{http://autotask.net/ATWS/v1_5/}ArrayOfEntity" minOccurs="0"/&gt;
 *         &lt;element name="EntityResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://autotask.net/ATWS/v1_5/}ArrayOfATWSError" minOccurs="0"/&gt;
 *         &lt;element name="EntityReturnInfoResults" type="{http://autotask.net/ATWS/v1_5/}ArrayOfEntityReturnInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATWSResponse", propOrder = {
    "returnCode",
    "entityResults",
    "entityResultType",
    "errors",
    "entityReturnInfoResults"
})
public class ATWSResponse {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "EntityResults")
    protected ArrayOfEntity entityResults;
    @XmlElement(name = "EntityResultType")
    protected String entityResultType;
    @XmlElement(name = "Errors")
    protected ArrayOfATWSError errors;
    @XmlElement(name = "EntityReturnInfoResults")
    protected ArrayOfEntityReturnInfo entityReturnInfoResults;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the entityResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntity }
     *     
     */
    public ArrayOfEntity getEntityResults() {
        return entityResults;
    }

    /**
     * Sets the value of the entityResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntity }
     *     
     */
    public void setEntityResults(ArrayOfEntity value) {
        this.entityResults = value;
    }

    /**
     * Gets the value of the entityResultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityResultType() {
        return entityResultType;
    }

    /**
     * Sets the value of the entityResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityResultType(String value) {
        this.entityResultType = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfATWSError }
     *     
     */
    public ArrayOfATWSError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfATWSError }
     *     
     */
    public void setErrors(ArrayOfATWSError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the entityReturnInfoResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityReturnInfo }
     *     
     */
    public ArrayOfEntityReturnInfo getEntityReturnInfoResults() {
        return entityReturnInfoResults;
    }

    /**
     * Sets the value of the entityReturnInfoResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityReturnInfo }
     *     
     */
    public void setEntityReturnInfoResults(ArrayOfEntityReturnInfo value) {
        this.entityReturnInfoResults = value;
    }

}
