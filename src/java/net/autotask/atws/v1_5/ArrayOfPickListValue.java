
package net.autotask.atws.v1_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPickListValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPickListValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickListValue" type="{http://autotask.net/ATWS/v1_5/}PickListValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPickListValue", propOrder = {
    "pickListValue"
})
public class ArrayOfPickListValue {

    @XmlElement(name = "PickListValue", nillable = true)
    protected List<PickListValue> pickListValue;

    /**
     * Gets the value of the pickListValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickListValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PickListValue }
     * 
     * 
     */
    public List<PickListValue> getPickListValue() {
        if (pickListValue == null) {
            pickListValue = new ArrayList<PickListValue>();
        }
        return this.pickListValue;
    }

}
