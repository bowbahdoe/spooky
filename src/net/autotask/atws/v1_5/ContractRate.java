
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractHourlyRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InternalCurrencyContractHourlyRate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRate", propOrder = {
    "roleID",
    "contractID",
    "contractHourlyRate",
    "internalCurrencyContractHourlyRate"
})
public class ContractRate
    extends Entity
{

    @XmlElement(name = "RoleID")
    protected Object roleID;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ContractHourlyRate")
    protected Object contractHourlyRate;
    @XmlElement(name = "InternalCurrencyContractHourlyRate")
    protected Object internalCurrencyContractHourlyRate;

    /**
     * Gets the value of the roleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRoleID() {
        return roleID;
    }

    /**
     * Sets the value of the roleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRoleID(Object value) {
        this.roleID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractID(Object value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the contractHourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractHourlyRate() {
        return contractHourlyRate;
    }

    /**
     * Sets the value of the contractHourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractHourlyRate(Object value) {
        this.contractHourlyRate = value;
    }

    /**
     * Gets the value of the internalCurrencyContractHourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInternalCurrencyContractHourlyRate() {
        return internalCurrencyContractHourlyRate;
    }

    /**
     * Sets the value of the internalCurrencyContractHourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInternalCurrencyContractHourlyRate(Object value) {
        this.internalCurrencyContractHourlyRate = value;
    }

}
