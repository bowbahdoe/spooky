
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autotask.net/ATWS/v1_5/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DailyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="HourlyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InstallDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUsers" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PerUseCost" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTitle" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SetupFee" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VendorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InstalledByID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="InstalledByContactID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ParentInstalledProductID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ContractServiceBundleID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevelAgreementID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AccountPhysicalLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceUID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditArchitectureID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditDescription" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditDisplayAdaptorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditDomainID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditExternalIPAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditHostname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditIPAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMacAddress" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditManufacturerID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMemoryBytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditModelID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMotherboardID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditOperatingSystem" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditProcessorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditServicePackID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditStorageBytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditDeviceTypeID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditSNMPLocation" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditSNMPName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditSNMPContact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMobileNetworkOperatorID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMobileNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditMissingPatchCount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMOpenAlertCount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AEMDeviceAuditLastUser" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoSerialNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoInternalIP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoRemoteIP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoHostname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoProtectedKilobytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoUsedKilobytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoAvailableKilobytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoPercentageUsed" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoOffsiteUsedBytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoOSVersionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoZFSVersionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoKernelVersionID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoNICSpeedKilobitsPerSecond" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoDeviceMemoryMegabytes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoUptimeSeconds" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoNumberOfAgents" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoNumberOfDrives" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoDrivesErrors" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoNumberOfVolumes" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DattoLastCheckInDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledProduct", propOrder = {
    "createDate",
    "accountID",
    "active",
    "dailyCost",
    "hourlyCost",
    "installDate",
    "monthlyCost",
    "notes",
    "numberOfUsers",
    "perUseCost",
    "productID",
    "referenceNumber",
    "referenceTitle",
    "serialNumber",
    "setupFee",
    "warrantyExpirationDate",
    "contractID",
    "serviceID",
    "serviceBundleID",
    "type",
    "location",
    "contactID",
    "vendorID",
    "installedByID",
    "installedByContactID",
    "parentInstalledProductID",
    "lastModifiedTime",
    "contractServiceID",
    "contractServiceBundleID",
    "serviceLevelAgreementID",
    "accountPhysicalLocationID",
    "aemDeviceID",
    "aemDeviceUID",
    "aemDeviceAuditArchitectureID",
    "aemDeviceAuditDescription",
    "aemDeviceAuditDisplayAdaptorID",
    "aemDeviceAuditDomainID",
    "aemDeviceAuditExternalIPAddress",
    "aemDeviceAuditHostname",
    "aemDeviceAuditIPAddress",
    "aemDeviceAuditMacAddress",
    "aemDeviceAuditManufacturerID",
    "aemDeviceAuditMemoryBytes",
    "aemDeviceAuditModelID",
    "aemDeviceAuditMotherboardID",
    "aemDeviceAuditOperatingSystem",
    "aemDeviceAuditProcessorID",
    "aemDeviceAuditServicePackID",
    "aemDeviceAuditStorageBytes",
    "aemDeviceAuditDeviceTypeID",
    "aemDeviceAuditSNMPLocation",
    "aemDeviceAuditSNMPName",
    "aemDeviceAuditSNMPContact",
    "aemDeviceAuditMobileNetworkOperatorID",
    "aemDeviceAuditMobileNumber",
    "aemDeviceAuditMissingPatchCount",
    "aemOpenAlertCount",
    "aemDeviceAuditLastUser",
    "dattoSerialNumber",
    "dattoInternalIP",
    "dattoRemoteIP",
    "dattoHostname",
    "dattoProtectedKilobytes",
    "dattoUsedKilobytes",
    "dattoAvailableKilobytes",
    "dattoPercentageUsed",
    "dattoOffsiteUsedBytes",
    "dattoOSVersionID",
    "dattoZFSVersionID",
    "dattoKernelVersionID",
    "dattoNICSpeedKilobitsPerSecond",
    "dattoDeviceMemoryMegabytes",
    "dattoUptimeSeconds",
    "dattoNumberOfAgents",
    "dattoNumberOfDrives",
    "dattoDrivesErrors",
    "dattoNumberOfVolumes",
    "dattoLastCheckInDateTime"
})
public class InstalledProduct
    extends Entity
{

    @XmlElement(name = "CreateDate")
    protected Object createDate;
    @XmlElement(name = "AccountID")
    protected Object accountID;
    @XmlElement(name = "Active")
    protected Object active;
    @XmlElement(name = "DailyCost")
    protected Object dailyCost;
    @XmlElement(name = "HourlyCost")
    protected Object hourlyCost;
    @XmlElement(name = "InstallDate")
    protected Object installDate;
    @XmlElement(name = "MonthlyCost")
    protected Object monthlyCost;
    @XmlElement(name = "Notes")
    protected Object notes;
    @XmlElement(name = "NumberOfUsers")
    protected Object numberOfUsers;
    @XmlElement(name = "PerUseCost")
    protected Object perUseCost;
    @XmlElement(name = "ProductID")
    protected Object productID;
    @XmlElement(name = "ReferenceNumber")
    protected Object referenceNumber;
    @XmlElement(name = "ReferenceTitle")
    protected Object referenceTitle;
    @XmlElement(name = "SerialNumber")
    protected Object serialNumber;
    @XmlElement(name = "SetupFee")
    protected Object setupFee;
    @XmlElement(name = "WarrantyExpirationDate")
    protected Object warrantyExpirationDate;
    @XmlElement(name = "ContractID")
    protected Object contractID;
    @XmlElement(name = "ServiceID")
    protected Object serviceID;
    @XmlElement(name = "ServiceBundleID")
    protected Object serviceBundleID;
    @XmlElement(name = "Type")
    protected Object type;
    @XmlElement(name = "Location")
    protected Object location;
    @XmlElement(name = "ContactID")
    protected Object contactID;
    @XmlElement(name = "VendorID")
    protected Object vendorID;
    @XmlElement(name = "InstalledByID")
    protected Object installedByID;
    @XmlElement(name = "InstalledByContactID")
    protected Object installedByContactID;
    @XmlElement(name = "ParentInstalledProductID")
    protected Object parentInstalledProductID;
    @XmlElement(name = "LastModifiedTime")
    protected Object lastModifiedTime;
    @XmlElement(name = "ContractServiceID")
    protected Object contractServiceID;
    @XmlElement(name = "ContractServiceBundleID")
    protected Object contractServiceBundleID;
    @XmlElement(name = "ServiceLevelAgreementID")
    protected Object serviceLevelAgreementID;
    @XmlElement(name = "AccountPhysicalLocationID")
    protected Object accountPhysicalLocationID;
    @XmlElement(name = "AEMDeviceID")
    protected Object aemDeviceID;
    @XmlElement(name = "AEMDeviceUID")
    protected Object aemDeviceUID;
    @XmlElement(name = "AEMDeviceAuditArchitectureID")
    protected Object aemDeviceAuditArchitectureID;
    @XmlElement(name = "AEMDeviceAuditDescription")
    protected Object aemDeviceAuditDescription;
    @XmlElement(name = "AEMDeviceAuditDisplayAdaptorID")
    protected Object aemDeviceAuditDisplayAdaptorID;
    @XmlElement(name = "AEMDeviceAuditDomainID")
    protected Object aemDeviceAuditDomainID;
    @XmlElement(name = "AEMDeviceAuditExternalIPAddress")
    protected Object aemDeviceAuditExternalIPAddress;
    @XmlElement(name = "AEMDeviceAuditHostname")
    protected Object aemDeviceAuditHostname;
    @XmlElement(name = "AEMDeviceAuditIPAddress")
    protected Object aemDeviceAuditIPAddress;
    @XmlElement(name = "AEMDeviceAuditMacAddress")
    protected Object aemDeviceAuditMacAddress;
    @XmlElement(name = "AEMDeviceAuditManufacturerID")
    protected Object aemDeviceAuditManufacturerID;
    @XmlElement(name = "AEMDeviceAuditMemoryBytes")
    protected Object aemDeviceAuditMemoryBytes;
    @XmlElement(name = "AEMDeviceAuditModelID")
    protected Object aemDeviceAuditModelID;
    @XmlElement(name = "AEMDeviceAuditMotherboardID")
    protected Object aemDeviceAuditMotherboardID;
    @XmlElement(name = "AEMDeviceAuditOperatingSystem")
    protected Object aemDeviceAuditOperatingSystem;
    @XmlElement(name = "AEMDeviceAuditProcessorID")
    protected Object aemDeviceAuditProcessorID;
    @XmlElement(name = "AEMDeviceAuditServicePackID")
    protected Object aemDeviceAuditServicePackID;
    @XmlElement(name = "AEMDeviceAuditStorageBytes")
    protected Object aemDeviceAuditStorageBytes;
    @XmlElement(name = "AEMDeviceAuditDeviceTypeID")
    protected Object aemDeviceAuditDeviceTypeID;
    @XmlElement(name = "AEMDeviceAuditSNMPLocation")
    protected Object aemDeviceAuditSNMPLocation;
    @XmlElement(name = "AEMDeviceAuditSNMPName")
    protected Object aemDeviceAuditSNMPName;
    @XmlElement(name = "AEMDeviceAuditSNMPContact")
    protected Object aemDeviceAuditSNMPContact;
    @XmlElement(name = "AEMDeviceAuditMobileNetworkOperatorID")
    protected Object aemDeviceAuditMobileNetworkOperatorID;
    @XmlElement(name = "AEMDeviceAuditMobileNumber")
    protected Object aemDeviceAuditMobileNumber;
    @XmlElement(name = "AEMDeviceAuditMissingPatchCount")
    protected Object aemDeviceAuditMissingPatchCount;
    @XmlElement(name = "AEMOpenAlertCount")
    protected Object aemOpenAlertCount;
    @XmlElement(name = "AEMDeviceAuditLastUser")
    protected Object aemDeviceAuditLastUser;
    @XmlElement(name = "DattoSerialNumber")
    protected Object dattoSerialNumber;
    @XmlElement(name = "DattoInternalIP")
    protected Object dattoInternalIP;
    @XmlElement(name = "DattoRemoteIP")
    protected Object dattoRemoteIP;
    @XmlElement(name = "DattoHostname")
    protected Object dattoHostname;
    @XmlElement(name = "DattoProtectedKilobytes")
    protected Object dattoProtectedKilobytes;
    @XmlElement(name = "DattoUsedKilobytes")
    protected Object dattoUsedKilobytes;
    @XmlElement(name = "DattoAvailableKilobytes")
    protected Object dattoAvailableKilobytes;
    @XmlElement(name = "DattoPercentageUsed")
    protected Object dattoPercentageUsed;
    @XmlElement(name = "DattoOffsiteUsedBytes")
    protected Object dattoOffsiteUsedBytes;
    @XmlElement(name = "DattoOSVersionID")
    protected Object dattoOSVersionID;
    @XmlElement(name = "DattoZFSVersionID")
    protected Object dattoZFSVersionID;
    @XmlElement(name = "DattoKernelVersionID")
    protected Object dattoKernelVersionID;
    @XmlElement(name = "DattoNICSpeedKilobitsPerSecond")
    protected Object dattoNICSpeedKilobitsPerSecond;
    @XmlElement(name = "DattoDeviceMemoryMegabytes")
    protected Object dattoDeviceMemoryMegabytes;
    @XmlElement(name = "DattoUptimeSeconds")
    protected Object dattoUptimeSeconds;
    @XmlElement(name = "DattoNumberOfAgents")
    protected Object dattoNumberOfAgents;
    @XmlElement(name = "DattoNumberOfDrives")
    protected Object dattoNumberOfDrives;
    @XmlElement(name = "DattoDrivesErrors")
    protected Object dattoDrivesErrors;
    @XmlElement(name = "DattoNumberOfVolumes")
    protected Object dattoNumberOfVolumes;
    @XmlElement(name = "DattoLastCheckInDateTime")
    protected Object dattoLastCheckInDateTime;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDate(Object value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountID(Object value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActive(Object value) {
        this.active = value;
    }

    /**
     * Gets the value of the dailyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDailyCost() {
        return dailyCost;
    }

    /**
     * Sets the value of the dailyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDailyCost(Object value) {
        this.dailyCost = value;
    }

    /**
     * Gets the value of the hourlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHourlyCost() {
        return hourlyCost;
    }

    /**
     * Sets the value of the hourlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHourlyCost(Object value) {
        this.hourlyCost = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstallDate(Object value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the monthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * Sets the value of the monthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonthlyCost(Object value) {
        this.monthlyCost = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNotes(Object value) {
        this.notes = value;
    }

    /**
     * Gets the value of the numberOfUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNumberOfUsers() {
        return numberOfUsers;
    }

    /**
     * Sets the value of the numberOfUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNumberOfUsers(Object value) {
        this.numberOfUsers = value;
    }

    /**
     * Gets the value of the perUseCost property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPerUseCost() {
        return perUseCost;
    }

    /**
     * Sets the value of the perUseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPerUseCost(Object value) {
        this.perUseCost = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProductID(Object value) {
        this.productID = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReferenceNumber(Object value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the referenceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReferenceTitle() {
        return referenceTitle;
    }

    /**
     * Sets the value of the referenceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReferenceTitle(Object value) {
        this.referenceTitle = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSerialNumber(Object value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the setupFee property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSetupFee() {
        return setupFee;
    }

    /**
     * Sets the value of the setupFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSetupFee(Object value) {
        this.setupFee = value;
    }

    /**
     * Gets the value of the warrantyExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWarrantyExpirationDate() {
        return warrantyExpirationDate;
    }

    /**
     * Sets the value of the warrantyExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWarrantyExpirationDate(Object value) {
        this.warrantyExpirationDate = value;
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
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceID(Object value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceBundleID() {
        return serviceBundleID;
    }

    /**
     * Sets the value of the serviceBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceBundleID(Object value) {
        this.serviceBundleID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setType(Object value) {
        this.type = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocation(Object value) {
        this.location = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactID(Object value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVendorID(Object value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the installedByID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstalledByID() {
        return installedByID;
    }

    /**
     * Sets the value of the installedByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstalledByID(Object value) {
        this.installedByID = value;
    }

    /**
     * Gets the value of the installedByContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstalledByContactID() {
        return installedByContactID;
    }

    /**
     * Sets the value of the installedByContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstalledByContactID(Object value) {
        this.installedByContactID = value;
    }

    /**
     * Gets the value of the parentInstalledProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentInstalledProductID() {
        return parentInstalledProductID;
    }

    /**
     * Sets the value of the parentInstalledProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentInstalledProductID(Object value) {
        this.parentInstalledProductID = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedTime(Object value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the contractServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractServiceID() {
        return contractServiceID;
    }

    /**
     * Sets the value of the contractServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractServiceID(Object value) {
        this.contractServiceID = value;
    }

    /**
     * Gets the value of the contractServiceBundleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractServiceBundleID() {
        return contractServiceBundleID;
    }

    /**
     * Sets the value of the contractServiceBundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractServiceBundleID(Object value) {
        this.contractServiceBundleID = value;
    }

    /**
     * Gets the value of the serviceLevelAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getServiceLevelAgreementID() {
        return serviceLevelAgreementID;
    }

    /**
     * Sets the value of the serviceLevelAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceLevelAgreementID(Object value) {
        this.serviceLevelAgreementID = value;
    }

    /**
     * Gets the value of the accountPhysicalLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountPhysicalLocationID() {
        return accountPhysicalLocationID;
    }

    /**
     * Sets the value of the accountPhysicalLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountPhysicalLocationID(Object value) {
        this.accountPhysicalLocationID = value;
    }

    /**
     * Gets the value of the aemDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceID() {
        return aemDeviceID;
    }

    /**
     * Sets the value of the aemDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceID(Object value) {
        this.aemDeviceID = value;
    }

    /**
     * Gets the value of the aemDeviceUID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceUID() {
        return aemDeviceUID;
    }

    /**
     * Sets the value of the aemDeviceUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceUID(Object value) {
        this.aemDeviceUID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditArchitectureID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditArchitectureID() {
        return aemDeviceAuditArchitectureID;
    }

    /**
     * Sets the value of the aemDeviceAuditArchitectureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditArchitectureID(Object value) {
        this.aemDeviceAuditArchitectureID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditDescription() {
        return aemDeviceAuditDescription;
    }

    /**
     * Sets the value of the aemDeviceAuditDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditDescription(Object value) {
        this.aemDeviceAuditDescription = value;
    }

    /**
     * Gets the value of the aemDeviceAuditDisplayAdaptorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditDisplayAdaptorID() {
        return aemDeviceAuditDisplayAdaptorID;
    }

    /**
     * Sets the value of the aemDeviceAuditDisplayAdaptorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditDisplayAdaptorID(Object value) {
        this.aemDeviceAuditDisplayAdaptorID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditDomainID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditDomainID() {
        return aemDeviceAuditDomainID;
    }

    /**
     * Sets the value of the aemDeviceAuditDomainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditDomainID(Object value) {
        this.aemDeviceAuditDomainID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditExternalIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditExternalIPAddress() {
        return aemDeviceAuditExternalIPAddress;
    }

    /**
     * Sets the value of the aemDeviceAuditExternalIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditExternalIPAddress(Object value) {
        this.aemDeviceAuditExternalIPAddress = value;
    }

    /**
     * Gets the value of the aemDeviceAuditHostname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditHostname() {
        return aemDeviceAuditHostname;
    }

    /**
     * Sets the value of the aemDeviceAuditHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditHostname(Object value) {
        this.aemDeviceAuditHostname = value;
    }

    /**
     * Gets the value of the aemDeviceAuditIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditIPAddress() {
        return aemDeviceAuditIPAddress;
    }

    /**
     * Sets the value of the aemDeviceAuditIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditIPAddress(Object value) {
        this.aemDeviceAuditIPAddress = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMacAddress() {
        return aemDeviceAuditMacAddress;
    }

    /**
     * Sets the value of the aemDeviceAuditMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMacAddress(Object value) {
        this.aemDeviceAuditMacAddress = value;
    }

    /**
     * Gets the value of the aemDeviceAuditManufacturerID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditManufacturerID() {
        return aemDeviceAuditManufacturerID;
    }

    /**
     * Sets the value of the aemDeviceAuditManufacturerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditManufacturerID(Object value) {
        this.aemDeviceAuditManufacturerID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMemoryBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMemoryBytes() {
        return aemDeviceAuditMemoryBytes;
    }

    /**
     * Sets the value of the aemDeviceAuditMemoryBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMemoryBytes(Object value) {
        this.aemDeviceAuditMemoryBytes = value;
    }

    /**
     * Gets the value of the aemDeviceAuditModelID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditModelID() {
        return aemDeviceAuditModelID;
    }

    /**
     * Sets the value of the aemDeviceAuditModelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditModelID(Object value) {
        this.aemDeviceAuditModelID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMotherboardID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMotherboardID() {
        return aemDeviceAuditMotherboardID;
    }

    /**
     * Sets the value of the aemDeviceAuditMotherboardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMotherboardID(Object value) {
        this.aemDeviceAuditMotherboardID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditOperatingSystem() {
        return aemDeviceAuditOperatingSystem;
    }

    /**
     * Sets the value of the aemDeviceAuditOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditOperatingSystem(Object value) {
        this.aemDeviceAuditOperatingSystem = value;
    }

    /**
     * Gets the value of the aemDeviceAuditProcessorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditProcessorID() {
        return aemDeviceAuditProcessorID;
    }

    /**
     * Sets the value of the aemDeviceAuditProcessorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditProcessorID(Object value) {
        this.aemDeviceAuditProcessorID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditServicePackID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditServicePackID() {
        return aemDeviceAuditServicePackID;
    }

    /**
     * Sets the value of the aemDeviceAuditServicePackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditServicePackID(Object value) {
        this.aemDeviceAuditServicePackID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditStorageBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditStorageBytes() {
        return aemDeviceAuditStorageBytes;
    }

    /**
     * Sets the value of the aemDeviceAuditStorageBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditStorageBytes(Object value) {
        this.aemDeviceAuditStorageBytes = value;
    }

    /**
     * Gets the value of the aemDeviceAuditDeviceTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditDeviceTypeID() {
        return aemDeviceAuditDeviceTypeID;
    }

    /**
     * Sets the value of the aemDeviceAuditDeviceTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditDeviceTypeID(Object value) {
        this.aemDeviceAuditDeviceTypeID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditSNMPLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditSNMPLocation() {
        return aemDeviceAuditSNMPLocation;
    }

    /**
     * Sets the value of the aemDeviceAuditSNMPLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditSNMPLocation(Object value) {
        this.aemDeviceAuditSNMPLocation = value;
    }

    /**
     * Gets the value of the aemDeviceAuditSNMPName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditSNMPName() {
        return aemDeviceAuditSNMPName;
    }

    /**
     * Sets the value of the aemDeviceAuditSNMPName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditSNMPName(Object value) {
        this.aemDeviceAuditSNMPName = value;
    }

    /**
     * Gets the value of the aemDeviceAuditSNMPContact property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditSNMPContact() {
        return aemDeviceAuditSNMPContact;
    }

    /**
     * Sets the value of the aemDeviceAuditSNMPContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditSNMPContact(Object value) {
        this.aemDeviceAuditSNMPContact = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMobileNetworkOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMobileNetworkOperatorID() {
        return aemDeviceAuditMobileNetworkOperatorID;
    }

    /**
     * Sets the value of the aemDeviceAuditMobileNetworkOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMobileNetworkOperatorID(Object value) {
        this.aemDeviceAuditMobileNetworkOperatorID = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMobileNumber() {
        return aemDeviceAuditMobileNumber;
    }

    /**
     * Sets the value of the aemDeviceAuditMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMobileNumber(Object value) {
        this.aemDeviceAuditMobileNumber = value;
    }

    /**
     * Gets the value of the aemDeviceAuditMissingPatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditMissingPatchCount() {
        return aemDeviceAuditMissingPatchCount;
    }

    /**
     * Sets the value of the aemDeviceAuditMissingPatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditMissingPatchCount(Object value) {
        this.aemDeviceAuditMissingPatchCount = value;
    }

    /**
     * Gets the value of the aemOpenAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMOpenAlertCount() {
        return aemOpenAlertCount;
    }

    /**
     * Sets the value of the aemOpenAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMOpenAlertCount(Object value) {
        this.aemOpenAlertCount = value;
    }

    /**
     * Gets the value of the aemDeviceAuditLastUser property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAEMDeviceAuditLastUser() {
        return aemDeviceAuditLastUser;
    }

    /**
     * Sets the value of the aemDeviceAuditLastUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAEMDeviceAuditLastUser(Object value) {
        this.aemDeviceAuditLastUser = value;
    }

    /**
     * Gets the value of the dattoSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoSerialNumber() {
        return dattoSerialNumber;
    }

    /**
     * Sets the value of the dattoSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoSerialNumber(Object value) {
        this.dattoSerialNumber = value;
    }

    /**
     * Gets the value of the dattoInternalIP property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoInternalIP() {
        return dattoInternalIP;
    }

    /**
     * Sets the value of the dattoInternalIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoInternalIP(Object value) {
        this.dattoInternalIP = value;
    }

    /**
     * Gets the value of the dattoRemoteIP property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoRemoteIP() {
        return dattoRemoteIP;
    }

    /**
     * Sets the value of the dattoRemoteIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoRemoteIP(Object value) {
        this.dattoRemoteIP = value;
    }

    /**
     * Gets the value of the dattoHostname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoHostname() {
        return dattoHostname;
    }

    /**
     * Sets the value of the dattoHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoHostname(Object value) {
        this.dattoHostname = value;
    }

    /**
     * Gets the value of the dattoProtectedKilobytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoProtectedKilobytes() {
        return dattoProtectedKilobytes;
    }

    /**
     * Sets the value of the dattoProtectedKilobytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoProtectedKilobytes(Object value) {
        this.dattoProtectedKilobytes = value;
    }

    /**
     * Gets the value of the dattoUsedKilobytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoUsedKilobytes() {
        return dattoUsedKilobytes;
    }

    /**
     * Sets the value of the dattoUsedKilobytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoUsedKilobytes(Object value) {
        this.dattoUsedKilobytes = value;
    }

    /**
     * Gets the value of the dattoAvailableKilobytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoAvailableKilobytes() {
        return dattoAvailableKilobytes;
    }

    /**
     * Sets the value of the dattoAvailableKilobytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoAvailableKilobytes(Object value) {
        this.dattoAvailableKilobytes = value;
    }

    /**
     * Gets the value of the dattoPercentageUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoPercentageUsed() {
        return dattoPercentageUsed;
    }

    /**
     * Sets the value of the dattoPercentageUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoPercentageUsed(Object value) {
        this.dattoPercentageUsed = value;
    }

    /**
     * Gets the value of the dattoOffsiteUsedBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoOffsiteUsedBytes() {
        return dattoOffsiteUsedBytes;
    }

    /**
     * Sets the value of the dattoOffsiteUsedBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoOffsiteUsedBytes(Object value) {
        this.dattoOffsiteUsedBytes = value;
    }

    /**
     * Gets the value of the dattoOSVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoOSVersionID() {
        return dattoOSVersionID;
    }

    /**
     * Sets the value of the dattoOSVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoOSVersionID(Object value) {
        this.dattoOSVersionID = value;
    }

    /**
     * Gets the value of the dattoZFSVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoZFSVersionID() {
        return dattoZFSVersionID;
    }

    /**
     * Sets the value of the dattoZFSVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoZFSVersionID(Object value) {
        this.dattoZFSVersionID = value;
    }

    /**
     * Gets the value of the dattoKernelVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoKernelVersionID() {
        return dattoKernelVersionID;
    }

    /**
     * Sets the value of the dattoKernelVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoKernelVersionID(Object value) {
        this.dattoKernelVersionID = value;
    }

    /**
     * Gets the value of the dattoNICSpeedKilobitsPerSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoNICSpeedKilobitsPerSecond() {
        return dattoNICSpeedKilobitsPerSecond;
    }

    /**
     * Sets the value of the dattoNICSpeedKilobitsPerSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoNICSpeedKilobitsPerSecond(Object value) {
        this.dattoNICSpeedKilobitsPerSecond = value;
    }

    /**
     * Gets the value of the dattoDeviceMemoryMegabytes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoDeviceMemoryMegabytes() {
        return dattoDeviceMemoryMegabytes;
    }

    /**
     * Sets the value of the dattoDeviceMemoryMegabytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoDeviceMemoryMegabytes(Object value) {
        this.dattoDeviceMemoryMegabytes = value;
    }

    /**
     * Gets the value of the dattoUptimeSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoUptimeSeconds() {
        return dattoUptimeSeconds;
    }

    /**
     * Sets the value of the dattoUptimeSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoUptimeSeconds(Object value) {
        this.dattoUptimeSeconds = value;
    }

    /**
     * Gets the value of the dattoNumberOfAgents property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoNumberOfAgents() {
        return dattoNumberOfAgents;
    }

    /**
     * Sets the value of the dattoNumberOfAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoNumberOfAgents(Object value) {
        this.dattoNumberOfAgents = value;
    }

    /**
     * Gets the value of the dattoNumberOfDrives property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoNumberOfDrives() {
        return dattoNumberOfDrives;
    }

    /**
     * Sets the value of the dattoNumberOfDrives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoNumberOfDrives(Object value) {
        this.dattoNumberOfDrives = value;
    }

    /**
     * Gets the value of the dattoDrivesErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoDrivesErrors() {
        return dattoDrivesErrors;
    }

    /**
     * Sets the value of the dattoDrivesErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoDrivesErrors(Object value) {
        this.dattoDrivesErrors = value;
    }

    /**
     * Gets the value of the dattoNumberOfVolumes property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoNumberOfVolumes() {
        return dattoNumberOfVolumes;
    }

    /**
     * Sets the value of the dattoNumberOfVolumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoNumberOfVolumes(Object value) {
        this.dattoNumberOfVolumes = value;
    }

    /**
     * Gets the value of the dattoLastCheckInDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDattoLastCheckInDateTime() {
        return dattoLastCheckInDateTime;
    }

    /**
     * Sets the value of the dattoLastCheckInDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDattoLastCheckInDateTime(Object value) {
        this.dattoLastCheckInDateTime = value;
    }

}
