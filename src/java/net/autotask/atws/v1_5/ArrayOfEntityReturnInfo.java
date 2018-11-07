
package net.autotask.atws.v1_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEntityReturnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntityReturnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityReturnInfo" type="{http://autotask.net/ATWS/v1_5/}EntityReturnInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityReturnInfo", propOrder = {
    "entityReturnInfo"
})
public class ArrayOfEntityReturnInfo {

    @XmlElement(name = "EntityReturnInfo", nillable = true)
    protected List<EntityReturnInfo> entityReturnInfo;

    /**
     * Gets the value of the entityReturnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityReturnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityReturnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityReturnInfo }
     * 
     * 
     */
    public List<EntityReturnInfo> getEntityReturnInfo() {
        if (entityReturnInfo == null) {
            entityReturnInfo = new ArrayList<EntityReturnInfo>();
        }
        return this.entityReturnInfo;
    }

}
