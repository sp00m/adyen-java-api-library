/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Terminal
 */
@JsonPropertyOrder({
  Terminal.JSON_PROPERTY_ASSIGNED,
  Terminal.JSON_PROPERTY_BLUETOOTH_IP,
  Terminal.JSON_PROPERTY_BLUETOOTH_MAC,
  Terminal.JSON_PROPERTY_CITY,
  Terminal.JSON_PROPERTY_COMPANY_ACCOUNT,
  Terminal.JSON_PROPERTY_COUNTRY_CODE,
  Terminal.JSON_PROPERTY_DEVICE_MODEL,
  Terminal.JSON_PROPERTY_ETHERNET_IP,
  Terminal.JSON_PROPERTY_ETHERNET_MAC,
  Terminal.JSON_PROPERTY_FIRMWARE_VERSION,
  Terminal.JSON_PROPERTY_ICCID,
  Terminal.JSON_PROPERTY_ID,
  Terminal.JSON_PROPERTY_LAST_ACTIVITY_DATE_TIME,
  Terminal.JSON_PROPERTY_LAST_TRANSACTION_DATE_TIME,
  Terminal.JSON_PROPERTY_LINK_NEGOTIATION,
  Terminal.JSON_PROPERTY_SERIAL_NUMBER,
  Terminal.JSON_PROPERTY_SIM_STATUS,
  Terminal.JSON_PROPERTY_STATUS,
  Terminal.JSON_PROPERTY_STORE_STATUS,
  Terminal.JSON_PROPERTY_WIFI_IP,
  Terminal.JSON_PROPERTY_WIFI_MAC,
  Terminal.JSON_PROPERTY_WIFI_SSID
})

public class Terminal {
  public static final String JSON_PROPERTY_ASSIGNED = "assigned";
  private Boolean assigned;

  public static final String JSON_PROPERTY_BLUETOOTH_IP = "bluetoothIp";
  private String bluetoothIp;

  public static final String JSON_PROPERTY_BLUETOOTH_MAC = "bluetoothMac";
  private String bluetoothMac;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COMPANY_ACCOUNT = "companyAccount";
  private String companyAccount;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_DEVICE_MODEL = "deviceModel";
  private String deviceModel;

  public static final String JSON_PROPERTY_ETHERNET_IP = "ethernetIp";
  private String ethernetIp;

  public static final String JSON_PROPERTY_ETHERNET_MAC = "ethernetMac";
  private String ethernetMac;

  public static final String JSON_PROPERTY_FIRMWARE_VERSION = "firmwareVersion";
  private String firmwareVersion;

  public static final String JSON_PROPERTY_ICCID = "iccid";
  private String iccid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LAST_ACTIVITY_DATE_TIME = "lastActivityDateTime";
  private OffsetDateTime lastActivityDateTime;

  public static final String JSON_PROPERTY_LAST_TRANSACTION_DATE_TIME = "lastTransactionDateTime";
  private OffsetDateTime lastTransactionDateTime;

  public static final String JSON_PROPERTY_LINK_NEGOTIATION = "linkNegotiation";
  private String linkNegotiation;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_SIM_STATUS = "simStatus";
  private String simStatus;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STORE_STATUS = "storeStatus";
  private String storeStatus;

  public static final String JSON_PROPERTY_WIFI_IP = "wifiIp";
  private String wifiIp;

  public static final String JSON_PROPERTY_WIFI_MAC = "wifiMac";
  private String wifiMac;

  public static final String JSON_PROPERTY_WIFI_SSID = "wifiSsid";
  private String wifiSsid;

  public Terminal() { 
  }

