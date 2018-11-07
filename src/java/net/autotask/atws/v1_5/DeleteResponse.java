
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
 *         &lt;element name="deleteResult" type="{http://autotask.net/ATWS/v1_5/}ATWSResponse" minOccurs="0"/&gt;
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
    "deleteResult"
})
@XmlRootElement(name = "deleteResponse")
public class DeleteResponse {

    protected ATWSResponse deleteResult;

    /**
     * Gets the value of the deleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ATWSResponse }
     *     
     */
    public ATWSResponse getDeleteResult() {
        return deleteResult;
    }

    /**
     * Sets the value of the deleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATWSResponse }
     *     
     */
    public void setDeleteResult(ATWSResponse value) {
        this.deleteResult = value;
    }

}
