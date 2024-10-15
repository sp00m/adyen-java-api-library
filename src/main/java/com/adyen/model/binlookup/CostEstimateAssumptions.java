/*
 * Adyen BinLookup API
 *
 * The version of the OpenAPI document: 54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
 * CostEstimateAssumptions
 */
@JsonPropertyOrder({
  CostEstimateAssumptions.JSON_PROPERTY_ASSUME3_D_SECURE_AUTHENTICATED,
  CostEstimateAssumptions.JSON_PROPERTY_ASSUME_LEVEL3_DATA,
  CostEstimateAssumptions.JSON_PROPERTY_INSTALLMENTS
})

public class CostEstimateAssumptions {
  public static final String JSON_PROPERTY_ASSUME3_D_SECURE_AUTHENTICATED = "assume3DSecureAuthenticated";
  private Boolean assume3DSecureAuthenticated;

  public static final String JSON_PROPERTY_ASSUME_LEVEL3_DATA = "assumeLevel3Data";
  private Boolean assumeLevel3Data;

  public static final String JSON_PROPERTY_INSTALLMENTS = "installments";
  private Integer installments;

  public CostEstimateAssumptions() { 
  }

  /**
   * If true, the cardholder is expected to successfully authorise via 3D Secure.
   *
   * @param assume3DSecureAuthenticated
   * @return the current {@code CostEstimateAssumptions} instance, allowing for method chaining
   */
  public CostEstimateAssumptions assume3DSecureAuthenticated(Boolean assume3DSecureAuthenticated) {
    this.assume3DSecureAuthenticated = assume3DSecureAuthenticated;
    return this;
  }

  /**
   * If true, the cardholder is expected to successfully authorise via 3D Secure.
   * @return assume3DSecureAuthenticated
   */
  @ApiModelProperty(value = "If true, the cardholder is expected to successfully authorise via 3D Secure.")
  @JsonProperty(JSON_PROPERTY_ASSUME3_D_SECURE_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAssume3DSecureAuthenticated() {
    return assume3DSecureAuthenticated;
  }

  /**
   * If true, the cardholder is expected to successfully authorise via 3D Secure.
   *
   * @param assume3DSecureAuthenticated
   */ 
  @JsonProperty(JSON_PROPERTY_ASSUME3_D_SECURE_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssume3DSecureAuthenticated(Boolean assume3DSecureAuthenticated) {
    this.assume3DSecureAuthenticated = assume3DSecureAuthenticated;
  }

  /**
   * If true, the transaction is expected to have valid Level 3 data.
   *
   * @param assumeLevel3Data
   * @return the current {@code CostEstimateAssumptions} instance, allowing for method chaining
   */
  public CostEstimateAssumptions assumeLevel3Data(Boolean assumeLevel3Data) {
    this.assumeLevel3Data = assumeLevel3Data;
    return this;
  }

  /**
   * If true, the transaction is expected to have valid Level 3 data.
   * @return assumeLevel3Data
   */
  @ApiModelProperty(value = "If true, the transaction is expected to have valid Level 3 data.")
  @JsonProperty(JSON_PROPERTY_ASSUME_LEVEL3_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAssumeLevel3Data() {
    return assumeLevel3Data;
  }

  /**
   * If true, the transaction is expected to have valid Level 3 data.
   *
   * @param assumeLevel3Data
   */ 
  @JsonProperty(JSON_PROPERTY_ASSUME_LEVEL3_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssumeLevel3Data(Boolean assumeLevel3Data) {
    this.assumeLevel3Data = assumeLevel3Data;
  }

  /**
   * If not zero, the number of installments.
   *
   * @param installments
   * @return the current {@code CostEstimateAssumptions} instance, allowing for method chaining
   */
  public CostEstimateAssumptions installments(Integer installments) {
    this.installments = installments;
    return this;
  }

  /**
   * If not zero, the number of installments.
   * @return installments
   */
  @ApiModelProperty(value = "If not zero, the number of installments.")
  @JsonProperty(JSON_PROPERTY_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getInstallments() {
    return installments;
  }

  /**
   * If not zero, the number of installments.
   *
   * @param installments
   */ 
  @JsonProperty(JSON_PROPERTY_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallments(Integer installments) {
    this.installments = installments;
  }

  /**
   * Return true if this CostEstimateAssumptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimateAssumptions costEstimateAssumptions = (CostEstimateAssumptions) o;
    return Objects.equals(this.assume3DSecureAuthenticated, costEstimateAssumptions.assume3DSecureAuthenticated) &&
        Objects.equals(this.assumeLevel3Data, costEstimateAssumptions.assumeLevel3Data) &&
        Objects.equals(this.installments, costEstimateAssumptions.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assume3DSecureAuthenticated, assumeLevel3Data, installments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateAssumptions {\n");
    sb.append("    assume3DSecureAuthenticated: ").append(toIndentedString(assume3DSecureAuthenticated)).append("\n");
    sb.append("    assumeLevel3Data: ").append(toIndentedString(assumeLevel3Data)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
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
   * Create an instance of CostEstimateAssumptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CostEstimateAssumptions
   * @throws JsonProcessingException if the JSON string is invalid with respect to CostEstimateAssumptions
   */
  public static CostEstimateAssumptions fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CostEstimateAssumptions.class);
  }
/**
  * Convert an instance of CostEstimateAssumptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
