
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskPredecessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskPredecessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LagDays" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PredecessorTaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SuccessorTaskID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskPredecessor", propOrder = {
    "lagDays",
    "predecessorTaskID",
    "successorTaskID"
})
public class TaskPredecessor
    extends Entity
{

    @XmlElement(name = "LagDays")
    protected Object lagDays;
    @XmlElement(name = "PredecessorTaskID")
    protected Object predecessorTaskID;
    @XmlElement(name = "SuccessorTaskID")
    protected Object successorTaskID;

    /**
     * Gets the value of the lagDays property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLagDays() {
        return lagDays;
    }

    /**
     * Sets the value of the lagDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLagDays(Object value) {
        this.lagDays = value;
    }

    /**
     * Gets the value of the predecessorTaskID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPredecessorTaskID() {
        return predecessorTaskID;
    }

    /**
     * Sets the value of the predecessorTaskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPredecessorTaskID(Object value) {
        this.predecessorTaskID = value;
    }

    /**
     * Gets the value of the successorTaskID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSuccessorTaskID() {
        return successorTaskID;
    }

    /**
     * Sets the value of the successorTaskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSuccessorTaskID(Object value) {
        this.successorTaskID = value;
    }

}
