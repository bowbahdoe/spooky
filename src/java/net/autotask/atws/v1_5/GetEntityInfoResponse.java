
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
 *         &lt;element name="GetEntityInfoResult" type="{http://autotask.net/ATWS/v1_5/}ArrayOfEntityInfo" minOccurs="0"/&gt;
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
    "getEntityInfoResult"
})
@XmlRootElement(name = "GetEntityInfoResponse")
public class GetEntityInfoResponse {

    @XmlElement(name = "GetEntityInfoResult")
    protected ArrayOfEntityInfo getEntityInfoResult;

    /**
     * Gets the value of the getEntityInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityInfo }
     *     
     */
    public ArrayOfEntityInfo getGetEntityInfoResult() {
        return getEntityInfoResult;
    }

    /**
     * Sets the value of the getEntityInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityInfo }
     *     
     */
    public void setGetEntityInfoResult(ArrayOfEntityInfo value) {
        this.getEntityInfoResult = value;
    }

}
