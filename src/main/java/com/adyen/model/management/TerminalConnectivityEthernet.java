/*
 * Management API
 *
 * The version of the OpenAPI document: 3
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TerminalConnectivityEthernet
 */
@JsonPropertyOrder({
  TerminalConnectivityEthernet.JSON_PROPERTY_IP_ADDRESS,
  TerminalConnectivityEthernet.JSON_PROPERTY_LINK_NEGOTIATION,
  TerminalConnectivityEthernet.JSON_PROPERTY_MAC_ADDRESS
})

public class TerminalConnectivityEthernet {
  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_LINK_NEGOTIATION = "linkNegotiation";
  private String linkNegotiation;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "macAddress";
  private String macAddress;

  public TerminalConnectivityEthernet() { 
  }

  /**
   * The terminal&#39;s ethernet IP address.
   *
   * @param ipAddress
   * @return the current {@code TerminalConnectivityEthernet} instance, allowing for method chaining
   */
  public TerminalConnectivityEthernet ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The terminal&#39;s ethernet IP address.
   * @return ipAddress
   */
  @ApiModelProperty(value = "The terminal's ethernet IP address.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * The terminal&#39;s ethernet IP address.
   *
   * @param ipAddress
   */ 
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * The ethernet link negotiation that the terminal uses.
   *
   * @param linkNegotiation
   * @return the current {@code TerminalConnectivityEthernet} instance, allowing for method chaining
   */
  public TerminalConnectivityEthernet linkNegotiation(String linkNegotiation) {
    this.linkNegotiation = linkNegotiation;
    return this;
  }

  /**
   * The ethernet link negotiation that the terminal uses.
   * @return linkNegotiation
   */
  @ApiModelProperty(value = "The ethernet link negotiation that the terminal uses.")
  @JsonProperty(JSON_PROPERTY_LINK_NEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLinkNegotiation() {
    return linkNegotiation;
  }

  /**
   * The ethernet link negotiation that the terminal uses.
   *
   * @param linkNegotiation
   */ 
  @JsonProperty(JSON_PROPERTY_LINK_NEGOTIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkNegotiation(String linkNegotiation) {
    this.linkNegotiation = linkNegotiation;
  }

  /**
   * The terminal&#39;s ethernet MAC address.
   *
   * @param macAddress
   * @return the current {@code TerminalConnectivityEthernet} instance, allowing for method chaining
   */
  public TerminalConnectivityEthernet macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * The terminal&#39;s ethernet MAC address.
   * @return macAddress
   */
  @ApiModelProperty(value = "The terminal's ethernet MAC address.")
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * The terminal&#39;s ethernet MAC address.
   *
   * @param macAddress
   */ 
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * Return true if this TerminalConnectivityEthernet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalConnectivityEthernet terminalConnectivityEthernet = (TerminalConnectivityEthernet) o;
    return Objects.equals(this.ipAddress, terminalConnectivityEthernet.ipAddress) &&
        Objects.equals(this.linkNegotiation, terminalConnectivityEthernet.linkNegotiation) &&
        Objects.equals(this.macAddress, terminalConnectivityEthernet.macAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, linkNegotiation, macAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalConnectivityEthernet {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    linkNegotiation: ").append(toIndentedString(linkNegotiation)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
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
   * Create an instance of TerminalConnectivityEthernet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalConnectivityEthernet
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalConnectivityEthernet
   */
  public static TerminalConnectivityEthernet fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalConnectivityEthernet.class);
  }
/**
  * Convert an instance of TerminalConnectivityEthernet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
