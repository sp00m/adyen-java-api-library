/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
 * CheckTaxElectronicDeliveryConsentResponse
 */
@JsonPropertyOrder({
  CheckTaxElectronicDeliveryConsentResponse.JSON_PROPERTY_US1099K
})

public class CheckTaxElectronicDeliveryConsentResponse {
  public static final String JSON_PROPERTY_US1099K = "US1099k";
  private Boolean us1099k;

  public CheckTaxElectronicDeliveryConsentResponse() { 
  }

  /**
   * Consent to electronically deliver tax form US1099-K.
   *
   * @param us1099k
   * @return the current {@code CheckTaxElectronicDeliveryConsentResponse} instance, allowing for method chaining
   */
  public CheckTaxElectronicDeliveryConsentResponse us1099k(Boolean us1099k) {
    this.us1099k = us1099k;
    return this;
  }

  /**
   * Consent to electronically deliver tax form US1099-K.
   * @return us1099k
   */
  @ApiModelProperty(value = "Consent to electronically deliver tax form US1099-K.")
  @JsonProperty(JSON_PROPERTY_US1099K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUs1099k() {
    return us1099k;
  }

  /**
   * Consent to electronically deliver tax form US1099-K.
   *
   * @param us1099k
   */ 
  @JsonProperty(JSON_PROPERTY_US1099K)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUs1099k(Boolean us1099k) {
    this.us1099k = us1099k;
  }

  /**
   * Return true if this CheckTaxElectronicDeliveryConsentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckTaxElectronicDeliveryConsentResponse checkTaxElectronicDeliveryConsentResponse = (CheckTaxElectronicDeliveryConsentResponse) o;
    return Objects.equals(this.us1099k, checkTaxElectronicDeliveryConsentResponse.us1099k);
  }

  @Override
  public int hashCode() {
    return Objects.hash(us1099k);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckTaxElectronicDeliveryConsentResponse {\n");
    sb.append("    us1099k: ").append(toIndentedString(us1099k)).append("\n");
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
   * Create an instance of CheckTaxElectronicDeliveryConsentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckTaxElectronicDeliveryConsentResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckTaxElectronicDeliveryConsentResponse
   */
  public static CheckTaxElectronicDeliveryConsentResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckTaxElectronicDeliveryConsentResponse.class);
  }
/**
  * Convert an instance of CheckTaxElectronicDeliveryConsentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
