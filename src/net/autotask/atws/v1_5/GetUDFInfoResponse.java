
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getUDFInfoResult" type="{http://autotask.net/ATWS/v1_5/}ArrayOfField" minOccurs="0"/&gt;
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
    "getUDFInfoResult"
})
@XmlRootElement(name = "getUDFInfoResponse")
public class GetUDFInfoResponse {

    protected ArrayOfField getUDFInfoResult;

    /**
     * Gets the value of the getUDFInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfField }
     *     
     */
    public ArrayOfField getGetUDFInfoResult() {
        return getUDFInfoResult;
    }

    /**
     * Sets the value of the getUDFInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfField }
     *     
     */
    public void setGetUDFInfoResult(ArrayOfField value) {
        this.getUDFInfoResult = value;
    }

}
