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
import com.adyen.model.management.TransactionDescriptionInfo;
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
 * DinersInfo
 */
@JsonPropertyOrder({
  DinersInfo.JSON_PROPERTY_MID_NUMBER,
  DinersInfo.JSON_PROPERTY_REUSE_MID_NUMBER,
  DinersInfo.JSON_PROPERTY_SERVICE_LEVEL,
  DinersInfo.JSON_PROPERTY_TRANSACTION_DESCRIPTION
})

public class DinersInfo {
  public static final String JSON_PROPERTY_MID_NUMBER = "midNumber";
  private String midNumber;

  public static final String JSON_PROPERTY_REUSE_MID_NUMBER = "reuseMidNumber";
  private Boolean reuseMidNumber;

  /**
   * Specifies the service level (settlement type) of this payment method. Required for merchants operating in Japan. Possible values:  * **noContract**: Adyen holds the contract with JCB.  * **gatewayContract**: JCB receives the settlement and handles disputes, then pays out to you or your sub-merchant directly.
   */
  public enum ServiceLevelEnum {
    NOCONTRACT("noContract"),
    
    GATEWAYCONTRACT("gatewayContract");

    private String value;

    ServiceLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceLevelEnum fromValue(String value) {
      for (ServiceLevelEnum b : ServiceLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE_LEVEL = "serviceLevel";
  private ServiceLevelEnum serviceLevel;

  public static final String JSON_PROPERTY_TRANSACTION_DESCRIPTION = "transactionDescription";
  private TransactionDescriptionInfo transactionDescription;

  public DinersInfo() { 
  }

  /**
   * MID (Merchant ID) number. Required for merchants operating in Japan. Format: 14 numeric characters.
   *
   * @param midNumber
   * @return the current {@code DinersInfo} instance, allowing for method chaining
   */
  public DinersInfo midNumber(String midNumber) {
    this.midNumber = midNumber;
    return this;
  }

  /**
   * MID (Merchant ID) number. Required for merchants operating in Japan. Format: 14 numeric characters.
   * @return midNumber
   */
  @ApiModelProperty(value = "MID (Merchant ID) number. Required for merchants operating in Japan. Format: 14 numeric characters.")
  @JsonProperty(JSON_PROPERTY_MID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMidNumber() {
    return midNumber;
  }

  /**
   * MID (Merchant ID) number. Required for merchants operating in Japan. Format: 14 numeric characters.
   *
   * @param midNumber
   */ 
  @JsonProperty(JSON_PROPERTY_MID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMidNumber(String midNumber) {
    this.midNumber = midNumber;
  }

  /**
   * Indicates whether the JCB Merchant ID is reused from a previously configured JCB payment method. The default value is **false**. For merchants operating in Japan, this field is required and must be set to **true**.
   *
   * @param reuseMidNumber
   * @return the current {@code DinersInfo} instance, allowing for method chaining
   */
  public DinersInfo reuseMidNumber(Boolean reuseMidNumber) {
    this.reuseMidNumber = reuseMidNumber;
    return this;
  }

  /**
   * Indicates whether the JCB Merchant ID is reused from a previously configured JCB payment method. The default value is **false**. For merchants operating in Japan, this field is required and must be set to **true**.
   * @return reuseMidNumber
   */
  @ApiModelProperty(required = true, value = "Indicates whether the JCB Merchant ID is reused from a previously configured JCB payment method. The default value is **false**. For merchants operating in Japan, this field is required and must be set to **true**.")
  @JsonProperty(JSON_PROPERTY_REUSE_MID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReuseMidNumber() {
    return reuseMidNumber;
  }

  /**
   * Indicates whether the JCB Merchant ID is reused from a previously configured JCB payment method. The default value is **false**. For merchants operating in Japan, this field is required and must be set to **true**.
   *
   * @param reuseMidNumber
   */ 
  @JsonProperty(JSON_PROPERTY_REUSE_MID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReuseMidNumber(Boolean reuseMidNumber) {
    this.reuseMidNumber = reuseMidNumber;
  }

  /**
   * Specifies the service level (settlement type) of this payment method. Required for merchants operating in Japan. Possible values:  * **noContract**: Adyen holds the contract with JCB.  * **gatewayContract**: JCB receives the settlement and handles disputes, then pays out to you or your sub-merchant directly.
   *
   * @param serviceLevel
   * @return the current {@code DinersInfo} instance, allowing for method chaining
   */
  public DinersInfo serviceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  /**
   * Specifies the service level (settlement type) of this payment method. Required for merchants operating in Japan. Possible values:  * **noContract**: Adyen holds the contract with JCB.  * **gatewayContract**: JCB receives the settlement and handles disputes, then pays out to you or your sub-merchant directly.
   * @return serviceLevel
   */
  @ApiModelProperty(value = "Specifies the service level (settlement type) of this payment method. Required for merchants operating in Japan. Possible values:  * **noContract**: Adyen holds the contract with JCB.  * **gatewayContract**: JCB receives the settlement and handles disputes, then pays out to you or your sub-merchant directly.")
  @JsonProperty(JSON_PROPERTY_SERVICE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceLevelEnum getServiceLevel() {
    return serviceLevel;
  }

  /**
   * Specifies the service level (settlement type) of this payment method. Required for merchants operating in Japan. Possible values:  * **noContract**: Adyen holds the contract with JCB.  * **gatewayContract**: JCB receives the settlement and handles disputes, then pays out to you or your sub-merchant directly.
   *
   * @param serviceLevel
   */ 
  @JsonProperty(JSON_PROPERTY_SERVICE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  /**
   * transactionDescription
   *
   * @param transactionDescription
   * @return the current {@code DinersInfo} instance, allowing for method chaining
   */
  public DinersInfo transactionDescription(TransactionDescriptionInfo transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * transactionDescription
   * @return transactionDescription
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TransactionDescriptionInfo getTransactionDescription() {
    return transactionDescription;
  }

  /**
   * transactionDescription
   *
   * @param transactionDescription
   */ 
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionDescription(TransactionDescriptionInfo transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  /**
   * Return true if this DinersInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DinersInfo dinersInfo = (DinersInfo) o;
    return Objects.equals(this.midNumber, dinersInfo.midNumber) &&
        Objects.equals(this.reuseMidNumber, dinersInfo.reuseMidNumber) &&
        Objects.equals(this.serviceLevel, dinersInfo.serviceLevel) &&
        Objects.equals(this.transactionDescription, dinersInfo.transactionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(midNumber, reuseMidNumber, serviceLevel, transactionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DinersInfo {\n");
    sb.append("    midNumber: ").append(toIndentedString(midNumber)).append("\n");
    sb.append("    reuseMidNumber: ").append(toIndentedString(reuseMidNumber)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
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
   * Create an instance of DinersInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DinersInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to DinersInfo
   */
  public static DinersInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DinersInfo.class);
  }
/**
  * Convert an instance of DinersInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