  public Terminal assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * The [assignment status](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api) of the terminal. If true, the terminal is assigned. If false, the terminal is in inventory and can&#39;t be boarded.
   * @return assigned
  **/
  @ApiModelProperty(value = "The [assignment status](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api) of the terminal. If true, the terminal is assigned. If false, the terminal is in inventory and can't be boarded.")
  @JsonProperty(JSON_PROPERTY_ASSIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAssigned() {
    return assigned;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }


  public Terminal bluetoothIp(String bluetoothIp) {
    this.bluetoothIp = bluetoothIp;
    return this;
  }

   /**
   * The Bluetooth IP address of the terminal.
   * @return bluetoothIp
  **/
  @ApiModelProperty(value = "The Bluetooth IP address of the terminal.")
  @JsonProperty(JSON_PROPERTY_BLUETOOTH_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBluetoothIp() {
    return bluetoothIp;
  }


  @JsonProperty(JSON_PROPERTY_BLUETOOTH_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBluetoothIp(String bluetoothIp) {
    this.bluetoothIp = bluetoothIp;
  }


  public Terminal bluetoothMac(String bluetoothMac) {
    this.bluetoothMac = bluetoothMac;
    return this;
  }

   /**
   * The Bluetooth MAC address of the terminal.
   * @return bluetoothMac
  **/
  @ApiModelProperty(value = "The Bluetooth MAC address of the terminal.")
  @JsonProperty(JSON_PROPERTY_BLUETOOTH_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBluetoothMac() {
    return bluetoothMac;
  }


  @JsonProperty(JSON_PROPERTY_BLUETOOTH_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBluetoothMac(String bluetoothMac) {
    this.bluetoothMac = bluetoothMac;
  }


  public Terminal city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city where the terminal is located.
   * @return city
  **/
  @ApiModelProperty(value = "The city where the terminal is located.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Terminal companyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
    return this;
  }

   /**
   * The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account.
   * @return companyAccount
  **/
  @ApiModelProperty(value = "The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyAccount() {
    return companyAccount;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }


  public Terminal countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code of the country where the terminal is located.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country code of the country where the terminal is located.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Terminal deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * The model name of the terminal.
   * @return deviceModel
  **/
  @ApiModelProperty(value = "The model name of the terminal.")
  @JsonProperty(JSON_PROPERTY_DEVICE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceModel() {
    return deviceModel;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  public Terminal ethernetIp(String ethernetIp) {
    this.ethernetIp = ethernetIp;
    return this;
  }

   /**
   * The ethernet IP address of the terminal.
   * @return ethernetIp
  **/
  @ApiModelProperty(value = "The ethernet IP address of the terminal.")
  @JsonProperty(JSON_PROPERTY_ETHERNET_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEthernetIp() {
    return ethernetIp;
  }


  @JsonProperty(JSON_PROPERTY_ETHERNET_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEthernetIp(String ethernetIp) {
    this.ethernetIp = ethernetIp;
  }


  public Terminal ethernetMac(String ethernetMac) {
    this.ethernetMac = ethernetMac;
    return this;
  }

   /**
   * The ethernet MAC address of the terminal.
   * @return ethernetMac
  **/
  @ApiModelProperty(value = "The ethernet MAC address of the terminal.")
  @JsonProperty(JSON_PROPERTY_ETHERNET_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEthernetMac() {
    return ethernetMac;
  }


  @JsonProperty(JSON_PROPERTY_ETHERNET_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEthernetMac(String ethernetMac) {
    this.ethernetMac = ethernetMac;
  }


  public Terminal firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }

   /**
   * The software release currently in use on the terminal.
   * @return firmwareVersion
  **/
  @ApiModelProperty(value = "The software release currently in use on the terminal.")
  @JsonProperty(JSON_PROPERTY_FIRMWARE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirmwareVersion() {
    return firmwareVersion;
  }


  @JsonProperty(JSON_PROPERTY_FIRMWARE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }


  public Terminal iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

   /**
   * The integrated circuit card identifier (ICCID) of the SIM card in the terminal.
   * @return iccid
  **/
  @ApiModelProperty(value = "The integrated circuit card identifier (ICCID) of the SIM card in the terminal.")
  @JsonProperty(JSON_PROPERTY_ICCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIccid() {
    return iccid;
  }


  @JsonProperty(JSON_PROPERTY_ICCID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


  public Terminal id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the terminal.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the terminal.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Terminal lastActivityDateTime(OffsetDateTime lastActivityDateTime) {
    this.lastActivityDateTime = lastActivityDateTime;
    return this;
  }

   /**
   * Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago.
   * @return lastActivityDateTime
  **/
  @ApiModelProperty(value = "Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago.")
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastActivityDateTime() {
    return lastActivityDateTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastActivityDateTime(OffsetDateTime lastActivityDateTime) {
    this.lastActivityDateTime = lastActivityDateTime;
  }


  public Terminal lastTransactionDateTime(OffsetDateTime lastTransactionDateTime) {
    this.lastTransactionDateTime = lastTransactionDateTime;
    return this;
  }

   /**
   * Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago.
   * @return lastTransactionDateTime
  **/
  @ApiModelProperty(value = "Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago.")
  @JsonProperty(JSON_PROPERTY_LAST_TRANSACTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastTransactionDateTime() {
    return lastTransactionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TRANSACTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastTransactionDateTime(OffsetDateTime lastTransactionDateTime) {
    this.lastTransactionDateTime = lastTransactionDateTime;
  }


  public Terminal linkNegotiation(String linkNegotiation) {
    this.linkNegotiation = linkNegotiation;
    return this;
  }

   /**
   * The Ethernet link negotiation that the terminal uses:  - &#x60;auto&#x60;: Auto-negotiation  - &#x60;100full&#x60;: 100 Mbps full duplex
   * @return linkNegotiation
  **/
  @ApiModelProperty(value = "The Ethernet link negotiation that the terminal uses:  - `auto`: Auto-negotiation  - `100full`: 100 Mbps full duplex")
  @JsonProperty(JSON_PROPERTY_LINK_NEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkNegotiation() {
    return linkNegotiation;
  }


  @JsonProperty(JSON_PROPERTY_LINK_NEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkNegotiation(String linkNegotiation) {
    this.linkNegotiation = linkNegotiation;
  }


  public Terminal serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number of the terminal.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "The serial number of the terminal.")
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Terminal simStatus(String simStatus) {
    this.simStatus = simStatus;
    return this;
  }

   /**
   * On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY.
   * @return simStatus
  **/
  @ApiModelProperty(value = "On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY.")
  @JsonProperty(JSON_PROPERTY_SIM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSimStatus() {
    return simStatus;
  }


  @JsonProperty(JSON_PROPERTY_SIM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimStatus(String simStatus) {
    this.simStatus = simStatus;
  }


  public Terminal status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates when the terminal was last online, whether the terminal is being reassigned, or whether the terminal is turned off. If the terminal was last online more that a week ago, it is also shown as turned off.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates when the terminal was last online, whether the terminal is being reassigned, or whether the terminal is turned off. If the terminal was last online more that a week ago, it is also shown as turned off.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public Terminal storeStatus(String storeStatus) {
    this.storeStatus = storeStatus;
    return this;
  }

   /**
   * The status of the store that the terminal is assigned to.
   * @return storeStatus
  **/
  @ApiModelProperty(value = "The status of the store that the terminal is assigned to.")
  @JsonProperty(JSON_PROPERTY_STORE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreStatus() {
    return storeStatus;
  }


  @JsonProperty(JSON_PROPERTY_STORE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreStatus(String storeStatus) {
    this.storeStatus = storeStatus;
  }


  public Terminal wifiIp(String wifiIp) {
    this.wifiIp = wifiIp;
    return this;
  }

   /**
   * The terminal&#39;s IP address in your Wi-Fi network.
   * @return wifiIp
  **/
  @ApiModelProperty(value = "The terminal's IP address in your Wi-Fi network.")
  @JsonProperty(JSON_PROPERTY_WIFI_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWifiIp() {
    return wifiIp;
  }


  @JsonProperty(JSON_PROPERTY_WIFI_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWifiIp(String wifiIp) {
    this.wifiIp = wifiIp;
  }


  public Terminal wifiMac(String wifiMac) {
    this.wifiMac = wifiMac;
    return this;
  }

   /**
   * The terminal&#39;s MAC address in your Wi-Fi network.
   * @return wifiMac
  **/
  @ApiModelProperty(value = "The terminal's MAC address in your Wi-Fi network.")
  @JsonProperty(JSON_PROPERTY_WIFI_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWifiMac() {
    return wifiMac;
  }


  @JsonProperty(JSON_PROPERTY_WIFI_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWifiMac(String wifiMac) {
    this.wifiMac = wifiMac;
  }


  public Terminal wifiSsid(String wifiSsid) {
    this.wifiSsid = wifiSsid;
    return this;
  }

   /**
   * The SSID of the Wi-Fi network that your terminal is connected to.
   * @return wifiSsid
  **/
  @ApiModelProperty(value = "The SSID of the Wi-Fi network that your terminal is connected to.")
  @JsonProperty(JSON_PROPERTY_WIFI_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWifiSsid() {
    return wifiSsid;
  }


  @JsonProperty(JSON_PROPERTY_WIFI_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWifiSsid(String wifiSsid) {
    this.wifiSsid = wifiSsid;
  }


  /**
   * Return true if this Terminal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return Objects.equals(this.assigned, terminal.assigned) &&
        Objects.equals(this.bluetoothIp, terminal.bluetoothIp) &&
        Objects.equals(this.bluetoothMac, terminal.bluetoothMac) &&
        Objects.equals(this.city, terminal.city) &&
        Objects.equals(this.companyAccount, terminal.companyAccount) &&
        Objects.equals(this.countryCode, terminal.countryCode) &&
        Objects.equals(this.deviceModel, terminal.deviceModel) &&
        Objects.equals(this.ethernetIp, terminal.ethernetIp) &&
        Objects.equals(this.ethernetMac, terminal.ethernetMac) &&
        Objects.equals(this.firmwareVersion, terminal.firmwareVersion) &&
        Objects.equals(this.iccid, terminal.iccid) &&
        Objects.equals(this.id, terminal.id) &&
        Objects.equals(this.lastActivityDateTime, terminal.lastActivityDateTime) &&
        Objects.equals(this.lastTransactionDateTime, terminal.lastTransactionDateTime) &&
        Objects.equals(this.linkNegotiation, terminal.linkNegotiation) &&
        Objects.equals(this.serialNumber, terminal.serialNumber) &&
        Objects.equals(this.simStatus, terminal.simStatus) &&
        Objects.equals(this.status, terminal.status) &&
        Objects.equals(this.storeStatus, terminal.storeStatus) &&
        Objects.equals(this.wifiIp, terminal.wifiIp) &&
        Objects.equals(this.wifiMac, terminal.wifiMac) &&
        Objects.equals(this.wifiSsid, terminal.wifiSsid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, bluetoothIp, bluetoothMac, city, companyAccount, countryCode, deviceModel, ethernetIp, ethernetMac, firmwareVersion, iccid, id, lastActivityDateTime, lastTransactionDateTime, linkNegotiation, serialNumber, simStatus, status, storeStatus, wifiIp, wifiMac, wifiSsid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Terminal {\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    bluetoothIp: ").append(toIndentedString(bluetoothIp)).append("\n");
    sb.append("    bluetoothMac: ").append(toIndentedString(bluetoothMac)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    ethernetIp: ").append(toIndentedString(ethernetIp)).append("\n");
    sb.append("    ethernetMac: ").append(toIndentedString(ethernetMac)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastActivityDateTime: ").append(toIndentedString(lastActivityDateTime)).append("\n");
    sb.append("    lastTransactionDateTime: ").append(toIndentedString(lastTransactionDateTime)).append("\n");
    sb.append("    linkNegotiation: ").append(toIndentedString(linkNegotiation)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeStatus: ").append(toIndentedString(storeStatus)).append("\n");
    sb.append("    wifiIp: ").append(toIndentedString(wifiIp)).append("\n");
    sb.append("    wifiMac: ").append(toIndentedString(wifiMac)).append("\n");
    sb.append("    wifiSsid: ").append(toIndentedString(wifiSsid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of Terminal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Terminal
   * @throws JsonProcessingException if the JSON string is invalid with respect to Terminal
   */
  public static Terminal fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Terminal.class);
  }
/**
  * Convert an instance of Terminal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

