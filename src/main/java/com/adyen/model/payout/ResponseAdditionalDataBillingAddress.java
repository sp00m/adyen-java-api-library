/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

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
 * ResponseAdditionalDataBillingAddress
 */
@JsonPropertyOrder({
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_CITY,
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_COUNTRY,
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME,
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_POSTAL_CODE,
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_STATE_OR_PROVINCE,
  ResponseAdditionalDataBillingAddress.JSON_PROPERTY_BILLING_ADDRESS_STREET
})

public class ResponseAdditionalDataBillingAddress {
  public static final String JSON_PROPERTY_BILLING_ADDRESS_CITY = "billingAddress.city";
  private String billingAddressCity;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_COUNTRY = "billingAddress.country";
  private String billingAddressCountry;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME = "billingAddress.houseNumberOrName";
  private String billingAddressHouseNumberOrName;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_POSTAL_CODE = "billingAddress.postalCode";
  private String billingAddressPostalCode;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_STATE_OR_PROVINCE = "billingAddress.stateOrProvince";
  private String billingAddressStateOrProvince;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_STREET = "billingAddress.street";
  private String billingAddressStreet;

  public ResponseAdditionalDataBillingAddress() { 
  }

  /**
   * The billing address city passed in the payment request.
   *
   * @param billingAddressCity
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressCity(String billingAddressCity) {
    this.billingAddressCity = billingAddressCity;
    return this;
  }

  /**
   * The billing address city passed in the payment request.
   * @return billingAddressCity
   */
  @ApiModelProperty(value = "The billing address city passed in the payment request.")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressCity() {
    return billingAddressCity;
  }

  /**
   * The billing address city passed in the payment request.
   *
   * @param billingAddressCity
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressCity(String billingAddressCity) {
    this.billingAddressCity = billingAddressCity;
  }

  /**
   * The billing address country passed in the payment request.  Example: NL
   *
   * @param billingAddressCountry
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressCountry(String billingAddressCountry) {
    this.billingAddressCountry = billingAddressCountry;
    return this;
  }

  /**
   * The billing address country passed in the payment request.  Example: NL
   * @return billingAddressCountry
   */
  @ApiModelProperty(value = "The billing address country passed in the payment request.  Example: NL")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressCountry() {
    return billingAddressCountry;
  }

  /**
   * The billing address country passed in the payment request.  Example: NL
   *
   * @param billingAddressCountry
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressCountry(String billingAddressCountry) {
    this.billingAddressCountry = billingAddressCountry;
  }

  /**
   * The billing address house number or name passed in the payment request.
   *
   * @param billingAddressHouseNumberOrName
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressHouseNumberOrName(String billingAddressHouseNumberOrName) {
    this.billingAddressHouseNumberOrName = billingAddressHouseNumberOrName;
    return this;
  }

  /**
   * The billing address house number or name passed in the payment request.
   * @return billingAddressHouseNumberOrName
   */
  @ApiModelProperty(value = "The billing address house number or name passed in the payment request.")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressHouseNumberOrName() {
    return billingAddressHouseNumberOrName;
  }

  /**
   * The billing address house number or name passed in the payment request.
   *
   * @param billingAddressHouseNumberOrName
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressHouseNumberOrName(String billingAddressHouseNumberOrName) {
    this.billingAddressHouseNumberOrName = billingAddressHouseNumberOrName;
  }

  /**
   * The billing address postal code passed in the payment request.  Example: 1011 DJ
   *
   * @param billingAddressPostalCode
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressPostalCode(String billingAddressPostalCode) {
    this.billingAddressPostalCode = billingAddressPostalCode;
    return this;
  }

  /**
   * The billing address postal code passed in the payment request.  Example: 1011 DJ
   * @return billingAddressPostalCode
   */
  @ApiModelProperty(value = "The billing address postal code passed in the payment request.  Example: 1011 DJ")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressPostalCode() {
    return billingAddressPostalCode;
  }

