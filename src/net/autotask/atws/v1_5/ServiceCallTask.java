
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCallTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCallTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceCallID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCallTask", propOrder = {
    "serviceCallID",
    "taskID"
})
public class ServiceCallTask
    extends Entity
{

    @XmlElement(name = "ServiceCallID")
    protected Object serviceCallID;
    @XmlElement(name = "TaskID")
    protected Object taskID;

    /**
     * Gets the value of the serviceCallID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceCallID() {
        return serviceCallID;
    }

    /**
     * Sets the value of the serviceCallID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceCallID(Object value) {
        this.serviceCallID = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTaskID(Object value) {
        this.taskID = value;
    }

}
