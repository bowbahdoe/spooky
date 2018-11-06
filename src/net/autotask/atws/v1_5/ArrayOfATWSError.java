
package net.autotask.atws.v1_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfATWSError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfATWSError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATWSError" type="{http://autotask.net/ATWS/v1_5/}ATWSError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfATWSError", propOrder = {
    "atwsError"
})
public class ArrayOfATWSError {

    @XmlElement(name = "ATWSError", nillable = true)
    protected List<ATWSError> atwsError;

    /**
     * Gets the value of the atwsError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atwsError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATWSError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATWSError }
     * 
     * 
     */
    public List<ATWSError> getATWSError() {
        if (atwsError == null) {
            atwsError = new ArrayList<ATWSError>();
        }
        return this.atwsError;
    }

}