  /**
   * The billing address postal code passed in the payment request.  Example: 1011 DJ
   *
   * @param billingAddressPostalCode
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressPostalCode(String billingAddressPostalCode) {
    this.billingAddressPostalCode = billingAddressPostalCode;
  }

  /**
   * The billing address state or province passed in the payment request.  Example: NH
   *
   * @param billingAddressStateOrProvince
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressStateOrProvince(String billingAddressStateOrProvince) {
    this.billingAddressStateOrProvince = billingAddressStateOrProvince;
    return this;
  }

  /**
   * The billing address state or province passed in the payment request.  Example: NH
   * @return billingAddressStateOrProvince
   */
  @ApiModelProperty(value = "The billing address state or province passed in the payment request.  Example: NH")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressStateOrProvince() {
    return billingAddressStateOrProvince;
  }

  /**
   * The billing address state or province passed in the payment request.  Example: NH
   *
   * @param billingAddressStateOrProvince
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressStateOrProvince(String billingAddressStateOrProvince) {
    this.billingAddressStateOrProvince = billingAddressStateOrProvince;
  }

  /**
   * The billing address street passed in the payment request.
   *
   * @param billingAddressStreet
   * @return the current {@code ResponseAdditionalDataBillingAddress} instance, allowing for method chaining
   */
  public ResponseAdditionalDataBillingAddress billingAddressStreet(String billingAddressStreet) {
    this.billingAddressStreet = billingAddressStreet;
    return this;
  }

  /**
   * The billing address street passed in the payment request.
   * @return billingAddressStreet
   */
  @ApiModelProperty(value = "The billing address street passed in the payment request.")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingAddressStreet() {
    return billingAddressStreet;
  }

  /**
   * The billing address street passed in the payment request.
   *
   * @param billingAddressStreet
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressStreet(String billingAddressStreet) {
    this.billingAddressStreet = billingAddressStreet;
  }

  /**
   * Return true if this ResponseAdditionalDataBillingAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataBillingAddress responseAdditionalDataBillingAddress = (ResponseAdditionalDataBillingAddress) o;
    return Objects.equals(this.billingAddressCity, responseAdditionalDataBillingAddress.billingAddressCity) &&
        Objects.equals(this.billingAddressCountry, responseAdditionalDataBillingAddress.billingAddressCountry) &&
        Objects.equals(this.billingAddressHouseNumberOrName, responseAdditionalDataBillingAddress.billingAddressHouseNumberOrName) &&
        Objects.equals(this.billingAddressPostalCode, responseAdditionalDataBillingAddress.billingAddressPostalCode) &&
        Objects.equals(this.billingAddressStateOrProvince, responseAdditionalDataBillingAddress.billingAddressStateOrProvince) &&
        Objects.equals(this.billingAddressStreet, responseAdditionalDataBillingAddress.billingAddressStreet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddressCity, billingAddressCountry, billingAddressHouseNumberOrName, billingAddressPostalCode, billingAddressStateOrProvince, billingAddressStreet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataBillingAddress {\n");
    sb.append("    billingAddressCity: ").append(toIndentedString(billingAddressCity)).append("\n");
    sb.append("    billingAddressCountry: ").append(toIndentedString(billingAddressCountry)).append("\n");
    sb.append("    billingAddressHouseNumberOrName: ").append(toIndentedString(billingAddressHouseNumberOrName)).append("\n");
    sb.append("    billingAddressPostalCode: ").append(toIndentedString(billingAddressPostalCode)).append("\n");
    sb.append("    billingAddressStateOrProvince: ").append(toIndentedString(billingAddressStateOrProvince)).append("\n");
    sb.append("    billingAddressStreet: ").append(toIndentedString(billingAddressStreet)).append("\n");
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
   * Create an instance of ResponseAdditionalDataBillingAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseAdditionalDataBillingAddress
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResponseAdditionalDataBillingAddress
   */
  public static ResponseAdditionalDataBillingAddress fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResponseAdditionalDataBillingAddress.class);
  }
/**
  * Convert an instance of ResponseAdditionalDataBillingAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
